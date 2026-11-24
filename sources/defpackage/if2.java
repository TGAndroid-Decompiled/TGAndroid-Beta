package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class if2 implements fh6, yr9 {
    public final jf2 a;

    public if2(jf2 jf2Var) {
        this.a = jf2Var;
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final boolean U1(int i) {
        return true;
    }

    @Override
    public final boolean a(gh6 gh6Var, boolean z) {
        int intValue = ((Integer) gh6Var.getTag()).intValue();
        jf2 jf2Var = this.a;
        TLObject E = jf2Var.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return jf2Var.E.h0((TLRPC.ChannelParticipant) E, !z, gh6Var);
        }
        return false;
    }

    @Override
    public final void r(int i) {
        jf2 jf2Var = this.a;
        kf2 kf2Var = jf2Var.E;
        if (!jf2Var.h.e()) {
            int i2 = jf2Var.r;
            jf2Var.f();
            if (jf2Var.r > i2) {
                kf2Var.B0(i2);
            }
            if (!jf2Var.s && jf2Var.r == 0 && i != 0) {
                kf2Var.b.e(false, true);
            }
        }
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }
}
