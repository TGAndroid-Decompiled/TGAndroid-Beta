package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hk0;
public final class k3 implements View.OnClickListener {
    public final int f12216a;
    public final boolean f12217b;
    public final Object f12218c;
    public final Object d;
    public final Object f12219e;

    public k3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f12216a = i7;
        this.f12218c = obj;
        this.d = obj2;
        this.f12217b = z10;
        this.f12219e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.k3.onClick(android.view.View):void");
    }

    public k3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, hk0 hk0Var, boolean z10) {
        this.f12216a = 2;
        this.f12218c = hk0Var;
        this.d = arrayList;
        this.f12219e = tL_secureRequiredType;
        this.f12217b = z10;
    }
}
