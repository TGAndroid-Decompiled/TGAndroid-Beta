package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
public class rq2 extends Dialog implements i36, vt9 {
    public k36 a;
    public final rx b;
    public final vr7 c;

    public rq2(Context context, int i) {
        super(context, i);
        this.b = new rx(this);
        this.c = new vr7(new vd2(this, (byte) 11));
    }

    public static final void b(rq2 rq2Var) {
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
    public final po g() {
        return (po) this.b.d;
    }

    @Override
    public final k36 m() {
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36 k36Var2 = new k36(this);
            this.a = k36Var2;
            return k36Var2;
        }
        return k36Var;
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
            vr7 vr7Var = this.c;
            vr7Var.getClass();
            vr7Var.e = onBackInvokedDispatcher;
            vr7Var.b(vr7Var.g);
        }
        this.b.g(bundle);
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_CREATE);
    }

    @Override
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.h(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override
    public final void onStart() {
        super.onStart();
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_RESUME);
    }

    @Override
    public void onStop() {
        k36 k36Var = this.a;
        if (k36Var == null) {
            k36Var = new k36(this);
            this.a = k36Var;
        }
        k36Var.e(y26.ON_DESTROY);
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
