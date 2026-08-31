package mh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.yh;
public final class ea extends LinearLayout {
    public static HashMap B;
    public final int f13977a;
    public final org.telegram.ui.Components.z8 f13978b;
    public final org.telegram.ui.Components.p9 f13979c;
    public final org.telegram.ui.Components.p9 d;
    public int f13980e;
    public final TextView f13981f;
    public final LinearLayout.LayoutParams h;
    public final g90 f13982n;
    public final TextView f13983r;
    public final TextView f13984s;
    public final SpannableString v;
    public final SpannableString f13985w;
    public boolean f13986x;
    public boolean f13987y;

    public ea(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f13980e = 1;
        this.f13977a = i10;
        setOrientation(0);
        eg.t3 t3Var = new eg.t3(this, context, g6Var);
        addView(t3Var, k7.c6.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        t3Var.addView(p9Var, k7.c6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f13978b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
        this.f13979c = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        t3Var.addView(p9Var2, k7.c6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, k7.c6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f13981f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = k7.c6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        g90 g90Var = new g90(context, null);
        this.f13982n = g90Var;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        g90Var.setTextSize(1, 13.0f);
        g90Var.setEllipsize(truncateAt);
        g90Var.setSingleLine(true);
        linearLayout.addView(g90Var, k7.c6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f13983r = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22053z6, g6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = yh.i(linearLayout, textView2, k7.c6.n(-1, -2), context);
        this.f13984s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, k7.c6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f13985w = spannableString2;
        oq oqVar = new oq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        oqVar.setSize(AndroidUtilities.dp(18.0f));
        oqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(oqVar, 0, spannableString2.length(), 33);
    }

    public static pq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.t6.a(i10, str);
        }
        if (B == null) {
            B = new HashMap();
        }
        pq pqVar = (pq) B.get(str);
        if (pqVar == null) {
            HashMap hashMap = B;
            pq a2 = org.telegram.ui.Cells.t6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return pqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f13987y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21779k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f13986x) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
