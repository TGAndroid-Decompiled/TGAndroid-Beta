package ai;

import a4.g;
import f2.r;
import f2.s;
import java.nio.ByteBuffer;
import v7.u6;
public final class a {
    public boolean f918a;

    public a(s sVar, r rVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = rVar.f8895a;
        ByteBuffer byteBuffer = rVar.f8896b;
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
        if (!sVar.f8897a) {
            if (gVar.f()) {
                this.f918a = false;
                return;
            }
            int g10 = gVar.g(2);
            boolean f7 = gVar.f();
            if (!sVar.f8898b) {
                if (!f7) {
                    this.f918a = true;
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
                    if (!sVar.f8899c) {
                        if (g10 != 3) {
                            gVar.n();
                        }
                        gVar.o(sVar.f8900f);
                        if (g10 != 2 && g10 != 0 && !z11) {
                            gVar.o(3);
                        }
                        if (g10 != 3 && g10 != 0) {
                            i10 = gVar.g(8);
                        } else {
                            i10 = 255;
                        }
                        this.f918a = i10 != 0;
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
        if (this.f918a == z10) {
            return;
        }
        this.f918a = z10;
    }
}
