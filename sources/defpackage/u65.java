package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class u65 implements Runnable {
    public final g95 a;

    public u65(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void run() {
        int i;
        g95 g95Var = this.a;
        lka lkaVar = g95Var.N1;
        o85 o85Var = g95Var.O1;
        if (o85Var != null && !g95Var.J) {
            qd2 qd2Var = g95Var.T2;
            if (qd2Var != null) {
                i = qd2Var.b.schedule_date;
            } else {
                i = g95Var.c4;
            }
            if (i != 0) {
                int currentTime = i - ConnectionsManager.getInstance(g95Var.n1.a).getCurrentTime();
                if (currentTime >= 86400) {
                    o85Var.l(jb6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    o85Var.l(gm.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && lkaVar.getTag() == null) {
                        lkaVar.setTag(1);
                        lkaVar.l(jb6.M0(2131743125, null), false);
                    }
                }
                g95Var.P1.l(jb6.W(3, i, true), false);
                gm.d3(g95Var.o4, 1000L);
            }
        }
    }
}
