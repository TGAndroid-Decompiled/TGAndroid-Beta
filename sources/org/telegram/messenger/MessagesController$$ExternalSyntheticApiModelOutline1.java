package org.telegram.messenger;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

public abstract class MessagesController$$ExternalSyntheticApiModelOutline1 {
    public static Notification.Builder m(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static NotificationChannel m(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static NotificationChannel m(String str) {
        return new NotificationChannel(str, "Internal notifications", 3);
    }

    public static NotificationChannelGroup m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static NotificationChannelGroup m(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static void m() {
    }
}
