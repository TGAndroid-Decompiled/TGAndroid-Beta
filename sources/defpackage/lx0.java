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
public final class lx0 extends Dialog {
    public final vx0 a;
    public final kx0 b;
    public final jx0 c;
    public final Paint d;
    public boolean e;

    public lx0(vx0 vx0Var) {
        super(vx0Var.mo23d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = vx0Var;
        wx0 mo23d = vx0Var.mo23d();
        jx0 jx0Var = new jx0(this, getContext());
        this.c = jx0Var;
        paint.setColor(bkb.w0(null, bkb.Z6, false));
        kx0 kx0Var = new kx0(mo23d);
        this.b = kx0Var;
        setContentView(kx0Var, new ViewGroup.LayoutParams(-1, -1));
        kx0Var.addView(jx0Var, nme.e(-1, -2, 80));
        kx0Var.setClipToPadding(false);
    }

    public static void a(vx0 vx0Var) {
        d S = LaunchActivity.S();
        if (S != null) {
            if (gl.O1() || vx0Var.i() || gl.s1(S)) {
                lx0 lx0Var = new lx0(vx0Var);
                if (vx0Var.k(lx0Var)) {
                    kx0 kx0Var = lx0Var.b;
                    View view = (View) kx0Var.a;
                    gl.B2(view);
                    kx0Var.addView(view, nme.e(-1, -1, 119));
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
            fa4.g(e, true);
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
        gl.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        kx0 kx0Var = this.b;
        kx0Var.setFitsSystemWindows(true);
        kx0Var.setSystemUiVisibility(1792);
        kx0Var.setPadding(0, 0, 0, 0);
        kx0Var.setOnApplyWindowInsetsListener(new vs((byte) 1));
    }
}
