package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dn0;
public final class e1 implements View.OnClickListener {
    public final int f5255a;
    public final boolean f5256b;
    public final Object f5257c;
    public final Object d;
    public final Object e;

    public e1(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f5255a = i10;
        this.f5257c = obj;
        this.d = obj2;
        this.f5256b = z4;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: eg.e1.onClick(android.view.View):void");
    }

    public e1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, dn0 dn0Var, boolean z4) {
        this.f5255a = 3;
        this.f5257c = dn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f5256b = z4;
    }
}
