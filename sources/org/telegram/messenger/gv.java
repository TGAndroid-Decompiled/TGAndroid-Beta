package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class gv {
    public final ev f24306a;
    public final ArrayList f24307b;
    public final int f24308c;
    public final int d;
    public final hv f24309e;
    public int f24310f;
    public int f24311g;
    public hv h;

    public gv(ev evVar, ArrayList arrayList, int i7, int i10, hv hvVar, int i11, int i12, hv hvVar2) {
        this.f24306a = evVar;
        this.f24307b = arrayList;
        this.f24308c = i7;
        this.d = i10;
        this.f24309e = hvVar;
        this.f24310f = i11;
        this.f24311g = i12;
        this.h = hvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10;
        int i11;
        if (i7 == this.f24308c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i7 == this.f24310f) {
            i11 = this.f24311g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f24307b.get(i7);
        }
        return b(i7).b(i10, i11);
    }

    public final hv b(int i7) {
        if (i7 == this.f24308c) {
            return this.f24309e;
        }
        int i10 = this.f24310f;
        ArrayList arrayList = this.f24307b;
        ev evVar = this.f24306a;
        if (i7 == i10) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new hv(richText, identityHashMap, evVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new hv(richText2, identityHashMap2, evVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
