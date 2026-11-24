package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class q3a implements Runnable {
    public final byte a;
    public final a6a b;
    public final TLObject c;
    public final k47 d;
    public final String e;
    public final m5a f;
    public final boolean h;
    public final m5a n;
    public final Object r;
    public final HashMap s;
    public final boolean w;

    public q3a(a6a a6aVar, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.h = z;
        this.n = m5aVar2;
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
