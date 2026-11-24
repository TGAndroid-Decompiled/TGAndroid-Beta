package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class ni1 extends b38 {
    public final oi1 H;

    public ni1(oi1 oi1Var, Context context, int i, long j, ylb ylbVar) {
        super(i, j, ylbVar, context);
        this.H = oi1Var;
    }

    @Override
    public final void b(int i, boolean z) {
        super.b(i, z);
        oi1 oi1Var = this.H;
        TextView textView = oi1Var.d;
        if (textView != null) {
            textView.setTextColor(oi1Var.b.h.getTextColor());
        }
    }
}
