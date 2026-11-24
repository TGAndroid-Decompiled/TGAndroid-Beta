package defpackage;
public final class r48 implements nac {
    public final byte a;
    public final v48 b;
    public final y48 c;

    public r48(v48 v48Var, y48 y48Var, byte b) {
        this.a = b;
        this.b = v48Var;
        this.c = y48Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        y48 y48Var = this.c;
        v48 v48Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                a58 a58Var = v48Var.x;
                c40 c40Var = a58Var.C2;
                nab nabVar = (nab) c40Var.c;
                if (nabVar == null) {
                    ((fab) a58Var.G1).g(false);
                    a58Var.setActive(true);
                    a58Var.J3 = false;
                    a58Var.Y0 = new vt2(runnable, (byte) 5);
                    if (bool.booleanValue()) {
                        a58Var.c1(false);
                    }
                    gm.d3(runnable, 400L);
                    return;
                }
                nabVar.firstFrameRendered = false;
                c40Var.a = false;
                nabVar.setOnReadyListener(new m38(runnable, currentTimeMillis, (byte) 1));
                ((fab) a58Var.G1).g(false);
                s09 s09Var = a58Var.p0;
                if (s09Var != null) {
                    s09Var.setAnimation(y48Var.u);
                }
                if (a58Var.H2 > 0 && l.longValue() > a58Var.H2 - 1400) {
                    l = 0L;
                }
                a58Var.O0(l.longValue(), true);
                a58Var.J3 = false;
                gm.d3(runnable, 400L);
                if (bool.booleanValue()) {
                    a58Var.c1(false);
                    return;
                }
                return;
            default:
                Long l3 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l4 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                a58 a58Var2 = v48Var.x;
                c40 c40Var2 = a58Var2.C2;
                nab nabVar2 = (nab) c40Var2.c;
                if (nabVar2 == null) {
                    ((fab) a58Var2.G1).g(false);
                    a58Var2.setActive(true);
                    a58Var2.J3 = false;
                    a58Var2.Y0 = new vt2(runnable2, (byte) 6);
                    if (bool2.booleanValue()) {
                        a58Var2.c1(false);
                    }
                    gm.d3(runnable2, 400L);
                    return;
                }
                nabVar2.firstFrameRendered = false;
                c40Var2.a = false;
                nabVar2.setOnReadyListener(new m38(runnable2, currentTimeMillis2, (byte) 2));
                ((fab) a58Var2.G1).g(false);
                s09 s09Var2 = a58Var2.p0;
                if (s09Var2 != null) {
                    s09Var2.setAnimation(y48Var.u);
                }
                if (a58Var2.H2 > 0 && l3.longValue() > a58Var2.H2 - 1400) {
                    l3 = 0L;
                }
                a58Var2.O0(l3.longValue(), true);
                a58Var2.J3 = false;
                gm.d3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    a58Var2.c1(false);
                    return;
                }
                return;
        }
    }
}
