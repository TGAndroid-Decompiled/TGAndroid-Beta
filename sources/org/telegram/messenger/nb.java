package org.telegram.messenger;

import java.util.ArrayList;
public final class nb implements Runnable {
    public final int f25716a = 0;
    public final String f25717b;
    public final int f25718c;
    public final boolean d;

    public nb(int i7, String str, boolean z10) {
        this.f25718c = i7;
        this.f25717b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f25716a;
        boolean z10 = this.d;
        int i10 = this.f25718c;
        String str = this.f25717b;
        switch (i7) {
            case 0:
                ls.f(i10).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54856a.get(str);
                if (k0Var != null && k0Var.f54827t != null) {
                    if (org.telegram.utils.twidget.n0.f54861g.contains(k0Var)) {
                        k0Var.K = i10;
                        k0Var.f54827t.l(i10);
                        return;
                    }
                    k0Var.K = i10;
                    k0Var.L = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.n0.f54860f;
                    arrayList.remove(k0Var);
                    arrayList.add(k0Var);
                    org.telegram.utils.twidget.n0.p();
                    return;
                }
                return;
        }
    }

    public nb(String str, int i7, boolean z10) {
        this.f25717b = str;
        this.f25718c = i7;
        this.d = z10;
    }
}
