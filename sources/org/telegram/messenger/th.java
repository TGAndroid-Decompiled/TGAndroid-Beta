package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class th implements Runnable {
    public final int f18503a;
    public final SharedConfig.ProxyInfo f18504b;
    public final long f18505c;

    public th(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18503a = i10;
        this.f18504b = proxyInfo;
        this.f18505c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18503a;
        long j10 = this.f18505c;
        SharedConfig.ProxyInfo proxyInfo = this.f18504b;
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
