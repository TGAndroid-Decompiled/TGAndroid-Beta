package e0;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class n {
    public static Notification.BubbleMetadata a(p pVar) {
        PendingIntent pendingIntent;
        boolean z10;
        if (pVar == null || (pendingIntent = pVar.f8460a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(pVar.f8461b.m(null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z11 = true;
        if ((pVar.d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z10);
        if ((pVar.d & 2) == 0) {
            z11 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z11);
        int i10 = pVar.f8462c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
