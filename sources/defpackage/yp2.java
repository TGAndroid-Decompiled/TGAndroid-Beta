package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
public class yp2 extends Dialog implements e16, dq9 {
    public g16 a;
    public final qx b;
    public final vo7 c;

    public yp2(Context context, int i) {
        super(context, i);
        this.b = new qx(this);
        this.c = new vo7(new mk2(this, (byte) 5));
    }

    public static final void b(yp2 yp2Var) {
        super.onBackPressed();
    }

    public final void a() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(2131296731, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131296732, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131296733, this);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        a();
        super.addContentView(view, layoutParams);
    }

    @Override
    public final oo g() {
        return (oo) this.b.d;
    }

    @Override
    public final g16 m() {
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16 g16Var2 = new g16(this);
            this.a = g16Var2;
            return g16Var2;
        }
        return g16Var;
    }

    @Override
    public final void onBackPressed() {
        this.c.a();
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            vo7 vo7Var = this.c;
            vo7Var.getClass();
            vo7Var.e = onBackInvokedDispatcher;
            vo7Var.b(vo7Var.g);
        }
        this.b.f(bundle);
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_CREATE);
    }

    @Override
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.g(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override
    public final void onStart() {
        super.onStart();
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_RESUME);
    }

    @Override
    public void onStop() {
        g16 g16Var = this.a;
        if (g16Var == null) {
            g16Var = new g16(this);
            this.a = g16Var;
        }
        g16Var.e(u06.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override
    public void setContentView(View view) {
        view.getClass();
        a();
        super.setContentView(view);
    }

    @Override
    public void setContentView(int i) {
        a();
        super.setContentView(i);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        a();
        super.setContentView(view, layoutParams);
    }
}
