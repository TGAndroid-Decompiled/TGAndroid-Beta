package h3;

import android.os.SystemClock;
import android.text.TextUtils;

public final class n extends v1 {

    public final int f8028c;
    public final String d;

    public final int f8029e;

    public final t0 f8030f;
    public final int h;

    public final j4.a0 f8031n;

    public final boolean f8032r;

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final n a(j4.a0 a0Var) {
        String message = getMessage();
        int i10 = d5.g0.f4795a;
        return new n(message, getCause(), this.f8216a, this.f8028c, this.d, this.f8029e, this.f8030f, this.h, a0Var, this.f8217b, this.f8032r);
    }

    public n(String str, Throwable th, int i10, int i11, String str2, int i12, t0 t0Var, int i13, j4.a0 a0Var, long j10, boolean z10) {
        super(str, th, i10, j10);
        d5.a.f(!z10 || i11 == 1);
        d5.a.f(th != null || i11 == 3);
        this.f8028c = i11;
        this.d = str2;
        this.f8029e = i12;
        this.f8030f = t0Var;
        this.h = i13;
        this.f8031n = a0Var;
        this.f8032r = z10;
    }

    public n(int i10, Throwable th, int i11, String str, int i12, t0 t0Var, int i13, boolean z10) {
        String str2;
        int i14;
        t0 t0Var2;
        String string;
        String str3;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            t0Var2 = t0Var;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i14 = i12;
            t0Var2 = t0Var;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            t0Var2 = t0Var;
            sb2.append(t0Var2);
            sb2.append(", format_supported=");
            int i15 = d5.g0.f4795a;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : s3.c.l(string, ": null"), th, i11, i10, str2, i14, t0Var2, i13, null, SystemClock.elapsedRealtime(), z10);
    }
}
