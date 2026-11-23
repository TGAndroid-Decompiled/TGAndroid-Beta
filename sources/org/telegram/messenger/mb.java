package org.telegram.messenger;

import java.util.ArrayList;
public final class mb implements Runnable {
    public final int f25648a = 0;
    public final String f25649b;
    public final int f25650c;
    public final boolean d;

    public mb(int i7, String str, boolean z10) {
        this.f25650c = i7;
        this.f25649b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f25648a;
        boolean z10 = this.d;
        int i10 = this.f25650c;
        String str = this.f25649b;
        switch (i7) {
            case 0:
                ks.f(i10).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54972a.get(str);
                if (k0Var != null && k0Var.f54943t != null) {
                    if (org.telegram.utils.twidget.n0.f54977g.contains(k0Var)) {
                        k0Var.K = i10;
                        k0Var.f54943t.l(i10);
                        return;
                    }
                    k0Var.K = i10;
                    k0Var.L = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.n0.f54976f;
                    arrayList.remove(k0Var);
                    arrayList.add(k0Var);
                    org.telegram.utils.twidget.n0.p();
                    return;
                }
                return;
        }
    }

    public mb(String str, int i7, boolean z10) {
        this.f25649b = str;
        this.f25650c = i7;
        this.d = z10;
    }
}
