package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class jl9 {
    public final hl9 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final kl9 e;
    public int f;
    public int g;
    public kl9 h;

    public jl9(hl9 hl9Var, ArrayList arrayList, int i, int i2, kl9 kl9Var, int i3, int i4, kl9 kl9Var2) {
        this.a = hl9Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = kl9Var;
        this.f = i3;
        this.g = i4;
        this.h = kl9Var2;
    }

    public final TL_iv.RichText a(int i) {
        int i2;
        int i3;
        if (i == this.c) {
            i2 = this.d;
        } else {
            i2 = 0;
        }
        if (i == this.f) {
            i3 = this.g;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (i2 == 0 && i3 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.b.get(i);
        }
        return b(i).b(i2, i3);
    }

    public final kl9 b(int i) {
        if (i == this.c) {
            return this.e;
        }
        int i2 = this.f;
        ArrayList arrayList = this.b;
        hl9 hl9Var = this.a;
        if (i == i2) {
            kl9 kl9Var = this.h;
            if (kl9Var == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                kl9 kl9Var2 = new kl9(richText, identityHashMap, hl9Var.o(richText, 0, identityHashMap).length(), 0);
                this.h = kl9Var2;
                return kl9Var2;
            }
            return kl9Var;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new kl9(richText2, identityHashMap2, hl9Var.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
