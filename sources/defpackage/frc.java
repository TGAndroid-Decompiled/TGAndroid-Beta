package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class frc implements Runnable {
    public final byte a;
    public final rrc b;

    public frc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                if (rrcVar.J && (editTextBoldCursor = rrcVar.I) != null && editTextBoldCursor.isAttachedToWindow() && rrcVar.I.hasWindowFocus()) {
                    rrcVar.I.requestFocus();
                    if (gm.E3(rrcVar.I)) {
                        rrcVar.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f = rrcVar.c0;
                if (f < 1.0f && rrcVar.b0 == null) {
                    zna znaVar = new zna(new xk4(f));
                    rrcVar.b0 = znaVar;
                    aoa aoaVar = new aoa(1.0f);
                    aoaVar.a(0.55f);
                    aoaVar.b(65.0f);
                    znaVar.m = aoaVar;
                    rrcVar.b0.f(0.001f);
                    rrcVar.b0.b(new h20(rrcVar, (byte) 20));
                    rrcVar.b0.a(new hx0(rrcVar, (byte) 13));
                    rrcVar.b0.h();
                    return;
                }
                return;
            case 2:
                rrcVar.e0.setLoading(false);
                return;
            case 3:
                rrcVar.e0.setLoading(false);
                return;
            case 4:
                rrcVar.v0();
                return;
            case 5:
                rrcVar.presentFragment(yv1.ga(rrcVar.f.id));
                return;
            default:
                ts2.u(null, 2131742884, c41.b0(rrcVar), 2131623994, 36);
                return;
        }
    }
}
