package org.telegram.messenger;

import android.app.Notification;
import android.graphics.SurfaceTexture;
public abstract class v3 {
    public static Notification.Builder a(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static SurfaceTexture b() {
        return new SurfaceTexture(false);
    }
}
