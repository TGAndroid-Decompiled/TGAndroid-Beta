package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bi.u6;
import e2.i0;
import i2.d0;
public final class a extends BroadcastReceiver {
    public final d0 f5926a;
    public final i0 f5927b;
    public final b f5928c;

    public a(b bVar, i0 i0Var, d0 d0Var) {
        this.f5928c = bVar;
        this.f5927b = i0Var;
        this.f5926a = d0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f5927b.d(new u6(this, 9));
        }
    }
}
