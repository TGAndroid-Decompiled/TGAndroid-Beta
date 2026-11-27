package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class tn7 {
    public static Notification.BubbleMetadata a(un7 un7Var) {
        boolean z;
        if (un7Var == null) {
            return null;
        }
        PendingIntent pendingIntent = un7Var.a;
        IconCompat iconCompat = un7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pendingIntent, jpe.a(iconCompat, null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
        boolean z2 = true;
        if ((un7Var.d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z);
        if ((un7Var.d & 2) == 0) {
            z2 = false;
        }
        autoExpandBubble.setSuppressNotification(z2);
        int i = un7Var.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
