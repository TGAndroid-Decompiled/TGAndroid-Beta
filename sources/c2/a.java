package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.c0;
public final class a extends BroadcastReceiver {
    public final c0 f4488a;
    public final i0 f4489b;
    public final b f4490c;

    public a(b bVar, i0 i0Var, c0 c0Var) {
        this.f4490c = bVar;
        this.f4489b = i0Var;
        this.f4488a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4489b.d(new androidx.fragment.app.d(this, 5));
        }
    }
}
