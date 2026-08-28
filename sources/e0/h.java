package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import g7.z6;
public abstract class h extends Activity implements androidx.lifecycle.t, r0.k {
    public final androidx.lifecycle.v f4705a = new androidx.lifecycle.v(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (z6.a(decorView, event)) {
            return true;
        }
        return z6.b(this, decorView, this, event);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (z6.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public final boolean i(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i9 = androidx.lifecycle.h0.f1103b;
        androidx.lifecycle.f0.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        this.f4705a.g();
        super.onSaveInstanceState(outState);
    }
}
