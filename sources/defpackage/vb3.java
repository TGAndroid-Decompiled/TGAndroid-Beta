package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
public class vb3 {
    public final Context a;
    public final p13 b;
    public boolean c = false;

    public vb3(Context context) {
        this.a = context;
        this.b = new p13(context, (char) 0);
    }

    public void a(android.content.Context r14, int r15, defpackage.x30 r16, android.os.Handler r17, defpackage.t54 r18, java.util.ArrayList r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb3.a(android.content.Context, int, x30, android.os.Handler, t54, java.util.ArrayList):void");
    }

    public q93 b(Context context) {
        return new c30(context, (byte) 2).b();
    }

    public void c(android.content.Context r18, int r19, android.os.Handler r20, defpackage.t54 r21, java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb3.c(android.content.Context, int, android.os.Handler, t54, java.util.ArrayList):void");
    }

    public final ug0[] d(Handler handler, t54 t54Var, t54 t54Var2, t54 t54Var3, t54 t54Var4) {
        ArrayList arrayList = new ArrayList();
        c(this.a, this.c ? 1 : 0, handler, t54Var, arrayList);
        Context context = this.a;
        a(this.a, this.c ? 1 : 0, b(context), handler, t54Var2, arrayList);
        arrayList.add(new zhb(t54Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new qd7(t54Var4, looper));
        }
        arrayList.add(new t91());
        arrayList.add(new ql5(new uj0(context, (byte) 0)));
        return (ug0[]) arrayList.toArray(new ug0[0]);
    }
}
