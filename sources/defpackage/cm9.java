package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class cm9 implements View.OnClickListener {
    public final byte a;
    public final km9 b;

    public cm9(km9 km9Var, byte b) {
        this.a = b;
        this.b = km9Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        byte b = this.a;
        km9 km9Var = this.b;
        switch (b) {
            case 0:
                mk0 mk0Var = km9Var.y;
                if (mk0Var != null && mk0Var.e) {
                    boolean z = !mk0Var.f;
                    mk0Var.f = z;
                    ((CheckBoxBase) km9Var.e.b).f(-1, z, true);
                    hm9 hm9Var = km9Var.E;
                    if (hm9Var != null) {
                        mk0 mk0Var2 = km9Var.y;
                        boolean z2 = mk0Var2.f;
                        pi9 pi9Var = ((zh9) hm9Var).a;
                        mk0Var2.f = z2;
                        ch9 ch9Var = pi9Var.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                            pi9Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                hm9 hm9Var2 = km9Var.E;
                if (hm9Var2 != null) {
                    mk0 mk0Var3 = km9Var.y;
                    pi9 pi9Var2 = ((zh9) hm9Var2).a;
                    if (mk0Var3 != null && (mk0Var3.b instanceof TL_iv.pageBlockPreformatted) && (set = mk2.a.r) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) mk0Var3.b;
                        fu5 O = pi9Var2.p3.O(view);
                        O.X(aob.b0(hl.L(3.0f), aob.v0(aob.d6, pi9Var2.o3)));
                        O.f0 = true;
                        O.d0 = hl.L(350.0f);
                        O.h(new jh9(pi9Var2, mk0Var3, (byte) 22), ob6.M0(2131753992, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            O.h(null, o47.b(pageblockpreformatted.language), true);
                        }
                        O.j();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            String str = (String) obj;
                            O.h(new sa8(pi9Var2, mk0Var3, str, (byte) 22), o47.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        O.a0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
