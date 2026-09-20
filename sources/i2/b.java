package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.uc;
public final class b extends BroadcastReceiver {
    public final b0 f10622a;
    public final e2.z f10623b;
    public final com.google.firebase.messaging.m f10624c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, b0 b0Var) {
        this.f10624c = mVar;
        this.f10623b = zVar;
        this.f10622a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10623b.c(new uc(this, 27));
        }
    }
}
