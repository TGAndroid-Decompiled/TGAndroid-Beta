package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class gw implements Runnable {
    public final int f22781a;
    public final yy f22782b;
    public final TLObject f22783c;
    public final zi d;
    public final String f22784e;
    public final ky f22785f;
    public final boolean h;
    public final ky f22786n;
    public final Object f22787r;
    public final HashMap f22788s;
    public final boolean f22789w;

    public gw(yy yyVar, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11, int i3) {
        this.f22781a = i3;
        this.f22782b = yyVar;
        this.f22783c = tLObject;
        this.d = ziVar;
        this.f22784e = str;
        this.f22785f = kyVar;
        this.h = z10;
        this.f22786n = kyVar2;
        this.f22787r = obj;
        this.f22788s = hashMap;
        this.f22789w = z11;
    }

    @Override
    public final void run() {
        switch (this.f22781a) {
            case 0:
                this.f22782b.O(this.f22783c, this.d, this.f22784e, this.f22785f, this.h, this.f22786n, this.f22787r, this.f22788s, this.f22789w);
                return;
            case 1:
                this.f22782b.O(this.f22783c, this.d, this.f22784e, this.f22785f, this.h, this.f22786n, this.f22787r, this.f22788s, this.f22789w);
                return;
            default:
                this.f22782b.O(this.f22783c, this.d, this.f22784e, this.f22785f, this.h, this.f22786n, this.f22787r, this.f22788s, this.f22789w);
                return;
        }
    }
}
