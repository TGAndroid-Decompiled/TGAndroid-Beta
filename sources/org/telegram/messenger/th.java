package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class th implements Runnable {
    public final int f19014a;
    public final SharedConfig.ProxyInfo f19015b;
    public final long f19016c;

    public th(SharedConfig.ProxyInfo proxyInfo, long j3, int i10) {
        this.f19014a = i10;
        this.f19015b = proxyInfo;
        this.f19016c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f19014a;
        long j3 = this.f19016c;
        SharedConfig.ProxyInfo proxyInfo = this.f19015b;
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
