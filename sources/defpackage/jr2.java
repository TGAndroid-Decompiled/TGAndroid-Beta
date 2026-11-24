package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
public class jr2 extends Dialog implements e36, es9 {
    public g36 a;
    public final ry b;
    public final yq7 c;

    public jr2(Context context, int i) {
        super(context, i);
        this.b = new ry(this);
        this.c = new yq7(new xf2(this, (byte) 10));
    }

    public static final void b(jr2 jr2Var) {
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
    public final op g() {
        return (op) this.b.d;
    }

    @Override
    public final g36 m() {
        g36 g36Var = this.a;
        if (g36Var == null) {
            g36 g36Var2 = new g36(this);
            this.a = g36Var2;
            return g36Var2;
        }
        return g36Var;
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
            yq7 yq7Var = this.c;
            yq7Var.getClass();
            yq7Var.e = onBackInvokedDispatcher;
            yq7Var.b(yq7Var.g);
        }
        this.b.f(bundle);
        g36 g36Var = this.a;
        if (g36Var == null) {
            g36Var = new g36(this);
            this.a = g36Var;
        }
        g36Var.e(u26.ON_CREATE);
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
        g36 g36Var = this.a;
        if (g36Var == null) {
            g36Var = new g36(this);
            this.a = g36Var;
        }
        g36Var.e(u26.ON_RESUME);
    }

    @Override
    public void onStop() {
        g36 g36Var = this.a;
        if (g36Var == null) {
            g36Var = new g36(this);
            this.a = g36Var;
        }
        g36Var.e(u26.ON_DESTROY);
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
