package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.a0;
public final class b extends BroadcastReceiver {
    public final a0 f11015a;
    public final i0 f11016b;
    public final ab.q f11017c;

    public b(ab.q qVar, i0 i0Var, a0 a0Var) {
        this.f11017c = qVar;
        this.f11016b = i0Var;
        this.f11015a = a0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11016b.d(new a(this, 0));
        }
    }
}
