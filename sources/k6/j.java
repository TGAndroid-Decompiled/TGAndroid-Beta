package k6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends z {
    public final Context f10945a;
    public final d f10946b;

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
        int i11 = e.f10936a;
        d dVar = this.f10946b;
        Context context = this.f10945a;
        int d = dVar.d(context, i11);
        AtomicBoolean atomicBoolean = g.f10939a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(d, context, "n");
        if (b10 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b10, 201326592);
        }
        dVar.h(context, d, activity);
    }
}
