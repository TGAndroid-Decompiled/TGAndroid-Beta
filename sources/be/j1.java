package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class j1 extends v1 {
    public final boolean f2683c;

    public j1() {
        super(true);
        q qVar;
        q qVar2;
        boolean z10 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.f2718b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar instanceof q) {
            qVar = (q) pVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            v1 i10 = qVar.i();
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
            this.f2683c = z10;
        }
        z10 = false;
        this.f2683c = z10;
    }

    @Override
    public final boolean r() {
        return this.f2683c;
    }

    @Override
    public final boolean s() {
        return true;
    }
}
