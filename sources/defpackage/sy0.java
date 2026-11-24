package defpackage;

import android.app.Dialog;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class sy0 extends Dialog {
    public final cz0 a;
    public final ry0 b;
    public final qy0 c;
    public final Paint d;
    public boolean e;

    public sy0(cz0 cz0Var) {
        super(cz0Var.mo21d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = cz0Var;
        dz0 mo21d = cz0Var.mo21d();
        qy0 qy0Var = new qy0(this, getContext());
        this.c = qy0Var;
        paint.setColor(cmb.w0(null, cmb.Z6, false));
        ry0 ry0Var = new ry0(mo21d);
        this.b = ry0Var;
        setContentView(ry0Var, new ViewGroup.LayoutParams(-1, -1));
        ry0Var.addView(qy0Var, qoe.e(-1, -2, 80));
        ry0Var.setClipToPadding(false);
    }

    public static void a(cz0 cz0Var) {
        d S = LaunchActivity.S();
        if (S != null) {
            if (gm.O1() || cz0Var.i() || gm.s1(S)) {
                sy0 sy0Var = new sy0(cz0Var);
                if (cz0Var.k(sy0Var)) {
                    ry0 ry0Var = sy0Var.b;
                    View view = (View) ry0Var.a;
                    gm.B2(view);
                    ry0Var.addView(view, qoe.e(-1, -1, 119));
                }
            }
        }
    }

    public static WindowInsets c(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2;
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            windowInsets2 = WindowInsets.CONSUMED;
            return windowInsets2;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void b() {
        this.a.k(null);
        if (!this.e) {
            return;
        }
        this.e = false;
        try {
            super.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void dismiss() {
        this.a.a(false);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(2131755178);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        gm.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        ry0 ry0Var = this.b;
        ry0Var.setFitsSystemWindows(true);
        ry0Var.setSystemUiVisibility(1792);
        ry0Var.setPadding(0, 0, 0, 0);
        ry0Var.setOnApplyWindowInsetsListener(new wt((byte) 1));
    }
}
