package e0;

import android.app.Notification;
public abstract class n {
    public static Notification.BubbleMetadata a(o oVar) {
        boolean z9;
        if (oVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(oVar.f10096a, oVar.f10097b.m(null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z10);
        int i7 = oVar.f10098c;
        if (i7 != 0) {
            builder.setDesiredHeight(i7);
        }
        return builder.build();
    }
}
