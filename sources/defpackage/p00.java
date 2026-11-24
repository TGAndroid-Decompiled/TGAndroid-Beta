package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public final class p00 extends BroadcastReceiver {
    public final c74 a;
    public final dfb b;
    public final yh4 c;

    public p00(yh4 yh4Var, dfb dfbVar, c74 c74Var) {
        this.c = yh4Var;
        this.b = dfbVar;
        this.a = c74Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new f00(this, (byte) 2));
        }
    }
}
