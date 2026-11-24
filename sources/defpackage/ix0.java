package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ix0 extends fy0 {
    public final LinearLayout S1;
    public FrameLayout T1;
    public u41 U1;

    public ix0(Context context, wjb wjbVar) {
        super(context, null, false, false, wjbVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        return new gx0(this, (byte) 0);
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.o1.setTitle(charSequence);
    }
}
