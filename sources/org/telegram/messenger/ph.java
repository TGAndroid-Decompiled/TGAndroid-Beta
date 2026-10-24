package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class ph implements Runnable {
    public final int f19284a;
    public final SharedConfig.ProxyInfo f19285b;
    public final long f19286c;

    public ph(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f19284a = i10;
        this.f19285b = proxyInfo;
        this.f19286c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f19284a;
        long j10 = this.f19286c;
        SharedConfig.ProxyInfo proxyInfo = this.f19285b;
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
