package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class q0 extends BroadcastReceiver {
    public final int f24843a;

    public q0(int i3) {
        this.f24843a = i3;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f24843a) {
            case 0:
                try {
                    t0.f25458c = t0.f25459e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i3 = 0; i3 < 4; i3++) {
                    ConnectionsManager.getInstance(i3).checkConnection();
                    w7.K.c(new g10(1, w7.G(i3), p10));
                }
                return;
            case 1:
                lc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f21348v0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (r2.f25040a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(h10.f22829t0).setAppPaused(true, true);
                    t0.f25464w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (r2.f25040a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(h10.f22829t0).setAppPaused(false, true);
                    t0.f25464w = true;
                }
                hs.e().k(287, new Object[0]);
                return;
        }
    }
}
