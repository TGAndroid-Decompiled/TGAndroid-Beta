package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class hj0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public byte d = 0;

    public final hj0 a() {
        String str;
        boolean z;
        if (!TextUtils.isEmpty(this.a)) {
            if (wmd.c(this.d)) {
                byte b = this.d;
                if (b != 0) {
                    z = wmd.b(b);
                } else {
                    z = false;
                }
                if (TextUtils.isEmpty(this.c) && !z) {
                    w26.j("Negative text must be set and non-empty.");
                    return null;
                } else if (!TextUtils.isEmpty(this.c) && z) {
                    w26.j("Negative text must not be set if device credential authentication is allowed.");
                    return null;
                } else {
                    String str2 = this.a;
                    String str3 = this.b;
                    String str4 = this.c;
                    byte b2 = this.d;
                    ?? obj = new Object();
                    obj.a = str2;
                    obj.b = str3;
                    obj.c = str4;
                    obj.d = b2;
                    return obj;
                }
            }
            StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(": ");
            byte b3 = this.d;
            if (b3 != 15) {
                if (b3 != 255) {
                    if (b3 != 32768) {
                        if (b3 != 32783) {
                            if (b3 != 33023) {
                                str = String.valueOf((int) b3);
                            } else {
                                str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                            }
                        } else {
                            str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                        }
                    } else {
                        str = "DEVICE_CREDENTIAL";
                    }
                } else {
                    str = "BIOMETRIC_WEAK";
                }
            } else {
                str = "BIOMETRIC_STRONG";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        w26.j("Title must be set and non-empty.");
        return null;
    }
}
