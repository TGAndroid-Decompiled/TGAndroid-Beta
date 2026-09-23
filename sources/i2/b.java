package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.rc;
public final class b extends BroadcastReceiver {
    public final c0 f10607a;
    public final e2.z f10608b;
    public final com.google.firebase.messaging.m f10609c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, c0 c0Var) {
        this.f10609c = mVar;
        this.f10608b = zVar;
        this.f10607a = c0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10608b.c(new rc(this, 27));
        }
    }
}
