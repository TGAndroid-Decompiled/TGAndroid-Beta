package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class sn7 {
    public static Notification.BubbleMetadata a(un7 un7Var) {
        PendingIntent pendingIntent;
        boolean z;
        if (un7Var == null || (pendingIntent = un7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = un7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder deleteIntent = builder.setIcon(jpe.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null);
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
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z2);
        int i = un7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
