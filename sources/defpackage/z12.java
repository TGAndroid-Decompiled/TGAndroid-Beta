package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class z12 extends jb8 {
    public final jo6 a;
    public final i22 b;

    public z12(i22 i22Var, jo6 jo6Var) {
        this.b = i22Var;
        this.a = jo6Var;
    }

    @Override
    public final void M(int i, rcc rccVar, final boolean z, final int i2, int i3, final boolean z2) {
        i22 i22Var = this.b;
        i22Var.s4 = true;
        if (i22Var.W3 == null) {
            return;
        }
        final jo6 jo6Var = this.a;
        jo6Var.s = rccVar;
        ik.X(i22Var.G3, 0L, i22Var.R0() + 1, new qac() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, jo6Var);
                z12.this.b.W3.E0(7, true, z, i2, 0, 0L, false, z2, ((Long) obj).longValue());
            }
        });
    }
}
