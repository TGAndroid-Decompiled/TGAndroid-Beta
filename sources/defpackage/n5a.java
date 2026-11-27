package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class n5a implements Runnable {
    public final byte a;
    public final r7a b;
    public final TLObject c;
    public final r47 d;
    public final String e;
    public final d7a f;
    public final boolean h;
    public final d7a n;
    public final Object r;
    public final HashMap s;
    public final boolean w;

    public n5a(r7a r7aVar, TLObject tLObject, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tLObject;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.h = z;
        this.n = d7aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                return;
            case 1:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                return;
            default:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                return;
        }
    }
}
