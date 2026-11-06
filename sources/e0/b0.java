package e0;

import android.app.Notification;
public abstract class b0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
        return builder.setAllowGeneratedReplies(z9);
    }
}
