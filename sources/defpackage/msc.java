package defpackage;
public final class msc implements Runnable {
    public final byte a;
    public final wsc b;

    public msc(wsc wscVar, byte b) {
        this.a = b;
        this.b = wscVar;
    }

    @Override
    public final void run() {
        ksc j;
        byte b = this.a;
        wsc wscVar = this.b;
        switch (b) {
            case 0:
                wscVar.t0 = false;
                wscVar.h0 = null;
                wscVar.f0();
                return;
            case 1:
                wscVar.Q();
                return;
            case 2:
                vsc vscVar = wscVar.h0;
                if (vscVar != null && !wscVar.n0) {
                    if (wscVar.v0) {
                        wscVar.o0 = true;
                        wscVar.i0 = vscVar;
                        wscVar.C0 = Float.NaN;
                        wscVar.F0 = Float.NaN;
                        wscVar.D0 = 0.0f;
                        wscVar.M0 = false;
                        wscVar.E0 = vscVar.i.b;
                        vscVar.q.a(0.0f);
                        vsc vscVar2 = wscVar.h0;
                        usc uscVar = vscVar2.l;
                        uscVar.d = 260.0f;
                        uscVar.e = 0.58f;
                        uscVar.b = 1.0f;
                        long j2 = wscVar.O0 + 1;
                        wscVar.O0 = j2;
                        vscVar2.I = j2;
                        nl nlVar = vscVar2.c;
                        nlVar.v0 = true;
                        nlVar.w0(false);
                        wscVar.performHapticFeedback(0);
                        wscVar.f0();
                        return;
                    } else if (wscVar.q0 && (j = wscVar.j(vscVar)) != null) {
                        wscVar.S(j);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                if (wscVar.r0 && wscVar.h0 != null) {
                    wscVar.r0 = false;
                    wscVar.q0 = true;
                    wscVar.removeCallbacks(wscVar.C1);
                    ((sc6) wscVar.d.b).X();
                    wscVar.getParent().requestDisallowInterceptTouchEvent(true);
                    wscVar.performHapticFeedback(4);
                    ksc j3 = wscVar.j(wscVar.h0);
                    if (j3 != null) {
                        j3.o();
                        j3.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    wscVar.f0();
                    return;
                }
                return;
        }
    }
}
