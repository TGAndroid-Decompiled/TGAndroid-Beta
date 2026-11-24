package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class k30 {
    public final y79 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public k30(y79 y79Var) {
        this.a = y79Var;
        l30 l30Var = l30.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        if (this.d && ((p30) this.b.get(a())).a() && !this.c[a()].hasRemaining()) {
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
                    p30 p30Var = (p30) arrayList.get(i);
                    if (p30Var.a()) {
                        if (!this.c[i].hasRemaining() && i < a()) {
                            ((p30) arrayList.get(i + 1)).f();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = p30.a;
                        }
                        p30Var.d(byteBuffer2);
                        this.c[i] = p30Var.b();
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
            if (obj instanceof k30) {
                y79 y79Var = ((k30) obj).a;
                y79 y79Var2 = this.a;
                if (y79Var2.d == y79Var.d) {
                    for (int i = 0; i < y79Var2.d; i++) {
                        if (y79Var2.get(i) == y79Var.get(i)) {
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
