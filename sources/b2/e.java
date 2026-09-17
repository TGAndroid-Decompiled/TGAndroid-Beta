package b2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class e {
    public static final e h = new e(0, 0, 1, 1, 0, false);
    public static final String f1998i;
    public static final String f1999j;
    public static final String f2000k;
    public static final String f2001l;
    public static final String f2002m;
    public static final String f2003n;
    public final int f2004a;
    public final int f2005b;
    public final int f2006c;
    public final int d;
    public final int f2007e;
    public final boolean f2008f;
    public w0 f2009g;

    static {
        String str = e2.d0.f8737a;
        f1998i = Integer.toString(0, 36);
        f1999j = Integer.toString(1, 36);
        f2000k = Integer.toString(2, 36);
        f2001l = Integer.toString(3, 36);
        f2002m = Integer.toString(4, 36);
        f2003n = Integer.toString(5, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f2004a = i10;
        this.f2005b = i11;
        this.f2006c = i12;
        this.d = i13;
        this.f2007e = i14;
        this.f2008f = z10;
    }

    public static e a(Bundle bundle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        String str = f1998i;
        if (bundle.containsKey(str)) {
            i10 = bundle.getInt(str);
        } else {
            i10 = 0;
        }
        String str2 = f1999j;
        if (bundle.containsKey(str2)) {
            i11 = bundle.getInt(str2);
        } else {
            i11 = 0;
        }
        String str3 = f2000k;
        if (bundle.containsKey(str3)) {
            i12 = bundle.getInt(str3);
        } else {
            i12 = 1;
        }
        String str4 = f2001l;
        if (bundle.containsKey(str4)) {
            i13 = bundle.getInt(str4);
        } else {
            i13 = 1;
        }
        String str5 = f2002m;
        if (bundle.containsKey(str5)) {
            i14 = bundle.getInt(str5);
        } else {
            i14 = 0;
        }
        String str6 = f2003n;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        } else {
            z10 = false;
        }
        return new e(i10, i11, i12, i13, i14, z10);
    }

    public final w0 b() {
        if (this.f2009g == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2004a).setFlags(this.f2005b).setUsage(this.f2006c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                c.k(usage, this.d);
            }
            if (i10 >= 32) {
                d.b(usage, this.f2007e);
                d.a(usage, this.f2008f);
            }
            obj.f2408a = usage.build();
            this.f2009g = obj;
        }
        return this.f2009g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f2004a == eVar.f2004a && this.f2005b == eVar.f2005b && this.f2006c == eVar.f2006c && this.d == eVar.d && this.f2007e == eVar.f2007e && this.f2008f == eVar.f2008f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((527 + this.f2004a) * 31) + this.f2005b) * 31) + this.f2006c) * 31) + this.d) * 31) + this.f2007e) * 31) + (this.f2008f ? 1 : 0);
    }
}
