package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class iw implements Runnable {
    public final int f24785a;
    public final az f24786b;
    public final TLObject f24787c;
    public final gj d;
    public final String f24788e;
    public final my f24789f;
    public final boolean h;
    public final my f24790n;
    public final Object f24791r;
    public final HashMap f24792s;
    public final boolean f24793w;

    public iw(az azVar, TLObject tLObject, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24785a = i7;
        this.f24786b = azVar;
        this.f24787c = tLObject;
        this.d = gjVar;
        this.f24788e = str;
        this.f24789f = myVar;
        this.h = z10;
        this.f24790n = myVar2;
        this.f24791r = obj;
        this.f24792s = hashMap;
        this.f24793w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24785a) {
            case 0:
                this.f24786b.O(this.f24787c, this.d, this.f24788e, this.f24789f, this.h, this.f24790n, this.f24791r, this.f24792s, this.f24793w);
                return;
            case 1:
                this.f24786b.O(this.f24787c, this.d, this.f24788e, this.f24789f, this.h, this.f24790n, this.f24791r, this.f24792s, this.f24793w);
                return;
            default:
                this.f24786b.O(this.f24787c, this.d, this.f24788e, this.f24789f, this.h, this.f24790n, this.f24791r, this.f24792s, this.f24793w);
                return;
        }
    }
}
