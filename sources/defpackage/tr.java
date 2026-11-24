package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
public final class tr extends BroadcastReceiver {
    public final byte a;

    public tr(byte b) {
        this.a = b;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                try {
                    a.c = a.e.getActiveNetworkInfo();
                } catch (Throwable unused) {
                }
                boolean p = a.p();
                for (int i = 0; i < 4; i++) {
                    ConnectionsManager.getInstance(i).checkConnection();
                    ba4.K.c(new x6c((byte) 17, ba4.G(i), p));
                }
                return;
            case 1:
                e66.h(intent);
                return;
            case 2:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    MediaController.w().Q(MediaController.w().v0, true);
                    return;
                }
                return;
            default:
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    if (w01.a) {
                        fa4.b("screen off");
                    }
                    ConnectionsManager.getInstance(y6c.t0).setAppPaused(true, true);
                    a.w = false;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    if (w01.a) {
                        fa4.b("screen on");
                    }
                    ConnectionsManager.getInstance(y6c.t0).setAppPaused(false, true);
                    a.w = true;
                }
                kk7.e().k(290, new Object[0]);
                return;
        }
    }
}
