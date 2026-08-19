package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;

public class ProxyRotationController implements NotificationCenter.NotificationCenterDelegate {
    public static final int DEFAULT_TIMEOUT_INDEX = 1;
    private static final ProxyRotationController INSTANCE = new ProxyRotationController();
    public static final List<Integer> ROTATION_TIMEOUTS = Arrays.asList(5, 10, 15, 30, 60);
    private Runnable checkProxyAndSwitchRunnable = new Runnable() {
        @Override
        public final void run() {
            ProxyRotationController.$r8$lambda$R7SeVu6mN6wVygIZ24DPF7xcTAE(this.f$0);
        }
    };
    private boolean isCurrentlyChecking;

    public static void $r8$lambda$R7SeVu6mN6wVygIZ24DPF7xcTAE(ProxyRotationController proxyRotationController) {
        proxyRotationController.isCurrentlyChecking = true;
        int i = UserConfig.selectedAccount;
        boolean z = false;
        for (int i2 = 0; i2 < SharedConfig.proxyList.size(); i2++) {
            final SharedConfig.ProxyInfo proxyInfo = SharedConfig.proxyList.get(i2);
            if (!proxyInfo.checking && SystemClock.elapsedRealtime() - proxyInfo.availableCheckTime >= 120000) {
                proxyInfo.checking = true;
                proxyInfo.proxyCheckPingId = ConnectionsManager.getInstance(i).checkProxy(proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, new RequestTimeDelegate() {
                    @Override
                    public final void run(long j) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                ProxyRotationController.$r8$lambda$y4AyqLfFAqbbC1e8rcgYYgTc97s(proxyInfo, j);
                            }
                        });
                    }
                });
                z = true;
            }
        }
        if (z) {
            return;
        }
        proxyRotationController.isCurrentlyChecking = false;
        proxyRotationController.switchToAvailable();
    }

    public static void $r8$lambda$y4AyqLfFAqbbC1e8rcgYYgTc97s(SharedConfig.ProxyInfo proxyInfo, long j) {
        proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
        proxyInfo.checking = false;
        if (j == -1) {
            proxyInfo.available = false;
            proxyInfo.ping = 0L;
        } else {
            proxyInfo.ping = j;
            proxyInfo.available = true;
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxyCheckDone, proxyInfo);
    }

    public static void init() {
        INSTANCE.initInternal();
    }

    private void switchToAvailable() {
        this.isCurrentlyChecking = false;
        if (SharedConfig.proxyRotationEnabled) {
            ArrayList arrayList = new ArrayList(SharedConfig.proxyList);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((SharedConfig.ProxyInfo) obj).ping, ((SharedConfig.ProxyInfo) obj2).ping);
                }
            });
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
                if (proxyInfo != SharedConfig.currentProxy && !proxyInfo.checking && proxyInfo.available) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putString("proxy_ip", proxyInfo.address);
                    editorEdit.putString("proxy_pass", proxyInfo.password);
                    editorEdit.putString("proxy_user", proxyInfo.username);
                    editorEdit.putInt("proxy_port", proxyInfo.port);
                    editorEdit.putString("proxy_secret", proxyInfo.secret);
                    editorEdit.putBoolean("proxy_enabled", true);
                    if (!proxyInfo.secret.isEmpty()) {
                        editorEdit.putBoolean("proxy_enabled_calls", false);
                    }
                    editorEdit.apply();
                    SharedConfig.currentProxy = proxyInfo;
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxySettingsChanged, new Object[0]);
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.proxyChangedByRotation, new Object[0]);
                    SharedConfig.ProxyInfo proxyInfo2 = SharedConfig.currentProxy;
                    ConnectionsManager.setProxySettings(true, proxyInfo2.address, proxyInfo2.port, proxyInfo2.username, proxyInfo2.password, proxyInfo2.secret);
                    return;
                }
            }
        }
    }

    private void initInternal() {
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.didUpdateConnectionState);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.proxyCheckDone) {
            if (SharedConfig.isProxyEnabled() && SharedConfig.proxyRotationEnabled && SharedConfig.proxyList.size() > 1 && this.isCurrentlyChecking) {
                switchToAvailable();
                return;
            }
            return;
        }
        if (i == NotificationCenter.proxySettingsChanged) {
            AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
            return;
        }
        if (i == NotificationCenter.didUpdateConnectionState && i2 == UserConfig.selectedAccount) {
            if ((SharedConfig.isProxyEnabled() || SharedConfig.proxyRotationEnabled) && SharedConfig.proxyList.size() > 1) {
                if (ConnectionsManager.getInstance(i2).getConnectionState() == 4) {
                    if (this.isCurrentlyChecking) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(this.checkProxyAndSwitchRunnable, ((long) ROTATION_TIMEOUTS.get(SharedConfig.proxyRotationTimeout).intValue()) * 1000);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(this.checkProxyAndSwitchRunnable);
            }
        }
    }
}
