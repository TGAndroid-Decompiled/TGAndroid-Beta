package c3;

import a8.yb;
import java.nio.ByteBuffer;
public final class m0 {
    public boolean f6089a;

    public m0(f2.t tVar, f2.s sVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11 = sVar.f10113a;
        ByteBuffer byteBuffer = sVar.f10114b;
        if (i11 != 6 && i11 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        yb.g(z10);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        if (!tVar.f10115a) {
            if (gVar.f()) {
                this.f6089a = false;
                return;
            }
            int g7 = gVar.g(2);
            boolean f7 = gVar.f();
            if (!tVar.f10116b) {
                if (!f7) {
                    this.f6089a = true;
                    return;
                }
                if (g7 != 3 && g7 != 0) {
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
                    if (!tVar.f10117c) {
                        if (g7 != 3) {
                            gVar.n();
                        }
                        gVar.o(tVar.f10118f);
                        if (g7 != 2 && g7 != 0 && !z11) {
                            gVar.o(3);
                        }
                        if (g7 != 3 && g7 != 0) {
                            i10 = gVar.g(8);
                        } else {
                            i10 = 255;
                        }
                        this.f6089a = i10 != 0;
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
        if (this.f6089a == z10) {
            return;
        }
        this.f6089a = z10;
    }
}
