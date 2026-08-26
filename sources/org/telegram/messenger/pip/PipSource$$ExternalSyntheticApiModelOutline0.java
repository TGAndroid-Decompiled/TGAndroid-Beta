package org.telegram.messenger.pip;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VoIPService;

public abstract class PipSource$$ExternalSyntheticApiModelOutline0 {
    public static Notification.Builder m(VoIPService voIPService, String str) {
        return new Notification.Builder(voIPService, str);
    }

    public static NotificationChannel m(Object obj) {
        return (NotificationChannel) obj;
    }

    public static NotificationChannel m(String str, String str2) {
        return new NotificationChannel(str, str2, 4);
    }

    public static JobWorkItem m(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static SurfaceTexture m() {
        return new SurfaceTexture(false);
    }
}
