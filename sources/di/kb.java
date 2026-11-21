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
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
public final class kb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int f9231a;
    public final org.telegram.ui.Components.b9 f9232b;
    public final org.telegram.ui.Components.q9 f9233c;
    public final org.telegram.ui.Components.q9 d;
    public int f9234e;
    public final TextView f9235f;
    public final LinearLayout.LayoutParams h;
    public final m80 f9236n;
    public final TextView f9237r;
    public final TextView f9238s;
    public final SpannableString f9239w;
    public final SpannableString f9240x;
    public boolean f9241y;

    public kb(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f9234e = 1;
        this.f9231a = i7;
        setOrientation(0);
        d1 d1Var = new d1(this, context, h6Var);
        addView(d1Var, c8.ma.p(72, -1, 0.0f, 115));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9232b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
        this.f9233c = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var2, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ma.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f9235f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ma.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        m80 m80Var = new m80(context, null);
        this.f9236n = m80Var;
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        m80Var.setTextSize(1, 13.0f);
        m80Var.setEllipsize(truncateAt);
        m80Var.setSingleLine(true);
        linearLayout.addView(m80Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f9237r = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29789z6, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ma.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.f9238s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ma.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.f9239w = spannableString;
        Drawable g10 = i5.c.g(context, 2131232754);
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g10), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f9240x = spannableString2;
        nq nqVar = new nq(0, i5.c.g(context, 2131231958));
        nqVar.d = false;
        nqVar.c(org.telegram.messenger.g0.L(18.0f));
        nqVar.f37947s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(nqVar, 0, spannableString2.length(), 33);
    }

    public static oq a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.t6.a(i7, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        oq oqVar = (oq) F.get(str);
        if (oqVar == null) {
            HashMap hashMap = F;
            oq a10 = org.telegram.ui.Cells.t6.a(44, str);
            hashMap.put(str, a10);
            return a10;
        }
        return oqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f9241y) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
