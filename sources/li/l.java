package li;

import android.content.Context;
import android.widget.TextView;
import bi.e4;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.bn;
public final class l implements Runnable {
    public final int f20065a;
    public final boolean f20066b;
    public final boolean f20067c;
    public final long d;
    public final fs f20068e;

    public l(fs fsVar, boolean z10, boolean z11, long j3, int i7) {
        this.f20065a = i7;
        this.f20068e = fsVar;
        this.f20066b = z10;
        this.f20067c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f20065a;
        int i10 = 2131751902;
        boolean z10 = this.f20067c;
        boolean z11 = this.f20066b;
        long j3 = this.d;
        fs fsVar = this.f20068e;
        switch (i7) {
            case 0:
                o oVar = (o) fsVar;
                String N0 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                b5.s0(oVar, N0, gd.N0(i10, null), gd.N0(2131746125, null), true, new g(oVar, j3, 0));
                return;
            case 1:
                c0 c0Var = (c0) fsVar;
                Context context = c0Var.getContext();
                i6 i6Var = c0Var.J0;
                String N02 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                t1 M = b5.M(context, i6Var, N02, gd.N0(i10, null), gd.N0(2131746125, null), new e4(c0Var, j3, 12));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    u6.U(textView, n6.f29692q7, null);
                    return;
                }
                return;
            case 2:
                mp mpVar = (mp) fsVar;
                if (z11) {
                    arrayList = mpVar.f25885w0;
                } else {
                    arrayList = mpVar.f25875v0;
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

    public l(bn bnVar, long j3, boolean z10, boolean z11) {
        this.f20065a = 3;
        this.f20068e = bnVar;
        this.d = j3;
        this.f20066b = z10;
        this.f20067c = z11;
    }
}
