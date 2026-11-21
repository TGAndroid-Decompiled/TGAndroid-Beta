package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class hw implements Runnable {
    public final int f24533a;
    public final zy f24534b;
    public final TLObject f24535c;
    public final fj d;
    public final String f24536e;
    public final ly f24537f;
    public final boolean h;
    public final ly f24538n;
    public final Object f24539r;
    public final HashMap f24540s;
    public final boolean f24541w;

    public hw(zy zyVar, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11, int i7) {
        this.f24533a = i7;
        this.f24534b = zyVar;
        this.f24535c = tLObject;
        this.d = fjVar;
        this.f24536e = str;
        this.f24537f = lyVar;
        this.h = z10;
        this.f24538n = lyVar2;
        this.f24539r = obj;
        this.f24540s = hashMap;
        this.f24541w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24533a) {
            case 0:
                this.f24534b.O(this.f24535c, this.d, this.f24536e, this.f24537f, this.h, this.f24538n, this.f24539r, this.f24540s, this.f24541w);
                return;
            case 1:
                this.f24534b.O(this.f24535c, this.d, this.f24536e, this.f24537f, this.h, this.f24538n, this.f24539r, this.f24540s, this.f24541w);
                return;
            default:
                this.f24534b.O(this.f24535c, this.d, this.f24536e, this.f24537f, this.h, this.f24538n, this.f24539r, this.f24540s, this.f24541w);
                return;
        }
    }
}
