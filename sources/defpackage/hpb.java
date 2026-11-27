package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class hpb implements pcc {
    public final byte a;
    public final pqb b;

    public hpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.p1 = ((Float) obj).floatValue();
                pqbVar.z0.invalidate();
                pqbVar.X0();
                return;
            case 1:
                pqbVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                pqbVar.W1 = true;
                pqbVar.m1(true);
                pqbVar.V1 = false;
                return;
            default:
                pqbVar.Y0((wg1) obj);
                return;
        }
    }
}
