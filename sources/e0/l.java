package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class l extends z {
    public IconCompat f8438e;
    public IconCompat f8439f;
    public boolean f8440g;

    @Override
    public final void b(g0 g0Var) {
        Context context = (Context) g0Var.f8410b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) g0Var.f8411c).setBigContentTitle(this.f8496b);
        IconCompat iconCompat = this.f8438e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                k.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f8438e.f());
            }
        }
        if (this.f8440g) {
            IconCompat iconCompat2 = this.f8439f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                j.a(bigContentTitle, iconCompat2.m(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f8497c);
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
