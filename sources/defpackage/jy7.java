package defpackage;

import android.net.Uri;
import java.io.IOException;
public final class jy7 implements oa6 {
    public final long a;
    public final n73 b;
    public final byte c;
    public final b2b d;
    public final iy7 e;
    public volatile Object f;

    public jy7(lyc lycVar) {
        this.d = new b2b((h73) lycVar.b);
        this.b = (n73) lycVar.c;
        this.c = (byte) 4;
        this.e = (iy7) lycVar.d;
        this.a = ja6.h.getAndIncrement();
    }

    @Override
    public final void a() {
        this.d.b = 0L;
        l73 l73Var = new l73(this.d, this.b);
        try {
            l73Var.a.open(l73Var.b);
            l73Var.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.I(uri, l73Var);
            try {
                l73Var.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = gcc.a;
            try {
                l73Var.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void c() {
    }

    public jy7(h73 h73Var, n73 n73Var, int i, iy7 iy7Var) {
        this.d = new b2b(h73Var);
        this.b = n73Var;
        this.c = i;
        this.e = iy7Var;
        this.a = ja6.h.getAndIncrement();
    }
}
