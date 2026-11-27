package defpackage;
public final class up extends uo4 {
    public final dq s;
    public final gq w;

    public up(gq gqVar, gq gqVar2, dq dqVar) {
        super(gqVar2);
        this.w = gqVar;
        this.s = dqVar;
    }

    @Override
    public final oka b() {
        return this.s;
    }

    @Override
    public final boolean c() {
        gq gqVar = this.w;
        if (!gqVar.getInternalPopup().a()) {
            gqVar.f.l(xp.b(gqVar), xp.a(gqVar));
            return true;
        }
        return true;
    }
}
