package org.telegram.messenger;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
public final class jo implements Runnable {
    public final int f16491a;
    public final long f16492b;
    public final boolean f16493c;
    public final boolean d;
    public final vs e;

    public jo(vs vsVar, boolean z10, boolean z11, long j10, int i10) {
        this.f16491a = i10;
        this.e = vsVar;
        this.f16493c = z10;
        this.d = z11;
        this.f16492b = j10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i10 = this.f16491a;
        int i11 = 2131751914;
        long j10 = this.f16492b;
        boolean z10 = this.d;
        boolean z11 = this.f16493c;
        vs vsVar = this.e;
        switch (i10) {
            case 0:
                wp wpVar = (wp) vsVar;
                if (z11) {
                    arrayList = wpVar.f19264v0;
                } else {
                    arrayList = wpVar.f19255u0;
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
            case 1:
                org.telegram.ui.un.U0((org.telegram.ui.un) vsVar, j10, z11, z10);
                return;
            case 2:
                yh.l lVar = (yh.l) vsVar;
                String L0 = dd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.Components.s4.u0(lVar, L0, dd.L0(i11, null), dd.L0(2131746336, null), true, new yh.f(lVar, j10, 0));
                return;
            default:
                yh.z zVar = (yh.z) vsVar;
                Context context = zVar.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = zVar.I0;
                String L02 = dd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.ActionBar.x1 O = org.telegram.ui.Components.s4.O(context, p6Var, L02, dd.L0(i11, null), dd.L0(2131746336, null), new vh.q8(zVar, j10, 1));
                O.show();
                TextView textView = (TextView) O.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                    return;
                }
                return;
        }
    }

    public jo(org.telegram.ui.un unVar, long j10, boolean z10, boolean z11) {
        this.f16491a = 1;
        this.e = unVar;
        this.f16492b = j10;
        this.f16493c = z10;
        this.d = z11;
    }
}
