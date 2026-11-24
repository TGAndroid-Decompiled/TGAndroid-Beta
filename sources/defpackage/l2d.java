package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
public final class l2d extends o59 {
    public final Context a;
    public final cy4 b;

    public l2d(defpackage.cy4 r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2d.<init>(cy4, android.content.Context):void");
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
        int i2 = dy4.a;
        cy4 cy4Var = this.b;
        Context context = this.a;
        int c = cy4Var.c(context, i2);
        int i3 = yy4.e;
        if (c != 1 && c != 2 && c != 3 && c != 9) {
            return;
        }
        Intent a = cy4Var.a(c, context, "n");
        if (a == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, a, 201326592);
        }
        cy4Var.g(context, c, activity);
    }
}
