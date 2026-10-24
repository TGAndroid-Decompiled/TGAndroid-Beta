package ci;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zm0;
public final class y3 implements View.OnClickListener {
    public final int f6154a;
    public final boolean f6155b;
    public final Object f6156c;
    public final Object d;
    public final Object e;

    public y3(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f6154a = i10;
        this.f6156c = obj;
        this.d = obj2;
        this.f6155b = z10;
        this.e = obj3;
    }

    @Override
    public final void onClick(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.y3.onClick(android.view.View):void");
    }

    public y3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, zm0 zm0Var, boolean z10) {
        this.f6154a = 2;
        this.f6156c = zm0Var;
        this.d = arrayList;
        this.e = tL_secureRequiredType;
        this.f6155b = z10;
    }
}
