package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
public abstract class uk7 {
    public static Notification.BubbleMetadata a(vk7 vk7Var) {
        boolean z;
        if (vk7Var == null) {
            return null;
        }
        PendingIntent pendingIntent = vk7Var.a;
        IconCompat iconCompat = vk7Var.b;
        iconCompat.getClass();
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pendingIntent, nke.a(iconCompat, null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z2);
        int i = vk7Var.c;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        return builder.build();
    }
}
