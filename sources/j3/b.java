package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
public final class b extends BroadcastReceiver implements Runnable {
    public final c0 f8405a;
    public final Handler f8406b;
    public final androidx.activity.o f8407c;

    public b(androidx.activity.o oVar, Handler handler, c0 c0Var) {
        this.f8407c = oVar;
        this.f8406b = handler;
        this.f8405a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f8406b.post(this);
        }
    }

    @Override
    public final void run() {
        if (this.f8407c.f332a) {
            this.f8405a.f8423a.g0(-1, 3, false);
        }
    }
}
