package org.telegram.messenger;

import java.util.ArrayList;
public final class nb implements Runnable {
    public final int f25184a = 0;
    public final String f25185b;
    public final int f25186c;
    public final boolean d;

    public nb(int i7, String str, boolean z10) {
        this.f25186c = i7;
        this.f25185b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7 = this.f25184a;
        boolean z10 = this.d;
        int i10 = this.f25186c;
        String str = this.f25185b;
        switch (i7) {
            case 0:
                ns.f(i10).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(str);
                if (k0Var != null && k0Var.f54283t != null) {
                    if (org.telegram.utils.twidget.n0.f54343g.contains(k0Var)) {
                        k0Var.E = i10;
                        k0Var.f54283t.n(i10);
                        return;
                    }
                    k0Var.E = i10;
                    k0Var.F = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.n0.f54342f;
                    arrayList.remove(k0Var);
                    arrayList.add(k0Var);
                    org.telegram.utils.twidget.n0.p();
                    return;
                }
                return;
        }
    }

    public nb(String str, int i7, boolean z10) {
        this.f25185b = str;
        this.f25186c = i7;
        this.d = z10;
    }
}
