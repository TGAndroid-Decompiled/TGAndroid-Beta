package hi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
public final class y7 implements p10 {
    public final int f15878a;
    public final Object f15879b;

    public y7(Object obj, int i7) {
        this.f15878a = i7;
        this.f15879b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        int i10;
        ni.a aVar = (ni.a) this.f15879b;
        ArrayList arrayList = (ArrayList) obj;
        b51 b51Var = (b51) obj2;
        arrayList.add(n41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(n41.j(1, aVar.V1));
        arrayList.add(n41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(n41.t(3, gd.N0(2131751935, null)));
        aVar.Y1 = arrayList.size();
        String N0 = gd.N0(2131751934, null);
        boolean z10 = aVar.X1;
        if (z10) {
            i7 = 2131751933;
        } else {
            i7 = 2131751932;
        }
        n41 y10 = n41.y(151, N0, gd.N0(i7, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        String N02 = gd.N0(2131751938, null);
        if (z10) {
            i10 = 2131751937;
        } else {
            i10 = 2131751936;
        }
        n41 y11 = n41.y(150, N02, gd.N0(i10, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(n41.B(6, gd.N0(2131751939, null)));
    }

    @Override
    public final void a(java.lang.Object r28, java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: hi.y7.a(java.lang.Object, java.lang.Object):void");
    }
}
