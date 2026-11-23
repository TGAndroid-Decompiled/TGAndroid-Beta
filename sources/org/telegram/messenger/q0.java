package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class q0 extends BroadcastReceiver {
    public final int f26434a;

    public q0(int i7) {
        this.f26434a = i7;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f26434a) {
            case 0:
                try {
                    t0.f27014c = t0.f27015e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i7 = 0; i7 < 4; i7++) {
                    ConnectionsManager.getInstance(i7).checkConnection();
                    w7.K.c(new h10(1, w7.G(i7), p10));
                }
                return;
            case 1:
                pc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f22838v0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (s2.f26829a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(i10.f24637t0).setAppPaused(true, true);
                    t0.f27020w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (s2.f26829a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(i10.f24637t0).setAppPaused(false, true);
                    t0.f27020w = true;
                }
                ks.e().k(290, new Object[0]);
                return;
        }
    }
}
