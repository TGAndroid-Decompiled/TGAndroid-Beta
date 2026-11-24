package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class dpc implements Runnable {
    public final byte a;
    public final qpc b;

    public dpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                if (qpcVar.J && (editTextBoldCursor = qpcVar.I) != null && editTextBoldCursor.isAttachedToWindow() && qpcVar.I.hasWindowFocus()) {
                    qpcVar.I.requestFocus();
                    if (gl.E3(qpcVar.I)) {
                        qpcVar.J = false;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                float f = qpcVar.c0;
                if (f < 1.0f && qpcVar.b0 == null) {
                    yla ylaVar = new yla(new ti4(f));
                    qpcVar.b0 = ylaVar;
                    zla zlaVar = new zla(1.0f);
                    zlaVar.a(0.55f);
                    zlaVar.b(65.0f);
                    ylaVar.m = zlaVar;
                    qpcVar.b0.f(0.001f);
                    qpcVar.b0.b(new h10(qpcVar, (byte) 20));
                    qpcVar.b0.a(new zv0(qpcVar, (byte) 13));
                    qpcVar.b0.h();
                    return;
                }
                return;
            case 2:
                qpcVar.e0.setLoading(false);
                return;
            case 3:
                qpcVar.e0.setLoading(false);
                return;
            case 4:
                qpcVar.u0();
                return;
            case 5:
                qpcVar.presentFragment(mu1.W9(qpcVar.f.id));
                return;
            default:
                ir2.v(null, 2131742958, u21.b0(qpcVar), 2131623994, 36);
                return;
        }
    }
}
