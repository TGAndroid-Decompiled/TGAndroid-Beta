package defpackage;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class v37 implements Runnable {
    public final byte a;
    public final j47 b;
    public final EditText c;

    public v37(j47 j47Var, EditText editText, byte b) {
        this.a = b;
        this.b = j47Var;
        this.c = editText;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        j47 j47Var = this.b;
        switch (b) {
            case 0:
                if (!j47Var.t0) {
                    try {
                        Window window = j47Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        j47Var.t0 = true;
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                gl.d3(new v37(j47Var, editText, (byte) 1), 100L);
                return;
            default:
                gl.E3(editText);
                if (j47Var.W != null) {
                    j47Var.b(j47Var.r0);
                    j47Var.X.setScaleX(j47Var.W.getScaleX());
                    j47Var.X.setScaleY(j47Var.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
