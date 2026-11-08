package org.telegram.messenger;

import java.util.ArrayList;
public final class ob implements Runnable {
    public final int f24317a = 0;
    public final String f24318b;
    public final int f24319c;
    public final boolean d;

    public ob(int i7, String str, boolean z9) {
        this.f24319c = i7;
        this.f24318b = str;
        this.d = z9;
    }

    @Override
    public final void run() {
        int i7 = this.f24317a;
        boolean z9 = this.d;
        int i10 = this.f24319c;
        String str = this.f24318b;
        switch (i7) {
            case 0:
                qs.f(i10).k(139, str, Boolean.valueOf(z9));
                return;
            default:
                org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52915a.get(str);
                if (k0Var != null && k0Var.f52881t != null) {
                    if (org.telegram.utils.twidget.n0.f52920g.contains(k0Var)) {
                        k0Var.E = i10;
                        k0Var.f52881t.n(i10);
                        return;
                    }
                    k0Var.E = i10;
                    k0Var.F = z9;
                    ArrayList arrayList = org.telegram.utils.twidget.n0.f52919f;
                    arrayList.remove(k0Var);
                    arrayList.add(k0Var);
                    org.telegram.utils.twidget.n0.p();
                    return;
                }
                return;
        }
    }

    public ob(String str, int i7, boolean z9) {
        this.f24318b = str;
        this.f24319c = i7;
        this.d = z9;
    }
}
