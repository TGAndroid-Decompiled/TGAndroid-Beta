package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class r61 extends o61 {
    public final z61 d;

    public r61(z61 z61Var, Context context) {
        super(context);
        this.d = z61Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = hl.L(5.0f);
        this.a.setOnClickListener(new k1(this, (byte) 27));
    }
}
