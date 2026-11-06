package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class ow implements Runnable {
    public final int f24395a;
    public final gz f24396b;
    public final TLObject f24397c;
    public final ij d;
    public final String f24398e;
    public final sy f24399f;
    public final boolean h;
    public final sy f24400n;
    public final Object f24401r;
    public final HashMap f24402s;
    public final boolean f24403w;

    public ow(gz gzVar, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10, int i7) {
        this.f24395a = i7;
        this.f24396b = gzVar;
        this.f24397c = tLObject;
        this.d = ijVar;
        this.f24398e = str;
        this.f24399f = syVar;
        this.h = z9;
        this.f24400n = syVar2;
        this.f24401r = obj;
        this.f24402s = hashMap;
        this.f24403w = z10;
    }

    @Override
    public final void run() {
        switch (this.f24395a) {
            case 0:
                this.f24396b.O(this.f24397c, this.d, this.f24398e, this.f24399f, this.h, this.f24400n, this.f24401r, this.f24402s, this.f24403w);
                return;
            case 1:
                this.f24396b.O(this.f24397c, this.d, this.f24398e, this.f24399f, this.h, this.f24400n, this.f24401r, this.f24402s, this.f24403w);
                return;
            default:
                this.f24396b.O(this.f24397c, this.d, this.f24398e, this.f24399f, this.h, this.f24400n, this.f24401r, this.f24402s, this.f24403w);
                return;
        }
    }
}
