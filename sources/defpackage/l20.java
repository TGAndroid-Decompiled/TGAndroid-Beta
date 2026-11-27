package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class l20 {
    public final j99 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public l20(j99 j99Var) {
        this.a = j99Var;
        m20 m20Var = m20.e;
        this.d = false;
    }

    public final int a() {
        return this.c.length - 1;
    }

    public final boolean b() {
        if (this.d && ((q20) this.b.get(a())).a() && !this.c[a()].hasRemaining()) {
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
                    q20 q20Var = (q20) arrayList.get(i);
                    if (q20Var.a()) {
                        if (!this.c[i].hasRemaining() && i < a()) {
                            ((q20) arrayList.get(i + 1)).f();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = q20.a;
                        }
                        q20Var.d(byteBuffer2);
                        this.c[i] = q20Var.b();
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
            if (obj instanceof l20) {
                j99 j99Var = ((l20) obj).a;
                j99 j99Var2 = this.a;
                if (j99Var2.d == j99Var.d) {
                    for (int i = 0; i < j99Var2.d; i++) {
                        if (j99Var2.get(i) == j99Var.get(i)) {
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
