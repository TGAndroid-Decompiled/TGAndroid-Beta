package c2;

import e9.i0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class e {
    public final i0 f4176a;
    public final ArrayList f4177b = new ArrayList();
    public ByteBuffer[] f4178c = new ByteBuffer[0];
    public boolean d;

    public e(i0 i0Var) {
        this.f4176a = i0Var;
        f fVar = f.f4179e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f4177b;
        arrayList.clear();
        this.d = false;
        int i10 = 0;
        while (true) {
            i0 i0Var = this.f4176a;
            if (i10 >= i0Var.size()) {
                break;
            }
            h hVar = (h) i0Var.get(i10);
            hVar.flush();
            if (hVar.isActive()) {
                arrayList.add(hVar);
            }
            i10++;
        }
        this.f4178c = new ByteBuffer[arrayList.size()];
        for (int i11 = 0; i11 <= b(); i11++) {
            this.f4178c[i11] = ((h) arrayList.get(i11)).a();
        }
    }

    public final int b() {
        return this.f4178c.length - 1;
    }

    public final boolean c() {
        if (this.d && ((h) this.f4177b.get(b())).b() && !this.f4178c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f4177b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= b(); i10++) {
                if (!this.f4178c[i10].hasRemaining()) {
                    ArrayList arrayList = this.f4177b;
                    h hVar = (h) arrayList.get(i10);
                    if (hVar.b()) {
                        if (!this.f4178c[i10].hasRemaining() && i10 < b()) {
                            ((h) arrayList.get(i10 + 1)).e();
                        }
                    } else {
                        if (i10 > 0) {
                            byteBuffer2 = this.f4178c[i10 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = h.f4183a;
                        }
                        hVar.c(byteBuffer2);
                        this.f4178c[i10] = hVar.a();
                        if (byteBuffer2.remaining() - byteBuffer2.remaining() <= 0 && !this.f4178c[i10].hasRemaining()) {
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
        if (!(obj instanceof e)) {
            return false;
        }
        i0 i0Var = ((e) obj).f4176a;
        i0 i0Var2 = this.f4176a;
        if (i0Var2.size() != i0Var.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i0Var2.size(); i10++) {
            if (i0Var2.get(i10) != i0Var.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f4176a.hashCode();
    }
}
