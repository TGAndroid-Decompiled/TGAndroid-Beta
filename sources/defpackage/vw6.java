package defpackage;

import android.os.Bundle;
import java.util.HashSet;
public final class vw6 {
    public static final i9a f;
    public static final i9a g;
    public static final zf8 h;
    public static final zf8 i;
    public final i9a a;
    public final zf8 b;
    public final po5 c;
    public final po5 d;
    public final Bundle e;

    static {
        int i2;
        HashSet hashSet = new HashSet();
        j99 j99Var = h9a.d;
        int i3 = 0;
        while (true) {
            int i4 = j99Var.d;
            i2 = j99Var.d;
            if (i3 >= i4) {
                break;
            }
            hashSet.add(new h9a(((Integer) j99Var.get(i3)).intValue()));
            i3++;
        }
        j99 j99Var2 = h9a.e;
        for (int i5 = 0; i5 < j99Var2.d; i5++) {
            hashSet.add(new h9a(((Integer) j99Var2.get(i5)).intValue()));
        }
        f = new i9a(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i6 = 0; i6 < i2; i6++) {
            hashSet2.add(new h9a(((Integer) j99Var.get(i6)).intValue()));
        }
        g = new i9a(hashSet2);
        i09 i09Var = new i09();
        j99 j99Var3 = h9a.f;
        i09Var.g(j99Var3);
        i09Var.g(h9a.g);
        i09Var.g(h9a.d);
        i09Var.g(h9a.e);
        new i9a((HashSet) i09Var.b);
        HashSet hashSet3 = new HashSet();
        for (int i7 = 0; i7 < j99Var3.d; i7++) {
            hashSet3.add(new h9a(((Integer) j99Var3.get(i7)).intValue()));
        }
        for (int i8 = 0; i8 < i2; i8++) {
            hashSet3.add(new h9a(((Integer) j99Var.get(i8)).intValue()));
        }
        new i9a(hashSet3);
        yf8 yf8Var = new yf8();
        lk4 lk4Var = yf8.b;
        n31 n31Var = yf8Var.a;
        n31Var.c(lk4Var);
        n31Var.c(yf8.c);
        h = yf8Var.b();
        yf8 yf8Var2 = new yf8();
        yf8Var2.a.c(lk4Var);
        i = yf8Var2.b();
    }

    public vw6(i9a i9aVar, zf8 zf8Var, po5 po5Var, po5 po5Var2, Bundle bundle) {
        this.a = i9aVar;
        this.b = zf8Var;
        this.c = po5Var;
        this.d = po5Var2;
        this.e = bundle;
    }
}
