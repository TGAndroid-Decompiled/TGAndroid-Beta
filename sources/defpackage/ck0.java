package defpackage;

import android.hardware.biometrics.BiometricManager;
public abstract class ck0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
