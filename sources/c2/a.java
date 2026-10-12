package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bi.la;
import e2.i0;
import i2.b0;
public final class a extends BroadcastReceiver {
    public final b0 f4115a;
    public final i0 f4116b;
    public final b f4117c;

    public a(b bVar, i0 i0Var, b0 b0Var) {
        this.f4117c = bVar;
        this.f4116b = i0Var;
        this.f4115a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4116b.d(new la(this, 8));
        }
    }
}
