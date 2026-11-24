package defpackage;

import android.text.TextUtils;
import org.telegram.ui.o;
public final class hu implements Runnable {
    public final byte a;
    public final o b;
    public final String c;

    public hu(o oVar, String str, byte b) {
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
                vc vcVar = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vcVar.setText(str);
                vc vcVar2 = oVar.i0.c0;
                vcVar2.setSelection(vcVar2.getText().length());
                gm.E3(oVar.i0.c0);
                return;
            default:
                l11.o(oVar.M, str, false, null);
                return;
        }
    }
}
