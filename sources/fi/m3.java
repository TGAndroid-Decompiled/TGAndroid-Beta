package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ek0;
public final class m3 implements View.OnClickListener {
    public final int f12025a;
    public final boolean f12026b;
    public final Object f12027c;
    public final Object d;
    public final Object f12028e;

    public m3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f12025a = i7;
        this.f12027c = obj;
        this.d = obj2;
        this.f12026b = z10;
        this.f12028e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.m3.onClick(android.view.View):void");
    }

    public m3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, ek0 ek0Var, boolean z10) {
        this.f12025a = 2;
        this.f12027c = ek0Var;
        this.d = arrayList;
        this.f12028e = tL_secureRequiredType;
        this.f12026b = z10;
    }
}
