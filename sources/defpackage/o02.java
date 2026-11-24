package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class o02 extends i98 {
    public final jm6 a;
    public final x02 b;

    public o02(x02 x02Var, jm6 jm6Var) {
        this.b = x02Var;
        this.a = jm6Var;
    }

    @Override
    public final void L(int i, oac oacVar, final boolean z, final int i2, int i3, final boolean z2) {
        x02 x02Var = this.b;
        x02Var.s4 = true;
        if (x02Var.W3 == null) {
            return;
        }
        final jm6 jm6Var = this.a;
        jm6Var.s = oacVar;
        ij.X(x02Var.G3, 0L, x02Var.R0() + 1, new p8c() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, jm6Var);
                o02.this.b.W3.B1(7, true, z, i2, 0, 0L, false, z2, ((Long) obj).longValue());
            }
        });
    }
}
