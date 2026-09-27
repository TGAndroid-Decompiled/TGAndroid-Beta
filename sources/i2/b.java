package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.qc;
public final class b extends BroadcastReceiver {
    public final c0 f10610a;
    public final e2.z f10611b;
    public final com.google.firebase.messaging.m f10612c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f10612c = mVar;
        this.f10611b = zVar;
        this.f10610a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10611b.c(new qc(this, 27));
        }
    }
}
