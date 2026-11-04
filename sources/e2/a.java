package e2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.d1;
import g2.j0;
import k2.c0;
public final class a extends BroadcastReceiver {
    public final c0 f9326a;
    public final j0 f9327b;
    public final b4.n f9328c;

    public a(b4.n nVar, j0 j0Var, c0 c0Var) {
        this.f9328c = nVar;
        this.f9327b = j0Var;
        this.f9326a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f9327b.d(new d1(this, 19));
        }
    }
}
