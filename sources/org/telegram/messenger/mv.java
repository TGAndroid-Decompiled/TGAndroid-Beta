package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class mv {
    public final kv f24091a;
    public final ArrayList f24092b;
    public final int f24093c;
    public final int d;
    public final nv f24094e;
    public int f24095f;
    public int f24096g;
    public nv h;

    public mv(kv kvVar, ArrayList arrayList, int i7, int i10, nv nvVar, int i11, int i12, nv nvVar2) {
        this.f24091a = kvVar;
        this.f24092b = arrayList;
        this.f24093c = i7;
        this.d = i10;
        this.f24094e = nvVar;
        this.f24095f = i11;
        this.f24096g = i12;
        this.h = nvVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10;
        int i11;
        if (i7 == this.f24093c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i7 == this.f24095f) {
            i11 = this.f24096g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f24092b.get(i7);
        }
        return b(i7).b(i10, i11);
    }

    public final nv b(int i7) {
        if (i7 == this.f24093c) {
            return this.f24094e;
        }
        int i10 = this.f24095f;
        ArrayList arrayList = this.f24092b;
        kv kvVar = this.f24091a;
        if (i7 == i10) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new nv(richText, identityHashMap, kvVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new nv(richText2, identityHashMap2, kvVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
