package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public class k1 extends w1 {
    public final boolean f471c;

    public k1() {
        super(true);
        q qVar;
        q qVar2;
        boolean z10 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.f515b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar instanceof q) {
            qVar = (q) pVar;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            w1 i10 = qVar.i();
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
            this.f471c = z10;
        }
        z10 = false;
        this.f471c = z10;
    }

    @Override
    public final boolean r() {
        return this.f471c;
    }

    @Override
    public final boolean s() {
        return true;
    }
}
