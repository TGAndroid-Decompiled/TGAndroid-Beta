package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class mv1 extends TextView implements vlb {
    public final fg0 a;
    public int b;
    public boolean c;
    public final yv1 d;

    public mv1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.d = yv1Var;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        anb.X(this, cmb.Ii, yv1Var.getResourceProvider());
        int themedColor = yv1Var.getThemedColor(cmb.Ei);
        this.b = themedColor;
        fg0 e = ulb.e(themedColor, 16.0f);
        this.a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(gm.o());
        setGravity(17);
        setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), (int) (gm.q.x * 0.45f)), Integer.MIN_VALUE), i2);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(cmb.Ei);
            if (themedColor != this.b || this.c != cmb.I.o()) {
                Drawable background = getBackground();
                fg0 fg0Var = this.a;
                if (background == fg0Var) {
                    this.c = cmb.I.o();
                    cmb.F1(fg0Var, themedColor, false);
                    cmb.F1(fg0Var, ulb.b(themedColor), true);
                    this.b = themedColor;
                    invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
