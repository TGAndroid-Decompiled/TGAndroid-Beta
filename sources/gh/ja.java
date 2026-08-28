package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.l80;
public final class ja extends LinearLayout {
    public static HashMap A;
    public final int f8357a;
    public final org.telegram.ui.Components.z8 f8358b;
    public final org.telegram.ui.Components.o9 f8359c;
    public final org.telegram.ui.Components.o9 d;
    public int f8360e;
    public final TextView f8361f;
    public final LinearLayout.LayoutParams h;
    public final l80 f8362n;
    public final TextView f8363r;
    public final TextView f8364s;
    public final SpannableString v;
    public final SpannableString f8365w;
    public boolean f8366x;
    public boolean f8367y;

    public ja(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8360e = 1;
        this.f8357a = i9;
        setOrientation(0);
        h1 h1Var = new h1(this, context, b6Var);
        addView(h1Var, g7.e6.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(o9Var, g7.e6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f8358b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
        this.f8359c = o9Var2;
        o9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(o9Var2, g7.e6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, g7.e6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f8361f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        ll.n(i10, b6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = g7.e6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        l80 l80Var = new l80(context, null);
        this.f8362n = l80Var;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        l80Var.setTextSize(1, 13.0f);
        l80Var.setEllipsize(truncateAt);
        l80Var.setSingleLine(true);
        linearLayout.addView(l80Var, g7.e6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f8363r = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.f23386z6, b6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = j3.r0.h(linearLayout, textView2, g7.e6.n(-1, -2), context);
        this.f8364s = h;
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 15.3f);
        h.setGravity(5);
        addView(h, g7.e6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f8365w = spannableString2;
        eq eqVar = new eq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        eqVar.setSize(AndroidUtilities.dp(18.0f));
        eqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(eqVar, 0, spannableString2.length(), 33);
    }

    public static fq a(int i9, String str) {
        if (i9 != 44) {
            return org.telegram.ui.Cells.t6.a(i9, str);
        }
        if (A == null) {
            A = new HashMap();
        }
        fq fqVar = (fq) A.get(str);
        if (fqVar == null) {
            HashMap hashMap = A;
            fq a2 = org.telegram.ui.Cells.t6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return fqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.f8367y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(72.0f);
            } else {
                i9 = 0;
            }
            canvas.drawRect(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f8366x) {
            f10 = 71.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
