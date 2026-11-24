package defpackage;
public final class pt1 extends c01 {
    public final byte d;
    public final hf0 e;
    public final Object f;

    public pt1(Object obj, hf0 hf0Var, byte b) {
        this.d = b;
        this.f = obj;
        this.e = hf0Var;
    }

    @Override
    public final void c(boolean z) {
        byte b = this.d;
        Object obj = this.f;
        switch (b) {
            case 0:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 5), 250L);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 6), 250L);
                    return;
                }
                return;
            case 2:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 7), 250L);
                    return;
                }
                return;
            case 3:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 8), 250L);
                    return;
                }
                return;
            case 4:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 9), 250L);
                    return;
                }
                return;
            case 5:
                if (!z) {
                    gl.e3(new ho1(((wt1) obj).a, (byte) 10), 250L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gl.e3(new aj1(this, (uk1) this.e, (byte) 21), 250L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        hf0 hf0Var = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                mu1 mu1Var = ((wt1) obj).a;
                gb2 gb2Var = (gb2) hf0Var;
                mu1Var.ac = gb2Var.getMessageObject().e1();
                mu1Var.bc = 2;
                mu1Var.cc = null;
                gb2Var.invalidate();
                return;
            case 1:
                mu1 mu1Var2 = ((wt1) obj).a;
                gb2 gb2Var2 = (gb2) hf0Var;
                mu1Var2.ac = gb2Var2.getMessageObject().e1();
                mu1Var2.bc = 2;
                mu1Var2.cc = null;
                gb2Var2.invalidate();
                return;
            case 2:
                mu1 mu1Var3 = ((wt1) obj).a;
                gb2 gb2Var3 = (gb2) hf0Var;
                mu1Var3.ac = gb2Var3.getMessageObject().e1();
                mu1Var3.bc = 2;
                mu1Var3.cc = null;
                gb2Var3.invalidate();
                return;
            case 3:
                mu1 mu1Var4 = ((wt1) obj).a;
                gb2 gb2Var4 = (gb2) hf0Var;
                mu1Var4.ac = gb2Var4.getMessageObject().e1();
                mu1Var4.bc = 2;
                mu1Var4.cc = null;
                gb2Var4.invalidate();
                return;
            case 4:
                mu1 mu1Var5 = ((wt1) obj).a;
                gb2 gb2Var5 = (gb2) hf0Var;
                mu1Var5.ac = gb2Var5.getMessageObject().e1();
                mu1Var5.bc = 2;
                mu1Var5.cc = null;
                gb2Var5.invalidate();
                return;
            case 5:
                mu1 mu1Var6 = ((wt1) obj).a;
                gb2 gb2Var6 = (gb2) hf0Var;
                mu1Var6.ac = gb2Var6.getMessageObject().e1();
                mu1Var6.bc = 2;
                mu1Var6.cc = null;
                gb2Var6.invalidate();
                return;
            default:
                vs1 vs1Var = ((qs1) obj).a;
                uk1 uk1Var = (uk1) hf0Var;
                vs1Var.R.ac = uk1Var.getMessageObject().e1();
                mu1 mu1Var7 = vs1Var.R;
                mu1Var7.bc = 4;
                mu1Var7.cc = null;
                uk1Var.getMessageObject().r = true;
                uk1Var.invalidate();
                return;
        }
    }
}
