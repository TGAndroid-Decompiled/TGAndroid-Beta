package e0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
public final class k extends y {
    public IconCompat f10087e;
    public IconCompat f10088f;
    public boolean f10089g;

    @Override
    public final void b(a4.k kVar) {
        Context context = (Context) kVar.f192c;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) kVar.d).setBigContentTitle(this.f10132b);
        IconCompat iconCompat = this.f10087e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                j.a(bigContentTitle, iconCompat.m(context));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f10087e.f());
            }
        }
        if (this.f10089g) {
            IconCompat iconCompat2 = this.f10088f;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                i.a(bigContentTitle, iconCompat2.m(context));
            }
        }
        if (this.d) {
            bigContentTitle.setSummaryText(this.f10133c);
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
