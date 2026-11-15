package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class lw implements Runnable {
    public final int f24901a;
    public final ez f24902b;
    public final TLObject f24903c;
    public final gj d;
    public final String f24904e;
    public final qy f24905f;
    public final boolean h;
    public final qy f24906n;
    public final Object f24907r;
    public final HashMap f24908s;
    public final boolean f24909w;

    public lw(ez ezVar, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24901a = i7;
        this.f24902b = ezVar;
        this.f24903c = tLObject;
        this.d = gjVar;
        this.f24904e = str;
        this.f24905f = qyVar;
        this.h = z10;
        this.f24906n = qyVar2;
        this.f24907r = obj;
        this.f24908s = hashMap;
        this.f24909w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24901a) {
            case 0:
                this.f24902b.O(this.f24903c, this.d, this.f24904e, this.f24905f, this.h, this.f24906n, this.f24907r, this.f24908s, this.f24909w);
                return;
            case 1:
                this.f24902b.O(this.f24903c, this.d, this.f24904e, this.f24905f, this.h, this.f24906n, this.f24907r, this.f24908s, this.f24909w);
                return;
            default:
                this.f24902b.O(this.f24903c, this.d, this.f24904e, this.f24905f, this.h, this.f24906n, this.f24907r, this.f24908s, this.f24909w);
                return;
        }
    }
}
