package m6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.z;
public final class j extends z {
    public final Context f19197a;
    public final d f19198b;

    public j(m6.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: m6.j.<init>(m6.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i3);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = e.f19188a;
        d dVar = this.f19198b;
        Context context = this.f19197a;
        int d = dVar.d(context, i10);
        int i11 = g.f19194e;
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
