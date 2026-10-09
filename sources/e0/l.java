package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class l extends z {
    public IconCompat f8441e;
    public IconCompat f8442f;
    public boolean f8443g;

    @Override
    public final void b(g0 g0Var) {
        Context context = (Context) g0Var.f8413b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) g0Var.f8414c).setBigContentTitle(this.f8499b);
        IconCompat iconCompat = this.f8441e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                k.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f8441e.f());
            }
        }
        if (this.f8443g) {
            IconCompat iconCompat2 = this.f8442f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                j.a(bigContentTitle, iconCompat2.m(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f8500c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            k.c(bigContentTitle, false);
            k.b(bigContentTitle, null);
        }
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
