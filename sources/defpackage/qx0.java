package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class qx0 extends ny0 {
    public final LinearLayout S1;
    public FrameLayout T1;
    public c51 U1;

    public qx0(Context context, vnb vnbVar) {
        super(context, null, false, false, vnbVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        return new ox0(this, (byte) 0);
    }

    @Override
    public final CharSequence K0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.o1.setTitle(charSequence);
    }
}
