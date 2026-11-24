package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class q71 extends n71 {
    public final y71 d;

    public q71(y71 y71Var, Context context) {
        super(context);
        this.d = y71Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gm.L(5.0f);
        this.a.setOnClickListener(new j1(this, (byte) 28));
    }
}
