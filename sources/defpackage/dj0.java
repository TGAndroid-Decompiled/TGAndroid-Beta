package defpackage;

import android.hardware.biometrics.BiometricManager;
public abstract class dj0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
