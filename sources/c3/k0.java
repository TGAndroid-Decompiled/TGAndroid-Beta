package c3;

import android.content.Context;
import android.os.Looper;
import java.nio.ByteBuffer;
public final class k0 {
    public final int f3778a;
    public boolean f3779b;

    public k0() {
        this.f3778a = 4;
    }

    public void a(boolean z10) {
        switch (this.f3778a) {
            case 2:
                if (this.f3779b != z10) {
                    this.f3779b = z10;
                    return;
                }
                return;
            default:
                if (this.f3779b != z10) {
                    this.f3779b = z10;
                    return;
                }
                return;
        }
    }

    public k0(Context context, Looper looper, e2.x xVar, int i10) {
        this.f3778a = i10;
        switch (i10) {
            case 3:
                new na.d(context.getApplicationContext());
                xVar.a(looper, null);
                return;
            default:
                new t7.u(context.getApplicationContext());
                xVar.a(looper, null);
                return;
        }
    }

    public k0(boolean z10) {
        this.f3778a = 0;
        this.f3779b = z10;
    }

    public k0(f2.o oVar, f2.q qVar) {
        this.f3778a = 1;
        int i10 = qVar.f8836a;
        ByteBuffer byteBuffer = qVar.f8837b;
        e2.d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.h hVar = new a4.h(bArr, min);
        oVar.getClass();
        if (hVar.h()) {
            this.f3779b = false;
            return;
        }
        int i11 = hVar.i(2);
        if (!hVar.h()) {
            this.f3779b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            hVar.h();
        }
        hVar.s();
        throw new Exception();
    }
}
