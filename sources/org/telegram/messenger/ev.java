package org.telegram.messenger;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;
public final class ev {
    public final cv f22400a;
    public final ArrayList f22401b;
    public final int f22402c;
    public final int d;
    public final fv f22403e;
    public int f22404f;
    public int f22405g;
    public fv h;

    public ev(cv cvVar, ArrayList arrayList, int i3, int i10, fv fvVar, int i11, int i12, fv fvVar2) {
        this.f22400a = cvVar;
        this.f22401b = arrayList;
        this.f22402c = i3;
        this.d = i10;
        this.f22403e = fvVar;
        this.f22404f = i11;
        this.f22405g = i12;
        this.h = fvVar2;
    }

    public final TL_iv.RichText a(int i3) {
        int i10;
        int i11;
        if (i3 == this.f22402c) {
            i10 = this.d;
        } else {
            i10 = 0;
        }
        if (i3 == this.f22404f) {
            i11 = this.f22405g;
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (i10 == 0 && i11 == Integer.MAX_VALUE) {
            return (TL_iv.RichText) this.f22401b.get(i3);
        }
        return b(i3).b(i10, i11);
    }

    public final fv b(int i3) {
        if (i3 == this.f22402c) {
            return this.f22403e;
        }
        int i10 = this.f22404f;
        ArrayList arrayList = this.f22401b;
        cv cvVar = this.f22400a;
        if (i3 == i10) {
            if (this.h == null) {
                TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i3);
                IdentityHashMap identityHashMap = new IdentityHashMap();
                this.h = new fv(richText, identityHashMap, cvVar.o(richText, 0, identityHashMap).length(), 0);
            }
            return this.h;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i3);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        return new fv(richText2, identityHashMap2, cvVar.o(richText2, 0, identityHashMap2).length(), 0);
    }
}
