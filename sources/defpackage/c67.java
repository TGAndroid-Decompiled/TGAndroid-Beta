package defpackage;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class c67 implements Runnable {
    public final byte a;
    public final q67 b;
    public final EditText c;

    public c67(q67 q67Var, EditText editText, byte b) {
        this.a = b;
        this.b = q67Var;
        this.c = editText;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        q67 q67Var = this.b;
        switch (b) {
            case 0:
                if (!q67Var.t0) {
                    try {
                        Window window = q67Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        q67Var.t0 = true;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                hl.d3(new c67(q67Var, editText, (byte) 1), 100L);
                return;
            default:
                hl.E3(editText);
                if (q67Var.W != null) {
                    q67Var.b(q67Var.r0);
                    q67Var.X.setScaleX(q67Var.W.getScaleX());
                    q67Var.X.setScaleY(q67Var.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
