package defpackage;

import android.content.pm.PackageManager;
public abstract class qu7 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
