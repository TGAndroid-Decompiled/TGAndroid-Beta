package ai;

import a4.g;
import f2.r;
import f2.s;
import java.nio.ByteBuffer;
import v7.u6;
public final class a {
    public boolean f914a;

    public a(s sVar, r rVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = rVar.f8892a;
        ByteBuffer byteBuffer = rVar.f8893b;
        if (i11 != 6 && i11 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        u6.g(z10);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        g gVar = new g(bArr, min);
        if (!sVar.f8894a) {
            if (gVar.f()) {
                this.f914a = false;
                return;
            }
            int g10 = gVar.g(2);
            boolean f7 = gVar.f();
            if (!sVar.f8895b) {
                if (!f7) {
                    this.f914a = true;
                    return;
                }
                if (g10 != 3 && g10 != 0) {
                    z11 = gVar.f();
                } else {
                    z11 = true;
                }
                gVar.n();
                if (sVar.d) {
                    if (gVar.f()) {
                        if (sVar.e) {
                            gVar.n();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!sVar.f8896c) {
                        if (g10 != 3) {
                            gVar.n();
                        }
                        gVar.o(sVar.f8897f);
                        if (g10 != 2 && g10 != 0 && !z11) {
                            gVar.o(3);
                        }
                        if (g10 != 3 && g10 != 0) {
                            i10 = gVar.g(8);
                        } else {
                            i10 = 255;
                        }
                        this.f914a = i10 != 0;
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
        if (this.f914a == z10) {
            return;
        }
        this.f914a = z10;
    }
}
