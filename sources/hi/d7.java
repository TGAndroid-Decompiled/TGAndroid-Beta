package hi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.o41;
public final class d7 implements q10 {
    public final int f14545a;
    public final Object f14546b;

    public d7(Object obj, int i7) {
        this.f14545a = i7;
        this.f14546b = obj;
    }

    private final void b(Object obj, Object obj2) {
        int i7;
        int i10;
        ni.a aVar = (ni.a) this.f14546b;
        ArrayList arrayList = (ArrayList) obj;
        c51 c51Var = (c51) obj2;
        arrayList.add(o41.E(0, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(o41.j(1, aVar.V1));
        arrayList.add(o41.E(2, org.telegram.messenger.g0.L(12.0f)));
        arrayList.add(o41.t(3, gd.N0(2131751935, null)));
        aVar.Y1 = arrayList.size();
        String N0 = gd.N0(2131751934, null);
        boolean z10 = aVar.X1;
        if (z10) {
            i7 = 2131751933;
        } else {
            i7 = 2131751932;
        }
        o41 y10 = o41.y(151, N0, gd.N0(i7, null));
        y10.L(true ^ aVar.U1);
        arrayList.add(y10);
        String N02 = gd.N0(2131751938, null);
        if (z10) {
            i10 = 2131751937;
        } else {
            i10 = 2131751936;
        }
        o41 y11 = o41.y(150, N02, gd.N0(i10, null));
        y11.L(aVar.U1);
        arrayList.add(y11);
        arrayList.add(o41.B(6, gd.N0(2131751939, null)));
    }

    @Override
    public final void a(java.lang.Object r29, java.lang.Object r30) {
        throw new UnsupportedOperationException("Method not decompiled: hi.d7.a(java.lang.Object, java.lang.Object):void");
    }
}
