package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashMap;
public class ax8 extends my0 {
    public final Bitmap l1;
    public final TextView m1;
    public final TextView n1;
    public final TextView o1;
    public final int p1;
    public final s09 q1;
    public boolean r1;
    public int s1;

    public ax8(Context context, String str, String str2, String str3, boolean z) {
        super(1, (ylb) null, context, false);
        Bitmap bitmap;
        J();
        this.P = str;
        this.Q = true;
        c51 c51Var = new c51(context, (byte) 4);
        c51Var.setScaleType(ImageView.ScaleType.FIT_XY);
        c51Var.setOutlineProvider(new xj((byte) 13));
        c51Var.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gm.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.l1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(y34.a, g54.M);
            hashMap.put(y34.c, 0);
            jib jibVar = new jib((byte) 0);
            bitmap = jibVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.p1 = jibVar.e;
        } catch (Exception e) {
            fc4.g(e, true);
            bitmap = null;
        }
        this.l1 = bitmap;
        c51Var.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.q1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        wy7 wy7Var = new wy7(this, context, c51Var);
        wy7Var.addView(c51Var, qoe.c(-1.0f, -1));
        wy7Var.addView((View) imageView, qoe.e(60, 60, 17));
        linearLayout.addView(wy7Var, qoe.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, qoe.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        textView2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setText(jb6.M0(2131745182, null));
        textView2.setOnClickListener(new n06(this, context, (byte) 28));
        linearLayout.addView(textView2, qoe.t(-1, 48, 80, 16, 15, 16, 3));
        if (z) {
            TextView textView3 = new TextView(context);
            this.o1 = textView3;
            textView3.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(jb6.M0(2131745192, null));
            textView3.setOnClickListener(new n06(str2, context, (byte) 29));
            linearLayout.addView(textView3, qoe.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.O = scrollView;
    }

    public final void D0() {
        s09 s09Var = this.q1;
        s09Var.setAutoRepeat(true);
        s09Var.f(2131624167, 60, 60, null);
        s09Var.d();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int i = cmb.Ii;
            int i2 = cmb.Ei;
            int v0 = (cmb.v0(i2, this.J0) * 17) + (cmb.v0(i, this.J0) * 31);
            int i3 = cmb.Gi;
            int v02 = (cmb.v0(i3, this.J0) * 13) + v0;
            int i4 = cmb.h6;
            int v03 = (cmb.v0(i4, this.J0) * 7) + v02;
            int i5 = cmb.x6;
            int v04 = (cmb.v0(i5, this.J0) * 5) + v03;
            int i6 = cmb.F6;
            int v05 = (cmb.v0(i6, this.J0) * 3) + v04;
            int i7 = cmb.g5;
            int v06 = v05 + cmb.v0(i7, this.J0);
            if (this.r1 && v06 == this.s1) {
                return;
            }
            this.r1 = true;
            this.s1 = v06;
            TextView textView = this.n1;
            if (textView != null) {
                textView.setTextColor(cmb.v0(i, this.J0));
                cmb.F1(textView.getBackground(), cmb.v0(i2, this.J0), false);
                cmb.F1(textView.getBackground(), cmb.v0(i3, this.J0), true);
            }
            TextView textView2 = this.o1;
            if (textView2 != null) {
                textView2.setTextColor(cmb.v0(i2, this.J0));
                cmb.F1(textView2.getBackground(), on2.p(cmb.v0(i2, this.J0), Math.min(255, Color.alpha(cmb.v0(i4, this.J0)) << 1)), true);
            }
            TextView textView3 = this.m1;
            if (textView3 != null) {
                textView3.setTextColor(cmb.v0(i5, this.J0));
            }
            ey0 ey0Var = this.m0;
            if (ey0Var != null) {
                ey0Var.setTextColor(cmb.v0(i6, this.J0));
            }
            s0(cmb.v0(i7, this.J0));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void updateColors() {
        int v0 = cmb.v0(cmb.Ii, this.J0);
        TextView textView = this.n1;
        textView.setTextColor(v0);
        int L = gm.L(24.0f);
        int i = cmb.Ei;
        int v02 = cmb.v0(i, this.J0);
        int v03 = cmb.v0(cmb.Gi, this.J0);
        textView.setBackground(cmb.i0(L, L, L, L, v02, v03, v03));
        TextView textView2 = this.o1;
        if (textView2 != null) {
            textView2.setTextColor(cmb.v0(i, this.J0));
            textView2.setBackground(cmb.f0(on2.p(cmb.v0(i, this.J0), Math.min(255, Color.alpha(cmb.v0(cmb.h6, this.J0)) << 1)), 7, -1));
        }
        int i2 = cmb.x6;
        int v04 = cmb.v0(i2, this.J0);
        TextView textView3 = this.m1;
        textView3.setTextColor(v04);
        textView3.setTextColor(cmb.v0(i2, this.J0));
        ey0 ey0Var = this.m0;
        if (ey0Var != null) {
            ey0Var.setTextColor(cmb.v0(cmb.F6, this.J0));
        }
        s0(cmb.v0(cmb.g5, this.J0));
    }
}
