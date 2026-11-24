package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class py0 extends mz0 {
    public final LinearLayout S1;
    public FrameLayout T1;
    public b61 U1;

    public py0(Context context, ylb ylbVar) {
        super(context, null, false, false, ylbVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new ny0(this, (byte) 0);
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
