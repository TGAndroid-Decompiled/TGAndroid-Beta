package c3;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
public final class j0 {
    public final int f4130a;
    public boolean f4131b;

    public j0() {
        this.f4130a = 4;
    }

    public void a(boolean z10) {
        switch (this.f4130a) {
            case 2:
                if (this.f4131b != z10) {
                    this.f4131b = z10;
                    return;
                }
                return;
            default:
                if (this.f4131b != z10) {
                    this.f4131b = z10;
                    return;
                }
                return;
        }
    }

    public j0(Context context, Looper looper, e2.x xVar, int i10) {
        this.f4130a = i10;
        switch (i10) {
            case 3:
                new na.d(context.getApplicationContext());
                xVar.a(looper, null);
                return;
            default:
                new t7.t(context.getApplicationContext());
                xVar.a(looper, null);
                return;
        }
    }

    public j0(boolean z10) {
        this.f4130a = 0;
        this.f4131b = z10;
    }

    public j0(f2.p pVar, f2.r rVar) {
        this.f4130a = 1;
        int i10 = rVar.f9619a;
        ByteBuffer byteBuffer = rVar.f9620b;
        e2.d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, min);
        pVar.getClass();
        if (gVar.h()) {
            this.f4131b = false;
            return;
        }
        int i11 = gVar.i(2);
        if (!gVar.h()) {
            this.f4131b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            gVar.h();
        }
        gVar.s();
        throw new Exception();
    }
}
