package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.messenger.SharedConfig;
public final class mh implements Runnable {
    public final int f18973a;
    public final SharedConfig.ProxyInfo f18974b;
    public final long f18975c;

    public mh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f18973a = i10;
        this.f18974b = proxyInfo;
        this.f18975c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f18973a;
        long j10 = this.f18975c;
        SharedConfig.ProxyInfo proxyInfo = this.f18974b;
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
