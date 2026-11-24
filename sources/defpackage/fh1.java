package defpackage;

import android.content.Context;
import android.widget.TextView;
public final class fh1 extends y08 {
    public final gh1 H;

    public fh1(gh1 gh1Var, Context context, int i, long j, wjb wjbVar) {
        super(i, j, wjbVar, context);
        this.H = gh1Var;
    }

    @Override
    public final void b(int i, boolean z) {
        super.b(i, z);
        gh1 gh1Var = this.H;
        TextView textView = gh1Var.d;
        if (textView != null) {
            textView.setTextColor(gh1Var.b.h.getTextColor());
        }
    }
}
