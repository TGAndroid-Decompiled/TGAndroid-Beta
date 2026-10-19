package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vm0;
public final class z3 implements View.OnClickListener {
    public final int f6247a;
    public final boolean f6248b;
    public final Object f6249c;
    public final Object d;
    public final Object e;

    public z3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f6247a = i10;
        this.f6249c = obj;
        this.d = obj2;
        this.f6248b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.z3.onClick(android.view.View):void");
    }

    public z3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, vm0 vm0Var, boolean z10) {
        this.f6247a = 2;
        this.f6249c = vm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f6248b = z10;
    }
}
