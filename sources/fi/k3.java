package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fk0;
public final class k3 implements View.OnClickListener {
    public final int f12181a;
    public final boolean f12182b;
    public final Object f12183c;
    public final Object d;
    public final Object f12184e;

    public k3(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f12181a = i7;
        this.f12183c = obj;
        this.d = obj2;
        this.f12182b = z10;
        this.f12184e = obj3;
    }

    @Override
    public final void onClick(android.view.View r15) {
        throw new UnsupportedOperationException("Method not decompiled: fi.k3.onClick(android.view.View):void");
    }

    public k3(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, fk0 fk0Var, boolean z10) {
        this.f12181a = 2;
        this.f12183c = fk0Var;
        this.d = arrayList;
        this.f12184e = tL_secureRequiredType;
        this.f12182b = z10;
    }
}
