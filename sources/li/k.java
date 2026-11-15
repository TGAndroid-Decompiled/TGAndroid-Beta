package li;

import android.content.Context;
import android.widget.TextView;
import di.x2;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;
public final class k implements Runnable {
    public final int f19587a;
    public final boolean f19588b;
    public final boolean f19589c;
    public final long d;
    public final is f19590e;

    public k(is isVar, boolean z10, boolean z11, long j3, int i7) {
        this.f19587a = i7;
        this.f19590e = isVar;
        this.f19588b = z10;
        this.f19589c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f19587a;
        int i10 = 2131751914;
        boolean z10 = this.f19589c;
        boolean z11 = this.f19588b;
        long j3 = this.d;
        is isVar = this.f19590e;
        switch (i7) {
            case 0:
                n nVar = (n) isVar;
                String M0 = hd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t4.s0(nVar, M0, hd.M0(i10, null), hd.M0(2131746321, null), true, new f(nVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) isVar;
                Context context = d0Var.getContext();
                e6 e6Var = d0Var.J0;
                String M02 = hd.M0(2131751915, null);
                if (z11) {
                    i10 = 2131751917;
                } else if (z10) {
                    i10 = 2131751916;
                }
                t1 M = t4.M(context, e6Var, M02, hd.M0(i10, null), hd.M0(2131746321, null), new x2(d0Var, j3, 11));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    q6.U(textView, j6.f29090q7, null);
                    return;
                }
                return;
            case 2:
                np npVar = (np) isVar;
                if (z11) {
                    arrayList = npVar.f25424w0;
                } else {
                    arrayList = npVar.f25414v0;
                }
                if (z10) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                        return;
                    }
                    return;
                }
                arrayList.remove(Long.valueOf(j3));
                return;
            default:
                an.y1((an) isVar, j3, z11, z10);
                return;
        }
    }

    public k(an anVar, long j3, boolean z10, boolean z11) {
        this.f19587a = 3;
        this.f19590e = anVar;
        this.d = j3;
        this.f19588b = z10;
        this.f19589c = z11;
    }
}
