package k6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends a0 {
    public final Context f14715a;
    public final d f14716b;

    public j(k6.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: k6.j.<init>(k6.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.f14706a;
        d dVar = this.f14716b;
        Context context = this.f14715a;
        int d = dVar.d(context, i11);
        AtomicBoolean atomicBoolean = g.f14709a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(context, "n", d);
        if (b10 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b10, 201326592);
        }
        dVar.h(context, d, activity);
    }
}
