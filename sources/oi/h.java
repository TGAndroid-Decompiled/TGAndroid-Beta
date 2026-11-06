package oi;

import c8.yc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.pj0;
public final class h {
    public final q f21077a;

    public h(q qVar) {
        this.f21077a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f21077a;
        ArrayList arrayList = qVar.f21098c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f21113t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f21113t = j10;
            qVar.f21100f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = k6.Am + r6.f28475b;
        if (qVar.f21112s != j11) {
            qVar.f21112s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f21107n.iterator();
        while (it.hasNext()) {
            if (((pj0) it.next()).b0()) {
                qVar.f21102i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (yc.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f21087a.a(oVar.f21088b.h());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (yc.a(i7, 32)) {
                e eVar = pVar.f21090b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f21072b, rVar)) {
                    eVar.f21072b = rVar;
                    eVar.g(rVar);
                }
            }
            if (yc.a(i7, 16)) {
                pVar.f21090b.updateColors();
            }
            pVar.f21090b.invalidateSelf();
            pVar.f21089a.invalidate();
            pVar.h = true;
        }
        qVar.f21114u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: oi.h.b():void");
    }
}
