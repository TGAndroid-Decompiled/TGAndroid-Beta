package defpackage;

import android.view.View;
public final class nba implements it3 {
    public final byte a;
    public final int[] b;
    public final jm7 c;
    public final View d;

    public nba(jm7 jm7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = jm7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                ((tca) jm7Var).K0((wca) view, iArr, f / 1000.0f);
                return;
            default:
                ((cca) jm7Var).d.K0(view, iArr, f / 1000.0f);
                return;
        }
    }
}
