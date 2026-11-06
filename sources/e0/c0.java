package e0;

import android.app.Notification;
public abstract class c0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
        return builder.setAuthenticationRequired(z9);
    }
}
