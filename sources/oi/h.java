package oi;

import c8.zc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.pj0;
public final class h {
    public final q f21080a;

    public h(q qVar) {
        this.f21080a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f21080a;
        ArrayList arrayList = qVar.f21101c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f21116t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f21116t = j10;
            qVar.f21103f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = k6.Am + r6.f28479b;
        if (qVar.f21115s != j11) {
            qVar.f21115s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f21110n.iterator();
        while (it.hasNext()) {
            if (((pj0) it.next()).b0()) {
                qVar.f21105i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (zc.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f21090a.a(oVar.f21091b.h());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (zc.a(i7, 32)) {
                e eVar = pVar.f21093b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f21075b, rVar)) {
                    eVar.f21075b = rVar;
                    eVar.g(rVar);
                }
            }
            if (zc.a(i7, 16)) {
                pVar.f21093b.updateColors();
            }
            pVar.f21093b.invalidateSelf();
            pVar.f21092a.invalidate();
            pVar.h = true;
        }
        qVar.f21117u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: oi.h.b():void");
    }
}
