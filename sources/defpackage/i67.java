package defpackage;

import android.content.Context;
public final class i67 extends rc2 {
    public int Ld;
    public int Md;
    public int Nd;
    public final j67 Od;

    public i67(j67 j67Var, Context context, int i, ylb ylbVar) {
        super(context, i, true, null, ylbVar);
        this.Od = j67Var;
        this.Ld = Integer.MAX_VALUE;
        this.Md = Integer.MAX_VALUE;
        this.Nd = -1;
    }

    @Override
    public final qna Y2() {
        return qna.d(1, this, this.Od.F);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int e1;
        super.onLayout(z, i, i2, i3, i4);
        if (this.ub.x0 && i2 != 0 && this.Ld != Integer.MAX_VALUE && i4 != 0 && this.Md != Integer.MAX_VALUE) {
            int i5 = this.Nd;
            int i6 = 0;
            if (getMessageObject() == null) {
                e1 = 0;
            } else {
                e1 = getMessageObject().e1();
            }
            if (i5 == e1) {
                if (!this.Od.A0) {
                    setTranslationY(-(i2 - this.Ld));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(d53.h).start();
                }
                this.Ld = getTop();
                this.Md = getBottom();
                if (getMessageObject() != null) {
                    i6 = getMessageObject().e1();
                }
                this.Nd = i6;
            }
        }
    }
}
