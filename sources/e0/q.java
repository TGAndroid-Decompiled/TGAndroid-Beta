package e0;

import android.app.Notification;
public abstract class q {
    public static Notification.BubbleMetadata a(r rVar) {
        boolean z4;
        if (rVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(rVar.f5014a, rVar.f5015b.m(null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z10);
        int i10 = rVar.f5016c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
