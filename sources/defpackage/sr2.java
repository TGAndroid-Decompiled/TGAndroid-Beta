package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
public final class sr2 implements vz6, gs3 {
    public final Integer a;
    public kq b;
    public fs3 c;
    public final ur2 d;

    public sr2(ur2 ur2Var, Integer num) {
        this.d = ur2Var;
        this.b = ur2Var.b(null);
        this.c = new fs3(ur2Var.d.c, 0, null);
        this.a = num;
    }

    @Override
    public final void I(int i, rz6 rz6Var) {
        if (a(i, rz6Var)) {
            this.c.e();
        }
    }

    @Override
    public final void N(int i, rz6 rz6Var, jk2 jk2Var) {
        if (a(i, rz6Var)) {
            this.c.a(jk2Var);
        }
    }

    @Override
    public final void O(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, int i2) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            kqVar.h(new zn(kqVar, ea6Var, b(ft6Var, rz6Var), i2, (byte) 5));
        }
    }

    public final boolean a(int i, rz6 rz6Var) {
        rz6 rz6Var2;
        Integer num = this.a;
        ur2 ur2Var = this.d;
        if (rz6Var != null) {
            rz6Var2 = ur2Var.u(num, rz6Var);
            if (rz6Var2 == null) {
                return false;
            }
        } else {
            rz6Var2 = null;
        }
        int w = ur2Var.w(i, num);
        kq kqVar = this.b;
        if (kqVar.b != w || !Objects.equals((rz6) kqVar.c, rz6Var2)) {
            this.b = new kq((CopyOnWriteArrayList) ur2Var.c.d, w, rz6Var2);
        }
        fs3 fs3Var = this.c;
        if (fs3Var.a != w || !Objects.equals(fs3Var.b, rz6Var2)) {
            this.c = new fs3(ur2Var.d.c, w, rz6Var2);
            return true;
        }
        return true;
    }

    public final ft6 b(ft6 ft6Var, rz6 rz6Var) {
        long j = ft6Var.f;
        ur2 ur2Var = this.d;
        Integer num = this.a;
        long v = ur2Var.v(j, num);
        long j2 = ft6Var.g;
        long v2 = ur2Var.v(j2, num);
        if (v == j && v2 == j2) {
            return ft6Var;
        }
        return new ft6(ft6Var.a, ft6Var.b, ft6Var.c, ft6Var.d, ft6Var.e, v, v2);
    }

    @Override
    public final void i(int i, rz6 rz6Var, Exception exc) {
        if (a(i, rz6Var)) {
            this.c.d(exc);
        }
    }

    @Override
    public final void j(int i, rz6 rz6Var, ft6 ft6Var) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            kqVar.h(new cz6(kqVar, b(ft6Var, rz6Var), (byte) 3));
        }
    }

    @Override
    public final void k(int i, rz6 rz6Var, ft6 ft6Var) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            ft6 b = b(ft6Var, rz6Var);
            rz6 rz6Var2 = (rz6) kqVar.c;
            rz6Var2.getClass();
            kqVar.h(new wu2(kqVar, rz6Var2, b, (byte) 18));
        }
    }

    @Override
    public final void n(int i, rz6 rz6Var, int i2) {
        if (a(i, rz6Var)) {
            this.c.c(i2);
        }
    }

    @Override
    public final void s(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            kqVar.h(new tz6(kqVar, ea6Var, b(ft6Var, rz6Var), (byte) 1));
        }
    }

    @Override
    public final void u(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            kqVar.h(new tz6(kqVar, ea6Var, b(ft6Var, rz6Var), (byte) 0));
        }
    }

    @Override
    public final void w(int i, rz6 rz6Var, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        if (a(i, rz6Var)) {
            kq kqVar = this.b;
            kqVar.h(new og(kqVar, ea6Var, b(ft6Var, rz6Var), iOException, z));
        }
    }

    @Override
    public final void y(int i, rz6 rz6Var) {
        if (a(i, rz6Var)) {
            this.c.b();
        }
    }
}
