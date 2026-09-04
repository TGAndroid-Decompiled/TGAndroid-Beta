package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pn0;
public final class w4 implements View.OnClickListener {
    public final int f3942a;
    public final boolean f3943b;
    public final Object f3944c;
    public final Object d;
    public final Object f3945e;

    public w4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3942a = i10;
        this.f3944c = obj;
        this.d = obj2;
        this.f3943b = z10;
        this.f3945e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.w4.onClick(android.view.View):void");
    }

    public w4(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, pn0 pn0Var, boolean z10) {
        this.f3942a = 2;
        this.f3944c = pn0Var;
        this.d = arrayList;
        this.f3945e = tL_secureRequiredType;
        this.f3943b = z10;
    }
}
