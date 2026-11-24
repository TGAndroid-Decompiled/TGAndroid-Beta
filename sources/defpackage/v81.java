package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;
public final class v81 extends FrameLayout {
    public final int a;
    public final hc0 b;
    public final ImageView c;
    public final rr8 d;
    public final wf2 e;
    public Drawable f;
    public Drawable h;

    public v81(Context context, int i) {
        super(context);
        int i2;
        int L;
        float f;
        int i3;
        int i4;
        this.a = i;
        rr8 rr8Var = new rr8(context, null);
        this.d = rr8Var;
        rr8Var.N0 = true;
        rr8Var.F0 = true;
        if (k96.a0) {
            i2 = gl.L(32.0f);
        } else {
            i2 = 0;
        }
        if (k96.a0) {
            L = 0;
        } else {
            L = gl.L(32.0f);
        }
        rr8Var.setPadding(i2, 0, L, 0);
        if (k96.a0) {
            f = 2.0f;
        } else {
            f = -2.0f;
        }
        rr8Var.c0 = gl.L(f);
        rr8Var.d0 = -gl.L(7.0f);
        addView(rr8Var, nme.c(-1.0f, -1));
        hc0 hc0Var = new hc0(context, false);
        this.b = hc0Var;
        hc0Var.setAvatarsTextSize(gl.L(18.0f));
        hc0Var.setStepFactor(0.4f);
        hc0Var.setSize(gl.L(29.0f));
        hc0Var.setCentered(true);
        hc0Var.setVisibility(8);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(hc0Var, nme.d(72, -1.0f, i3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        zkb.s(imageView, bkb.Yl, null, PorterDuff.Mode.SRC_IN);
        int i5 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i5, false), 1, -1);
        vkb M = zkb.M(i5);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(k96.M0(2131752622, null));
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        addView(imageView, nme.d(48, 48.0f, i4 | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        wf2 wf2Var = new wf2(21, null, context);
        this.e = wf2Var;
        CheckBoxBase checkBoxBase = wf2Var.getCheckBoxBase();
        int w0 = bkb.w0(null, bkb.Xl, false);
        if (checkBoxBase.x != w0) {
            checkBoxBase.x = w0;
            checkBoxBase.b();
        }
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var, nme.d(24, 24.0f, (k96.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
