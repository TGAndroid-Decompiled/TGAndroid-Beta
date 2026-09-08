package k6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends c0 {
    public final Context f14850a;
    public final d f14851b;

    public j(k6.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: k6.j.<init>(k6.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        int i10;
        PendingIntent activity;
        int i11 = message.what;
        if (i11 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i11);
            return;
        }
        int i12 = e.f14841a;
        d dVar = this.f14851b;
        Context context = this.f14850a;
        int d = dVar.d(context, i12);
        AtomicBoolean atomicBoolean = g.f14844a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(context, "n", d);
        if (b10 == null) {
            activity = null;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            activity = PendingIntent.getActivity(context, 0, b10, i10);
        }
        dVar.h(context, d, activity);
    }
}
