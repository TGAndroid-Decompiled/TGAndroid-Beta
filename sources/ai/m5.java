package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.on0;
public final class m5 implements View.OnClickListener {
    public final int f1243a;
    public final boolean f1244b;
    public final Object f1245c;
    public final Object d;
    public final Object e;

    public m5(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f1243a = i10;
        this.f1245c = obj;
        this.d = obj2;
        this.f1244b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.m5.onClick(android.view.View):void");
    }

    public m5(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, on0 on0Var, boolean z10) {
        this.f1243a = 2;
        this.f1245c = on0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f1244b = z10;
    }
}
