package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jl0;
public final class z0 implements View.OnClickListener {
    public final int f11350a;
    public final boolean f11351b;
    public final Object f11352c;
    public final Object d;
    public final Object e;

    public z0(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f11350a = i10;
        this.f11352c = obj;
        this.d = obj2;
        this.f11351b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: kg.z0.onClick(android.view.View):void");
    }

    public z0(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, jl0 jl0Var, boolean z10) {
        this.f11350a = 2;
        this.f11352c = jl0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f11351b = z10;
    }
}
