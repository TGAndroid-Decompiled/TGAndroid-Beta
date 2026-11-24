package defpackage;

import android.hardware.biometrics.BiometricManager;
public abstract class cj0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
