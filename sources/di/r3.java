package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bk0;
public final class r3 implements View.OnClickListener {
    public final int f9693a;
    public final boolean f9694b;
    public final Object f9695c;
    public final Object d;
    public final Object f9696e;

    public r3(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f9693a = i7;
        this.f9695c = obj;
        this.d = obj2;
        this.f9694b = z9;
        this.f9696e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.r3.onClick(android.view.View):void");
    }

    public r3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, bk0 bk0Var, boolean z9) {
        this.f9693a = 2;
        this.f9695c = bk0Var;
        this.d = arrayList;
        this.f9696e = tL_secureRequiredType;
        this.f9694b = z9;
    }
}
