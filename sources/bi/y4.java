package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.un0;
public final class y4 implements View.OnClickListener {
    public final int f4007a;
    public final boolean f4008b;
    public final Object f4009c;
    public final Object d;
    public final Object e;

    public y4(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f4007a = i10;
        this.f4009c = obj;
        this.d = obj2;
        this.f4008b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.y4.onClick(android.view.View):void");
    }

    public y4(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, un0 un0Var, boolean z10) {
        this.f4007a = 2;
        this.f4009c = un0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f4008b = z10;
    }
}
