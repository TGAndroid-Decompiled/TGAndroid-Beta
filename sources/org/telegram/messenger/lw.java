package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class lw implements Runnable {
    public final int f24895a;
    public final ez f24896b;
    public final TLObject f24897c;
    public final gj d;
    public final String f24898e;
    public final qy f24899f;
    public final boolean h;
    public final qy f24900n;
    public final Object f24901r;
    public final HashMap f24902s;
    public final boolean f24903w;

    public lw(ez ezVar, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24895a = i7;
        this.f24896b = ezVar;
        this.f24897c = tLObject;
        this.d = gjVar;
        this.f24898e = str;
        this.f24899f = qyVar;
        this.h = z10;
        this.f24900n = qyVar2;
        this.f24901r = obj;
        this.f24902s = hashMap;
        this.f24903w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24895a) {
            case 0:
                this.f24896b.O(this.f24897c, this.d, this.f24898e, this.f24899f, this.h, this.f24900n, this.f24901r, this.f24902s, this.f24903w);
                return;
            case 1:
                this.f24896b.O(this.f24897c, this.d, this.f24898e, this.f24899f, this.h, this.f24900n, this.f24901r, this.f24902s, this.f24903w);
                return;
            default:
                this.f24896b.O(this.f24897c, this.d, this.f24898e, this.f24899f, this.h, this.f24900n, this.f24901r, this.f24902s, this.f24903w);
                return;
        }
    }
}
