package ei;

import a8.ma;
import d4.f;
import i2.q;
import i2.r;
import java.nio.ByteBuffer;
public final class a {
    public boolean f10957a;

    public a(r rVar, q qVar) {
        boolean z10;
        boolean z11;
        int i7;
        int i10 = qVar.f15971a;
        ByteBuffer byteBuffer = qVar.f15972b;
        if (i10 != 6 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        ma.f(z10);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        f fVar = new f(bArr, min);
        if (!rVar.f15973a) {
            if (fVar.i()) {
                this.f10957a = false;
                return;
            }
            int j3 = fVar.j(2);
            boolean i11 = fVar.i();
            if (!rVar.f15974b) {
                if (!i11) {
                    this.f10957a = true;
                    return;
                }
                if (j3 != 3 && j3 != 0) {
                    z11 = fVar.i();
                } else {
                    z11 = true;
                }
                fVar.K();
                if (rVar.d) {
                    if (fVar.i()) {
                        if (rVar.f15976e) {
                            fVar.K();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!rVar.f15975c) {
                        if (j3 != 3) {
                            fVar.K();
                        }
                        fVar.L(rVar.f15977f);
                        if (j3 != 2 && j3 != 0 && !z11) {
                            fVar.L(3);
                        }
                        if (j3 != 3 && j3 != 0) {
                            i7 = fVar.j(8);
                        } else {
                            i7 = 255;
                        }
                        this.f10957a = i7 != 0;
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
        if (this.f10957a == z10) {
            return;
        }
        this.f10957a = z10;
    }
}
