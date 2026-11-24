package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
public final class n4d extends q79 {
    public final Context a;
    public final d05 b;

    public n4d(defpackage.d05 r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4d.<init>(d05, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = e05.a;
        d05 d05Var = this.b;
        Context context = this.a;
        int c = d05Var.c(context, i2);
        int i3 = x05.e;
        if (c != 1 && c != 2 && c != 3 && c != 9) {
            return;
        }
        Intent a = d05Var.a(c, context, "n");
        if (a == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a, 201326592);
        }
        d05Var.g(context, c, activity);
    }
}
