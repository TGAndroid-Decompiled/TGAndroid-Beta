package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class d28 implements jac {
    public final byte a;
    public final TL_stars.TL_starGiftUnique b;
    public final long c;
    public final jm7 d;
    public final Object e;
    public final Object f;

    public d28(jm7 jm7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j;
        this.f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                ((d38) jm7Var).H0((boolean[]) obj4, this.b, this.c, (a28) obj3, (yra) obj, (k11) obj2);
                return;
            default:
                wsa wsaVar = (wsa) jm7Var;
                fw4 fw4Var = (fw4) obj3;
                String str = (String) obj2;
                ((k11) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ira iraVar = wsaVar.M2;
                    if (iraVar != null) {
                        if (fw4Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iraVar.a(this.b, this.c, z);
                    }
                    if (fw4Var != null) {
                        gm.c3(new yv4(fw4Var, (byte) 3));
                        wsaVar.O0 = true;
                    }
                    wsaVar.dismiss();
                    return;
                }
                return;
        }
    }
}
