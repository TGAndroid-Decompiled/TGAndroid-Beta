package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e2.i0;
import i2.b0;
public final class a extends BroadcastReceiver {
    public final b0 f4490a;
    public final i0 f4491b;
    public final b f4492c;

    public a(b bVar, i0 i0Var, b0 b0Var) {
        this.f4492c = bVar;
        this.f4491b = i0Var;
        this.f4490a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4491b.d(new androidx.fragment.app.d(this, 5));
        }
    }
}
