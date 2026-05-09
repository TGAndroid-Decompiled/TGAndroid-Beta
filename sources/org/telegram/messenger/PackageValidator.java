package org.telegram.messenger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;

public final class PackageValidator {
    private static final Set<String> KNOWN_PACKAGES;

    private PackageValidator() {
    }

    static {
        HashSet hashSet = new HashSet();
        KNOWN_PACKAGES = hashSet;
        hashSet.add("com.google.android.projection.gearhead");
        hashSet.add("com.google.android.mediasimulator");
        hashSet.add("com.android.car.media");
        hashSet.add("com.android.car.carlauncher");
        hashSet.add("com.google.android.car.kitchensink");
        hashSet.add("com.google.android.wearable.app");
        hashSet.add("com.google.android.wearable.media.sessions");
        hashSet.add("com.google.android.googlequicksearchbox");
        hashSet.add("com.google.android.apps.gsa.staticplugins");
        hashSet.add("com.google.android.bluetooth");
    }

    public static boolean isKnownCaller(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        if (i == 1000 || i == Process.myUid() || KNOWN_PACKAGES.contains(str)) {
            return true;
        }
        return hasPermission(context, str, i);
    }

    private static boolean hasPermission(Context context, String str, int i) {
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", str) == 0) {
                return true;
            }
            return packageManager.checkPermission("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
