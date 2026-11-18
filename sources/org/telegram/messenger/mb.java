package org.telegram.messenger;

import java.util.ArrayList;
public final class mb implements Runnable {
    public final int f25555a = 0;
    public final String f25556b;
    public final int f25557c;
    public final boolean d;

    public mb(int i7, String str, boolean z10) {
        this.f25557c = i7;
        this.f25556b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f25555a;
        boolean z10 = this.d;
        int i10 = this.f25557c;
        String str = this.f25556b;
        switch (i7) {
            case 0:
                ks.f(i10).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54845a.get(str);
                if (k0Var != null && k0Var.f54816t != null) {
                    if (org.telegram.utils.twidget.n0.f54850g.contains(k0Var)) {
                        k0Var.E = i10;
                        k0Var.f54816t.l(i10);
                        return;
                    }
                    k0Var.E = i10;
                    k0Var.F = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.n0.f54849f;
                    arrayList.remove(k0Var);
                    arrayList.add(k0Var);
                    org.telegram.utils.twidget.n0.p();
                    return;
                }
                return;
        }
    }

    public mb(String str, int i7, boolean z10) {
        this.f25556b = str;
        this.f25557c = i7;
        this.d = z10;
    }
}
