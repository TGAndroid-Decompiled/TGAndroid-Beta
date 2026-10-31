package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ll0;
public final class z0 implements View.OnClickListener {
    public final int f11349a;
    public final boolean f11350b;
    public final Object f11351c;
    public final Object d;
    public final Object e;

    public z0(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f11349a = i10;
        this.f11351c = obj;
        this.d = obj2;
        this.f11350b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: kg.z0.onClick(android.view.View):void");
    }

    public z0(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, ll0 ll0Var, boolean z10) {
        this.f11349a = 2;
        this.f11351c = ll0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f11350b = z10;
    }
}
