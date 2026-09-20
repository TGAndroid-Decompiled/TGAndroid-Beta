package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class n extends b0 {
    public IconCompat e;
    public IconCompat f7814f;
    public boolean f7815g;

    @Override
    public final void b(i0 i0Var) {
        Context context = (Context) i0Var.f7790b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) i0Var.f7791c).setBigContentTitle(this.f7771b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                m.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.f7815g) {
            IconCompat iconCompat2 = this.f7814f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else if (Build.VERSION.SDK_INT >= 23) {
                l.a(bigContentTitle, iconCompat2.m(context));
            } else if (iconCompat2.i() == 1) {
                bigContentTitle.bigLargeIcon(this.f7814f.f());
            } else {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f7772c);
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
