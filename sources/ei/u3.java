package ei;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yj0;
public final class u3 implements View.OnClickListener {
    public final int f11083a;
    public final boolean f11084b;
    public final Object f11085c;
    public final Object d;
    public final Object f11086e;

    public u3(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.f11083a = i3;
        this.f11085c = obj;
        this.d = obj2;
        this.f11084b = z10;
        this.f11086e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: ei.u3.onClick(android.view.View):void");
    }

    public u3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, yj0 yj0Var, boolean z10) {
        this.f11083a = 2;
        this.f11085c = yj0Var;
        this.d = arrayList;
        this.f11086e = tL_secureRequiredType;
        this.f11084b = z10;
    }
}
