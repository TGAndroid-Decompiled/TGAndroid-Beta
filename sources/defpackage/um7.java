package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class um7 extends jn7 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    @Override
    public final void b(p41 p41Var) {
        Context context = (Context) p41Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) p41Var.c).setBigContentTitle(this.b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                tm7.a(bigContentTitle, pme.a(iconCompat, context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.g) {
            IconCompat iconCompat2 = this.f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                sm7.a(bigContentTitle, pme.a(iconCompat2, context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            tm7.c(bigContentTitle, false);
            tm7.b(bigContentTitle, null);
        }
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
