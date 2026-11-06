package e0;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class m {
    public static Notification.BubbleMetadata a(o oVar) {
        PendingIntent pendingIntent;
        boolean z9;
        if (oVar == null || (pendingIntent = oVar.f10091a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(oVar.f10092b.m(null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z10 = true;
        if ((oVar.d & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z9);
        if ((oVar.d & 2) == 0) {
            z10 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z10);
        int i7 = oVar.f10093c;
        if (i7 != 0) {
            suppressNotification.setDesiredHeight(i7);
        }
        return suppressNotification.build();
    }
}
