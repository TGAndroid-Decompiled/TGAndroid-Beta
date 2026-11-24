package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class ni9 implements View.OnClickListener {
    public final byte a;
    public final wi9 b;

    public ni9(wi9 wi9Var, byte b) {
        this.a = b;
        this.b = wi9Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        byte b = this.a;
        wi9 wi9Var = this.b;
        switch (b) {
            case 0:
                lk0 lk0Var = wi9Var.y;
                if (lk0Var != null && lk0Var.e) {
                    boolean z = !lk0Var.f;
                    lk0Var.f = z;
                    ((CheckBoxBase) wi9Var.e.b).f(-1, z, true);
                    ti9 ti9Var = wi9Var.E;
                    if (ti9Var != null) {
                        lk0 lk0Var2 = wi9Var.y;
                        boolean z2 = lk0Var2.f;
                        ye9 ye9Var = ((ie9) ti9Var).a;
                        lk0Var2.f = z2;
                        ld9 ld9Var = ye9Var.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                            ye9Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ti9 ti9Var2 = wi9Var.E;
                if (ti9Var2 != null) {
                    lk0 lk0Var3 = wi9Var.y;
                    ye9 ye9Var2 = ((ie9) ti9Var2).a;
                    if (lk0Var3 != null && (lk0Var3.b instanceof TL_iv.pageBlockPreformatted) && (set = qj2.a.r) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) lk0Var3.b;
                        cs5 N = ye9Var2.p3.N(view);
                        N.X(bkb.b0(gl.L(3.0f), bkb.v0(bkb.c6, ye9Var2.o3)));
                        N.c0 = true;
                        N.a0 = gl.L(350.0f);
                        N.h(new sd9(ye9Var2, lk0Var3, (byte) 25), k96.M0(2131753996, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            N.h(null, h27.b(pageblockpreformatted.language), true);
                        }
                        N.j();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str = (String) obj;
                            N.h(new gm8(ye9Var2, lk0Var3, str, (byte) 13), h27.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        N.a0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
