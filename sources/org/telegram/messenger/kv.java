package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class kv {
    public final iv f24759a;
    public final ArrayList f24760b;
    public final int f24761c;
    public final int d;
    public final lv f24762e;
    public int f24763f;
    public int f24764g;
    public lv h;

    public kv(iv ivVar, ArrayList arrayList, int i7, int i10, lv lvVar, int i11, int i12, lv lvVar2) {
        this.f24759a = ivVar;
        this.f24760b = arrayList;
        this.f24761c = i7;
        this.d = i10;
        this.f24762e = lvVar;
        this.f24763f = i11;
        this.f24764g = i12;
        this.h = lvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10;
        int i11;
        if (i7 == this.f24761c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i7 == this.f24763f) {
            i11 = this.f24764g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f24760b.get(i7);
        }
        return b(i7).b(i10, i11);
    }

    public final lv b(int i7) {
        if (i7 == this.f24761c) {
            return this.f24762e;
        }
        int i10 = this.f24763f;
        ArrayList arrayList = this.f24760b;
        iv ivVar = this.f24759a;
        if (i7 == i10) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new lv(richText, identityHashMap, ivVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new lv(richText2, identityHashMap2, ivVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
