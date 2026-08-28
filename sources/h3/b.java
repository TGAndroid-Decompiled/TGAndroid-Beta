package h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
public final class b extends BroadcastReceiver implements Runnable {
    public final h0 f9339a;
    public final Handler f9340b;
    public final androidx.activity.o f9341c;

    public b(androidx.activity.o oVar, Handler handler, h0 h0Var) {
        this.f9341c = oVar;
        this.f9340b = handler;
        this.f9339a = h0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f9340b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f9341c.f387a) {
            this.f9339a.f9440a.n0(-1, 3, false);
        }
    }
}
