package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class lh implements Runnable {
    public final int f18897a;
    public final SharedConfig.ProxyInfo f18898b;
    public final long f18899c;

    public lh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18897a = i10;
        this.f18898b = proxyInfo;
        this.f18899c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18897a;
        long j10 = this.f18899c;
        SharedConfig.ProxyInfo proxyInfo = this.f18898b;
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
