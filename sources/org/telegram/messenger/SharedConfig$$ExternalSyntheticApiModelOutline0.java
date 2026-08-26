package org.telegram.messenger;

import android.hardware.fingerprint.FingerprintManager;
import android.security.keystore.KeyGenParameterSpec;

public abstract class SharedConfig$$ExternalSyntheticApiModelOutline0 {
    public static FingerprintManager m(Object obj) {
        return (FingerprintManager) obj;
    }

    public static KeyGenParameterSpec.Builder m() {
        return new KeyGenParameterSpec.Builder("tmessages_passcode", 3);
    }

    public static void m882m() {
    }
}
