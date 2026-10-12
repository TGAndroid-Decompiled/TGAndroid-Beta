package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f3269i;
    public static final String f3270j;
    public static final String f3271k;
    public static final String f3272l;
    public static final String f3273m;
    public static final String f3274n;
    public final int f3275a;
    public final int f3276b;
    public final int f3277c;
    public final int d;
    public final int f3278e;
    public final boolean f3279f;
    public w0 f3280g;

    static {
        String str = e2.d0.f8529a;
        f3269i = Integer.toString(0, 36);
        f3270j = Integer.toString(1, 36);
        f3271k = Integer.toString(2, 36);
        f3272l = Integer.toString(3, 36);
        f3273m = Integer.toString(4, 36);
        f3274n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f3275a = i10;
        this.f3276b = i11;
        this.f3277c = i12;
        this.d = i13;
        this.f3278e = i14;
        this.f3279f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f3269i;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f3270j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f3271k;
        int i14 = 1;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f3272l;
        if (bundle.containsKey(str4)) {
            i14 = bundle.getInt(str4);
        }
        int i15 = i14;
        String str5 = f3273m;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f3274n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        return new e(i10, i11, i12, i15, i13, z10);
    }

    public final w0 b() {
        if (this.f3280g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f3275a).setFlags(this.f3276b).setUsage(this.f3277c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.j(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.f3278e);
                d.a(usage, this.f3279f);
            }
            obj.f3679a = usage.build();
            this.f3280g = obj;
        }
        return this.f3280g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f3275a == eVar.f3275a && this.f3276b == eVar.f3276b && this.f3277c == eVar.f3277c && this.d == eVar.d && this.f3278e == eVar.f3278e && this.f3279f == eVar.f3279f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f3275a) * 31) + this.f3276b) * 31) + this.f3277c) * 31) + this.d) * 31) + this.f3278e) * 31) + (this.f3279f ? 1 : 0);
    }
}
