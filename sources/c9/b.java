package c9;

import android.app.Notification;
import android.app.NotificationChannel;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;
public abstract class b {
    public static Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static NotificationChannel b(String str) {
        return new NotificationChannel("Assistant_verifier", str, 2);
    }

    public static SurfaceTexture c() {
        return new SurfaceTexture(false);
    }

    public static void d() {
    }
}
