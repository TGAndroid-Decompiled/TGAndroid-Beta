package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class hw implements Runnable {
    public final int f24508a;
    public final zy f24509b;
    public final TLObject f24510c;
    public final fj d;
    public final String f24511e;
    public final ly f24512f;
    public final boolean h;
    public final ly f24513n;
    public final Object f24514r;
    public final HashMap f24515s;
    public final boolean f24516w;

    public hw(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24508a = i7;
        this.f24509b = zyVar;
        this.f24510c = tLObject;
        this.d = fjVar;
        this.f24511e = str;
        this.f24512f = lyVar;
        this.h = z10;
        this.f24513n = lyVar2;
        this.f24514r = obj;
        this.f24515s = hashMap;
        this.f24516w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24508a) {
            case 0:
                this.f24509b.O(this.f24510c, this.d, this.f24511e, this.f24512f, this.h, this.f24513n, this.f24514r, this.f24515s, this.f24516w);
                return;
            case 1:
                this.f24509b.O(this.f24510c, this.d, this.f24511e, this.f24512f, this.h, this.f24513n, this.f24514r, this.f24515s, this.f24516w);
                return;
            default:
                this.f24509b.O(this.f24510c, this.d, this.f24511e, this.f24512f, this.h, this.f24513n, this.f24514r, this.f24515s, this.f24516w);
                return;
        }
    }
}
