package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
public class hd3 {
    public final Context a;
    public final uk0 b;
    public boolean c = false;

    public hd3(Context context) {
        this.a = context;
        this.b = new uk0(context, 0);
    }

    public void a(android.content.Context r14, int r15, defpackage.x40 r16, android.os.Handler r17, defpackage.c74 r18, java.util.ArrayList r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.a(android.content.Context, int, x40, android.os.Handler, c74, java.util.ArrayList):void");
    }

    public cb3 b(Context context) {
        return new c40(context, (byte) 2).b();
    }

    public void c(android.content.Context r18, int r19, android.os.Handler r20, defpackage.c74 r21, java.util.ArrayList r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.c(android.content.Context, int, android.os.Handler, c74, java.util.ArrayList):void");
    }

    public final uh0[] d(Handler handler, c74 c74Var, c74 c74Var2, c74 c74Var3, c74 c74Var4) {
        ArrayList arrayList = new ArrayList();
        c(this.a, this.c ? 1 : 0, handler, c74Var, arrayList);
        Context context = this.a;
        a(this.a, this.c ? 1 : 0, b(context), handler, c74Var2, arrayList);
        arrayList.add(new bkb(c74Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i = 0; i < 4; i++) {
            arrayList.add(new sf7(c74Var4, looper));
        }
        arrayList.add(new cb1());
        arrayList.add(new qn5(new uk0(context, (byte) 0)));
        return (uh0[]) arrayList.toArray(new uh0[0]);
    }
}
