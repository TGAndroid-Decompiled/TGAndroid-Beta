package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class k20 {
    public final w59 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k20(w59 w59Var) {
        this.a = w59Var;
        l20 l20Var = l20.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        if (this.d && ((p20) this.b.get(a())).a() && !this.c[a()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z2;
        for (boolean z3 = true; z3; z3 = z) {
            z = false;
            for (int i = 0; i <= a(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    p20 p20Var = (p20) arrayList.get(i);
                    if (p20Var.a()) {
                        if (!this.c[i].hasRemaining() && i < a()) {
                            ((p20) arrayList.get(i + 1)).f();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = p20.a;
                        }
                        p20Var.d(byteBuffer2);
                        this.c[i] = p20Var.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        z |= z2;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k20) {
                w59 w59Var = ((k20) obj).a;
                w59 w59Var2 = this.a;
                if (w59Var2.d == w59Var.d) {
                    for (int i = 0; i < w59Var2.d; i++) {
                        if (w59Var2.get(i) == w59Var.get(i)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
