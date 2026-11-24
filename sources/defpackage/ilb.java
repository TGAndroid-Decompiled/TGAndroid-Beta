package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class ilb implements p8c {
    public final byte a;
    public final qmb b;

    public ilb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        qmb qmbVar = this.b;
        switch (b) {
            case 0:
                qmbVar.p1 = ((Float) obj).floatValue();
                qmbVar.z0.invalidate();
                qmbVar.W0();
                return;
            case 1:
                qmbVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                qmbVar.W1 = true;
                qmbVar.l1(true);
                qmbVar.V1 = false;
                return;
            default:
                qmbVar.X0((ng1) obj);
                return;
        }
    }
}
