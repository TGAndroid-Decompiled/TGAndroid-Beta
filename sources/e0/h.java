package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import k7.q6;
public abstract class h extends Activity implements androidx.lifecycle.t, r0.k {
    public final androidx.lifecycle.v f4978a = new androidx.lifecycle.v(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (q6.a(decorView, event)) {
            return true;
        }
        return q6.b(this, decorView, this, event);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (q6.a(decorView, event)) {
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
        int i10 = androidx.lifecycle.h0.f1010b;
        androidx.lifecycle.f0.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        this.f4978a.g();
        super.onSaveInstanceState(outState);
    }
}
