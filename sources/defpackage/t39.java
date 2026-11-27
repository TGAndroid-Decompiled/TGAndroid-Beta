package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class t39 implements r69 {
    public final byte a;
    public final Object b;

    public t39(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        Boolean bool;
        n0c n0cVar = (n0c) this.b;
        ArrayList arrayList = n0cVar.U;
        if (i >= 0 && i < arrayList.size()) {
            k0c k0cVar = (k0c) arrayList.get(i);
            long j = k0cVar.a;
            if (j != 0) {
                if (n0cVar.V == j) {
                    j = 0;
                }
                n0cVar.V = j;
            } else {
                if (k0cVar.b.equals(n0cVar.W)) {
                    bool = null;
                } else {
                    bool = k0cVar.b;
                }
                n0cVar.W = bool;
            }
            hl.d0(n0cVar.S, new b0c((byte) 0));
            n0cVar.l(false);
            n0cVar.n();
        }
    }

    @Override
    public final void e(int r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t39.e(int, android.view.View):void");
    }
}
