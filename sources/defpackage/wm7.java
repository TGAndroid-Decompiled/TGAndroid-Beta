package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class wm7 {
    public static Notification.BubbleMetadata a(ym7 ym7Var) {
        PendingIntent pendingIntent;
        boolean z;
        if (ym7Var == null || (pendingIntent = ym7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = ym7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder deleteIntent = builder.setIcon(pme.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null);
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
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z2);
        int i = ym7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
