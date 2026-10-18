package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class lh implements Runnable {
    public final int f18898a;
    public final SharedConfig.ProxyInfo f18899b;
    public final long f18900c;

    public lh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18898a = i10;
        this.f18899b = proxyInfo;
        this.f18900c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18898a;
        long j10 = this.f18900c;
        SharedConfig.ProxyInfo proxyInfo = this.f18899b;
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
