package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xm0;
public final class z3 implements View.OnClickListener {
    public final int f6249a;
    public final boolean f6250b;
    public final Object f6251c;
    public final Object d;
    public final Object e;

    public z3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f6249a = i10;
        this.f6251c = obj;
        this.d = obj2;
        this.f6250b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z3.onClick(android.view.View):void");
    }

    public z3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, xm0 xm0Var, boolean z10) {
        this.f6249a = 2;
        this.f6251c = xm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f6250b = z10;
    }
}
