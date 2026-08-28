package e0;

import android.app.Notification;
public abstract class q {
    public static Notification.BubbleMetadata a(r rVar) {
        boolean z10;
        if (rVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(rVar.f4755a, rVar.f4756b.m(null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z11);
        int i9 = rVar.f4757c;
        if (i9 != 0) {
            builder.setDesiredHeight(i9);
        }
        return builder.build();
    }
}
