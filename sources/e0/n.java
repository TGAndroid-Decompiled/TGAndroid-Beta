package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class n extends b0 {
    public IconCompat f8654e;
    public IconCompat f8655f;
    public boolean f8656g;

    @Override
    public final void b(i0 i0Var) {
        Context context = (Context) i0Var.f8626b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) i0Var.f8627c).setBigContentTitle(this.f8604b);
        IconCompat iconCompat = this.f8654e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f8654e.f());
            }
        }
        if (this.f8656g) {
            IconCompat iconCompat2 = this.f8655f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                l.a(bigContentTitle, iconCompat2.m(context));
            } else if (iconCompat2.i() == 1) {
                bigContentTitle.bigLargeIcon(this.f8655f.f());
            } else {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f8605c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            m.c(bigContentTitle, false);
            m.b(bigContentTitle, null);
        }
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
