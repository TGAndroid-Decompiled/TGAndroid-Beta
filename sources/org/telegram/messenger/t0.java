package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class t0 extends BroadcastReceiver {
    public final int f18188a;

    public t0(int i10) {
        this.f18188a = i10;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f18188a) {
            case 0:
                try {
                    w0.f18946c = w0.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p5 = w0.p();
                for (int i10 = 0; i10 < 4; i10++) {
                    ConnectionsManager.getInstance(i10).checkConnection();
                    b8.J.c(new d20(1, b8.G(i10), p5));
                }
                return;
            case 1:
                tc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f14483u0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (v2.f18578a) {
                        f8.b("screen off");
                    }
                    ConnectionsManager.getInstance(e20.f15506s0).setAppPaused(true, true);
                    w0.f18951w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (v2.f18578a) {
                        f8.b("screen on");
                    }
                    ConnectionsManager.getInstance(e20.f15506s0).setAppPaused(false, true);
                    w0.f18951w = true;
                }
                at.e().k(287, new Object[0]);
                return;
        }
    }
}
