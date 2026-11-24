package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class xm7 {
    public static Notification.BubbleMetadata a(ym7 ym7Var) {
        boolean z;
        if (ym7Var == null) {
            return null;
        }
        PendingIntent pendingIntent = ym7Var.a;
        IconCompat iconCompat = ym7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pendingIntent, pme.a(iconCompat, null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
        boolean z2 = true;
        if ((ym7Var.d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z);
        if ((ym7Var.d & 2) == 0) {
            z2 = false;
        }
        autoExpandBubble.setSuppressNotification(z2);
        int i = ym7Var.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
