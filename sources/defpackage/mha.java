package defpackage;

import android.view.View;
import android.widget.TextView;
public final class mha implements View.OnClickListener {
    public final byte a;
    public final pha b;

    public mha(pha phaVar, byte b) {
        this.a = b;
        this.b = phaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        pha phaVar = this.b;
        switch (b) {
            case 0:
                if (!phaVar.H && phaVar.G) {
                    phaVar.n(true);
                    return;
                }
                c6 c6Var = phaVar.W;
                if (c6Var != null) {
                    c6Var.b(-1);
                    return;
                }
                return;
            default:
                if (phaVar.s.length() != 0) {
                    phaVar.s.setText("");
                } else {
                    TextView textView = phaVar.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        phaVar.m();
                    }
                }
                phaVar.s.requestFocus();
                gl.E3(phaVar.s);
                return;
        }
    }
}
