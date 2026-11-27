package defpackage;

import android.view.View;
public final class dda implements qs3 {
    public final byte a;
    public final int[] b;
    public final fn7 c;
    public final View d;

    public dda(fn7 fn7Var, View view, int[] iArr, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.d = view;
        this.b = iArr;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        int[] iArr = this.b;
        View view = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ((kea) fn7Var).L0((nea) view, iArr, f / 1000.0f);
                return;
            default:
                ((tda) fn7Var).d.L0(view, iArr, f / 1000.0f);
                return;
        }
    }
}
