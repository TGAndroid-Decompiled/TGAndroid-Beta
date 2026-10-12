package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.rc;
public final class b extends BroadcastReceiver {
    public final c0 f11608a;
    public final e2.z f11609b;
    public final com.google.firebase.messaging.m f11610c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11610c = mVar;
        this.f11609b = zVar;
        this.f11608a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11609b.c(new rc(this, 27));
        }
    }
}
