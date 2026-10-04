package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.qc;
public final class b extends BroadcastReceiver {
    public final c0 f11560a;
    public final e2.z f11561b;
    public final com.google.firebase.messaging.m f11562c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f11562c = mVar;
        this.f11561b = zVar;
        this.f11560a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f11561b.c(new qc(this, 27));
        }
    }
}
