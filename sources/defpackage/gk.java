package defpackage;

import android.app.Notification;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.FilesMigrationService;
public abstract class gk {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static PictureInPictureParams.Builder c() {
        return new PictureInPictureParams.Builder();
    }

    public static SurfaceTexture d() {
        return new SurfaceTexture(false);
    }

    public static void e() {
    }

    public static void f() {
    }

    public static void g() {
    }
}
