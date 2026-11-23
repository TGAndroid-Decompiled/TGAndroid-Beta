package di;

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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
public final class kb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int f9195a;
    public final org.telegram.ui.Components.a9 f9196b;
    public final org.telegram.ui.Components.p9 f9197c;
    public final org.telegram.ui.Components.p9 d;
    public int f9198e;
    public final TextView f9199f;
    public final LinearLayout.LayoutParams h;
    public final j80 f9200n;
    public final TextView f9201r;
    public final TextView f9202s;
    public final SpannableString f9203w;
    public final SpannableString f9204x;
    public boolean f9205y;

    public kb(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f9198e = 1;
        this.f9195a = i7;
        setOrientation(0);
        d1 d1Var = new d1(this, context, i6Var);
        addView(d1Var, c8.na.p(72, -1, 0.0f, 115));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(p9Var, c8.na.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9196b = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.f9197c = p9Var2;
        p9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(p9Var2, c8.na.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.na.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f9199f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.na.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        j80 j80Var = new j80(context, null);
        this.f9200n = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
        j80Var.setTextSize(1, 13.0f);
        j80Var.setEllipsize(truncateAt);
        j80Var.setSingleLine(true);
        linearLayout.addView(j80Var, c8.na.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f9201r = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.na.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.f9202s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.na.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.f9203w = spannableString;
        Drawable g10 = i5.c.g(context, 2131232757);
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g10), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f9204x = spannableString2;
        kq kqVar = new kq(0, i5.c.g(context, 2131231961));
        kqVar.d = false;
        kqVar.c(org.telegram.messenger.g0.L(18.0f));
        kqVar.f36854s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(kqVar, 0, spannableString2.length(), 33);
    }

    public static lq a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.s6.a(i7, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        lq lqVar = (lq) F.get(str);
        if (lqVar == null) {
            HashMap hashMap = F;
            lq a10 = org.telegram.ui.Cells.s6.a(44, str);
            hashMap.put(str, a10);
            return a10;
        }
        return lqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24314a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29574k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f9205y) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
