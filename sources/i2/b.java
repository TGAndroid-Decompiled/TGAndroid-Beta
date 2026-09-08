package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import di.nb;
public final class b extends BroadcastReceiver {
    public final c0 f11486a;
    public final e2.z f11487b;
    public final com.google.firebase.messaging.m f11488c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11488c = mVar;
        this.f11487b = zVar;
        this.f11486a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11487b.c(new nb(this, 23));
        }
    }
}
