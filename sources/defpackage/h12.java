package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class h12 extends i12 {
    public byte b;
    public final n12 c;

    public h12(n12 n12Var, Context context) {
        super(context);
        this.c = n12Var;
        setWillNotDraw(false);
        setFocusable(true);
        int i = n12.G4;
        vnb vnbVar = n12Var.J0;
        uz4 uz4Var = new uz4(context);
        uz4Var.d = vnbVar;
        uz4Var.R = true;
        TextView textView = uz4Var.a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        uz4Var.b(false);
        uz4Var.b.setLayoutParams(tre.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        uz4Var.x = aob.v0(aob.Tl, vnbVar);
        uz4Var.s = aob.v0(aob.Rl, vnbVar);
        uz4Var.w = aob.v0(aob.Sl, vnbVar);
        uz4Var.a();
        this.a = uz4Var;
        addView(uz4Var, tre.c(-1.0f, -1));
    }

    public final void a(int i, String str, tz4 tz4Var) {
        this.a.setText(str);
        this.a.setTabAnimation(tz4Var);
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
