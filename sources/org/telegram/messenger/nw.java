package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class nw implements Runnable {
    public final int f24234a;
    public final gz f24235b;
    public final TLObject f24236c;
    public final ij d;
    public final String f24237e;
    public final sy f24238f;
    public final boolean h;
    public final sy f24239n;
    public final Object f24240r;
    public final HashMap f24241s;
    public final boolean f24242w;

    public nw(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, int i7) {
        this.f24234a = i7;
        this.f24235b = gzVar;
        this.f24236c = tLObject;
        this.d = ijVar;
        this.f24237e = str;
        this.f24238f = syVar;
        this.h = z9;
        this.f24239n = syVar2;
        this.f24240r = obj;
        this.f24241s = hashMap;
        this.f24242w = z10;
    }

    @Override
    public final void run() {
        switch (this.f24234a) {
            case 0:
                this.f24235b.O(this.f24236c, this.d, this.f24237e, this.f24238f, this.h, this.f24239n, this.f24240r, this.f24241s, this.f24242w);
                return;
            case 1:
                this.f24235b.O(this.f24236c, this.d, this.f24237e, this.f24238f, this.h, this.f24239n, this.f24240r, this.f24241s, this.f24242w);
                return;
            default:
                this.f24235b.O(this.f24236c, this.d, this.f24237e, this.f24238f, this.h, this.f24239n, this.f24240r, this.f24241s, this.f24242w);
                return;
        }
    }
}
