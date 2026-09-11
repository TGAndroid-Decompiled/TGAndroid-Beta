package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import di.nb;
public final class b extends BroadcastReceiver {
    public final c0 f11460a;
    public final e2.z f11461b;
    public final com.google.firebase.messaging.m f11462c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11462c = mVar;
        this.f11461b = zVar;
        this.f11460a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11461b.c(new nb(this, 23));
        }
    }
}
