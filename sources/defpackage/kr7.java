package defpackage;

import android.content.pm.PackageManager;
public abstract class kr7 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
