package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dk0;
public final class r3 implements View.OnClickListener {
    public final int f9680a;
    public final boolean f9681b;
    public final Object f9682c;
    public final Object d;
    public final Object f9683e;

    public r3(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f9680a = i7;
        this.f9682c = obj;
        this.d = obj2;
        this.f9681b = z9;
        this.f9683e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.r3.onClick(android.view.View):void");
    }

    public r3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, dk0 dk0Var, boolean z9) {
        this.f9680a = 2;
        this.f9682c = dk0Var;
        this.d = arrayList;
        this.f9683e = tL_secureRequiredType;
        this.f9681b = z9;
    }
}
