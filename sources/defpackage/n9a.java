package defpackage;

import android.view.View;
public final class n9a implements yr3 {
    public final byte a;
    public final int[] b;
    public final gk7 c;
    public final View d;

    public n9a(gk7 gk7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = gk7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                ((taa) gk7Var).K0((waa) view, iArr, f / 1000.0f);
                return;
            default:
                ((caa) gk7Var).d.K0(view, iArr, f / 1000.0f);
                return;
        }
    }
}
