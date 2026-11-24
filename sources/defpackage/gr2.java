package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
public abstract class gr2 extends Activity implements e36, kx5 {
    public final g36 a = new g36(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (kfc.d(decorView, keyEvent)) {
            return true;
        }
        return xne.a(this, decorView, this, keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (kfc.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public final boolean i(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ga9.b;
        ea9.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        g36 g36Var = this.a;
        g36Var.d("setCurrentState");
        g36Var.f(v26.c);
        super.onSaveInstanceState(bundle);
    }
}
