package defpackage;

import android.text.TextUtils;
import org.telegram.ui.o;
public final class gt implements Runnable {
    public final byte a;
    public final o b;
    public final String c;

    public gt(o oVar, String str, byte b) {
        this.a = b;
        this.b = oVar;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        o oVar = this.b;
        switch (b) {
            case 0:
                ps0 ps0Var = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                ps0Var.setText(str);
                ps0 ps0Var2 = oVar.i0.c0;
                ps0Var2.setSelection(ps0Var2.getText().length());
                gl.E3(oVar.i0.c0);
                return;
            default:
                d01.n(oVar.M, str, false, null);
                return;
        }
    }
}
