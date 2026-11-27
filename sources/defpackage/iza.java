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
public final class iza extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int a;
    public final rb0 b;
    public final de0 c;
    public final de0 d;
    public int e;
    public final TextView f;
    public final LinearLayout.LayoutParams h;
    public final p66 n;
    public final TextView r;
    public final TextView s;
    public final SpannableString w;
    public final SpannableString x;
    public boolean y;

    public iza(int i, vnb vnbVar, Context context) {
        super(context);
        this.e = 1;
        this.a = i;
        setOrientation(0);
        gb0 gb0Var = new gb0(this, context, vnbVar);
        addView(gb0Var, tre.p(72, -1, 0.0f, 115));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setRoundRadius(hl.L(46.0f));
        gb0Var.addView(de0Var, tre.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.b = new rb0((vnb) null);
        de0 de0Var2 = new de0(context);
        this.c = de0Var2;
        de0Var2.setRoundRadius(hl.L(46.0f));
        gb0Var.addView(de0Var2, tre.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, tre.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f = textView;
        textView.setTypeface(hl.o());
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k = tre.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k;
        linearLayout.addView(textView, k);
        p66 p66Var = new p66(context, null);
        this.n = p66Var;
        yob.X(p66Var, i2, vnbVar);
        p66Var.setTextSize(1, 13.0f);
        p66Var.setEllipsize(truncateAt);
        p66Var.setSingleLine(true);
        linearLayout.addView(p66Var, tre.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, tre.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.s = textView3;
        textView3.setTypeface(hl.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, tre.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.w = spannableString;
        Drawable e = c00.e(context, 2131232775);
        e.setBounds(0, 0, hl.L(21.0f), hl.L(21.0f));
        spannableString.setSpan(new ImageSpan(e), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.x = spannableString2;
        wm2 wm2Var = new wm2(0, c00.e(context, 2131231961));
        wm2Var.d = false;
        wm2Var.c(hl.L(18.0f));
        wm2Var.s = hl.L(0.5f);
        spannableString2.setSpan(wm2Var, 0, spannableString2.length(), 33);
    }

    public static zm2 a(int i, String str) {
        if (i != 44) {
            return g9a.a(i, str);
        }
        HashMap hashMap = F;
        if (hashMap == null) {
            hashMap = new HashMap();
            F = hashMap;
        }
        zm2 zm2Var = (zm2) hashMap.get(str);
        if (zm2Var == null) {
            HashMap hashMap2 = F;
            zm2 a = g9a.a(44, str);
            hashMap2.put(str, a);
            return a;
        }
        return zm2Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.E) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f, measuredHeight, measuredWidth - i, getMeasuredHeight(), aob.j0);
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }
}
