package bi;

import android.os.SystemClock;
public final class j8 implements Runnable {
    public final int f2967a;
    public final m8 f2968b;

    public j8(m8 m8Var, int i10) {
        this.f2967a = i10;
        this.f2968b = m8Var;
    }

    @Override
    public final void run() {
        switch (this.f2967a) {
            case 0:
                m8 m8Var = this.f2968b;
                m8Var.f3126r0 = false;
                m8Var.f3138z0 = false;
                m8Var.f3131v0 = SystemClock.elapsedRealtime();
                m8Var.f3130u0 = true;
                m8Var.f3133w0 = false;
                m8Var.J.c(false);
                m8Var.K.c(false);
                m8Var.L.c(false);
                ((sc) m8Var.f3104a).d(true);
                return;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                m8 m8Var2 = this.f2968b;
                m8Var2.Q = currentTimeMillis;
                m8Var2.R = 0L;
                m8Var2.f3126r0 = true;
                ((sc) m8Var2.f3104a).f3660a.J0.a(0L, true);
                return;
            case 2:
                m8 m8Var3 = this.f2968b;
                if (!m8Var3.f3126r0 && !m8Var3.b()) {
                    if (!ce.d(((sc) m8Var3.f3104a).f3660a)) {
                        m8Var3.f3133w0 = false;
                        m8Var3.J.c(false);
                        m8Var3.K.c(false);
                        m8Var3.L.c(false);
                        return;
                    }
                    m8Var3.f3138z0 = true;
                    m8Var3.A0 = true;
                    ((sc) m8Var3.f3104a).e(new j8(m8Var3, 4), true);
                    return;
                }
                return;
            case 3:
                m8 m8Var4 = this.f2968b;
                if (!m8Var4.f3126r0 && !m8Var4.b()) {
                    bd bdVar = ((sc) m8Var4.f3104a).f3660a.B0;
                    if (bdVar != null) {
                        bdVar.toggleDual();
                    }
                    m8Var4.d(360.0f);
                    m8Var4.f3133w0 = false;
                    m8Var4.J.c(false);
                    m8Var4.K.c(false);
                    m8Var4.L.c(false);
                    return;
                }
                return;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                m8 m8Var5 = this.f2968b;
                m8Var5.Q = currentTimeMillis2;
                m8Var5.f3126r0 = true;
                k8 k8Var = m8Var5.f3104a;
                m8Var5.R = 0L;
                ((sc) k8Var).f3660a.J0.a(0L, true);
                return;
        }
    }
}
