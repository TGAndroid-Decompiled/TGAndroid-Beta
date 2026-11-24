package defpackage;

import java.util.HashMap;
import org.telegram.tgnet.TLObject;
public final class o1a implements Runnable {
    public final byte a;
    public final z3a b;
    public final TLObject c;
    public final k27 d;
    public final String e;
    public final k3a f;
    public final boolean h;
    public final k3a n;
    public final Object r;
    public final HashMap s;
    public final boolean w;

    public o1a(z3a z3aVar, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.h = z;
        this.n = k3aVar2;
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
