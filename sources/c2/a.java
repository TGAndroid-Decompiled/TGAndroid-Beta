package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.c0;
public final class a extends BroadcastReceiver {
    public final c0 f3523a;
    public final i0 f3524b;
    public final ac.a f3525c;

    public a(ac.a aVar, i0 i0Var, c0 c0Var) {
        this.f3525c = aVar;
        this.f3524b = i0Var;
        this.f3523a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f3524b.d(new a3.d(this, 26));
        }
    }
}
