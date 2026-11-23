package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class hw implements Runnable {
    public final int f24604a;
    public final zy f24605b;
    public final TLObject f24606c;
    public final fj d;
    public final String f24607e;
    public final ly f24608f;
    public final boolean h;
    public final ly f24609n;
    public final Object f24610r;
    public final HashMap f24611s;
    public final boolean f24612w;

    public hw(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24604a = i7;
        this.f24605b = zyVar;
        this.f24606c = tLObject;
        this.d = fjVar;
        this.f24607e = str;
        this.f24608f = lyVar;
        this.h = z10;
        this.f24609n = lyVar2;
        this.f24610r = obj;
        this.f24611s = hashMap;
        this.f24612w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24604a) {
            case 0:
                this.f24605b.O(this.f24606c, this.d, this.f24607e, this.f24608f, this.h, this.f24609n, this.f24610r, this.f24611s, this.f24612w);
                return;
            case 1:
                this.f24605b.O(this.f24606c, this.d, this.f24607e, this.f24608f, this.h, this.f24609n, this.f24610r, this.f24611s, this.f24612w);
                return;
            default:
                this.f24605b.O(this.f24606c, this.d, this.f24607e, this.f24608f, this.h, this.f24609n, this.f24610r, this.f24611s, this.f24612w);
                return;
        }
    }
}
