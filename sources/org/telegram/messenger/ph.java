package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class ph implements Runnable {
    public final int f19217a;
    public final SharedConfig.ProxyInfo f19218b;
    public final long f19219c;

    public ph(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f19217a = i10;
        this.f19218b = proxyInfo;
        this.f19219c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f19217a;
        long j10 = this.f19219c;
        SharedConfig.ProxyInfo proxyInfo = this.f19218b;
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
