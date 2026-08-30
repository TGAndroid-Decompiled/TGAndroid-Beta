package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
public final class b extends BroadcastReceiver implements Runnable {
    public final c0 f8423a;
    public final Handler f8424b;
    public final androidx.activity.o f8425c;

    public b(androidx.activity.o oVar, Handler handler, c0 c0Var) {
        this.f8425c = oVar;
        this.f8424b = handler;
        this.f8423a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f8424b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f8425c.f317a) {
            this.f8423a.f8441a.g0(-1, 3, false);
        }
    }
}
