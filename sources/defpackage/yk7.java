package defpackage;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
public final class yk7 extends gl7 {
    public int[] e;
    public MediaSessionCompat$Token f;

    @Override
    public final void b(h31 h31Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) h31Var.c;
        if (i >= 34) {
            nk7.d(builder, nk7.b(ok7.a(nk7.a(), null, 0, null, Boolean.FALSE), this.e, this.f));
        } else {
            nk7.d(builder, nk7.b(nk7.a(), this.e, this.f));
        }
    }
}
