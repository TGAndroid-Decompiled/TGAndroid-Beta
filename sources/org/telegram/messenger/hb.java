package org.telegram.messenger;

import java.util.ArrayList;
public final class hb implements Runnable {
    public final int f22911a = 0;
    public final String f22912b;
    public final int f22913c;
    public final boolean d;

    public hb(int i3, String str, boolean z10) {
        this.f22913c = i3;
        this.f22912b = str;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i3 = this.f22911a;
        boolean z10 = this.d;
        int i10 = this.f22913c;
        String str = this.f22912b;
        switch (i3) {
            case 0:
                hs.f(i10).k(139, str, Boolean.valueOf(z10));
                return;
            default:
                org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(str);
                if (mVar != null && mVar.f52927t != null) {
                    if (org.telegram.utils.twidget.p.f52946g.contains(mVar)) {
                        mVar.E = i10;
                        mVar.f52927t.n(i10);
                        return;
                    }
                    mVar.E = i10;
                    mVar.F = z10;
                    ArrayList arrayList = org.telegram.utils.twidget.p.f52945f;
                    arrayList.remove(mVar);
                    arrayList.add(mVar);
                    org.telegram.utils.twidget.p.o();
                    return;
                }
                return;
        }
    }

    public hb(String str, int i3, boolean z10) {
        this.f22912b = str;
        this.f22913c = i3;
        this.d = z10;
    }
}
