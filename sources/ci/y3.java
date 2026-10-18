package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.xm0;
public final class y3 implements View.OnClickListener {
    public final int f6146a;
    public final boolean f6147b;
    public final Object f6148c;
    public final Object d;
    public final Object e;

    public y3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f6146a = i10;
        this.f6148c = obj;
        this.d = obj2;
        this.f6147b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.y3.onClick(android.view.View):void");
    }

    public y3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, xm0 xm0Var, boolean z10) {
        this.f6146a = 2;
        this.f6148c = xm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f6147b = z10;
    }
}
