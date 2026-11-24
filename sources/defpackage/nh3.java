package defpackage;

import android.view.View;
public final class nh3 {
    public final byte a;
    public final oh3 b;
    public final View c;

    public nh3(oh3 oh3Var, View view, byte b) {
        this.a = b;
        this.b = oh3Var;
        this.c = view;
    }

    public final void a(boolean z) {
        byte b = this.a;
        View view = this.c;
        oh3 oh3Var = this.b;
        switch (b) {
            case 0:
                if (view instanceof uf3) {
                    oh3Var.P0.F0.i((uf3) view, false);
                    if (z) {
                        gl.d3(new jc((byte) 28), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (view instanceof uf3) {
                    oh3Var.P0.F0.i((uf3) view, false);
                    if (z) {
                        gl.d3(new jc((byte) 28), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
