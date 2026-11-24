package defpackage;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
public final class v57 implements Runnable {
    public final byte a;
    public final j67 b;
    public final EditText c;

    public v57(j67 j67Var, EditText editText, byte b) {
        this.a = b;
        this.b = j67Var;
        this.c = editText;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EditText editText = this.c;
        j67 j67Var = this.b;
        switch (b) {
            case 0:
                if (!j67Var.t0) {
                    try {
                        Window window = j67Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        j67Var.t0 = true;
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                gm.d3(new v57(j67Var, editText, (byte) 1), 100L);
                return;
            default:
                gm.E3(editText);
                if (j67Var.W != null) {
                    j67Var.b(j67Var.r0);
                    j67Var.X.setScaleX(j67Var.W.getScaleX());
                    j67Var.X.setScaleY(j67Var.W.getScaleY());
                    return;
                }
                return;
        }
    }
}
