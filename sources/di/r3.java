package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ek0;
public final class r3 implements View.OnClickListener {
    public final int f9685a;
    public final boolean f9686b;
    public final Object f9687c;
    public final Object d;
    public final Object f9688e;

    public r3(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f9685a = i7;
        this.f9687c = obj;
        this.d = obj2;
        this.f9686b = z9;
        this.f9688e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: di.r3.onClick(android.view.View):void");
    }

    public r3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, ek0 ek0Var, boolean z9) {
        this.f9685a = 2;
        this.f9687c = ek0Var;
        this.d = arrayList;
        this.f9688e = tL_secureRequiredType;
        this.f9686b = z9;
    }
}
