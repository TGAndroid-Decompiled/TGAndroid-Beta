package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class f09 implements c39 {
    public final byte a;
    public final Object b;

    public f09(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(int i, View view) {
        Boolean bool;
        lwb lwbVar = (lwb) this.b;
        ArrayList arrayList = lwbVar.U;
        if (i >= 0 && i < arrayList.size()) {
            iwb iwbVar = (iwb) arrayList.get(i);
            long j = iwbVar.a;
            if (j != 0) {
                if (lwbVar.V == j) {
                    j = 0;
                }
                lwbVar.V = j;
            } else {
                if (iwbVar.b.equals(lwbVar.W)) {
                    bool = null;
                } else {
                    bool = iwbVar.b;
                }
                lwbVar.W = bool;
            }
            gl.d0(lwbVar.S, new yvb((byte) 0));
            lwbVar.l(false);
            lwbVar.n();
        }
    }

    @Override
    public final void d(int r26, android.view.View r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f09.d(int, android.view.View):void");
    }
}
