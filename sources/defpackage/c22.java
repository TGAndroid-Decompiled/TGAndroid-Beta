package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class c22 extends d22 {
    public byte b;
    public final i22 c;

    public c22(i22 i22Var, Context context) {
        super(context);
        this.c = i22Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = i22.G4;
        ylb ylbVar = i22Var.J0;
        qz4 qz4Var = new qz4(context);
        qz4Var.d = ylbVar;
        qz4Var.R = true;
        TextView textView = qz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        qz4Var.b(false);
        qz4Var.b.setLayoutParams(qoe.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        qz4Var.x = cmb.v0(cmb.Sl, ylbVar);
        qz4Var.s = cmb.v0(cmb.Ql, ylbVar);
        qz4Var.w = cmb.v0(cmb.Rl, ylbVar);
        qz4Var.a();
        this.a = qz4Var;
        addView(qz4Var, qoe.c(-1.0f, -1));
    }

    public final void a(int i, String str, pz4 pz4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(pz4Var);
        this.b = i;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        if (this.b == this.c.T2) {
            z = true;
        } else {
            z = false;
        }
        this.a.f(z, false);
    }
}
