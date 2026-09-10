package e0;

import android.app.Notification;
public abstract class q {
    public static Notification.BubbleMetadata a(r rVar) {
        boolean z10;
        if (rVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(rVar.f7129a, rVar.f7130b.m(null));
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
        int i10 = rVar.f7131c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
