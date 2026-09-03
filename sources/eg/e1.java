package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fn0;
public final class e1 implements View.OnClickListener {
    public final int f5244a;
    public final boolean f5245b;
    public final Object f5246c;
    public final Object d;
    public final Object e;

    public e1(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f5244a = i10;
        this.f5246c = obj;
        this.d = obj2;
        this.f5245b = z4;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: eg.e1.onClick(android.view.View):void");
    }

    public e1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, fn0 fn0Var, boolean z4) {
        this.f5244a = 3;
        this.f5246c = fn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f5245b = z4;
    }
}
