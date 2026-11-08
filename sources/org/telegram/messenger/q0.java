package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class q0 extends BroadcastReceiver {
    public final int f24661a;

    public q0(int i7) {
        this.f24661a = i7;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f24661a) {
            case 0:
                try {
                    t0.f25567c = t0.f25568e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i7 = 0; i7 < 4; i7++) {
                    ConnectionsManager.getInstance(i7).checkConnection();
                    w7.J.c(new o10(1, w7.G(i7), p10));
                }
                return;
            case 1:
                sc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f21295u0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (r2.f25212a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(p10.f24470s0).setAppPaused(true, true);
                    t0.f25573w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (r2.f25212a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(p10.f24470s0).setAppPaused(false, true);
                    t0.f25573w = true;
                }
                qs.e().k(287, new Object[0]);
                return;
        }
    }
}
