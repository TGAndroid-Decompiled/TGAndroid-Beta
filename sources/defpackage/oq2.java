package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
public abstract class oq2 extends Activity implements i36, px5 {
    public final k36 a = new k36(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (ihc.d(decorView, keyEvent)) {
            return true;
        }
        return rqe.a(this, decorView, this, keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (ihc.d(decorView, keyEvent)) {
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
        int i = qb9.b;
        ob9.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        k36 k36Var = this.a;
        k36Var.d("setCurrentState");
        k36Var.f(z26.c);
        super.onSaveInstanceState(bundle);
    }
}
