package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class xv {
    public final vv f19294a;
    public final ArrayList f19295b;
    public final int f19296c;
    public final int d;
    public final yv e;
    public int f19297f;
    public int f19298g;
    public yv h;

    public xv(vv vvVar, ArrayList arrayList, int i10, int i11, yv yvVar, int i12, int i13, yv yvVar2) {
        this.f19294a = vvVar;
        this.f19295b = arrayList;
        this.f19296c = i10;
        this.d = i11;
        this.e = yvVar;
        this.f19297f = i12;
        this.f19298g = i13;
        this.h = yvVar2;
    }

    public final TL_iv.RichText a(int i10) {
        int i11;
        int i12;
        if (i10 == this.f19296c) {
            i11 = this.d;
        } else {
            i11 = 0;
        }
        if (i10 == this.f19297f) {
            i12 = this.f19298g;
        } else {
            i12 = Integer.MAX_VALUE;
        }
        if (i11 == 0 && i12 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f19295b.get(i10);
        }
        return b(i10).b(i11, i12);
    }

    public final yv b(int i10) {
        if (i10 == this.f19296c) {
            return this.e;
        }
        int i11 = this.f19297f;
        ArrayList arrayList = this.f19295b;
        vv vvVar = this.f19294a;
        if (i10 == i11) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i10);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new yv(richText, identityHashMap, vvVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i10);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new yv(richText2, identityHashMap2, vvVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
