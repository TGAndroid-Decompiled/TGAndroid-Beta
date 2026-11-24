package defpackage;

import android.net.Uri;
import java.io.IOException;
public final class dx7 implements ja6 {
    public final long a;
    public final g83 b;
    public final byte c;
    public final c0b d;
    public final cx7 e;
    public volatile Object f;

    public dx7(xvc xvcVar) {
        this.d = new c0b((a83) xvcVar.b);
        this.b = (g83) xvcVar.c;
        this.c = (byte) 4;
        this.e = (cx7) xvcVar.d;
        this.a = ea6.h.getAndIncrement();
    }

    @Override
    public final void a() {
        this.d.b = 0L;
        e83 e83Var = new e83(this.d, this.b);
        try {
            e83Var.a.open(e83Var.b);
            e83Var.d = true;
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.y(uri, e83Var);
            try {
                e83Var.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = hac.a;
            try {
                e83Var.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override
    public final void e() {
    }

    public dx7(a83 a83Var, g83 g83Var, int i, cx7 cx7Var) {
        this.d = new c0b(a83Var);
        this.b = g83Var;
        this.c = i;
        this.e = cx7Var;
        this.a = ea6.h.getAndIncrement();
    }
}
