package bi;

import a4.g;
import f2.s;
import f2.t;
import java.nio.ByteBuffer;
import v7.u6;
public final class a {
    public boolean f4423a;

    public a(t tVar, s sVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = sVar.f10338a;
        ByteBuffer byteBuffer = sVar.f10339b;
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
        if (!tVar.f10340a) {
            if (gVar.f()) {
                this.f4423a = false;
                return;
            }
            int g10 = gVar.g(2);
            boolean f7 = gVar.f();
            if (!tVar.f10341b) {
                if (!f7) {
                    this.f4423a = true;
                    return;
                }
                if (g10 != 3 && g10 != 0) {
                    z11 = gVar.f();
                } else {
                    z11 = true;
                }
                gVar.n();
                if (tVar.d) {
                    if (gVar.f()) {
                        if (tVar.e) {
                            gVar.n();
                        } else {
                            throw new Exception();
                        }
                    }
                    if (!tVar.f10342c) {
                        if (g10 != 3) {
                            gVar.n();
                        }
                        gVar.o(tVar.f10343f);
                        if (g10 != 2 && g10 != 0 && !z11) {
                            gVar.o(3);
                        }
                        if (g10 != 3 && g10 != 0) {
                            i10 = gVar.g(8);
                        } else {
                            i10 = 255;
                        }
                        this.f4423a = i10 != 0;
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
        if (this.f4423a == z10) {
            return;
        }
        this.f4423a = z10;
    }
}
