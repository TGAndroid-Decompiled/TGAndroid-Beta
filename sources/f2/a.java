package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.w;
import h2.i0;
import l2.z;
public final class a extends BroadcastReceiver {
    public final z f10703a;
    public final i0 f10704b;
    public final ab.q f10705c;

    public a(ab.q qVar, i0 i0Var, z zVar) {
        this.f10705c = qVar;
        this.f10704b = i0Var;
        this.f10703a = zVar;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10704b.d(new w(this, 27));
        }
    }
}
