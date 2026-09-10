package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import w7.v6;
public abstract class h extends Activity implements androidx.lifecycle.t, r0.j {
    public final androidx.lifecycle.v f7087a = new androidx.lifecycle.v(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (v6.a(decorView, event)) {
            return true;
        }
        return v6.b(this, decorView, this, event);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (v6.a(decorView, event)) {
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
        int i10 = androidx.lifecycle.h0.f1264b;
        androidx.lifecycle.f0.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        this.f7087a.g();
        super.onSaveInstanceState(outState);
    }
}
