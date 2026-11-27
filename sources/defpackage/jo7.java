package defpackage;

import android.app.Notification;
public abstract class jo7 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }
}
