package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
public final class p43 implements Runnable {
    public final byte a;
    public final s43 b;

    public p43(s43 s43Var, byte b) {
        this.a = b;
        this.b = s43Var;
    }

    @Override
    public final void run() {
        View view;
        byte b = this.a;
        s43 s43Var = this.b;
        switch (b) {
            case 0:
                if (s43Var.b == null && (view = s43Var.d) != null) {
                    View findFocus = view.findFocus();
                    if (findFocus instanceof EditText) {
                        s43Var.b = (EditText) findFocus;
                    }
                }
                EditText editText = s43Var.b;
                if (editText != null) {
                    if (editText.length() != 0 || s43Var.e) {
                        try {
                            s43Var.performHapticFeedback(3, 2);
                            s43Var.playSoundEffect(0);
                        } catch (Exception unused) {
                        }
                        s43Var.b.dispatchKeyEvent(new KeyEvent(0, 67));
                        s43Var.b.dispatchKeyEvent(new KeyEvent(1, 67));
                        if (s43Var.f) {
                            s43Var.postDelayed(s43Var.h, 50L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                s43Var.n = false;
                s43Var.f = true;
                s43Var.h.run();
                return;
        }
    }
}
