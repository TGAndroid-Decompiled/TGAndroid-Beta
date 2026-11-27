package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
public final class nu1 extends TextView implements snb {
    public final hf0 a;
    public int b;
    public boolean c;
    public final zu1 d;

    public nu1(zu1 zu1Var, Activity activity) {
        super(activity);
        this.d = zu1Var;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        yob.X(this, aob.Ji, zu1Var.getResourceProvider());
        int themedColor = zu1Var.getThemedColor(aob.Fi);
        this.b = themedColor;
        hf0 e = rnb.e(themedColor, 16.0f);
        this.a = e;
        setBackground(e);
        setTextSize(1, 14.0f);
        setTypeface(hl.o());
        setGravity(17);
        setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), (int) (hl.q.x * 0.45f)), Integer.MIN_VALUE), i2);
    }

    @Override
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(aob.Fi);
            if (themedColor != this.b || this.c != aob.I.o()) {
                Drawable background = getBackground();
                hf0 hf0Var = this.a;
                if (background == hf0Var) {
                    this.c = aob.I.o();
                    aob.F1(hf0Var, themedColor, false);
                    aob.F1(hf0Var, rnb.b(themedColor), true);
                    this.b = themedColor;
                    invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
