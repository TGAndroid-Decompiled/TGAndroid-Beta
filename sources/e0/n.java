package e0;

import android.app.Notification;
public abstract class n {
    public static Notification.BubbleMetadata a(o oVar) {
        boolean z10;
        if (oVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(oVar.f8136a, oVar.f8137b.m(null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z11);
        int i10 = oVar.f8138c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
