package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class jh implements Runnable {
    public final int f20720a;
    public final SharedConfig.ProxyInfo f20721b;
    public final long f20722c;

    public jh(SharedConfig.ProxyInfo proxyInfo, long j10, int i9) {
        this.f20720a = i9;
        this.f20721b = proxyInfo;
        this.f20722c = j10;
    }

    @Override
    public final void run() {
        int i9 = this.f20720a;
        long j10 = this.f20722c;
        SharedConfig.ProxyInfo proxyInfo = this.f20721b;
        switch (i9) {
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
