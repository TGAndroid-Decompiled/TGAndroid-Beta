package org.telegram.messenger;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
public final class io implements Runnable {
    public final int f16156a;
    public final long f16157b;
    public final boolean f16158c;
    public final boolean d;
    public final us e;

    public io(us usVar, boolean z10, boolean z11, long j10, int i10) {
        this.f16156a = i10;
        this.e = usVar;
        this.f16158c = z10;
        this.d = z11;
        this.f16157b = j10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i10 = this.f16156a;
        int i11 = 2131751914;
        long j10 = this.f16157b;
        boolean z10 = this.d;
        boolean z11 = this.f16158c;
        us usVar = this.e;
        switch (i10) {
            case 0:
                vp vpVar = (vp) usVar;
                if (z11) {
                    arrayList = vpVar.f18921v0;
                } else {
                    arrayList = vpVar.f18912u0;
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
                org.telegram.ui.un.j0((org.telegram.ui.un) usVar, j10, z11, z10);
                return;
            case 2:
                yh.l lVar = (yh.l) usVar;
                String L0 = cd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.Components.s4.u0(lVar, L0, cd.L0(i11, null), cd.L0(2131746336, null), true, new yh.f(lVar, j10, 0));
                return;
            default:
                yh.a0 a0Var = (yh.a0) usVar;
                Context context = a0Var.getContext();
                org.telegram.ui.ActionBar.p6 p6Var = a0Var.I0;
                String L02 = cd.L0(2131751915, null);
                if (z11) {
                    i11 = 2131751917;
                } else if (z10) {
                    i11 = 2131751916;
                }
                org.telegram.ui.ActionBar.x1 O = org.telegram.ui.Components.s4.O(context, p6Var, L02, cd.L0(i11, null), cd.L0(2131746336, null), new vh.q8(a0Var, j10, 1));
                O.show();
                TextView textView = (TextView) O.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                    return;
                }
                return;
        }
    }

    public io(org.telegram.ui.un unVar, long j10, boolean z10, boolean z11) {
        this.f16156a = 1;
        this.e = unVar;
        this.f16157b = j10;
        this.f16158c = z10;
        this.d = z11;
    }
}
