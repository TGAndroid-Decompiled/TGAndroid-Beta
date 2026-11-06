package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import di.s7;
import h2.i0;
import l2.c0;
public final class a extends BroadcastReceiver {
    public final c0 f10887a;
    public final i0 f10888b;
    public final ab.q f10889c;

    public a(ab.q qVar, i0 i0Var, c0 c0Var) {
        this.f10889c = qVar;
        this.f10888b = i0Var;
        this.f10887a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10888b.d(new s7(this, 11));
        }
    }
}
