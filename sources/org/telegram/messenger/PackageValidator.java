package org.telegram.messenger;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;

public final class PackageValidator {
    private static final Set<String> KNOWN_PACKAGES;

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

    private PackageValidator() {
    }

    private static boolean hasPermission(Context context, String str, int i10) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", str) == 0 || packageManager.checkPermission("android.permission.BIND_NOTIFICATION_LISTENER_SERVICE", str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isKnownCaller(Context context, String str, int i10) {
        if (str == null) {
            return false;
        }
        if (i10 == 1000 || i10 == Process.myUid() || KNOWN_PACKAGES.contains(str)) {
            return true;
        }
        return hasPermission(context, str, i10);
    }
}
