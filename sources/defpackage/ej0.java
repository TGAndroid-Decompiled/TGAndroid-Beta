package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class ej0 {
    public final dj0 a;
    public final BiometricManager b;
    public final uj0 c;

    public ej0(dj0 dj0Var) {
        BiometricManager biometricManager;
        Context context = dj0Var.a;
        this.a = dj0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            biometricManager = bj0.b(context);
        } else {
            biometricManager = null;
        }
        this.b = biometricManager;
        this.c = i <= 29 ? new uj0(context, (char) 0) : null;
    }

    public final int a(int i) {
        boolean b;
        boolean b2;
        BiometricPrompt.CryptoObject b3;
        boolean b4;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.b;
            if (biometricManager == null) {
                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                return 1;
            }
            return cj0.a(biometricManager, i);
        } else if (!wmd.c(i)) {
            return -2;
        } else {
            if (i != 0) {
                dj0 dj0Var = this.a;
                Context context = dj0Var.a;
                if (ov5.a(context) != null) {
                    int i4 = 0;
                    if (wmd.b(i)) {
                        KeyguardManager a = ov5.a(context);
                        if (a == null) {
                            b4 = false;
                        } else {
                            b4 = ov5.b(a);
                        }
                        if (b4) {
                            return 0;
                        }
                        return 11;
                    } else if (i2 == 29) {
                        if ((i & 255) == 255) {
                            BiometricManager biometricManager2 = this.b;
                            if (biometricManager2 == null) {
                                Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                                return 1;
                            }
                            return bj0.a(biometricManager2);
                        }
                        Method c = bj0.c();
                        if (c != null && (b3 = rae.b(rae.a())) != null) {
                            try {
                                Object invoke = c.invoke(this.b, b3);
                                if (invoke instanceof Integer) {
                                    return ((Integer) invoke).intValue();
                                }
                                Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                                Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                            }
                        }
                        BiometricManager biometricManager3 = this.b;
                        if (biometricManager3 == null) {
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        } else {
                            i3 = bj0.a(biometricManager3);
                        }
                        String str = Build.MODEL;
                        if (Build.VERSION.SDK_INT < 30 && str != null) {
                            for (String str2 : context.getResources().getStringArray(2130903041)) {
                                if (str.equals(str2)) {
                                    return i3;
                                }
                            }
                        }
                        if (i3 == 0) {
                            KeyguardManager a2 = ov5.a(dj0Var.a);
                            if (a2 == null) {
                                b2 = false;
                            } else {
                                b2 = ov5.b(a2);
                            }
                            if (!b2) {
                                i4 = b();
                            } else if (b() != 0) {
                                i4 = -1;
                            }
                            return i4;
                        }
                        return i3;
                    } else if (i2 == 28) {
                        if (context == null || context.getPackageManager() == null || !kr7.a(context.getPackageManager())) {
                            return 12;
                        }
                        KeyguardManager a3 = ov5.a(dj0Var.a);
                        if (a3 == null) {
                            b = false;
                        } else {
                            b = ov5.b(a3);
                        }
                        if (!b) {
                            return b();
                        }
                        if (b() == 0) {
                            return 0;
                        }
                        return -1;
                    } else {
                        return b();
                    }
                }
            }
            return 12;
        }
    }

    public final int b() {
        uj0 uj0Var = this.c;
        if (uj0Var == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = uj0Var.a;
        FingerprintManager c = dg4.c(context);
        if (c != null && dg4.e(c)) {
            FingerprintManager c2 = dg4.c(context);
            if (c2 != null && dg4.d(c2)) {
                return 0;
            }
            return 11;
        }
        return 12;
    }
}
