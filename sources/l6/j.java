package l6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.y;
public final class j extends y {
    public final Context f16938a;
    public final d f16939b;

    public j(l6.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: l6.j.<init>(l6.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.f16930a;
        d dVar = this.f16939b;
        Context context = this.f16938a;
        int d = dVar.d(context, i11);
        int i12 = g.e;
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
