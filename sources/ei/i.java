package ei;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.tk0;
import v7.u7;
public final class i {
    public final r f6652a;

    public i(r rVar) {
        this.f6652a = rVar;
    }

    public final void a() {
        int i10;
        r rVar = this.f6652a;
        ArrayList arrayList = rVar.f6672c;
        ArrayList arrayList2 = rVar.E;
        long j10 = rVar.f6686t;
        long j11 = r.G;
        if (j10 != j11) {
            rVar.f6686t = j11;
            i10 = 32;
        } else {
            i10 = 0;
        }
        long j12 = t6.Am + a7.f20158b;
        if (rVar.f6685s != j12) {
            rVar.f6685s = j12;
            i10 |= 16;
        }
        Iterator it = rVar.f6680n.iterator();
        while (it.hasNext()) {
            if (((tk0) it.next()).b0()) {
                rVar.f6675i++;
            }
        }
        if (i10 == 0) {
            return;
        }
        if (u7.a(i10, 16)) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                p pVar = (p) arrayList2.get(i11);
                pVar.f6662a.a(pVar.f6663b.c());
            }
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (u7.a(i10, 32)) {
                f fVar = qVar.f6665b;
                s sVar = r.F;
                if (!Objects.equals(fVar.f6648b, sVar)) {
                    fVar.f6648b = sVar;
                    fVar.g(sVar);
                }
            }
            if (u7.a(i10, 16)) {
                qVar.f6665b.updateColors();
            }
            qVar.f6665b.invalidateSelf();
            qVar.f6664a.invalidate();
            qVar.h = true;
        }
        rVar.f6687u |= i10;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ei.i.b():void");
    }
}
