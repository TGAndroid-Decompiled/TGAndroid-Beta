package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class oh1 extends f48 {
    public final ph1 H;

    public oh1(ph1 ph1Var, Context context, int i, long j, vnb vnbVar) {
        super(i, j, vnbVar, context);
        this.H = ph1Var;
    }

    @Override
    public final void b(int i, boolean z) {
        super.b(i, z);
        ph1 ph1Var = this.H;
        TextView textView = ph1Var.d;
        if (textView != null) {
            textView.setTextColor(ph1Var.b.h.getTextColor());
        }
    }
}
