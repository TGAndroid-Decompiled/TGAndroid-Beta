package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
public final class bn7 extends jn7 {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override
    public final void b(p41 p41Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) p41Var.c;
        if (i >= 34) {
            qm7.d(builder, qm7.b(rm7.a(qm7.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            qm7.d(builder, qm7.b(qm7.a(), this.e, this.f));
        }
    }
}
