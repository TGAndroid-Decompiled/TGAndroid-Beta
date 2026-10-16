package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sn0;
public final class y4 implements View.OnClickListener {
    public final int f4011a;
    public final boolean f4012b;
    public final Object f4013c;
    public final Object d;
    public final Object e;

    public y4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4011a = i10;
        this.f4013c = obj;
        this.d = obj2;
        this.f4012b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.y4.onClick(android.view.View):void");
    }

    public y4(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, sn0 sn0Var, boolean z10) {
        this.f4011a = 2;
        this.f4013c = sn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f4012b = z10;
    }
}
