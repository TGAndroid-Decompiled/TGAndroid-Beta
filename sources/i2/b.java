package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.qc;
public final class b extends BroadcastReceiver {
    public final c0 f11559a;
    public final e2.z f11560b;
    public final com.google.firebase.messaging.m f11561c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11561c = mVar;
        this.f11560b = zVar;
        this.f11559a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11560b.c(new qc(this, 27));
        }
    }
}
