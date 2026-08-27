package h3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class b extends BroadcastReceiver implements Runnable {

    public final h0 f7771a;

    public final Handler f7772b;

    public final androidx.activity.n f7773c;

    public b(androidx.activity.n nVar, Handler handler, h0 h0Var) {
        this.f7773c = nVar;
        this.f7772b = handler;
        this.f7771a = h0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f7772b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f7773c.f893a) {
            this.f7771a.f7870a.n0(-1, 3, false);
        }
    }
}
