package org.telegram.messenger;

import java.util.ArrayList;
public final class ob implements Runnable {
    public final int f24306a = 0;
    public final String f24307b;
    public final int f24308c;
    public final boolean d;

    public ob(int i7, String str, boolean z9) {
        this.f24308c = i7;
        this.f24307b = str;
        this.d = z9;
    }

    @Override
    public final void run() {
        int i7 = this.f24306a;
        boolean z9 = this.d;
        int i10 = this.f24308c;
        String str = this.f24307b;
        switch (i7) {
            case 0:
                qs.f(i10).k(139, str, Boolean.valueOf(z9));
                return;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(str);
                if (mVar != null && mVar.f52862t != null) {
                    if (org.telegram.utils.twidget.p.f52881g.contains(mVar)) {
                        mVar.E = i10;
                        mVar.f52862t.n(i10);
                        return;
                    }
                    mVar.E = i10;
                    mVar.F = z9;
                    ArrayList arrayList = org.telegram.utils.twidget.p.f52880f;
                    arrayList.remove(mVar);
                    arrayList.add(mVar);
                    org.telegram.utils.twidget.p.o();
                    return;
                }
                return;
        }
    }

    public ob(String str, int i7, boolean z9) {
        this.f24307b = str;
        this.f24308c = i7;
        this.d = z9;
    }
}
