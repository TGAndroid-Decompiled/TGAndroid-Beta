package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kn0;
public final class l5 implements View.OnClickListener {
    public final int f1276a;
    public final boolean f1277b;
    public final Object f1278c;
    public final Object d;
    public final Object f1279e;

    public l5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1276a = i10;
        this.f1278c = obj;
        this.d = obj2;
        this.f1277b = z10;
        this.f1279e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l5.onClick(android.view.View):void");
    }

    public l5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, kn0 kn0Var, boolean z10) {
        this.f1276a = 2;
        this.f1278c = kn0Var;
        this.d = arrayList;
        this.f1279e = tL_secureRequiredType;
        this.f1277b = z10;
    }
}
