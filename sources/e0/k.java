package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class k extends y {
    public IconCompat f9261e;
    public IconCompat f9262f;
    public boolean f9263g;

    @Override
    public final void b(e0 e0Var) {
        Context context = (Context) e0Var.f9226c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) e0Var.d).setBigContentTitle(this.f9311b);
        IconCompat iconCompat = this.f9261e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                j.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f9261e.f());
            }
        }
        if (this.f9263g) {
            IconCompat iconCompat2 = this.f9262f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                i.a(bigContentTitle, iconCompat2.m(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f9312c);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            j.c(bigContentTitle, false);
            j.b(bigContentTitle, null);
        }
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
