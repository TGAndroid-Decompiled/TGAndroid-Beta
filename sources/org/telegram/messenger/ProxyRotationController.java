package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
public class ProxyRotationController implements NotificationCenter.NotificationCenterDelegate {
    public static final int DEFAULT_TIMEOUT_INDEX = 1;
    private static final ProxyRotationController INSTANCE = new ProxyRotationController();
    public static final List<Integer> ROTATION_TIMEOUTS = Arrays.asList(5, 10, 15, 30, 60);
    private Runnable checkProxyAndSwitchRunnable = new ug(this, 4);
    private boolean isCurrentlyChecking;

    public static void init() {
        INSTANCE.initInternal();
    }

    private void initInternal() {
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
    }

    public static void lambda$new$0(SharedConfig.ProxyInfo proxyInfo, long j10) {
        proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
        proxyInfo.checking = false;
        if (j10 == -1) {
            proxyInfo.available = false;
            proxyInfo.ping = 0L;
        } else {
            proxyInfo.ping = j10;
            proxyInfo.available = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
    }

    public static void lambda$new$1(SharedConfig.ProxyInfo proxyInfo, long j10) {
        AndroidUtilities.runOnUIThread(new qh(proxyInfo, j10, 0));
    }

    public void lambda$new$2() {
        this.isCurrentlyChecking = true;
        int i10 = UserConfig.selectedAccount;
        boolean z10 = false;
        for (int i11 = 0; i11 < SharedConfig.proxyList.size(); i11++) {
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.proxyList.get(i11);
            if (proxyInfo.type != 2 && !proxyInfo.checking && SystemClock.elapsedRealtime() - proxyInfo.availableCheckTime >= 120000) {
                proxyInfo.checking = true;
                proxyInfo.proxyCheckPingId = ConnectionsManager.getInstance(i10).checkProxy(proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, new d(proxyInfo, 11));
                z10 = true;
            }
        }
        if (!z10) {
            this.isCurrentlyChecking = false;
            switchToAvailable();
        }
    }

    public static int lambda$switchToAvailable$3(SharedConfig.ProxyInfo proxyInfo, SharedConfig.ProxyInfo proxyInfo2) {
        return Long.compare(proxyInfo.ping, proxyInfo2.ping);
    }

    private void switchToAvailable() {
        this.isCurrentlyChecking = false;
        if (SharedConfig.proxyRotationEnabled) {
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            if (proxyInfo == null || proxyInfo.type != 2) {
                ArrayList arrayList = new ArrayList(SharedConfig.proxyList);
                Collections.sort(arrayList, new q(26));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) obj;
                    if (proxyInfo2 != SharedConfig.currentProxy && proxyInfo2.type != 2 && !proxyInfo2.checking && proxyInfo2.available) {
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        edit.putString("proxy_ip", proxyInfo2.address);
                        edit.putString("proxy_pass", proxyInfo2.password);
                        edit.putString("proxy_user", proxyInfo2.username);
                        edit.putInt("proxy_port", proxyInfo2.port);
                        edit.putString("proxy_secret", proxyInfo2.secret);
                        edit.putInt("proxy_type", proxyInfo2.type);
                        edit.putBoolean("proxy_enabled", true);
                        if (!proxyInfo2.secret.isEmpty()) {
                            edit.putBoolean("proxy_enabled_calls", false);
                        }
                        edit.apply();
                        SharedConfig.currentProxy = proxyInfo2;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyChangedByRotation, new Object[0]);
                        SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
                        ConnectionsManager.setProxySettings(true, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret, proxyInfo3.type);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.proxyCheckDone) {
            if (SharedConfig.isProxyEnabled() && SharedConfig.proxyRotationEnabled && SharedConfig.proxyList.size() > 1 && this.isCurrentlyChecking) {
                switchToAvailable();
            }
        } else if (i10 == NotificationCenter.proxySettingsChanged) {
            AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
        } else if (i10 == NotificationCenter.didUpdateConnectionState && i11 == UserConfig.selectedAccount) {
            if ((SharedConfig.isProxyEnabled() || SharedConfig.proxyRotationEnabled) && SharedConfig.proxyList.size() > 1) {
                if (ConnectionsManager.getInstance(i11).getConnectionState() == 4) {
                    if (!this.isCurrentlyChecking) {
                        AndroidUtilities.runOnUIThread(this.checkProxyAndSwitchRunnable, ROTATION_TIMEOUTS.get(SharedConfig.proxyRotationTimeout).intValue() * 1000);
                        return;
                    }
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
            }
        }
    }
}
