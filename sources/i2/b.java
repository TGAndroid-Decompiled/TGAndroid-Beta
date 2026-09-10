package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gg.v1;
public final class b extends BroadcastReceiver {
    public final b0 f10105a;
    public final e2.z f10106b;
    public final com.google.firebase.messaging.m f10107c;

    public b(com.google.firebase.messaging.m mVar, e2.z zVar, b0 b0Var) {
        this.f10107c = mVar;
        this.f10106b = zVar;
        this.f10105a = b0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f10106b.c(new v1(this, 10));
        }
    }
}
