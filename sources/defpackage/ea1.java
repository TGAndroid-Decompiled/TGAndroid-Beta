package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class ea1 extends FrameLayout {
    public final int a;
    public final hd0 b;
    public final ImageView c;
    public final ut8 d;
    public final jh2 e;
    public Drawable f;
    public Drawable h;

    public ea1(Context context, int i) {
        super(context);
        int i2;
        int L;
        float f;
        int i3;
        int i4;
        this.a = i;
        ut8 ut8Var = new ut8(context, null);
        this.d = ut8Var;
        ut8Var.N0 = true;
        ut8Var.F0 = true;
        if (jb6.a0) {
            i2 = gm.L(32.0f);
        } else {
            i2 = 0;
        }
        if (jb6.a0) {
            L = 0;
        } else {
            L = gm.L(32.0f);
        }
        ut8Var.setPadding(i2, 0, L, 0);
        if (jb6.a0) {
            f = 2.0f;
        } else {
            f = -2.0f;
        }
        ut8Var.c0 = gm.L(f);
        ut8Var.d0 = -gm.L(7.0f);
        addView(ut8Var, qoe.c(-1.0f, -1));
        hd0 hd0Var = new hd0(context, false);
        this.b = hd0Var;
        hd0Var.setAvatarsTextSize(gm.L(18.0f));
        hd0Var.setStepFactor(0.4f);
        hd0Var.setSize(gm.L(29.0f));
        hd0Var.setCentered(true);
        hd0Var.setVisibility(8);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(hd0Var, qoe.d(72, -1.0f, i3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        anb.s(imageView, cmb.Yl, null, PorterDuff.Mode.SRC_IN);
        int i5 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i5, false), 1, -1);
        wmb M = anb.M(i5);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(jb6.M0(2131752587, null));
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(imageView, qoe.d(48, 48.0f, i4 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        jh2 jh2Var = new jh2(21, null, context);
        this.e = jh2Var;
        CheckBoxBase checkBoxBase = jh2Var.getCheckBoxBase();
        int w0 = cmb.w0(null, cmb.Xl, false);
        if (checkBoxBase.x != w0) {
            checkBoxBase.x = w0;
            checkBoxBase.b();
        }
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
