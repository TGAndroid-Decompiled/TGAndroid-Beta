package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ln2 extends my0 {
    public static final int t1 = 0;
    public final nh2 l1;
    public final ImageView m1;
    public final dn2 n1;
    public final Path o1;
    public int p1;
    public gu2 q1;
    public ry r1;
    public boolean s1;

    public ln2(Context context, ylb ylbVar) {
        super(1, ylbVar, context, true);
        this.o1 = new Path();
        K(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232745).mutate();
        this.s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gm.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setImageResource(2131232555);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(cmb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new rc1(this, context, (byte) 21));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231246);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(cmb.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new k81(this, (byte) 17));
        dn2 dn2Var = new dn2(this, context);
        this.n1 = dn2Var;
        dn2Var.c = 1.0f;
        dn2Var.a();
        dn2Var.invalidate();
        nh2 nh2Var = new nh2(context, (byte) 2);
        nh2Var.setOrientation(1);
        in2 in2Var = new in2(this, context);
        nh2Var.b = in2Var;
        in2Var.a(this.p1);
        nh2Var.c = new hn2(this, context);
        nh2Var.d = new kn2(this, context);
        wgc wgcVar = new wgc(context, this.J0);
        wgcVar.setAdapter(new fn2(nh2Var, (byte) 0));
        nh2Var.addView(wgcVar, qoe.l(1.0f, -1, 0));
        nh2Var.addView(dn2Var, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, qoe.o(28, 28));
        linearLayout2.addView(wgcVar.l(8, false), qoe.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, qoe.o(28, 28));
        nh2Var.addView(linearLayout2, qoe.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.l1 = nh2Var;
        linearLayout.addView(nh2Var, qoe.o(-1, 0));
        cn2 cn2Var = new cn2(this, context, linearLayout);
        cn2Var.addView(linearLayout);
        this.O = cn2Var;
    }

    public final void D0(int i, int i2) {
        boolean z;
        float B;
        View findFocus;
        if (!this.s1) {
            if (i2 != 2) {
                return;
            }
            this.s1 = true;
        }
        nh2 nh2Var = this.l1;
        if (i2 != 5 && (findFocus = nh2Var.findFocus()) != null) {
            findFocus.clearFocus();
            gm.t1(findFocus);
        }
        if (i2 != 3) {
            ((in2) nh2Var.b).a(i);
        }
        if (i2 != 0) {
            hn2 hn2Var = (hn2) nh2Var.c;
            if (i2 != 1) {
                z = true;
            } else {
                z = false;
            }
            hn2Var.n.p1 = i;
            float[] fArr = hn2Var.h;
            Color.colorToHSV(i, fArr);
            if (z) {
                float f = (fArr[1] * 0.5f) + 1.0f;
                float f2 = fArr[2];
                if (f2 <= 0.5f) {
                    B = 1.0f - (((1.0f - f2) * 0.22000003f) + 0.78f);
                } else {
                    B = kt6.B(1.0f, f2, 0.22f, 1.0f);
                }
                hn2Var.d = f - B;
                hn2Var.e = fArr[0] / 360.0f;
            }
            hn2Var.invalidate();
        }
        if (i2 != 1) {
            dn2 dn2Var = this.n1;
            dn2Var.c = Color.alpha(i) / 255.0f;
            dn2Var.a();
            dn2Var.invalidate();
        }
        kn2 kn2Var = (kn2) nh2Var.d;
        kn2Var.e = true;
        kn2Var.a.b();
        kn2Var.b.b();
        kn2Var.c.b();
        EditTextBoldCursor editTextBoldCursor = kn2Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(kn2Var.f.p1));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        kn2Var.e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        gu2 gu2Var = this.q1;
        if (gu2Var != null) {
            gu2Var.accept(Integer.valueOf(this.p1));
        }
    }

    @Override
    public final void show() {
        ry ryVar = this.r1;
        boolean z = false;
        switch (ryVar.a) {
            case 5:
                if (((Bitmap) ryVar.c) != null) {
                    z = true;
                    break;
                }
                break;
        }
        if (!z) {
            this.m1.setVisibility(8);
        }
        super.show();
    }
}
