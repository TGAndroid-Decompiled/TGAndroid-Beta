package defpackage;

import android.net.Uri;
import java.io.IOException;
public final class cv7 implements k86 {
    public final long a;
    public final u63 b;
    public final byte c;
    public final zxa d;
    public final bv7 e;
    public volatile Object f;

    public cv7(c5a c5aVar) {
        this.d = new zxa((o63) c5aVar.c);
        this.b = (u63) c5aVar.d;
        this.c = (byte) 4;
        this.e = (bv7) c5aVar.e;
        this.a = f86.h.getAndIncrement();
    }

    @Override
    public final void a() {
        this.d.b = 0L;
        s63 s63Var = new s63(this.d, this.b);
        try {
            s63Var.a.open(s63Var.b);
            s63Var.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.v(uri, s63Var);
            try {
                s63Var.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = g8c.a;
            try {
                s63Var.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void d() {
    }

    public cv7(o63 o63Var, u63 u63Var, int i, bv7 bv7Var) {
        this.d = new zxa(o63Var);
        this.b = u63Var;
        this.c = i;
        this.e = bv7Var;
        this.a = f86.h.getAndIncrement();
    }
}
