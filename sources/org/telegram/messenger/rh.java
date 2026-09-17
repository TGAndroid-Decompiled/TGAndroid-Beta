package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class rh implements Runnable {
    public final int f17258a;
    public final SharedConfig.ProxyInfo f17259b;
    public final long f17260c;

    public rh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f17258a = i10;
        this.f17259b = proxyInfo;
        this.f17260c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f17258a;
        long j3 = this.f17260c;
        SharedConfig.ProxyInfo proxyInfo = this.f17259b;
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
