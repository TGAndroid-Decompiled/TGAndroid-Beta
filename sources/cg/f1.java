package cg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vm0;
public final class f1 implements View.OnClickListener {
    public final int f3118a;
    public final boolean f3119b;
    public final Object f3120c;
    public final Object d;
    public final Object f3121e;

    public f1(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3118a = i10;
        this.f3120c = obj;
        this.d = obj2;
        this.f3119b = z10;
        this.f3121e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: cg.f1.onClick(android.view.View):void");
    }

    public f1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, vm0 vm0Var, boolean z10) {
        this.f3118a = 3;
        this.f3120c = vm0Var;
        this.d = arrayList;
        this.f3121e = tL_secureRequiredType;
        this.f3119b = z10;
    }
}
