package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gn0;
public final class l5 implements View.OnClickListener {
    public final int f1181a;
    public final boolean f1182b;
    public final Object f1183c;
    public final Object d;
    public final Object e;

    public l5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1181a = i10;
        this.f1183c = obj;
        this.d = obj2;
        this.f1182b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l5.onClick(android.view.View):void");
    }

    public l5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, gn0 gn0Var, boolean z10) {
        this.f1181a = 2;
        this.f1183c = gn0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f1182b = z10;
    }
}
