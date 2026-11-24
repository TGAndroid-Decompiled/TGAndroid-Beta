package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
public final class idc extends hd3 {
    public final ndc d;

    public idc(ndc ndcVar, Context context) {
        super(context);
        this.d = ndcVar;
    }

    @Override
    public final cb3 b(Context context) {
        c40 c40Var = new c40(context, (byte) 2);
        ?? obj = new Object();
        obj.f = this.d;
        ?? obj2 = new Object();
        obj2.e = new float[0];
        obj2.b = (byte) 3;
        obj2.d = new float[513];
        obj2.a = new float[1024];
        obj2.c = new float[1024];
        int[] iArr = new int[1024];
        obj2.h = iArr;
        iArr[0] = 0;
        int i = 512;
        int i2 = 1;
        while (i2 < 1024) {
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr2 = (int[]) obj2.h;
                iArr2[i3 + i2] = iArr2[i3] + i;
            }
            i2 <<= 1;
            i >>= 1;
        }
        obj2.f = new float[1024];
        obj2.g = new float[1024];
        for (int i4 = 0; i4 < 1024; i4++) {
            double d = (-3.1415927f) / i4;
            ((float[]) obj2.f)[i4] = (float) Math.sin(d);
            ((float[]) obj2.g)[i4] = (float) Math.cos(d);
        }
        obj.c = obj2;
        obj.d = new float[1024];
        obj.a = 0;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        obj.e = allocateDirect;
        allocateDirect.position(0);
        c40Var.d = new mx6(new p30[]{new fib(obj)});
        return c40Var.b();
    }
}
