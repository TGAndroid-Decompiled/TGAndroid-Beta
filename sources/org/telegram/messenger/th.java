package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class th implements Runnable {
    public final int f18513a;
    public final SharedConfig.ProxyInfo f18514b;
    public final long f18515c;

    public th(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18513a = i10;
        this.f18514b = proxyInfo;
        this.f18515c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18513a;
        long j10 = this.f18515c;
        SharedConfig.ProxyInfo proxyInfo = this.f18514b;
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
