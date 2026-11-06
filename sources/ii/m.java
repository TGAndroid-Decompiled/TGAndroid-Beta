package ii;

import android.content.Context;
import android.widget.TextView;
import bi.r3;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.v4;
import org.telegram.ui.an;
public final class m implements Runnable {
    public final int f15574a;
    public final boolean f15575b;
    public final boolean f15576c;
    public final long d;
    public final ls f15577e;

    public m(ls lsVar, boolean z9, boolean z10, long j3, int i7) {
        this.f15574a = i7;
        this.f15577e = lsVar;
        this.f15575b = z9;
        this.f15576c = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f15574a;
        int i10 = 2131751914;
        boolean z9 = this.f15576c;
        boolean z10 = this.f15575b;
        long j3 = this.d;
        ls lsVar = this.f15577e;
        switch (i7) {
            case 0:
                p pVar = (p) lsVar;
                String M0 = hd.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                v4.s0(pVar, M0, hd.M0(i10, null), hd.M0(2131746320, null), true, new h(pVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) lsVar;
                Context context = d0Var.getContext();
                f6 f6Var = d0Var.I0;
                String M02 = hd.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                u1 M = v4.M(context, f6Var, M02, hd.M0(i10, null), hd.M0(2131746320, null), new r3(d0Var, j3, 10));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    r6.V(textView, k6.f28089q7, null);
                    return;
                }
                return;
            case 2:
                qp qpVar = (qp) lsVar;
                if (z10) {
                    arrayList = qpVar.f24900v0;
                } else {
                    arrayList = qpVar.f24891u0;
                }
                if (z9) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                        return;
                    }
                    return;
                }
                arrayList.remove(Long.valueOf(j3));
                return;
            default:
                an.u1((an) lsVar, j3, z10, z9);
                return;
        }
    }

    public m(an anVar, long j3, boolean z9, boolean z10) {
        this.f15574a = 3;
        this.f15577e = anVar;
        this.d = j3;
        this.f15575b = z9;
        this.f15576c = z10;
    }
}
