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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class tx0 extends Dialog {
    public final dy0 a;
    public final sx0 b;
    public final rx0 c;
    public final Paint d;
    public boolean e;

    public tx0(dy0 dy0Var) {
        super(dy0Var.mo23d().getContext(), 2131755352);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = dy0Var;
        ey0 mo23d = dy0Var.mo23d();
        rx0 rx0Var = new rx0(this, getContext());
        this.c = rx0Var;
        paint.setColor(aob.w0(null, aob.a7, false));
        sx0 sx0Var = new sx0(mo23d);
        this.b = sx0Var;
        setContentView(sx0Var, new ViewGroup.LayoutParams(-1, -1));
        sx0Var.addView(rx0Var, tre.e(-1, -2, 80));
        sx0Var.setClipToPadding(false);
    }

    public static void a(dy0 dy0Var) {
        e S = LaunchActivity.S();
        if (S != null) {
            if (hl.O1() || dy0Var.i() || hl.s1(S)) {
                tx0 tx0Var = new tx0(dy0Var);
                if (dy0Var.k(tx0Var)) {
                    sx0 sx0Var = tx0Var.b;
                    View view = (View) sx0Var.a;
                    hl.B2(view);
                    sx0Var.addView(view, tre.e(-1, -1, 119));
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
            cc4.g(e, true);
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
        hl.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        sx0 sx0Var = this.b;
        sx0Var.setFitsSystemWindows(true);
        sx0Var.setSystemUiVisibility(1792);
        sx0Var.setPadding(0, 0, 0, 0);
        sx0Var.setOnApplyWindowInsetsListener(new us((byte) 1));
    }
}
