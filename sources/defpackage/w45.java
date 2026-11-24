package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class w45 implements Runnable {
    public final h75 a;

    public w45(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void run() {
        int i;
        h75 h75Var = this.a;
        jia jiaVar = h75Var.N1;
        q65 q65Var = h75Var.O1;
        if (q65Var != null && !h75Var.J) {
            fc2 fc2Var = h75Var.T2;
            if (fc2Var != null) {
                i = fc2Var.b.schedule_date;
            } else {
                i = h75Var.c4;
            }
            if (i != 0) {
                int currentTime = i - ConnectionsManager.getInstance(h75Var.n1.a).getCurrentTime();
                if (currentTime >= 86400) {
                    q65Var.l(k96.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]), false);
                } else {
                    q65Var.l(gl.j0(Math.abs(currentTime)), false);
                    if (currentTime < 0 && jiaVar.getTag() == null) {
                        jiaVar.setTag(1);
                        jiaVar.l(k96.M0(2131743199, null), false);
                    }
                }
                h75Var.P1.l(k96.W(3, i, true), false);
                gl.e3(h75Var.o4, 1000L);
            }
        }
    }
}
