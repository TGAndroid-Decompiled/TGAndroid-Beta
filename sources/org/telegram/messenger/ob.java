package org.telegram.messenger;

import java.util.ArrayList;
public final class ob implements Runnable {
    public final int f17248a = 0;
    public final String f17249b;
    public final int f17250c;
    public final boolean d;

    public ob(int i10, String str, boolean z10) {
        this.f17250c = i10;
        this.f17249b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17248a;
        boolean z10 = this.d;
        int i11 = this.f17250c;
        String str = this.f17249b;
        switch (i10) {
            case 0:
                zs.f(i11).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(str);
                if (mVar != null && mVar.f44412u != null) {
                    if (org.telegram.utils.twidget.p.f44434g.contains(mVar)) {
                        mVar.F = i11;
                        mVar.f44412u.n(i11);
                        return;
                    }
                    mVar.F = i11;
                    mVar.G = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.p.f44433f;
                    arrayList.remove(mVar);
                    arrayList.add(mVar);
                    org.telegram.utils.twidget.p.o();
                    return;
                }
                return;
        }
    }

    public ob(String str, int i10, boolean z10) {
        this.f17249b = str;
        this.f17250c = i10;
        this.d = z10;
    }
}
