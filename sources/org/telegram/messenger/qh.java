package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class qh implements Runnable {
    public final int f19007a;
    public final SharedConfig.ProxyInfo f19008b;
    public final long f19009c;

    public qh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f19007a = i10;
        this.f19008b = proxyInfo;
        this.f19009c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f19007a;
        long j3 = this.f19009c;
        SharedConfig.ProxyInfo proxyInfo = this.f19008b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j3);
                return;
            default:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j3 == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j3;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                return;
        }
    }
}
