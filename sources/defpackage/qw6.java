package defpackage;

import android.os.Bundle;
import java.util.HashSet;
public final class qw6 {
    public static final s7a f;
    public static final s7a g;
    public static final ne8 h;
    public static final ne8 i;
    public final s7a a;
    public final ne8 b;
    public final mo5 c;
    public final mo5 d;
    public final Bundle e;

    static {
        int i2;
        HashSet hashSet = new HashSet();
        y79 y79Var = r7a.d;
        int i3 = 0;
        while (true) {
            int i4 = y79Var.d;
            i2 = y79Var.d;
            if (i3 >= i4) {
                break;
            }
            hashSet.add(new r7a(((Integer) y79Var.get(i3)).intValue()));
            i3++;
        }
        y79 y79Var2 = r7a.e;
        for (int i5 = 0; i5 < y79Var2.d; i5++) {
            hashSet.add(new r7a(((Integer) y79Var2.get(i5)).intValue()));
        }
        f = new s7a(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i6 = 0; i6 < i2; i6++) {
            hashSet2.add(new r7a(((Integer) y79Var.get(i6)).intValue()));
        }
        g = new s7a(hashSet2);
        cf9 cf9Var = new cf9((byte) 6);
        y79 y79Var3 = r7a.f;
        cf9Var.g(y79Var3);
        cf9Var.g(r7a.g);
        cf9Var.g(r7a.d);
        cf9Var.g(r7a.e);
        new s7a((HashSet) cf9Var.b);
        HashSet hashSet3 = new HashSet();
        for (int i7 = 0; i7 < y79Var3.d; i7++) {
            hashSet3.add(new r7a(((Integer) y79Var3.get(i7)).intValue()));
        }
        for (int i8 = 0; i8 < i2; i8++) {
            hashSet3.add(new r7a(((Integer) y79Var.get(i8)).intValue()));
        }
        new s7a(hashSet3);
        me8 me8Var = new me8();
        lk4 lk4Var = me8.b;
        m41 m41Var = me8Var.a;
        m41Var.c(lk4Var);
        m41Var.c(me8.c);
        h = me8Var.b();
        me8 me8Var2 = new me8();
        me8Var2.a.c(lk4Var);
        i = me8Var2.b();
    }

    public qw6(s7a s7aVar, ne8 ne8Var, mo5 mo5Var, mo5 mo5Var2, Bundle bundle) {
        this.a = s7aVar;
        this.b = ne8Var;
        this.c = mo5Var;
        this.d = mo5Var2;
        this.e = bundle;
    }
}
