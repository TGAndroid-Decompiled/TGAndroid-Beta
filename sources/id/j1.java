package id;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j1 extends v1 {

    public final boolean f11163c;

    public j1() {
        super(true);
        boolean z10 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.f11207b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar == null) {
            z10 = false;
            break;
        }
        v1 v1VarI = qVar.i();
        while (!v1VarI.r()) {
            p pVar2 = (p) atomicReferenceFieldUpdater.get(v1VarI);
            q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
            if (qVar2 == null) {
                z10 = false;
                break;
            }
            v1VarI = qVar2.i();
        }
        this.f11163c = z10;
    }

    @Override
    public final boolean r() {
        return this.f11163c;
    }

    @Override
    public final boolean s() {
        return true;
    }
}
