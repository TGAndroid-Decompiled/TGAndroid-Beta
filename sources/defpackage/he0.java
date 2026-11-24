package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class he0 extends FrameLayout {
    public final ge0 a;
    public boolean b;
    public boolean c;
    public qac d;

    public he0(Activity activity, ylb ylbVar) {
        super(activity);
        int w0;
        ge0 ge0Var = new ge0(this, activity);
        this.a = ge0Var;
        ge0Var.setHapticFeedbackEnabled(true);
        ge0Var.setImageResource(2131232756);
        anb.s(ge0Var, cmb.If, ylbVar, PorterDuff.Mode.MULTIPLY);
        ge0Var.setScaleType(ImageView.ScaleType.CENTER);
        ge0Var.setContentDescription(jb6.M0(2131754920, null));
        ge0Var.setFocusable(true);
        ge0Var.setOnClickListener(new x10((byte) 1));
        addView(ge0Var, qoe.e(36, 36, 17));
        int w02 = cmb.w0(null, cmb.h6, false);
        int L = gm.L(36.0f);
        int i = cmb.c6;
        if (ylbVar != null) {
            w0 = ylbVar.h(i);
        } else {
            w0 = cmb.w0(null, i, false);
        }
        fg0 h0 = cmb.h0(L, w0, w02);
        wmb M = anb.M(i);
        ge0Var.setBackground(h0);
        anb.j(ge0Var, h0, M, null, ylbVar);
        ge0Var.setOutlineProvider(new pl9(18));
        ge0Var.setElevation(gm.L(1.0f));
        ge0Var.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(42.0f), 1073741824));
    }

    public void setOnBackspace(qac qacVar) {
        this.d = qacVar;
    }
}
