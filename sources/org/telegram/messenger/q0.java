package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.ConnectionsManager;
public final class q0 extends BroadcastReceiver {
    public final int f26047a;

    public q0(int i7) {
        this.f26047a = i7;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f26047a) {
            case 0:
                try {
                    t0.f26610c = t0.f26611e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p10 = t0.p();
                for (int i7 = 0; i7 < 4; i7++) {
                    ConnectionsManager.getInstance(i7).checkConnection();
                    w7.K.c(new l10(1, w7.G(i7), p10));
                }
                return;
            case 1:
                qc.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.B().R(MediaController.B().f22377v0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (r2.f26206a) {
                        a8.b("screen off");
                    }
                    ConnectionsManager.getInstance(m10.f24940t0).setAppPaused(true, true);
                    t0.f26616w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (r2.f26206a) {
                        a8.b("screen on");
                    }
                    ConnectionsManager.getInstance(m10.f24940t0).setAppPaused(false, true);
                    t0.f26616w = true;
                }
                ns.e().k(287, new Object[0]);
                return;
        }
    }
}
