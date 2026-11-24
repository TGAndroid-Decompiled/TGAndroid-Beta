package defpackage;

import android.os.Bundle;
import java.util.HashSet;
public final class qu6 {
    public static final q5a f;
    public static final q5a g;
    public static final kc8 h;
    public static final kc8 i;
    public final q5a a;
    public final kc8 b;
    public final mm5 c;
    public final mm5 d;
    public final Bundle e;

    static {
        int i2;
        HashSet hashSet = new HashSet();
        w59 w59Var = p5a.d;
        int i3 = 0;
        while (true) {
            int i4 = w59Var.d;
            i2 = w59Var.d;
            if (i3 >= i4) {
                break;
            }
            hashSet.add(new p5a(((Integer) w59Var.get(i3)).intValue()));
            i3++;
        }
        w59 w59Var2 = p5a.e;
        for (int i5 = 0; i5 < w59Var2.d; i5++) {
            hashSet.add(new p5a(((Integer) w59Var2.get(i5)).intValue()));
        }
        f = new q5a(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i6 = 0; i6 < i2; i6++) {
            hashSet2.add(new p5a(((Integer) w59Var.get(i6)).intValue()));
        }
        g = new q5a(hashSet2);
        ln8 ln8Var = new ln8((byte) 13);
        w59 w59Var3 = p5a.f;
        ln8Var.p(w59Var3);
        ln8Var.p(p5a.g);
        ln8Var.p(p5a.d);
        ln8Var.p(p5a.e);
        new q5a((HashSet) ln8Var.b);
        HashSet hashSet3 = new HashSet();
        for (int i7 = 0; i7 < w59Var3.d; i7++) {
            hashSet3.add(new p5a(((Integer) w59Var3.get(i7)).intValue()));
        }
        for (int i8 = 0; i8 < i2; i8++) {
            hashSet3.add(new p5a(((Integer) w59Var.get(i8)).intValue()));
        }
        new q5a(hashSet3);
        jc8 jc8Var = new jc8();
        gi4 gi4Var = jc8.b;
        e31 e31Var = jc8Var.a;
        e31Var.c(gi4Var);
        e31Var.c(jc8.c);
        h = jc8Var.b();
        jc8 jc8Var2 = new jc8();
        jc8Var2.a.c(gi4Var);
        i = jc8Var2.b();
    }

    public qu6(q5a q5aVar, kc8 kc8Var, mm5 mm5Var, mm5 mm5Var2, Bundle bundle) {
        this.a = q5aVar;
        this.b = kc8Var;
        this.c = mm5Var;
        this.d = mm5Var2;
        this.e = bundle;
    }
}
