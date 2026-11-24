package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public final class pz extends BroadcastReceiver {
    public final t54 a;
    public final cdb b;
    public final xf4 c;

    public pz(xf4 xf4Var, cdb cdbVar, t54 t54Var) {
        this.c = xf4Var;
        this.b = cdbVar;
        this.a = t54Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new oz(this, (byte) 0));
        }
    }
}
