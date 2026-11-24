package defpackage;
public final class o28 implements m8c {
    public final byte a;
    public final s28 b;
    public final w28 c;

    public o28(s28 s28Var, w28 w28Var, byte b) {
        this.a = b;
        this.b = s28Var;
        this.c = w28Var;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        w28 w28Var = this.c;
        s28 s28Var = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                y28 y28Var = s28Var.x;
                c30 c30Var = y28Var.C2;
                l8b l8bVar = (l8b) c30Var.c;
                if (l8bVar == null) {
                    ((d8b) y28Var.G1).g(false);
                    y28Var.setActive(true);
                    y28Var.J3 = false;
                    y28Var.Y0 = new ks2(runnable, (byte) 5);
                    if (bool.booleanValue()) {
                        y28Var.c1(false);
                    }
                    gl.d3(runnable, 400L);
                    return;
                }
                l8bVar.firstFrameRendered = false;
                c30Var.a = false;
                l8bVar.setOnReadyListener(new k18(runnable, currentTimeMillis, (byte) 1));
                ((d8b) y28Var.G1).g(false);
                ry8 ry8Var = y28Var.p0;
                if (ry8Var != null) {
                    ry8Var.setAnimation(w28Var.u);
                }
                if (y28Var.H2 > 0 && l.longValue() > y28Var.H2 - 1400) {
                    l = 0L;
                }
                y28Var.O0(l.longValue(), true);
                y28Var.J3 = false;
                gl.d3(runnable, 400L);
                if (bool.booleanValue()) {
                    y28Var.c1(false);
                    return;
                }
                return;
            default:
                Long l3 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l4 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                y28 y28Var2 = s28Var.x;
                c30 c30Var2 = y28Var2.C2;
                l8b l8bVar2 = (l8b) c30Var2.c;
                if (l8bVar2 == null) {
                    ((d8b) y28Var2.G1).g(false);
                    y28Var2.setActive(true);
                    y28Var2.J3 = false;
                    y28Var2.Y0 = new ks2(runnable2, (byte) 6);
                    if (bool2.booleanValue()) {
                        y28Var2.c1(false);
                    }
                    gl.d3(runnable2, 400L);
                    return;
                }
                l8bVar2.firstFrameRendered = false;
                c30Var2.a = false;
                l8bVar2.setOnReadyListener(new k18(runnable2, currentTimeMillis2, (byte) 2));
                ((d8b) y28Var2.G1).g(false);
                ry8 ry8Var2 = y28Var2.p0;
                if (ry8Var2 != null) {
                    ry8Var2.setAnimation(w28Var.u);
                }
                if (y28Var2.H2 > 0 && l3.longValue() > y28Var2.H2 - 1400) {
                    l3 = 0L;
                }
                y28Var2.O0(l3.longValue(), true);
                y28Var2.J3 = false;
                gl.d3(runnable2, 400L);
                if (bool2.booleanValue()) {
                    y28Var2.c1(false);
                    return;
                }
                return;
        }
    }
}
