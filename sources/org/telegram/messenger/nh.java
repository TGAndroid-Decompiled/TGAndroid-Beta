package org.telegram.messenger;

import android.os.SystemClock;

public final class nh implements Runnable {

    public final int f21092a;

    public final SharedConfig.ProxyInfo f21093b;

    public final long f21094c;

    public nh(SharedConfig.ProxyInfo proxyInfo, long j10, int i10) {
        this.f21092a = i10;
        this.f21093b = proxyInfo;
        this.f21094c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f21092a;
        long j10 = this.f21094c;
        SharedConfig.ProxyInfo proxyInfo = this.f21093b;
        switch (i10) {
            case 0:
                ProxyRotationController.lambda$new$0(proxyInfo, j10);
                break;
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
                break;
        }
    }
}
