package b2;

import android.app.Notification;
import android.app.PendingIntent;
public abstract class b {
    public static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i3, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i3, pendingIntent);
        }
        return mediaStyle;
    }
}
