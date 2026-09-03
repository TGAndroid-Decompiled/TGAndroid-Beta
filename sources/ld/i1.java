package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class i1 extends u1 {
    public final boolean f12003c;

    public i1() {
        super(true);
        q qVar;
        q qVar2;
        boolean z4 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.f12038b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar instanceof q) {
            qVar = (q) pVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            u1 i10 = qVar.i();
            while (!i10.r()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(i10);
                if (pVar2 instanceof q) {
                    qVar2 = (q) pVar2;
                } else {
                    qVar2 = null;
                }
                if (qVar2 != null) {
                    i10 = qVar2.i();
                }
            }
            this.f12003c = z4;
        }
        z4 = false;
        this.f12003c = z4;
    }

    @Override
    public final boolean r() {
        return this.f12003c;
    }

    @Override
    public final boolean s() {
        return true;
    }
}
