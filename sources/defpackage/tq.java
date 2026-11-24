package defpackage;
public final class tq extends qo4 {
    public final cr s;
    public final fr w;

    public tq(fr frVar, fr frVar2, cr crVar) {
        super(frVar2);
        this.w = frVar;
        this.s = crVar;
    }

    @Override
    public final xia b() {
        return this.s;
    }

    @Override
    public final boolean c() {
        fr frVar = this.w;
        if (!frVar.getInternalPopup().a()) {
            frVar.f.l(wq.b(frVar), wq.a(frVar));
            return true;
        }
        return true;
    }
}
