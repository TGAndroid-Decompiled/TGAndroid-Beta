package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nn0;
public final class m5 implements View.OnClickListener {
    public final int f1392a;
    public final boolean f1393b;
    public final Object f1394c;
    public final Object d;
    public final Object f1395e;

    public m5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1392a = i10;
        this.f1394c = obj;
        this.d = obj2;
        this.f1393b = z10;
        this.f1395e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m5.onClick(android.view.View):void");
    }

    public m5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, nn0 nn0Var, boolean z10) {
        this.f1392a = 2;
        this.f1394c = nn0Var;
        this.d = arrayList;
        this.f1395e = tL_secureRequiredType;
        this.f1393b = z10;
    }
}
