package n6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends y {
    public final Context f20506a;
    public final d f20507b;

    public j(n6.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: n6.j.<init>(n6.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i7 = message.what;
        if (i7 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i7);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = e.f20497a;
        d dVar = this.f20507b;
        Context context = this.f20506a;
        int d = dVar.d(context, i10);
        AtomicBoolean atomicBoolean = g.f20500a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(d, context, "n");
        if (b10 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b10, 201326592);
        }
        dVar.f(context, d, activity);
    }
}
