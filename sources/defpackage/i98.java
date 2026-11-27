package defpackage;

import org.telegram.tgnet.TLRPC;
public final class i98 implements c88 {
    public final t20 a;

    public i98(t20 t20Var) {
        this.a = t20Var;
    }

    public final void a() {
        zu1 zu1Var;
        TLRPC.Chat chat;
        l98 l98Var = (l98) this.a.e;
        if (l98Var.J && (zu1Var = l98Var.V) != null && (chat = zu1Var.e) != null && !xc2.N(chat) && chat.slowmode_enabled && l98Var.X != 2) {
            jj.r0(l98Var, ob6.M0(2131745038, null), ob6.M0(2131745031, null), null);
            if (l98Var.X == 1) {
                l98Var.X = (byte) 2;
            }
        }
    }

    @Override
    public final void c(d88 d88Var) {
        boolean z;
        int intValue = ((Integer) d88Var.getTag()).intValue();
        l98 l98Var = (l98) this.a.e;
        do6 do6Var = l98Var.K;
        int i = -1;
        int i2 = 1;
        if (do6Var != null) {
            no6 no6Var = (no6) do6Var.e.get(intValue);
            boolean containsKey = l98Var.b.containsKey(Integer.valueOf(no6Var.C));
            z = !containsKey;
            if (!containsKey && l98Var.I > 0 && l98Var.b.size() >= l98Var.I) {
                a();
                return;
            }
            if (l98Var.e && !containsKey) {
                i = l98Var.c.size();
            }
            d88Var.b(i, z, true);
            l98Var.a0(intValue, no6Var);
        } else {
            hl.t1(l98Var.getParentActivity().getCurrentFocus());
            ro6 ro6Var = (ro6) l98Var.f.get(intValue);
            boolean containsKey2 = l98Var.b.containsKey(ro6Var.B);
            z = !containsKey2;
            if (!containsKey2 && l98Var.I > 0 && l98Var.b.size() >= l98Var.I) {
                a();
                return;
            }
            if (l98Var.e && !containsKey2) {
                i = l98Var.c.size();
            }
            d88Var.b(i, z, true);
            l98Var.a0(intValue, ro6Var);
        }
        if (!z) {
            i2 = 2;
        }
        l98Var.m0(i2);
        l98Var.t0.h();
    }
}
