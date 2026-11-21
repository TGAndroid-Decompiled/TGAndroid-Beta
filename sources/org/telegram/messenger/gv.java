package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class gv {
    public final ev f24331a;
    public final ArrayList f24332b;
    public final int f24333c;
    public final int d;
    public final hv f24334e;
    public int f24335f;
    public int f24336g;
    public hv h;

    public gv(ev evVar, ArrayList arrayList, int i7, int i10, hv hvVar, int i11, int i12, hv hvVar2) {
        this.f24331a = evVar;
        this.f24332b = arrayList;
        this.f24333c = i7;
        this.d = i10;
        this.f24334e = hvVar;
        this.f24335f = i11;
        this.f24336g = i12;
        this.h = hvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10;
        int i11;
        if (i7 == this.f24333c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i7 == this.f24335f) {
            i11 = this.f24336g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f24332b.get(i7);
        }
        return b(i7).b(i10, i11);
    }

    public final hv b(int i7) {
        if (i7 == this.f24333c) {
            return this.f24334e;
        }
        int i10 = this.f24335f;
        ArrayList arrayList = this.f24332b;
        ev evVar = this.f24331a;
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
