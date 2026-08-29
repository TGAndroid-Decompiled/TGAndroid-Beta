package e0;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class p {
    public static Notification.BubbleMetadata a(r rVar) {
        PendingIntent pendingIntent;
        boolean z10;
        if (rVar == null || (pendingIntent = rVar.f5725a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(rVar.f5726b.m(null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z11 = true;
        if ((rVar.d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z10);
        if ((rVar.d & 2) == 0) {
            z11 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z11);
        int i10 = rVar.f5727c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
