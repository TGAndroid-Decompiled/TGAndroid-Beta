package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class t0 extends BroadcastReceiver {
    public final int f17979a;

    public t0(int i10) {
        this.f17979a = i10;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f17979a) {
            case 0:
                try {
                    w0.f19026c = w0.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p5 = w0.p();
                for (int i10 = 0; i10 < 4; i10++) {
                    ConnectionsManager.getInstance(i10).checkConnection();
                    b8.J.c(new c20(1, b8.G(i10), p5));
                }
                return;
            case 1:
                sc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f14482u0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (v2.f18448a) {
                        f8.b("screen off");
                    }
                    ConnectionsManager.getInstance(d20.f15147s0).setAppPaused(true, true);
                    w0.f19031w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (v2.f18448a) {
                        f8.b("screen on");
                    }
                    ConnectionsManager.getInstance(d20.f15147s0).setAppPaused(false, true);
                    w0.f19031w = true;
                }
                zs.e().k(287, new Object[0]);
                return;
        }
    }
}
