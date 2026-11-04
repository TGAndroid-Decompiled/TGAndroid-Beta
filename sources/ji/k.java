package ji;

import android.content.Context;
import android.widget.TextView;
import ci.e3;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.t4;
import org.telegram.ui.wm;
public final class k implements Runnable {
    public final int f16336a;
    public final boolean f16337b;
    public final boolean f16338c;
    public final long d;
    public final cs f16339e;

    public k(cs csVar, boolean z10, boolean z11, long j10, int i3) {
        this.f16336a = i3;
        this.f16339e = csVar;
        this.f16337b = z10;
        this.f16338c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i3 = this.f16336a;
        int i10 = 2131751914;
        boolean z10 = this.f16338c;
        boolean z11 = this.f16337b;
        long j10 = this.d;
        cs csVar = this.f16339e;
        switch (i3) {
            case 0:
                n nVar = (n) csVar;
                String M0 = bd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t4.u0(nVar, M0, bd.M0(i10, null), bd.M0(2131746329, null), true, new f(nVar, j10, 0));
                return;
            case 1:
                b0 b0Var = (b0) csVar;
                Context context = b0Var.getContext();
                e6 e6Var = b0Var.J0;
                String M02 = bd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                s1 O = t4.O(context, e6Var, M02, bd.M0(i10, null), bd.M0(2131746329, null), new e3(b0Var, j10, 10));
                O.show();
                TextView textView = (TextView) O.d(-1);
                if (textView != null) {
                    r6.V(textView, k6.f28122q7, null);
                    return;
                }
                return;
            case 2:
                hp hpVar = (hp) csVar;
                if (z11) {
                    arrayList = hpVar.f23150w0;
                } else {
                    arrayList = hpVar.f23140v0;
                }
                if (z10) {
                    if (!arrayList.contains(Long.valueOf(j10))) {
                        arrayList.add(Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                arrayList.remove(Long.valueOf(j10));
                return;
            default:
                wm.u1((wm) csVar, j10, z11, z10);
                return;
        }
    }

    public k(wm wmVar, long j10, boolean z10, boolean z11) {
        this.f16336a = 3;
        this.f16339e = wmVar;
        this.d = j10;
        this.f16337b = z10;
        this.f16338c = z11;
    }
}
