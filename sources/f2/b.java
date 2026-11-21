package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.z;
public final class b extends BroadcastReceiver {
    public final z f11051a;
    public final i0 f11052b;
    public final ab.q f11053c;

    public b(ab.q qVar, i0 i0Var, z zVar) {
        this.f11053c = qVar;
        this.f11052b = i0Var;
        this.f11051a = zVar;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11052b.d(new a(this, 1));
        }
    }
}
