package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class oh implements Runnable {
    public final int f19149a;
    public final SharedConfig.ProxyInfo f19150b;
    public final long f19151c;

    public oh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f19149a = i10;
        this.f19150b = proxyInfo;
        this.f19151c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f19149a;
        long j10 = this.f19151c;
        SharedConfig.ProxyInfo proxyInfo = this.f19150b;
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
