package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class ow implements Runnable {
    public final int f24388a;
    public final gz f24389b;
    public final TLObject f24390c;
    public final ij d;
    public final String f24391e;
    public final sy f24392f;
    public final boolean h;
    public final sy f24393n;
    public final Object f24394r;
    public final HashMap f24395s;
    public final boolean f24396w;

    public ow(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, int i7) {
        this.f24388a = i7;
        this.f24389b = gzVar;
        this.f24390c = tLObject;
        this.d = ijVar;
        this.f24391e = str;
        this.f24392f = syVar;
        this.h = z9;
        this.f24393n = syVar2;
        this.f24394r = obj;
        this.f24395s = hashMap;
        this.f24396w = z10;
    }

    @Override
    public final void run() {
        switch (this.f24388a) {
            case 0:
                this.f24389b.O(this.f24390c, this.d, this.f24391e, this.f24392f, this.h, this.f24393n, this.f24394r, this.f24395s, this.f24396w);
                return;
            case 1:
                this.f24389b.O(this.f24390c, this.d, this.f24391e, this.f24392f, this.h, this.f24393n, this.f24394r, this.f24395s, this.f24396w);
                return;
            default:
                this.f24389b.O(this.f24390c, this.d, this.f24391e, this.f24392f, this.h, this.f24393n, this.f24394r, this.f24395s, this.f24396w);
                return;
        }
    }
}
