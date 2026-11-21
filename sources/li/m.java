package li;

import android.content.Context;
import android.widget.TextView;
import bi.c4;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.bn;
public final class m implements Runnable {
    public final int f19999a;
    public final boolean f20000b;
    public final boolean f20001c;
    public final long d;
    public final fs f20002e;

    public m(fs fsVar, boolean z10, boolean z11, long j3, int i7) {
        this.f19999a = i7;
        this.f20002e = fsVar;
        this.f20000b = z10;
        this.f20001c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f19999a;
        int i10 = 2131751902;
        boolean z10 = this.f20001c;
        boolean z11 = this.f20000b;
        long j3 = this.d;
        fs fsVar = this.f20002e;
        switch (i7) {
            case 0:
                p pVar = (p) fsVar;
                String N0 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                c5.s0(pVar, N0, gd.N0(i10, null), gd.N0(2131746125, null), true, new h(pVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) fsVar;
                Context context = d0Var.getContext();
                h6 h6Var = d0Var.J0;
                String N02 = gd.N0(2131751903, null);
                if (z11) {
                    i10 = 2131751905;
                } else if (z10) {
                    i10 = 2131751904;
                }
                t1 M = c5.M(context, h6Var, N02, gd.N0(i10, null), gd.N0(2131746125, null), new c4(d0Var, j3, 12));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    t6.U(textView, m6.f29619q7, null);
                    return;
                }
                return;
            case 2:
                mp mpVar = (mp) fsVar;
                if (z11) {
                    arrayList = mpVar.f25818w0;
                } else {
                    arrayList = mpVar.f25808v0;
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
        this.f19999a = 3;
        this.f20002e = bnVar;
        this.d = j3;
        this.f20000b = z10;
        this.f20001c = z11;
    }
}
