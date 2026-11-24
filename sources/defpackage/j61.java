package defpackage;

import android.content.Context;
import android.view.ViewGroup;
public final class j61 extends g61 {
    public final r61 d;

    public j61(r61 r61Var, Context context) {
        super(context);
        this.d = r61Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = gl.L(5.0f);
        this.a.setOnClickListener(new j1(this, (byte) 25));
    }
}
