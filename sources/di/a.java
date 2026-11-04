package di;

import b8.zb;
import c4.f;
import h2.q;
import h2.r;
import java.nio.ByteBuffer;
public final class a {
    public boolean f9179a;

    public a(r rVar, q qVar) {
        boolean z10;
        boolean z11;
        int i3;
        int i10 = qVar.f14161a;
        ByteBuffer byteBuffer = qVar.f14162b;
        if (i10 != 6 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.f(z10);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        f fVar = new f(bArr, min);
        if (!rVar.f14163a) {
            if (fVar.i()) {
                this.f9179a = false;
                return;
            }
            int j10 = fVar.j(2);
            boolean i11 = fVar.i();
            if (!rVar.f14164b) {
                if (!i11) {
                    this.f9179a = true;
                    return;
                }
                if (j10 != 3 && j10 != 0) {
                    z11 = fVar.i();
                } else {
                    z11 = true;
                }
                fVar.K();
                if (rVar.d) {
                    if (fVar.i()) {
                        if (rVar.f14166e) {
                            fVar.K();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!rVar.f14165c) {
                        if (j10 != 3) {
                            fVar.K();
                        }
                        fVar.L(rVar.f14167f);
                        if (j10 != 2 && j10 != 0 && !z11) {
                            fVar.L(3);
                        }
                        if (j10 != 3 && j10 != 0) {
                            i3 = fVar.j(8);
                        } else {
                            i3 = 255;
                        }
                        this.f9179a = i3 != 0;
                        return;
                    }
                    throw new Exception();
                }
                throw new Exception();
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public void a(boolean z10) {
        if (this.f9179a == z10) {
            return;
        }
        this.f9179a = z10;
    }
}
