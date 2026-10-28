package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class rh implements Runnable {
    public final int f21132a;
    public final SharedConfig.ProxyInfo f21133b;
    public final long f21134c;

    public rh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f21132a = i10;
        this.f21133b = proxyInfo;
        this.f21134c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f21132a;
        long j10 = this.f21134c;
        SharedConfig.ProxyInfo proxyInfo = this.f21133b;
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
