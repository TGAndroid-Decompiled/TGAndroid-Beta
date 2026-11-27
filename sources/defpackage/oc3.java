package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
public class oc3 {
    public final Context a;
    public final vj0 b;
    public boolean c = false;

    public oc3(Context context) {
        this.a = context;
        this.b = new vj0(context, (byte) 2);
    }

    public void a(android.content.Context r14, int r15, defpackage.y30 r16, android.os.Handler r17, defpackage.n64 r18, java.util.ArrayList r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc3.a(android.content.Context, int, y30, android.os.Handler, n64, java.util.ArrayList):void");
    }

    public ja3 b(Context context) {
        return new d30(context, (byte) 2).b();
    }

    public void c(android.content.Context r18, int r19, android.os.Handler r20, defpackage.n64 r21, java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc3.c(android.content.Context, int, android.os.Handler, n64, java.util.ArrayList):void");
    }

    public final vg0[] d(Handler handler, n64 n64Var, n64 n64Var2, n64 n64Var3, n64 n64Var4) {
        ArrayList arrayList = new ArrayList();
        c(this.a, this.c ? 1 : 0, handler, n64Var, arrayList);
        Context context = this.a;
        a(this.a, this.c ? 1 : 0, b(context), handler, n64Var2, arrayList);
        arrayList.add(new vlb(n64Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new ag7(n64Var4, looper));
        }
        arrayList.add(new ca1());
        arrayList.add(new tn5(new vj0(context, (byte) 0)));
        return (vg0[]) arrayList.toArray(new vg0[0]);
    }
}
