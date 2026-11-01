package org.telegram.messenger;

import java.util.ArrayList;
public final class pb implements Runnable {
    public final int f17581a = 0;
    public final String f17582b;
    public final int f17583c;
    public final boolean d;

    public pb(int i10, String str, boolean z10) {
        this.f17583c = i10;
        this.f17582b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17581a;
        boolean z10 = this.d;
        int i11 = this.f17583c;
        String str = this.f17582b;
        switch (i10) {
            case 0:
                at.f(i11).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44441a.get(str);
                if (mVar != null && mVar.f44423u != null) {
                    if (org.telegram.utils.twidget.p.f44445g.contains(mVar)) {
                        mVar.F = i11;
                        mVar.f44423u.n(i11);
                        return;
                    }
                    mVar.F = i11;
                    mVar.G = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.p.f44444f;
                    arrayList.remove(mVar);
                    arrayList.add(mVar);
                    org.telegram.utils.twidget.p.o();
                    return;
                }
                return;
        }
    }

    public pb(String str, int i10, boolean z10) {
        this.f17582b = str;
        this.f17583c = i10;
        this.d = z10;
    }
}
