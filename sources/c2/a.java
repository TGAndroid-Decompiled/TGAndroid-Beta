package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.a0;
public final class a extends BroadcastReceiver {
    public final a0 f4489a;
    public final i0 f4490b;
    public final b f4491c;

    public a(b bVar, i0 i0Var, a0 a0Var) {
        this.f4491c = bVar;
        this.f4490b = i0Var;
        this.f4489a = a0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4490b.d(new androidx.fragment.app.d(this, 5));
        }
    }
}
