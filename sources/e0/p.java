package e0;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class p {
    public static Notification.BubbleMetadata a(r rVar) {
        PendingIntent pendingIntent;
        boolean z4;
        if (rVar == null || (pendingIntent = rVar.f4844a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(rVar.f4845b.m(null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z10 = true;
        if ((rVar.d & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z4);
        if ((rVar.d & 2) == 0) {
            z10 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z10);
        int i10 = rVar.f4846c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
