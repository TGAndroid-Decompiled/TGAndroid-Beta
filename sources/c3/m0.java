package c3;

import java.nio.ByteBuffer;
import v7.t6;
public final class m0 {
    public boolean f3684a;

    public m0(f2.t tVar, f2.s sVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = sVar.f6786a;
        ByteBuffer byteBuffer = sVar.f6787b;
        if (i11 != 6 && i11 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.f(z10);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        if (!tVar.f6788a) {
            if (gVar.h()) {
                this.f3684a = false;
                return;
            }
            int i12 = gVar.i(2);
            boolean h = gVar.h();
            if (!tVar.f6789b) {
                if (!h) {
                    this.f3684a = true;
                    return;
                }
                if (i12 != 3 && i12 != 0) {
                    z11 = gVar.h();
                } else {
                    z11 = true;
                }
                gVar.e0();
                if (tVar.d) {
                    if (gVar.h()) {
                        if (tVar.e) {
                            gVar.e0();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!tVar.f6790c) {
                        if (i12 != 3) {
                            gVar.e0();
                        }
                        gVar.f0(tVar.f6791f);
                        if (i12 != 2 && i12 != 0 && !z11) {
                            gVar.f0(3);
                        }
                        if (i12 != 3 && i12 != 0) {
                            i10 = gVar.i(8);
                        } else {
                            i10 = 255;
                        }
                        this.f3684a = i10 != 0;
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
        if (this.f3684a == z10) {
            return;
        }
        this.f3684a = z10;
    }
}
