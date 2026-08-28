package ih;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wm0;
public final class t3 implements View.OnClickListener {
    public final int f12159a;
    public final boolean f12160b;
    public final Object f12161c;
    public final Object d;
    public final Object f12162e;

    public t3(Object obj, Object obj2, boolean z10, Object obj3, int i9) {
        this.f12159a = i9;
        this.f12161c = obj;
        this.d = obj2;
        this.f12160b = z10;
        this.f12162e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ih.t3.onClick(android.view.View):void");
    }

    public t3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, wm0 wm0Var, boolean z10) {
        this.f12159a = 2;
        this.f12161c = wm0Var;
        this.d = arrayList;
        this.f12162e = tL_secureRequiredType;
        this.f12160b = z10;
    }
}
