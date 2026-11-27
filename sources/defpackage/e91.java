package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class e91 extends FrameLayout {
    public final int a;
    public final jc0 b;
    public final ImageView c;
    public final bv8 d;
    public final og2 e;
    public Drawable f;
    public Drawable h;

    public e91(Context context, int i) {
        super(context);
        int i2;
        int L;
        float f;
        int i3;
        int i4;
        this.a = i;
        bv8 bv8Var = new bv8(context, null);
        this.d = bv8Var;
        bv8Var.O0 = true;
        bv8Var.G0 = true;
        if (ob6.a0) {
            i2 = hl.L(32.0f);
        } else {
            i2 = 0;
        }
        if (ob6.a0) {
            L = 0;
        } else {
            L = hl.L(32.0f);
        }
        bv8Var.setPadding(i2, 0, L, 0);
        if (ob6.a0) {
            f = 2.0f;
        } else {
            f = -2.0f;
        }
        bv8Var.c0 = hl.L(f);
        bv8Var.d0 = -hl.L(7.0f);
        addView(bv8Var, tre.c(-1.0f, -1));
        jc0 jc0Var = new jc0(context, false);
        this.b = jc0Var;
        jc0Var.setAvatarsTextSize(hl.L(18.0f));
        jc0Var.setStepFactor(0.4f);
        jc0Var.setSize(hl.L(29.0f));
        jc0Var.setCentered(true);
        jc0Var.setVisibility(8);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(jc0Var, tre.d(72, -1.0f, i3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        yob.s(imageView, aob.Zl, null, PorterDuff.Mode.SRC_IN);
        int i5 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i5, false), 1, -1);
        uob M = yob.M(i5);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(ob6.M0(2131752615, null));
        if (ob6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(imageView, tre.d(48, 48.0f, i4 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        og2 og2Var = new og2(21, null, context);
        this.e = og2Var;
        CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
        int w0 = aob.w0(null, aob.Yl, false);
        if (checkBoxBase.x != w0) {
            checkBoxBase.x = w0;
            checkBoxBase.b();
        }
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
