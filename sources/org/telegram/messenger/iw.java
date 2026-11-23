package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class iw implements Runnable {
    public final int f24749a;
    public final az f24750b;
    public final TLObject f24751c;
    public final gj d;
    public final String f24752e;
    public final my f24753f;
    public final boolean h;
    public final my f24754n;
    public final Object f24755r;
    public final HashMap f24756s;
    public final boolean f24757w;

    public iw(az azVar, TLObject tLObject, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24749a = i7;
        this.f24750b = azVar;
        this.f24751c = tLObject;
        this.d = gjVar;
        this.f24752e = str;
        this.f24753f = myVar;
        this.h = z10;
        this.f24754n = myVar2;
        this.f24755r = obj;
        this.f24756s = hashMap;
        this.f24757w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24749a) {
            case 0:
                this.f24750b.O(this.f24751c, this.d, this.f24752e, this.f24753f, this.h, this.f24754n, this.f24755r, this.f24756s, this.f24757w);
                return;
            case 1:
                this.f24750b.O(this.f24751c, this.d, this.f24752e, this.f24753f, this.h, this.f24754n, this.f24755r, this.f24756s, this.f24757w);
                return;
            default:
                this.f24750b.O(this.f24751c, this.d, this.f24752e, this.f24753f, this.h, this.f24754n, this.f24755r, this.f24756s, this.f24757w);
                return;
        }
    }
}
