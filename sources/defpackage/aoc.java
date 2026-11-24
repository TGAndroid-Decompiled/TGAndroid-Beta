package defpackage;
public final class aoc implements Runnable {
    public final byte a;
    public final koc b;

    public aoc(koc kocVar, byte b) {
        this.a = b;
        this.b = kocVar;
    }

    @Override
    public final void run() {
        ync j;
        byte b = this.a;
        koc kocVar = this.b;
        switch (b) {
            case 0:
                if (kocVar.r0 && kocVar.h0 != null) {
                    kocVar.r0 = false;
                    kocVar.q0 = true;
                    kocVar.removeCallbacks(kocVar.C1);
                    ((oa6) kocVar.d.b).X();
                    kocVar.getParent().requestDisallowInterceptTouchEvent(true);
                    kocVar.performHapticFeedback(4);
                    ync j2 = kocVar.j(kocVar.h0);
                    if (j2 != null) {
                        j2.o();
                        j2.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    kocVar.f0();
                    return;
                }
                return;
            case 1:
                kocVar.t0 = false;
                kocVar.h0 = null;
                kocVar.f0();
                return;
            case 2:
                kocVar.Q();
                return;
            default:
                joc jocVar = kocVar.h0;
                if (jocVar != null && !kocVar.n0) {
                    if (kocVar.v0) {
                        kocVar.o0 = true;
                        kocVar.i0 = jocVar;
                        kocVar.C0 = Float.NaN;
                        kocVar.F0 = Float.NaN;
                        kocVar.D0 = 0.0f;
                        kocVar.M0 = false;
                        kocVar.E0 = jocVar.i.b;
                        jocVar.q.a(0.0f);
                        joc jocVar2 = kocVar.h0;
                        ioc iocVar = jocVar2.l;
                        iocVar.d = 260.0f;
                        iocVar.e = 0.58f;
                        iocVar.b = 1.0f;
                        long j3 = kocVar.O0 + 1;
                        kocVar.O0 = j3;
                        jocVar2.I = j3;
                        ml mlVar = jocVar2.c;
                        mlVar.v0 = true;
                        mlVar.w0(false);
                        kocVar.performHapticFeedback(0);
                        kocVar.f0();
                        return;
                    } else if (kocVar.q0 && (j = kocVar.j(jocVar)) != null) {
                        kocVar.S(j);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
