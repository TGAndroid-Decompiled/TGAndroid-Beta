package hi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
public final class q4 implements s10 {
    public final int f14900a;
    public final Object f14901b;

    public q4(Object obj, int i7) {
        this.f14900a = i7;
        this.f14901b = obj;
    }

    private final void b(Object obj, Object obj2) {
        p41 p41Var = (p41) obj2;
        ((ArrayList) obj).add(b41.j(0, ((ni.b) this.f14901b).T1));
    }

    private final void c(Object obj, Object obj2) {
        String str = (String) obj;
        Utilities.f22419i.c(new kg.t1(24, (String[]) this.f14901b, (s10) obj2));
    }

    private final void d(Object obj, Object obj2) {
        oi.u uVar = (oi.u) this.f14901b;
        ArrayList arrayList = (ArrayList) obj;
        p41 p41Var = (p41) obj2;
        arrayList.add(b41.j(1, uVar.W1));
        arrayList.add(b41.j(3, uVar.Z1));
        if (uVar.f22023e2 != null) {
            arrayList.add(b41.j(2, uVar.X1));
        }
    }

    private final void e(Object obj, Object obj2) {
        oi.q3.L1((oi.q3[]) this.f14901b, (ArrayList) obj, (p41) obj2);
    }

    @Override
    public final void a(java.lang.Object r30, java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q4.a(java.lang.Object, java.lang.Object):void");
    }
}
