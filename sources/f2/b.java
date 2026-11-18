package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.z;
public final class b extends BroadcastReceiver {
    public final z f11022a;
    public final i0 f11023b;
    public final ab.q f11024c;

    public b(ab.q qVar, i0 i0Var, z zVar) {
        this.f11024c = qVar;
        this.f11023b = i0Var;
        this.f11022a = zVar;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11023b.d(new a(this, 1));
        }
    }
}
