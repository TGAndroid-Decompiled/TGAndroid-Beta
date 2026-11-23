package li;

import android.content.Context;
import android.widget.TextView;
import bi.e4;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.bn;
public final class m implements Runnable {
    public final int f19968a;
    public final boolean f19969b;
    public final boolean f19970c;
    public final long d;
    public final gs f19971e;

    public m(gs gsVar, boolean z10, boolean z11, long j3, int i7) {
        this.f19968a = i7;
        this.f19971e = gsVar;
        this.f19969b = z10;
        this.f19970c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f19968a;
        int i10 = 2131751902;
        boolean z10 = this.f19970c;
        boolean z11 = this.f19969b;
        long j3 = this.d;
        gs gsVar = this.f19971e;
        switch (i7) {
            case 0:
                p pVar = (p) gsVar;
                String N0 = hd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                c5.s0(pVar, N0, hd.N0(i10, null), hd.N0(2131746125, null), true, new h(pVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) gsVar;
                Context context = d0Var.getContext();
                h6 h6Var = d0Var.J0;
                String N02 = hd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                t1 M = c5.M(context, h6Var, N02, hd.N0(i10, null), hd.N0(2131746125, null), new e4(d0Var, j3, 12));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    t6.U(textView, m6.f29588q7, null);
                    return;
                }
                return;
            case 2:
                np npVar = (np) gsVar;
                if (z11) {
                    arrayList = npVar.f25953w0;
                } else {
                    arrayList = npVar.f25943v0;
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
                bn.y1((bn) gsVar, j3, z11, z10);
                return;
        }
    }

    public m(bn bnVar, long j3, boolean z10, boolean z11) {
        this.f19968a = 3;
        this.f19971e = bnVar;
        this.d = j3;
        this.f19969b = z10;
        this.f19970c = z11;
    }
}
