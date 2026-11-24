package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class tk7 {
    public static Notification.BubbleMetadata a(vk7 vk7Var) {
        PendingIntent pendingIntent;
        boolean z;
        if (vk7Var == null || (pendingIntent = vk7Var.a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
        IconCompat iconCompat = vk7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder deleteIntent = builder.setIcon(nke.a(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z2 = true;
        if ((vk7Var.d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z);
        if ((vk7Var.d & 2) == 0) {
            z2 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z2);
        int i = vk7Var.c;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        return suppressNotification.build();
    }
}
