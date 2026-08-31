package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
public final class b extends BroadcastReceiver implements Runnable {
    public final c0 f8980a;
    public final Handler f8981b;
    public final androidx.activity.o f8982c;

    public b(androidx.activity.o oVar, Handler handler, c0 c0Var) {
        this.f8982c = oVar;
        this.f8981b = handler;
        this.f8980a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f8981b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f8982c.f355a) {
            this.f8980a.f9000a.g0(-1, 3, false);
        }
    }
}
