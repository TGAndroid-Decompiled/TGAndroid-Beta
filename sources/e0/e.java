package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import c8.yb;
public abstract class e extends Activity implements androidx.lifecycle.t, r0.i {
    public final androidx.lifecycle.v f10195a = new androidx.lifecycle.v(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (yb.a(decorView, event)) {
            return true;
        }
        return yb.b(this, decorView, this, event);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (yb.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public final boolean i(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.h0.f2505b;
        androidx.lifecycle.f0.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        this.f10195a.g();
        super.onSaveInstanceState(outState);
    }
}
