package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class qh implements Runnable {
    public final int f19006a;
    public final SharedConfig.ProxyInfo f19007b;
    public final long f19008c;

    public qh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f19006a = i10;
        this.f19007b = proxyInfo;
        this.f19008c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f19006a;
        long j3 = this.f19008c;
        SharedConfig.ProxyInfo proxyInfo = this.f19007b;
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
