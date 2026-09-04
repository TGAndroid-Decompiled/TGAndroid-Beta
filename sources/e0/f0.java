package e0;

import android.app.Notification;
public abstract class f0 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
        return builder.setAuthenticationRequired(z10);
    }
}
