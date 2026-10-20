package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class nh implements Runnable {
    public final int f19070a;
    public final SharedConfig.ProxyInfo f19071b;
    public final long f19072c;

    public nh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f19070a = i10;
        this.f19071b = proxyInfo;
        this.f19072c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f19070a;
        long j10 = this.f19072c;
        SharedConfig.ProxyInfo proxyInfo = this.f19071b;
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
