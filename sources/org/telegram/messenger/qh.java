package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class qh implements Runnable {
    public final int f17419a;
    public final SharedConfig.ProxyInfo f17420b;
    public final long f17421c;

    public qh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f17419a = i10;
        this.f17420b = proxyInfo;
        this.f17421c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f17419a;
        long j3 = this.f17421c;
        SharedConfig.ProxyInfo proxyInfo = this.f17420b;
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
