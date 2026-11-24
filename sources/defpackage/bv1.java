package defpackage;
public final class bv1 extends k11 {
    public final byte d;
    public final hg0 e;
    public final Object f;

    public bv1(Object obj, hg0 hg0Var, byte b) {
        this.d = b;
        this.f = obj;
        this.e = hg0Var;
    }

    @Override
    public final void c(boolean z) {
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 9), 250L);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 10), 250L);
                    return;
                }
                return;
            case 2:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 11), 250L);
                    return;
                }
                return;
            case 3:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 12), 250L);
                    return;
                }
                return;
            case 4:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 13), 250L);
                    return;
                }
                return;
            case 5:
                if (!z) {
                    gm.d3(new pp1(((iv1) obj).a, (byte) 14), 250L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gm.d3(new uj1(this, (cm1) this.e, (byte) 22), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        hg0 hg0Var = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                yv1 yv1Var = ((iv1) obj).a;
                rc2 rc2Var = (rc2) hg0Var;
                yv1Var.kc = rc2Var.getMessageObject().e1();
                yv1Var.lc = 2;
                yv1Var.mc = null;
                rc2Var.invalidate();
                return;
            case 1:
                yv1 yv1Var2 = ((iv1) obj).a;
                rc2 rc2Var2 = (rc2) hg0Var;
                yv1Var2.kc = rc2Var2.getMessageObject().e1();
                yv1Var2.lc = 2;
                yv1Var2.mc = null;
                rc2Var2.invalidate();
                return;
            case 2:
                yv1 yv1Var3 = ((iv1) obj).a;
                rc2 rc2Var3 = (rc2) hg0Var;
                yv1Var3.kc = rc2Var3.getMessageObject().e1();
                yv1Var3.lc = 2;
                yv1Var3.mc = null;
                rc2Var3.invalidate();
                return;
            case 3:
                yv1 yv1Var4 = ((iv1) obj).a;
                rc2 rc2Var4 = (rc2) hg0Var;
                yv1Var4.kc = rc2Var4.getMessageObject().e1();
                yv1Var4.lc = 2;
                yv1Var4.mc = null;
                rc2Var4.invalidate();
                return;
            case 4:
                yv1 yv1Var5 = ((iv1) obj).a;
                rc2 rc2Var5 = (rc2) hg0Var;
                yv1Var5.kc = rc2Var5.getMessageObject().e1();
                yv1Var5.lc = 2;
                yv1Var5.mc = null;
                rc2Var5.invalidate();
                return;
            case 5:
                yv1 yv1Var6 = ((iv1) obj).a;
                rc2 rc2Var6 = (rc2) hg0Var;
                yv1Var6.kc = rc2Var6.getMessageObject().e1();
                yv1Var6.lc = 2;
                yv1Var6.mc = null;
                rc2Var6.invalidate();
                return;
            default:
                hu1 hu1Var = ((cu1) obj).a;
                cm1 cm1Var = (cm1) hg0Var;
                hu1Var.R.kc = cm1Var.getMessageObject().e1();
                yv1 yv1Var7 = hu1Var.R;
                yv1Var7.lc = 4;
                yv1Var7.mc = null;
                cm1Var.getMessageObject().r = true;
                cm1Var.invalidate();
                return;
        }
    }
}
