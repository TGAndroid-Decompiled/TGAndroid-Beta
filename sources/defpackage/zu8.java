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
public class zu8 extends fx0 {
    public final Bitmap l1;
    public final TextView m1;
    public final TextView n1;
    public final TextView o1;
    public final int p1;
    public final ry8 q1;
    public boolean r1;
    public int s1;

    public zu8(Context context, String str, String str2, String str3, boolean z) {
        super(1, (wjb) null, context, false);
        Bitmap bitmap;
        K();
        this.P = str;
        this.Q = true;
        v31 v31Var = new v31(context, (byte) 4);
        v31Var.setScaleType(ImageView.ScaleType.FIT_XY);
        v31Var.setOutlineProvider(new xi((byte) 13));
        v31Var.setClipToOutline(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, gl.L(16.0f), 0, 0);
        Bitmap bitmap2 = this.l1;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(n24.a, w34.M);
            hashMap.put(n24.c, 0);
            igb igbVar = new igb((byte) 0);
            bitmap = igbVar.a(str2, 768, 768, hashMap, bitmap2, 1.0f, -1, -16777216);
            this.p1 = igbVar.e;
        } catch (Exception e) {
            fa4.g(e, true);
            bitmap = null;
        }
        this.l1 = bitmap;
        v31Var.setImageBitmap(bitmap);
        ?? imageView = new ImageView(context);
        this.q1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setBackgroundColor(-1);
        tw7 tw7Var = new tw7(this, context, v31Var);
        tw7Var.addView(v31Var, nme.c(-1.0f, -1));
        tw7Var.addView((View) imageView, nme.e(60, 60, 17));
        linearLayout.addView(tw7Var, nme.t(220, 220, 1, 30, 0, 30, 0));
        TextView textView = new TextView(context);
        this.m1 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setText(str3);
        textView.setGravity(1);
        linearLayout.addView(textView, nme.d(-1, -2.0f, 0, 40.0f, 8.0f, 40.0f, 8.0f));
        TextView textView2 = new TextView(context);
        this.n1 = textView2;
        textView2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131745256, null));
        textView2.setOnClickListener(new v16(this, context, (byte) 27));
        linearLayout.addView(textView2, nme.t(-1, 48, 80, 16, 15, 16, 3));
        if (z) {
            TextView textView3 = new TextView(context);
            this.o1 = textView3;
            textView3.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(k96.M0(2131745266, null));
            textView3.setOnClickListener(new v16(str2, context, (byte) 28));
            linearLayout.addView(textView3, nme.t(-1, 48, 80, 16, 3, 16, 16));
        }
        updateColors();
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout);
        this.O = scrollView;
    }

    public final void D0() {
        ry8 ry8Var = this.q1;
        ry8Var.setAutoRepeat(true);
        ry8Var.f(2131624167, 60, 60, null);
        ry8Var.d();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int i = bkb.Ii;
            int i2 = bkb.Ei;
            int v0 = (bkb.v0(i2, this.J0) * 17) + (bkb.v0(i, this.J0) * 31);
            int i3 = bkb.Gi;
            int v02 = (bkb.v0(i3, this.J0) * 13) + v0;
            int i4 = bkb.h6;
            int v03 = (bkb.v0(i4, this.J0) * 7) + v02;
            int i5 = bkb.x6;
            int v04 = (bkb.v0(i5, this.J0) * 5) + v03;
            int i6 = bkb.F6;
            int v05 = (bkb.v0(i6, this.J0) * 3) + v04;
            int i7 = bkb.g5;
            int v06 = v05 + bkb.v0(i7, this.J0);
            if (this.r1 && v06 == this.s1) {
                return;
            }
            this.r1 = true;
            this.s1 = v06;
            TextView textView = this.n1;
            if (textView != null) {
                textView.setTextColor(bkb.v0(i, this.J0));
                bkb.F1(textView.getBackground(), bkb.v0(i2, this.J0), false);
                bkb.F1(textView.getBackground(), bkb.v0(i3, this.J0), true);
            }
            TextView textView2 = this.o1;
            if (textView2 != null) {
                textView2.setTextColor(bkb.v0(i2, this.J0));
                bkb.F1(textView2.getBackground(), bm2.o(bkb.v0(i2, this.J0), Math.min(255, Color.alpha(bkb.v0(i4, this.J0)) << 1)), true);
            }
            TextView textView3 = this.m1;
            if (textView3 != null) {
                textView3.setTextColor(bkb.v0(i5, this.J0));
            }
            xw0 xw0Var = this.m0;
            if (xw0Var != null) {
                xw0Var.setTextColor(bkb.v0(i6, this.J0));
            }
            s0(bkb.v0(i7, this.J0));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void updateColors() {
        int v0 = bkb.v0(bkb.Ii, this.J0);
        TextView textView = this.n1;
        textView.setTextColor(v0);
        int L = gl.L(24.0f);
        int i = bkb.Ei;
        int v02 = bkb.v0(i, this.J0);
        int v03 = bkb.v0(bkb.Gi, this.J0);
        textView.setBackground(bkb.i0(L, L, L, L, v02, v03, v03));
        TextView textView2 = this.o1;
        if (textView2 != null) {
            textView2.setTextColor(bkb.v0(i, this.J0));
            textView2.setBackground(bkb.f0(bm2.o(bkb.v0(i, this.J0), Math.min(255, Color.alpha(bkb.v0(bkb.h6, this.J0)) << 1)), 7, -1));
        }
        int i2 = bkb.x6;
        int v04 = bkb.v0(i2, this.J0);
        TextView textView3 = this.m1;
        textView3.setTextColor(v04);
        textView3.setTextColor(bkb.v0(i2, this.J0));
        xw0 xw0Var = this.m0;
        if (xw0Var != null) {
            xw0Var.setTextColor(bkb.v0(bkb.F6, this.J0));
        }
        s0(bkb.v0(bkb.g5, this.J0));
    }
}
