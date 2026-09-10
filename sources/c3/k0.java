package c3;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
public final class k0 {
    public final int f4200a;
    public boolean f4201b;

    public k0() {
        this.f4200a = 4;
    }

    public void a(boolean z10) {
        switch (this.f4200a) {
            case 2:
                if (this.f4201b != z10) {
                    this.f4201b = z10;
                    return;
                }
                return;
            default:
                if (this.f4201b != z10) {
                    this.f4201b = z10;
                    return;
                }
                return;
        }
    }

    public k0(Context context, Looper looper, e2.x xVar, int i10) {
        this.f4200a = i10;
        switch (i10) {
            case 3:
                new rb.a(context.getApplicationContext());
                xVar.a(looper, null);
                return;
            default:
                new qb.b(context.getApplicationContext());
                xVar.a(looper, null);
                return;
        }
    }

    public k0(boolean z10) {
        this.f4200a = 0;
        this.f4201b = z10;
    }

    public k0(f2.o oVar, f2.q qVar) {
        this.f4200a = 1;
        int i10 = qVar.f7735a;
        ByteBuffer byteBuffer = qVar.f7736b;
        e2.d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.h hVar = new a4.h(bArr, min);
        oVar.getClass();
        if (hVar.h()) {
            this.f4201b = false;
            return;
        }
        int i11 = hVar.i(2);
        if (!hVar.h()) {
            this.f4201b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            hVar.h();
        }
        hVar.s();
        throw new Exception();
    }
}
