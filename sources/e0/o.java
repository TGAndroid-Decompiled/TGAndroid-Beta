package e0;

import android.app.Notification;
public abstract class o {
    public static Notification.BubbleMetadata a(p pVar) {
        boolean z10;
        if (pVar == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(pVar.f8459a, pVar.f8460b.m(null));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(null);
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
        autoExpandBubble.setSuppressNotification(z11);
        int i10 = pVar.f8461c;
        if (i10 != 0) {
            builder.setDesiredHeight(i10);
        }
        return builder.build();
    }
}
