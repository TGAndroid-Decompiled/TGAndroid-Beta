package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class th implements Runnable {
    public final int f20123a;
    public final SharedConfig.ProxyInfo f20124b;
    public final long f20125c;

    public th(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f20123a = i10;
        this.f20124b = proxyInfo;
        this.f20125c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f20123a;
        long j10 = this.f20125c;
        SharedConfig.ProxyInfo proxyInfo = this.f20124b;
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
