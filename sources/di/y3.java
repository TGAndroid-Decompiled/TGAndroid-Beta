package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.in0;
public final class y3 implements View.OnClickListener {
    public final int f9398a;
    public final boolean f9399b;
    public final Object f9400c;
    public final Object d;
    public final Object e;

    public y3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f9398a = i10;
        this.f9400c = obj;
        this.d = obj2;
        this.f9399b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.y3.onClick(android.view.View):void");
    }

    public y3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, in0 in0Var, boolean z10) {
        this.f9398a = 2;
        this.f9400c = in0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f9399b = z10;
    }
}
