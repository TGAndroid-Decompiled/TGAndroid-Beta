package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class l extends z {
    public IconCompat e;
    public IconCompat f6043f;
    public boolean f6044g;

    @Override
    public final void b(cc.f fVar) {
        Context context = (Context) fVar.f4117c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) fVar.d).setBigContentTitle(this.f6087b);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                k.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.e.f());
            }
        }
        if (this.f6044g) {
            IconCompat iconCompat2 = this.f6043f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                j.a(bigContentTitle, iconCompat2.m(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f6088c);
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
