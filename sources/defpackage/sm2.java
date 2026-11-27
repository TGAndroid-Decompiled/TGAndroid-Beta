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
public final class sm2 extends nx0 {
    public static final int t1 = 0;
    public final rg2 l1;
    public final ImageView m1;
    public final km2 n1;
    public final Path o1;
    public int p1;
    public pt2 q1;
    public rx r1;
    public boolean s1;

    public sm2(Context context, vnb vnbVar) {
        super(1, vnbVar, context, true);
        this.o1 = new Path();
        K(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232744).mutate();
        this.s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, hl.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setImageResource(2131232554);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new sb1(this, context, (byte) 22));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231245);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(aob.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new r81(this, (byte) 16));
        km2 km2Var = new km2(this, context);
        this.n1 = km2Var;
        km2Var.c = 1.0f;
        km2Var.a();
        km2Var.invalidate();
        rg2 rg2Var = new rg2(context, (byte) 2);
        rg2Var.setOrientation(1);
        pm2 pm2Var = new pm2(this, context);
        rg2Var.b = pm2Var;
        pm2Var.a(this.p1);
        rg2Var.c = new om2(this, context);
        rg2Var.d = new rm2(this, context);
        vic vicVar = new vic(context, this.J0);
        vicVar.setAdapter(new mm2(rg2Var, (byte) 0));
        rg2Var.addView(vicVar, tre.l(1.0f, -1, 0));
        rg2Var.addView(km2Var, tre.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, tre.o(28, 28));
        linearLayout2.addView(vicVar.l(8, false), tre.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, tre.o(28, 28));
        rg2Var.addView(linearLayout2, tre.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.l1 = rg2Var;
        linearLayout.addView(rg2Var, tre.o(-1, 0));
        jm2 jm2Var = new jm2(this, context, linearLayout);
        jm2Var.addView(linearLayout);
        this.O = jm2Var;
    }

    public final void E0(int i, int i2) {
        boolean z;
        float B;
        View findFocus;
        if (!this.s1) {
            if (i2 != 2) {
                return;
            }
            this.s1 = true;
        }
        rg2 rg2Var = this.l1;
        if (i2 != 5 && (findFocus = rg2Var.findFocus()) != null) {
            findFocus.clearFocus();
            hl.t1(findFocus);
        }
        if (i2 != 3) {
            ((pm2) rg2Var.b).a(i);
        }
        if (i2 != 0) {
            om2 om2Var = (om2) rg2Var.c;
            if (i2 != 1) {
                z = true;
            } else {
                z = false;
            }
            om2Var.n.p1 = i;
            float[] fArr = om2Var.h;
            Color.colorToHSV(i, fArr);
            if (z) {
                float f = (fArr[1] * 0.5f) + 1.0f;
                float f2 = fArr[2];
                if (f2 <= 0.5f) {
                    B = 1.0f - (((1.0f - f2) * 0.22000003f) + 0.78f);
                } else {
                    B = qu6.B(1.0f, f2, 0.22f, 1.0f);
                }
                om2Var.d = f - B;
                om2Var.e = fArr[0] / 360.0f;
            }
            om2Var.invalidate();
        }
        if (i2 != 1) {
            km2 km2Var = this.n1;
            km2Var.c = Color.alpha(i) / 255.0f;
            km2Var.a();
            km2Var.invalidate();
        }
        rm2 rm2Var = (rm2) rg2Var.d;
        rm2Var.e = true;
        rm2Var.a.b();
        rm2Var.b.b();
        rm2Var.c.b();
        EditTextBoldCursor editTextBoldCursor = rm2Var.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(rm2Var.f.p1));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        rm2Var.e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        pt2 pt2Var = this.q1;
        if (pt2Var != null) {
            pt2Var.accept(Integer.valueOf(this.p1));
        }
    }

    @Override
    public final void show() {
        rx rxVar = this.r1;
        boolean z = false;
        switch (rxVar.a) {
            case 6:
                if (((Bitmap) rxVar.c) != null) {
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
