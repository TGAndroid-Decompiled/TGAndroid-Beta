package ci;

import a8.ia;
import d4.f;
import i2.q;
import i2.r;
import java.nio.ByteBuffer;
public final class a {
    public boolean f6416a;

    public a(r rVar, q qVar) {
        boolean z9;
        boolean z10;
        int i7;
        int i10 = qVar.f15208a;
        ByteBuffer byteBuffer = qVar.f15209b;
        if (i10 != 6 && i10 != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        ia.f(z9);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        f fVar = new f(bArr, min);
        if (!rVar.f15210a) {
            if (fVar.i()) {
                this.f6416a = false;
                return;
            }
            int j3 = fVar.j(2);
            boolean i11 = fVar.i();
            if (!rVar.f15211b) {
                if (!i11) {
                    this.f6416a = true;
                    return;
                }
                if (j3 != 3 && j3 != 0) {
                    z10 = fVar.i();
                } else {
                    z10 = true;
                }
                fVar.K();
                if (rVar.d) {
                    if (fVar.i()) {
                        if (rVar.f15213e) {
                            fVar.K();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!rVar.f15212c) {
                        if (j3 != 3) {
                            fVar.K();
                        }
                        fVar.L(rVar.f15214f);
                        if (j3 != 2 && j3 != 0 && !z10) {
                            fVar.L(3);
                        }
                        if (j3 != 3 && j3 != 0) {
                            i7 = fVar.j(8);
                        } else {
                            i7 = 255;
                        }
                        this.f6416a = i7 != 0;
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

    public void a(boolean z9) {
        if (this.f6416a == z9) {
            return;
        }
        this.f6416a = z9;
    }
}
