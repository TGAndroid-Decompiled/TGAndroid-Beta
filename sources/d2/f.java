package d2;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
public final class f {
    public static final f f8079i = new f(0, 0, 1, 1, false, 0, true);
    public static final String f8080j;
    public static final String f8081k;
    public static final String f8082l;
    public static final String f8083m;
    public static final String f8084n;
    public static final String f8085o;
    public static final String f8086p;
    public final int f8087a;
    public final int f8088b;
    public final int f8089c;
    public final int d;
    public final int f8090e;
    public final boolean f8091f;
    public final boolean f8092g;
    public AudioAttributes h;

    static {
        String str = g2.n0.f11873a;
        f8080j = Integer.toString(0, 36);
        f8081k = Integer.toString(1, 36);
        f8082l = Integer.toString(2, 36);
        f8083m = Integer.toString(3, 36);
        f8084n = Integer.toString(4, 36);
        f8085o = Integer.toString(5, 36);
        f8086p = Integer.toString(6, 36);
    }

    public f(int i3, int i10, int i11, int i12, boolean z10, int i13, boolean z11) {
        this.f8087a = i3;
        this.f8088b = i10;
        this.f8089c = i11;
        this.d = i12;
        this.f8090e = i13;
        this.f8091f = z10;
        this.f8092g = z11;
    }

    public static f a(Bundle bundle) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        String str = f8080j;
        boolean z10 = false;
        if (bundle.containsKey(str)) {
            i3 = bundle.getInt(str);
        } else {
            i3 = 0;
        }
        String str2 = f8081k;
        if (bundle.containsKey(str2)) {
            i10 = bundle.getInt(str2);
        } else {
            i10 = 0;
        }
        String str3 = f8082l;
        boolean z11 = true;
        if (bundle.containsKey(str3)) {
            i11 = bundle.getInt(str3);
        } else {
            i11 = 1;
        }
        String str4 = f8083m;
        if (bundle.containsKey(str4)) {
            i12 = bundle.getInt(str4);
        } else {
            i12 = 1;
        }
        String str5 = f8084n;
        if (bundle.containsKey(str5)) {
            i13 = bundle.getInt(str5);
        } else {
            i13 = 0;
        }
        String str6 = f8085o;
        if (bundle.containsKey(str6)) {
            z10 = bundle.getBoolean(str6);
        }
        boolean z12 = z10;
        String str7 = f8086p;
        if (bundle.containsKey(str7)) {
            z11 = bundle.getBoolean(str7);
        }
        return new f(i3, i10, i11, i12, z12, i13, z11);
    }

    public final AudioAttributes b() {
        if (this.h == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f8087a).setFlags(this.f8088b).setUsage(this.f8089c);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                d.k(usage, this.d);
                d.a(usage, this.f8092g);
            }
            if (i3 >= 32) {
                e.b(usage, this.f8090e);
                e.a(usage, this.f8091f);
            }
            this.h = usage.build();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f8087a == fVar.f8087a && this.f8088b == fVar.f8088b && this.f8089c == fVar.f8089c && this.d == fVar.d && this.f8090e == fVar.f8090e && this.f8091f == fVar.f8091f && this.f8092g == fVar.f8092g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.f8087a) * 31) + this.f8088b) * 31) + this.f8089c) * 31) + this.d) * 31) + this.f8090e) * 31) + (this.f8091f ? 1 : 0)) * 31) + (this.f8092g ? 1 : 0);
    }
}
