package e0;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class m {
    public static Notification.BubbleMetadata a(o oVar) {
        PendingIntent pendingIntent;
        boolean z10;
        if (oVar == null || (pendingIntent = oVar.f9572a) == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(oVar.f9573b.m(null)).setIntent(pendingIntent).setDeleteIntent(null);
        boolean z11 = true;
        if ((oVar.d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.BubbleMetadata.Builder autoExpandBubble = deleteIntent.setAutoExpandBubble(z10);
        if ((oVar.d & 2) == 0) {
            z11 = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = autoExpandBubble.setSuppressNotification(z11);
        int i10 = oVar.f9574c;
        if (i10 != 0) {
            suppressNotification.setDesiredHeight(i10);
        }
        return suppressNotification.build();
    }
}
