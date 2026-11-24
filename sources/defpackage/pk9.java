package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class pk9 implements View.OnClickListener {
    public final byte a;
    public final xk9 b;

    public pk9(xk9 xk9Var, byte b) {
        this.a = b;
        this.b = xk9Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        byte b = this.a;
        xk9 xk9Var = this.b;
        switch (b) {
            case 0:
                ll0 ll0Var = xk9Var.y;
                if (ll0Var != null && ll0Var.e) {
                    boolean z = !ll0Var.f;
                    ll0Var.f = z;
                    ((CheckBoxBase) xk9Var.e.b).f(-1, z, true);
                    uk9 uk9Var = xk9Var.E;
                    if (uk9Var != null) {
                        ll0 ll0Var2 = xk9Var.y;
                        boolean z2 = ll0Var2.f;
                        ch9 ch9Var = ((mg9) uk9Var).a;
                        ll0Var2.f = z2;
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
                            ch9Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                uk9 uk9Var2 = xk9Var.E;
                if (uk9Var2 != null) {
                    ll0 ll0Var3 = xk9Var.y;
                    ch9 ch9Var2 = ((mg9) uk9Var2).a;
                    if (ll0Var3 != null && (ll0Var3.b instanceof TL_iv.pageBlockPreformatted) && (set = el2.a.r) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) ll0Var3.b;
                        bu5 C = ch9Var2.p3.C(view);
                        C.X(cmb.b0(gm.L(3.0f), cmb.v0(cmb.c6, ch9Var2.o3)));
                        C.c0 = true;
                        C.a0 = gm.L(350.0f);
                        C.h(new vf9(ch9Var2, ll0Var3, (byte) 25), jb6.M0(2131753964, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            C.h(null, h47.b(pageblockpreformatted.language), true);
                        }
                        C.j();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str = (String) obj;
                            C.h(new ak8(ch9Var2, ll0Var3, str, (byte) 16), h47.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        C.a0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
