package bi;

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
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
public final class yc extends LinearLayout {
    public static HashMap E;
    public boolean D;
    public final int f5094a;
    public final org.telegram.ui.Components.w8 f5095b;
    public final org.telegram.ui.Components.l9 f5096c;
    public final org.telegram.ui.Components.l9 d;
    public int f5097e;
    public final TextView f5098f;
    public final LinearLayout.LayoutParams h;
    public final w70 f5099n;
    public final TextView f5100r;
    public final TextView f5101s;
    public final SpannableString f5102w;
    public final SpannableString f5103x;
    public boolean f5104y;

    public yc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f5097e = 1;
        this.f5094a = i7;
        setOrientation(0);
        s1 s1Var = new s1(this, context, f6Var);
        addView(s1Var, c8.ha.p(72, -1, 0.0f, 115));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        s1Var.addView(l9Var, c8.ha.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f5095b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
        this.f5096c = l9Var2;
        l9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        s1Var.addView(l9Var2, c8.ha.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ha.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f5098f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ha.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        w70 w70Var = new w70(context, null);
        this.f5099n = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        w70Var.setTextSize(1, 13.0f);
        w70Var.setEllipsize(truncateAt);
        w70Var.setSingleLine(true);
        linearLayout.addView(w70Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f5100r = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ha.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.f5101s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ha.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.f5102w = spannableString;
        Drawable h = jg.g.h(context, 2131232752);
        h.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(h), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f5103x = spannableString2;
        wp wpVar = new wp(0, jg.g.h(context, 2131231957));
        wpVar.d = false;
        wpVar.c(org.telegram.messenger.g0.L(18.0f));
        wpVar.f40021s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(wpVar, 0, spannableString2.length(), 33);
    }

    public static xp a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.s6.a(i7, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        xp xpVar = (xp) E.get(str);
        if (xpVar == null) {
            HashMap hashMap = E;
            xp a10 = org.telegram.ui.Cells.s6.a(44, str);
            hashMap.put(str, a10);
            return a10;
        }
        return xpVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.D) {
            if (org.telegram.messenger.id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f5104y) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
