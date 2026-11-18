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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
public final class kb extends LinearLayout {
    public static HashMap F;
    public boolean E;
    public final int f9200a;
    public final org.telegram.ui.Components.b9 f9201b;
    public final org.telegram.ui.Components.q9 f9202c;
    public final org.telegram.ui.Components.q9 d;
    public int f9203e;
    public final TextView f9204f;
    public final LinearLayout.LayoutParams h;
    public final k80 f9205n;
    public final TextView f9206r;
    public final TextView f9207s;
    public final SpannableString f9208w;
    public final SpannableString f9209x;
    public boolean f9210y;

    public kb(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f9203e = 1;
        this.f9200a = i7;
        setOrientation(0);
        d1 d1Var = new d1(this, context, i6Var);
        addView(d1Var, c8.ma.p(72, -1, 0.0f, 115));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9201b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
        this.f9202c = q9Var2;
        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        d1Var.addView(q9Var2, c8.ma.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, c8.ma.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f9204f = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = c8.ma.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        k80 k80Var = new k80(context, null);
        this.f9205n = k80Var;
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
        k80Var.setTextSize(1, 13.0f);
        k80Var.setEllipsize(truncateAt);
        k80Var.setSingleLine(true);
        linearLayout.addView(k80Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f9206r = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29805z6, i6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, c8.ma.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.f9207s = textView3;
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, c8.ma.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.f9208w = spannableString;
        Drawable g10 = i5.c.g(context, 2131232754);
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(21.0f));
        spannableString.setSpan(new ImageSpan(g10), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f9209x = spannableString2;
        lq lqVar = new lq(0, i5.c.g(context, 2131231958));
        lqVar.d = false;
        lqVar.c(org.telegram.messenger.g0.L(18.0f));
        lqVar.f37199s = org.telegram.messenger.g0.L(0.5f);
        spannableString2.setSpan(lqVar, 0, spannableString2.length(), 33);
    }

    public static mq a(int i7, String str) {
        if (i7 != 44) {
            return org.telegram.ui.Cells.t6.a(i7, str);
        }
        if (F == null) {
            F = new HashMap();
        }
        mq mqVar = (mq) F.get(str);
        if (mqVar == null) {
            HashMap hashMap = F;
            mq a10 = org.telegram.ui.Cells.t6.a(44, str);
            hashMap.put(str, a10);
            return a10;
        }
        return mqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24213a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24213a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawRect(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f9210y) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
