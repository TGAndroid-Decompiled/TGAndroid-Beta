package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class q0 extends BroadcastReceiver {
    public final int f26329a;

    public q0(int i7) {
        this.f26329a = i7;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f26329a) {
            case 0:
                try {
                    t0.f26916c = t0.f26917e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i7 = 0; i7 < 4; i7++) {
                    ConnectionsManager.getInstance(i7).checkConnection();
                    w7.K.c(new i10(1, w7.G(i7), p10));
                }
                return;
            case 1:
                pc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f22743v0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (s2.f26723a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(j10.f24773t0).setAppPaused(true, true);
                    t0.f26922w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (s2.f26723a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(j10.f24773t0).setAppPaused(false, true);
                    t0.f26922w = true;
                }
                ks.e().k(289, new Object[0]);
                return;
        }
    }
}
