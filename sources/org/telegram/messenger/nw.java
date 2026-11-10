package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class nw implements Runnable {
    public final int f24238a;
    public final gz f24239b;
    public final TLObject f24240c;
    public final ij d;
    public final String f24241e;
    public final sy f24242f;
    public final boolean h;
    public final sy f24243n;
    public final Object f24244r;
    public final HashMap f24245s;
    public final boolean f24246w;

    public nw(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, int i7) {
        this.f24238a = i7;
        this.f24239b = gzVar;
        this.f24240c = tLObject;
        this.d = ijVar;
        this.f24241e = str;
        this.f24242f = syVar;
        this.h = z9;
        this.f24243n = syVar2;
        this.f24244r = obj;
        this.f24245s = hashMap;
        this.f24246w = z10;
    }

    @Override
    public final void run() {
        switch (this.f24238a) {
            case 0:
                this.f24239b.O(this.f24240c, this.d, this.f24241e, this.f24242f, this.h, this.f24243n, this.f24244r, this.f24245s, this.f24246w);
                return;
            case 1:
                this.f24239b.O(this.f24240c, this.d, this.f24241e, this.f24242f, this.h, this.f24243n, this.f24244r, this.f24245s, this.f24246w);
                return;
            default:
                this.f24239b.O(this.f24240c, this.d, this.f24241e, this.f24242f, this.h, this.f24243n, this.f24244r, this.f24245s, this.f24246w);
                return;
        }
    }
}
