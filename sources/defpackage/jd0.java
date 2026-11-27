package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class jd0 extends FrameLayout {
    public final id0 a;
    public boolean b;
    public boolean c;
    public pcc d;

    public jd0(Activity activity, vnb vnbVar) {
        super(activity);
        int w0;
        id0 id0Var = new id0(this, activity);
        this.a = id0Var;
        id0Var.setHapticFeedbackEnabled(true);
        id0Var.setImageResource(2131232755);
        yob.s(id0Var, aob.Jf, vnbVar, PorterDuff.Mode.MULTIPLY);
        id0Var.setScaleType(ImageView.ScaleType.CENTER);
        id0Var.setContentDescription(ob6.M0(2131754916, null));
        id0Var.setFocusable(true);
        id0Var.setOnClickListener(new y00((byte) 1));
        addView(id0Var, tre.e(36, 36, 17));
        int w02 = aob.w0(null, aob.i6, false);
        int L = hl.L(36.0f);
        int i = aob.d6;
        if (vnbVar != null) {
            w0 = vnbVar.h(i);
        } else {
            w0 = aob.w0(null, i, false);
        }
        hf0 h0 = aob.h0(L, w0, w02);
        uob M = yob.M(i);
        id0Var.setBackground(h0);
        yob.j(id0Var, h0, M, null, vnbVar);
        id0Var.setOutlineProvider(new bn9(18));
        id0Var.setElevation(hl.L(1.0f));
        id0Var.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(42.0f), 1073741824));
    }

    public void setOnBackspace(pcc pccVar) {
        this.d = pccVar;
    }
}
