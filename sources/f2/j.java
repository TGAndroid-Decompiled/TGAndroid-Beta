package f2;

import a8.ia;
import h9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class j {
    public final i0 f10913a;
    public final ArrayList f10914b = new ArrayList();
    public ByteBuffer[] f10915c = new ByteBuffer[0];
    public boolean d;

    public j(i0 i0Var) {
        this.f10913a = i0Var;
        k kVar = k.f10916e;
        this.d = false;
    }

    public final void a() {
        boolean z9;
        l lVar = l.f10920b;
        ArrayList arrayList = this.f10914b;
        arrayList.clear();
        this.d = false;
        long j3 = lVar.f10921a;
        int i7 = 0;
        while (true) {
            i0 i0Var = this.f10913a;
            if (i7 >= i0Var.size()) {
                break;
            }
            n nVar = (n) i0Var.get(i7);
            nVar.d(new l(j3));
            if (nVar.isActive()) {
                j3 = nVar.g(j3);
                if (j3 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                arrayList.add(nVar);
            }
            i7++;
        }
        this.f10915c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f10915c[i10] = ((n) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.f10915c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((n) this.f10914b.get(b())).a() && !this.f10915c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f10914b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z9;
        ByteBuffer byteBuffer2;
        boolean z10;
        for (boolean z11 = true; z11; z11 = z9) {
            z9 = false;
            for (int i7 = 0; i7 <= b(); i7++) {
                if (!this.f10915c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f10914b;
                    n nVar = (n) arrayList.get(i7);
                    if (nVar.a()) {
                        if (!this.f10915c[i7].hasRemaining() && i7 < b()) {
                            ((n) arrayList.get(i7 + 1)).f();
                        }
                    } else {
                        if (i7 > 0) {
                            byteBuffer2 = this.f10915c[i7 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = n.f10922a;
                        }
                        nVar.c(byteBuffer2);
                        this.f10915c[i7] = nVar.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f10915c[i7].hasRemaining()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        z9 |= z10;
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
        i0 i0Var = ((j) obj).f10913a;
        i0 i0Var2 = this.f10913a;
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
        return this.f10913a.hashCode();
    }
}
