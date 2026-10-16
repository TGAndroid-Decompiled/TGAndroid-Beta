package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bi.la;
import e2.i0;
import i2.b0;
public final class a extends BroadcastReceiver {
    public final b0 f4119a;
    public final i0 f4120b;
    public final b f4121c;

    public a(b bVar, i0 i0Var, b0 b0Var) {
        this.f4121c = bVar;
        this.f4120b = i0Var;
        this.f4119a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4120b.d(new la(this, 8));
        }
    }
}
