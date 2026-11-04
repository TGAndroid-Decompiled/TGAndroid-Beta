package e9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;
public abstract class b {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static NotificationChannel c(String str) {
        return new NotificationChannel("Assistant_verifier", str, 2);
    }

    public static SurfaceTexture d() {
        return new SurfaceTexture(false);
    }

    public static void e() {
    }
}
