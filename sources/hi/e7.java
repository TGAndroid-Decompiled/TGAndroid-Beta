package hi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class e7 implements q10 {
    public final int f14597a;
    public final Object f14598b;

    public e7(Object obj, int i7) {
        this.f14597a = i7;
        this.f14598b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        int i10;
        ni.a aVar = (ni.a) this.f14598b;
        ArrayList arrayList = (ArrayList) obj;
        z41 z41Var = (z41) obj2;
        arrayList.add(l41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(l41.j(1, aVar.V1));
        arrayList.add(l41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(l41.t(3, gd.M0(2131751936, null)));
        aVar.Y1 = arrayList.size();
        String M0 = gd.M0(2131751935, null);
        boolean z10 = aVar.X1;
        if (z10) {
            i7 = 2131751934;
        } else {
            i7 = 2131751933;
        }
        l41 y10 = l41.y(151, M0, gd.M0(i7, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        String M02 = gd.M0(2131751939, null);
        if (z10) {
            i10 = 2131751938;
        } else {
            i10 = 2131751937;
        }
        l41 y11 = l41.y(150, M02, gd.M0(i10, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(l41.B(6, gd.M0(2131751940, null)));
    }

    @Override
    public final void a(java.lang.Object r28, java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: hi.e7.a(java.lang.Object, java.lang.Object):void");
    }
}
