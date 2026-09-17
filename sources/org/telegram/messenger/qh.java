package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class qh implements Runnable {
    public final int f18836a;
    public final SharedConfig.ProxyInfo f18837b;
    public final long f18838c;

    public qh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f18836a = i10;
        this.f18837b = proxyInfo;
        this.f18838c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f18836a;
        long j3 = this.f18838c;
        SharedConfig.ProxyInfo proxyInfo = this.f18837b;
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
