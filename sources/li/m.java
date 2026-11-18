package li;

import android.content.Context;
import android.widget.TextView;
import bi.y3;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.bn;
public final class m implements Runnable {
    public final int f19971a;
    public final boolean f19972b;
    public final boolean f19973c;
    public final long d;
    public final fs f19974e;

    public m(fs fsVar, boolean z10, boolean z11, long j3, int i7) {
        this.f19971a = i7;
        this.f19974e = fsVar;
        this.f19972b = z10;
        this.f19973c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f19971a;
        int i10 = 2131751903;
        boolean z10 = this.f19973c;
        boolean z11 = this.f19972b;
        long j3 = this.d;
        fs fsVar = this.f19974e;
        switch (i7) {
            case 0:
                p pVar = (p) fsVar;
                String M0 = gd.M0(2131751904, null);
                if (z11) {
                    i10 = 2131751906;
                } else if (z10) {
                    i10 = 2131751905;
                }
                b5.s0(pVar, M0, gd.M0(i10, null), gd.M0(2131746126, null), true, new h(pVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) fsVar;
                Context context = d0Var.getContext();
                i6 i6Var = d0Var.J0;
                String M02 = gd.M0(2131751904, null);
                if (z11) {
                    i10 = 2131751906;
                } else if (z10) {
                    i10 = 2131751905;
                }
                u1 M = b5.M(context, i6Var, M02, gd.M0(i10, null), gd.M0(2131746126, null), new y3(d0Var, j3, 12));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    u6.U(textView, n6.f29635q7, null);
                    return;
                }
                return;
            case 2:
                mp mpVar = (mp) fsVar;
                if (z11) {
                    arrayList = mpVar.f25790w0;
                } else {
                    arrayList = mpVar.f25780v0;
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
                bn.y1((bn) fsVar, j3, z11, z10);
                return;
        }
    }

    public m(bn bnVar, long j3, boolean z10, boolean z11) {
        this.f19971a = 3;
        this.f19974e = bnVar;
        this.d = j3;
        this.f19972b = z10;
        this.f19973c = z11;
    }
}
