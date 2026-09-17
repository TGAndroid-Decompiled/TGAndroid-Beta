package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ci.uc;
public final class b extends BroadcastReceiver {
    public final b0 f10621a;
    public final e2.z f10622b;
    public final com.google.firebase.messaging.m f10623c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, b0 b0Var) {
        this.f10623c = mVar;
        this.f10622b = zVar;
        this.f10621a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10622b.c(new uc(this, 27));
        }
    }
}
