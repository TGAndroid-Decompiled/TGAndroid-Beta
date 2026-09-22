package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class rh implements Runnable {
    public final int f17245a;
    public final SharedConfig.ProxyInfo f17246b;
    public final long f17247c;

    public rh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f17245a = i10;
        this.f17246b = proxyInfo;
        this.f17247c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f17245a;
        long j3 = this.f17247c;
        SharedConfig.ProxyInfo proxyInfo = this.f17246b;
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
