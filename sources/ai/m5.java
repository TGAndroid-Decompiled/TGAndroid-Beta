package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pn0;
public final class m5 implements View.OnClickListener {
    public final int f1390a;
    public final boolean f1391b;
    public final Object f1392c;
    public final Object d;
    public final Object f1393e;

    public m5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1390a = i10;
        this.f1392c = obj;
        this.d = obj2;
        this.f1391b = z10;
        this.f1393e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m5.onClick(android.view.View):void");
    }

    public m5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, pn0 pn0Var, boolean z10) {
        this.f1390a = 2;
        this.f1392c = pn0Var;
        this.d = arrayList;
        this.f1393e = tL_secureRequiredType;
        this.f1391b = z10;
    }
}
