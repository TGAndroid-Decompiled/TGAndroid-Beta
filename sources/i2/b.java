package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.rc;
public final class b extends BroadcastReceiver {
    public final c0 f11609a;
    public final e2.z f11610b;
    public final com.google.firebase.messaging.m f11611c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11611c = mVar;
        this.f11610b = zVar;
        this.f11609a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11610b.c(new rc(this, 27));
        }
    }
}
