package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class ax implements Runnable {
    public final int f14864a;
    public final rz f14865b;
    public final TLObject f14866c;
    public final kj d;
    public final String e;
    public final dz f14867f;
    public final boolean h;
    public final dz f14868n;
    public final Object f14869r;
    public final HashMap f14870s;
    public final boolean f14871w;

    public ax(rz rzVar, TLObject tLObject, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11, int i10) {
        this.f14864a = i10;
        this.f14865b = rzVar;
        this.f14866c = tLObject;
        this.d = kjVar;
        this.e = str;
        this.f14867f = dzVar;
        this.h = z10;
        this.f14868n = dzVar2;
        this.f14869r = obj;
        this.f14870s = hashMap;
        this.f14871w = z11;
    }

    @Override
    public final void run() {
        switch (this.f14864a) {
            case 0:
                this.f14865b.O(this.f14866c, this.d, this.e, this.f14867f, this.h, this.f14868n, this.f14869r, this.f14870s, this.f14871w);
                return;
            case 1:
                this.f14865b.O(this.f14866c, this.d, this.e, this.f14867f, this.h, this.f14868n, this.f14869r, this.f14870s, this.f14871w);
                return;
            default:
                this.f14865b.O(this.f14866c, this.d, this.e, this.f14867f, this.h, this.f14868n, this.f14869r, this.f14870s, this.f14871w);
                return;
        }
    }
}
