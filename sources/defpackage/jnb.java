package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class jnb implements qac {
    public final byte a;
    public final rob b;

    public jnb(rob robVar, byte b) {
        this.a = b;
        this.b = robVar;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        rob robVar = this.b;
        switch (b) {
            case 0:
                robVar.p1 = ((Float) obj).floatValue();
                robVar.z0.invalidate();
                robVar.X0();
                return;
            case 1:
                robVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                robVar.W1 = true;
                robVar.m1(true);
                robVar.V1 = false;
                return;
            default:
                robVar.Y0((vh1) obj);
                return;
        }
    }
}
