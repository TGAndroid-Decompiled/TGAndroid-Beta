package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class r02 extends s02 {
    public byte b;
    public final x02 c;

    public r02(x02 x02Var, Context context) {
        super(context);
        this.c = x02Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = x02.G4;
        wjb wjbVar = x02Var.J0;
        ox4 ox4Var = new ox4(context);
        ox4Var.d = wjbVar;
        ox4Var.R = true;
        TextView textView = ox4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        ox4Var.b(false);
        ox4Var.b.setLayoutParams(nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        this.a = ox4Var;
        addView(ox4Var, nme.c(-1.0f, -1));
    }

    public final void a(int i, String str, nx4 nx4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(nx4Var);
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
