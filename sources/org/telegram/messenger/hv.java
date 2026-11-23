package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class hv {
    public final fv f24534a;
    public final ArrayList f24535b;
    public final int f24536c;
    public final int d;
    public final iv f24537e;
    public int f24538f;
    public int f24539g;
    public iv h;

    public hv(fv fvVar, ArrayList arrayList, int i7, int i10, iv ivVar, int i11, int i12, iv ivVar2) {
        this.f24534a = fvVar;
        this.f24535b = arrayList;
        this.f24536c = i7;
        this.d = i10;
        this.f24537e = ivVar;
        this.f24538f = i11;
        this.f24539g = i12;
        this.h = ivVar2;
    }

    public final TL_iv.RichText a(int i7) {
        int i10;
        int i11;
        if (i7 == this.f24536c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i7 == this.f24538f) {
            i11 = this.f24539g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f24535b.get(i7);
        }
        return b(i7).b(i10, i11);
    }

    public final iv b(int i7) {
        if (i7 == this.f24536c) {
            return this.f24537e;
        }
        int i10 = this.f24538f;
        ArrayList arrayList = this.f24535b;
        fv fvVar = this.f24534a;
        if (i7 == i10) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i7);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new iv(richText, identityHashMap, fvVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i7);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new iv(richText2, identityHashMap2, fvVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
