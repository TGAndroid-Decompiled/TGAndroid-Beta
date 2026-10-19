package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class mh implements Runnable {
    public final int f18976a;
    public final SharedConfig.ProxyInfo f18977b;
    public final long f18978c;

    public mh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18976a = i10;
        this.f18977b = proxyInfo;
        this.f18978c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18976a;
        long j10 = this.f18978c;
        SharedConfig.ProxyInfo proxyInfo = this.f18977b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j10);
                return;
            default:
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
                return;
        }
    }
}
