package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class rh implements Runnable {
    public final int f18911a;
    public final SharedConfig.ProxyInfo f18912b;
    public final long f18913c;

    public rh(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f18911a = i10;
        this.f18912b = proxyInfo;
        this.f18913c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f18911a;
        long j3 = this.f18913c;
        SharedConfig.ProxyInfo proxyInfo = this.f18912b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j3);
                return;
            default:
                proxyInfo.availableCheckTime = SystemClock.elapsedRealtime();
                proxyInfo.checking = false;
                if (j3 == -1) {
                    proxyInfo.available = false;
                    proxyInfo.ping = 0L;
                } else {
                    proxyInfo.ping = j3;
                    proxyInfo.available = true;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxyCheckDone, proxyInfo);
                return;
        }
    }
}
