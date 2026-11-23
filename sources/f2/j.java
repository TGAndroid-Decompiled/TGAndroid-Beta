package f2;

import a8.la;
import h9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class j {
    public final i0 f11077a;
    public final ArrayList f11078b = new ArrayList();
    public ByteBuffer[] f11079c = new ByteBuffer[0];
    public boolean d;

    public j(i0 i0Var) {
        this.f11077a = i0Var;
        k kVar = k.f11080e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        l lVar = l.f11084b;
        ArrayList arrayList = this.f11078b;
        arrayList.clear();
        this.d = false;
        long j3 = lVar.f11085a;
        int i7 = 0;
        while (true) {
            i0 i0Var = this.f11077a;
            if (i7 >= i0Var.size()) {
                break;
            }
            n nVar = (n) i0Var.get(i7);
            nVar.d(new l(j3));
            if (nVar.isActive()) {
                j3 = nVar.g(j3);
                if (j3 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                arrayList.add(nVar);
            }
            i7++;
        }
        this.f11079c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f11079c[i10] = ((n) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.f11079c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((n) this.f11078b.get(b())).a() && !this.f11079c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f11078b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i7 = 0; i7 <= b(); i7++) {
                if (!this.f11079c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f11078b;
                    n nVar = (n) arrayList.get(i7);
                    if (nVar.a()) {
                        if (!this.f11079c[i7].hasRemaining() && i7 < b()) {
                            ((n) arrayList.get(i7 + 1)).f();
                        }
                    } else {
                        if (i7 > 0) {
                            byteBuffer2 = this.f11079c[i7 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = n.f11086a;
                        }
                        nVar.c(byteBuffer2);
                        this.f11079c[i7] = nVar.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f11079c[i7].hasRemaining()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z10 |= z11;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        i0 i0Var = ((j) obj).f11077a;
        i0 i0Var2 = this.f11077a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i7 = 0; i7 < i0Var2.size(); i7++) {
            if (i0Var2.get(i7) != i0Var.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11077a.hashCode();
    }
}
