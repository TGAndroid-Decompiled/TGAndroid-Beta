package gi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
public final class q4 implements n10 {
    public final int f13425a;
    public final Object f13426b;

    public q4(Object obj, int i3) {
        this.f13425a = i3;
        this.f13426b = obj;
    }

    private final void b(Object obj, Object obj2) {
        f41 f41Var = (f41) obj2;
        ((ArrayList) obj).add(r31.j(0, ((li.b) this.f13426b).Q1));
    }

    private final void c(Object obj, Object obj2) {
        String str = (String) obj;
        Utilities.f21390i.c(new m2.s(3, (String[]) this.f13426b, (n10) obj2));
    }

    private final void d(Object obj, Object obj2) {
        mi.v vVar = (mi.v) this.f13426b;
        ArrayList arrayList = (ArrayList) obj;
        f41 f41Var = (f41) obj2;
        arrayList.add(r31.j(1, vVar.T1));
        arrayList.add(r31.j(3, vVar.W1));
        if (vVar.f19975b2 != null) {
            arrayList.add(r31.j(2, vVar.U1));
        }
    }

    private final void e(Object obj, Object obj2) {
        mi.t3.L1((mi.t3[]) this.f13426b, (ArrayList) obj, (f41) obj2);
    }

    @Override
    public final void a(java.lang.Object r30, java.lang.Object r31) {
        throw new UnsupportedOperationException("Method not decompiled: gi.q4.a(java.lang.Object, java.lang.Object):void");
    }
}
