package e2;

import b8.zb;
import g9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class i {
    public final i0 f9349a;
    public final ArrayList f9350b = new ArrayList();
    public ByteBuffer[] f9351c = new ByteBuffer[0];
    public boolean d;

    public i(i0 i0Var) {
        this.f9349a = i0Var;
        j jVar = j.f9352e;
        this.d = false;
    }

    public final void a() {
        boolean z10;
        k kVar = k.f9356b;
        ArrayList arrayList = this.f9350b;
        arrayList.clear();
        this.d = false;
        long j10 = kVar.f9357a;
        int i3 = 0;
        while (true) {
            i0 i0Var = this.f9349a;
            if (i3 >= i0Var.size()) {
                break;
            }
            m mVar = (m) i0Var.get(i3);
            mVar.e(new k(j10));
            if (mVar.isActive()) {
                j10 = mVar.g(j10);
                if (j10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                arrayList.add(mVar);
            }
            i3++;
        }
        this.f9351c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f9351c[i10] = ((m) arrayList.get(i10)).b();
        }
    }

    public final int b() {
        return this.f9351c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((m) this.f9350b.get(b())).a() && !this.f9351c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f9350b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i3 = 0; i3 <= b(); i3++) {
                if (!this.f9351c[i3].hasRemaining()) {
                    ArrayList arrayList = this.f9350b;
                    m mVar = (m) arrayList.get(i3);
                    if (mVar.a()) {
                        if (!this.f9351c[i3].hasRemaining() && i3 < b()) {
                            ((m) arrayList.get(i3 + 1)).f();
                        }
                    } else {
                        if (i3 > 0) {
                            byteBuffer2 = this.f9351c[i3 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = m.f9358a;
                        }
                        mVar.c(byteBuffer2);
                        this.f9351c[i3] = mVar.b();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f9351c[i3].hasRemaining()) {
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
        if (!(obj instanceof i)) {
            return false;
        }
        i0 i0Var = ((i) obj).f9349a;
        i0 i0Var2 = this.f9349a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i0Var2.size(); i3++) {
            if (i0Var2.get(i3) != i0Var.get(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f9349a.hashCode();
    }
}
