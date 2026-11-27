package defpackage;

import android.text.TextUtils;
import org.telegram.ui.o;
public final class ft implements Runnable {
    public final byte a;
    public final o b;
    public final String c;

    public ft(o oVar, String str, byte b) {
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
                xs0 xs0Var = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                xs0Var.setText(str);
                xs0 xs0Var2 = oVar.i0.c0;
                xs0Var2.setSelection(xs0Var2.getText().length());
                hl.E3(oVar.i0.c0);
                return;
            default:
                m01.o(oVar.M, str, false, null);
                return;
        }
    }
}
