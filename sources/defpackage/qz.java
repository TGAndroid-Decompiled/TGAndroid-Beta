package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public final class qz extends BroadcastReceiver {
    public final n64 a;
    public final xgb b;
    public final vh4 c;

    public qz(vh4 vh4Var, xgb xgbVar, n64 n64Var) {
        this.c = vh4Var;
        this.b = xgbVar;
        this.a = n64Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new pz(this, (byte) 0));
        }
    }
}
