package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f1655i;
    public static final String f1656j;
    public static final String f1657k;
    public static final String f1658l;
    public static final String f1659m;
    public static final String f1660n;
    public final int f1661a;
    public final int f1662b;
    public final int f1663c;
    public final int d;
    public final int e;
    public final boolean f1664f;
    public w0 f1665g;

    static {
        String str = e2.d0.f7188a;
        f1655i = Integer.toString(0, 36);
        f1656j = Integer.toString(1, 36);
        f1657k = Integer.toString(2, 36);
        f1658l = Integer.toString(3, 36);
        f1659m = Integer.toString(4, 36);
        f1660n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f1661a = i10;
        this.f1662b = i11;
        this.f1663c = i12;
        this.d = i13;
        this.e = i14;
        this.f1664f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f1655i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f1656j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f1657k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f1658l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f1659m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f1660n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f1665g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f1661a).setFlags(this.f1662b).setUsage(this.f1663c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.e);
                d.a(usage, this.f1664f);
            }
            obj.f2037a = usage.build();
            this.f1665g = obj;
        }
        return this.f1665g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f1661a == eVar.f1661a && this.f1662b == eVar.f1662b && this.f1663c == eVar.f1663c && this.d == eVar.d && this.e == eVar.e && this.f1664f == eVar.f1664f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f1661a) * 31) + this.f1662b) * 31) + this.f1663c) * 31) + this.d) * 31) + this.e) * 31) + (this.f1664f ? 1 : 0);
    }
}
