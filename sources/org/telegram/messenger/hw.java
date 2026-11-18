package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class hw implements Runnable {
    public final int f24505a;
    public final zy f24506b;
    public final TLObject f24507c;
    public final fj d;
    public final String f24508e;
    public final ly f24509f;
    public final boolean h;
    public final ly f24510n;
    public final Object f24511r;
    public final HashMap f24512s;
    public final boolean f24513w;

    public hw(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24505a = i7;
        this.f24506b = zyVar;
        this.f24507c = tLObject;
        this.d = fjVar;
        this.f24508e = str;
        this.f24509f = lyVar;
        this.h = z10;
        this.f24510n = lyVar2;
        this.f24511r = obj;
        this.f24512s = hashMap;
        this.f24513w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24505a) {
            case 0:
                this.f24506b.O(this.f24507c, this.d, this.f24508e, this.f24509f, this.h, this.f24510n, this.f24511r, this.f24512s, this.f24513w);
                return;
            case 1:
                this.f24506b.O(this.f24507c, this.d, this.f24508e, this.f24509f, this.h, this.f24510n, this.f24511r, this.f24512s, this.f24513w);
                return;
            default:
                this.f24506b.O(this.f24507c, this.d, this.f24508e, this.f24509f, this.h, this.f24510n, this.f24511r, this.f24512s, this.f24513w);
                return;
        }
    }
}
