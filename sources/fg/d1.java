package fg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fn0;
public final class d1 implements View.OnClickListener {
    public final int f6270a;
    public final boolean f6271b;
    public final Object f6272c;
    public final Object d;
    public final Object f6273e;

    public d1(Object obj, Object obj2, boolean z4, Object obj3, int i10) {
        this.f6270a = i10;
        this.f6272c = obj;
        this.d = obj2;
        this.f6271b = z4;
        this.f6273e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: fg.d1.onClick(android.view.View):void");
    }

    public d1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, fn0 fn0Var, boolean z4) {
        this.f6270a = 3;
        this.f6272c = fn0Var;
        this.d = arrayList;
        this.f6273e = tL_secureRequiredType;
        this.f6271b = z4;
    }
}
