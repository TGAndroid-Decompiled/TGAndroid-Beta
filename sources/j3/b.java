package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
public final class b extends BroadcastReceiver implements Runnable {
    public final h0 f10378a;
    public final Handler f10379b;
    public final androidx.activity.n f10380c;

    public b(androidx.activity.n nVar, Handler handler, h0 h0Var) {
        this.f10380c = nVar;
        this.f10379b = handler;
        this.f10378a = h0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10379b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f10380c.f880a) {
            this.f10378a.f10477a.n0(-1, 3, false);
        }
    }
}
