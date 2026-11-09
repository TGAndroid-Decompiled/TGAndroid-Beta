package c2;

import a4.k;
import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import e0.y;
public final class c extends y {
    public int[] f5256e;
    public MediaSessionCompat$Token f5257f;

    @Override
    public final void b(k kVar) {
        Notification.Builder builder = (Notification.Builder) kVar.d;
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f5256e, this.f5257f));
        } else {
            a.d(builder, a.b(a.a(), this.f5256e, this.f5257f));
        }
    }
}
