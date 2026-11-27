package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class h53 implements Runnable {
    public final byte a;
    public final k53 b;

    public h53(k53 k53Var, byte b) {
        this.a = b;
        this.b = k53Var;
    }

    @Override
    public final void run() {
        View view;
        byte b = this.a;
        k53 k53Var = this.b;
        switch (b) {
            case 0:
                if (k53Var.b == null && (view = k53Var.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        k53Var.b = (EditText) findFocus;
                    }
                }
                EditText editText = k53Var.b;
                if (editText != null) {
                    if (editText.length() != 0 || k53Var.e) {
                        try {
                            k53Var.performHapticFeedback(3, 2);
                            k53Var.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        k53Var.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        k53Var.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (k53Var.f) {
                            k53Var.postDelayed(k53Var.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                k53Var.n = false;
                k53Var.f = true;
                k53Var.h.run();
                return;
        }
    }
}
