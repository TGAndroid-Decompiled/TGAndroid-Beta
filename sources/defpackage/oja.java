package defpackage;

import android.view.View;
import android.widget.TextView;
public final class oja implements View.OnClickListener {
    public final byte a;
    public final rja b;

    public oja(rja rjaVar, byte b) {
        this.a = b;
        this.b = rjaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        rja rjaVar = this.b;
        switch (b) {
            case 0:
                if (!rjaVar.H && rjaVar.G) {
                    rjaVar.o(true);
                    return;
                }
                c6 c6Var = rjaVar.W;
                if (c6Var != null) {
                    c6Var.b(-1);
                    return;
                }
                return;
            default:
                if (rjaVar.s.length() != 0) {
                    rjaVar.s.setText("");
                } else {
                    TextView textView = rjaVar.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        rjaVar.n();
                    }
                }
                rjaVar.s.requestFocus();
                gm.E3(rjaVar.s);
                return;
        }
    }
}
