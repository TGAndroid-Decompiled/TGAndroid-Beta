package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
public final class eva extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final pb0 b;
    public final be0 c;
    public final be0 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final l46 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public eva(int i, wjb wjbVar, Context context) {
        super(context);
        this.e = 1;
        this.a = i;
        setOrientation(0);
        eb0 eb0Var = new eb0(this, context, wjbVar);
        addView(eb0Var, nme.p(72, -1, 0.0f, 115));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setRoundRadius(gl.L(46.0f));
        eb0Var.addView(be0Var, nme.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new pb0((wjb) null);
        be0 be0Var2 = new be0(context);
        this.c = be0Var2;
        be0Var2.setRoundRadius(gl.L(46.0f));
        eb0Var.addView(be0Var2, nme.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, nme.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(gl.o());
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k = nme.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k;
        linearLayout.addView(textView, k);
        l46 l46Var = new l46(context, null);
        this.n = l46Var;
        zkb.X(l46Var, i2, wjbVar);
        l46Var.setTextSize(1, 13.0f);
        l46Var.setEllipsize(truncateAt);
        l46Var.setSingleLine(true);
        linearLayout.addView(l46Var, nme.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, nme.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(gl.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, nme.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable d = b00.d(context, 2131232757);
        d.setBounds(0, 0, gl.L(21.0f), gl.L(21.0f));
        spannableString.setSpan(new ImageSpan(d), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        cm2 cm2Var = new cm2(0, b00.d(context, 2131231961));
        cm2Var.d = false;
        cm2Var.c(gl.L(18.0f));
        cm2Var.s = gl.L(0.5f);
        spannableString2.setSpan(cm2Var, 0, spannableString2.length(), 33);
    }

    public static fm2 a(int i, String str) {
        if (i != 44) {
            return o5a.a(i, str);
        }
        HashMap hashMap = F;
        if (hashMap == null) {
            hashMap = new HashMap();
            F = hashMap;
        }
        fm2 fm2Var = (fm2) hashMap.get(str);
        if (fm2Var == null) {
            HashMap hashMap2 = F;
            fm2 a = o5a.a(44, str);
            hashMap2.put(str, a);
            return a;
        }
        return fm2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.E) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, measuredHeight, measuredWidth - i, getMeasuredHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.y) {
            f = 71.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
    }
}
