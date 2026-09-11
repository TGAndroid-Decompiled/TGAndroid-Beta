package ai;

import a4.h;
import android.content.Context;
import android.os.Looper;
import e2.d;
import e2.x;
import f2.p;
import f2.r;
import java.nio.ByteBuffer;
public final class a {
    public final int f736a;
    public boolean f737b;

    public a() {
        this.f736a = 0;
    }

    public void a(boolean z10) {
        switch (this.f736a) {
            case 3:
                if (this.f737b != z10) {
                    this.f737b = z10;
                    return;
                }
                return;
            default:
                if (this.f737b != z10) {
                    this.f737b = z10;
                    return;
                }
                return;
        }
    }

    public a(Context context, Looper looper, x xVar, int i10) {
        this.f736a = i10;
        switch (i10) {
            case 4:
                new ob.a(context.getApplicationContext());
                xVar.a(looper, null);
                return;
            default:
                context.getApplicationContext();
                xVar.a(looper, null);
                return;
        }
    }

    public a(boolean z10) {
        this.f736a = 1;
        this.f737b = z10;
    }

    public a(p pVar, r rVar) {
        this.f736a = 2;
        int i10 = rVar.f9232a;
        ByteBuffer byteBuffer = rVar.f9233b;
        d.b(i10 == 6 || i10 == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        h hVar = new h(bArr, min);
        pVar.getClass();
        if (hVar.h()) {
            this.f737b = false;
            return;
        }
        int i11 = hVar.i(2);
        if (!hVar.h()) {
            this.f737b = true;
            return;
        }
        if (i11 != 3 && i11 != 0) {
            hVar.h();
        }
        hVar.s();
        throw new Exception();
    }
}
