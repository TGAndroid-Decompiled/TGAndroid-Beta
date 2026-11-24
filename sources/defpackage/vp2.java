package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
public abstract class vp2 extends Activity implements e16, kv5 {
    public final g16 a = new g16(this);

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (jdc.d(decorView, keyEvent)) {
            return true;
        }
        return vle.a(this, decorView, this, keyEvent);
    }

    @Override
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (jdc.d(decorView, keyEvent)) {
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
        int i = e89.b;
        c89.b(this);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        g16 g16Var = this.a;
        g16Var.d("setCurrentState");
        g16Var.f(v06.c);
        super.onSaveInstanceState(bundle);
    }
}
