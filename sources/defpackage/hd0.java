package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class hd0 extends FrameLayout {
    public final gd0 a;
    public boolean b;
    public boolean c;
    public p8c d;

    public hd0(Activity activity, wjb wjbVar) {
        super(activity);
        int w0;
        gd0 gd0Var = new gd0(this, activity);
        this.a = gd0Var;
        gd0Var.setHapticFeedbackEnabled(true);
        gd0Var.setImageResource(2131232744);
        zkb.s(gd0Var, bkb.If, wjbVar, PorterDuff.Mode.MULTIPLY);
        gd0Var.setScaleType(ImageView.ScaleType.CENTER);
        gd0Var.setContentDescription(k96.M0(2131754920, null));
        gd0Var.setFocusable(true);
        gd0Var.setOnClickListener(new x00((byte) 1));
        addView(gd0Var, nme.e(36, 36, 17));
        int w02 = bkb.w0(null, bkb.h6, false);
        int L = gl.L(36.0f);
        int i = bkb.c6;
        if (wjbVar != null) {
            w0 = wjbVar.h(i);
        } else {
            w0 = bkb.w0(null, i, false);
        }
        ff0 h0 = bkb.h0(L, w0, w02);
        vkb M = zkb.M(i);
        gd0Var.setBackground(h0);
        zkb.j(gd0Var, h0, M, null, wjbVar);
        gd0Var.setOutlineProvider(new nj9(18));
        gd0Var.setElevation(gl.L(1.0f));
        gd0Var.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(42.0f), 1073741824));
    }

    public void setOnBackspace(p8c p8cVar) {
        this.d = p8cVar;
    }
}
