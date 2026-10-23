package ai;

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
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yq;
public final class id extends LinearLayout {
    public static HashMap E;
    public final int f1503a;
    public final org.telegram.ui.Components.h9 f1504b;
    public final org.telegram.ui.Components.w9 f1505c;
    public final org.telegram.ui.Components.w9 d;
    public int e;
    public final TextView f1506f;
    public final LinearLayout.LayoutParams h;
    public final y90 f1507n;
    public final TextView f1508r;
    public final TextView f1509s;
    public final SpannableString v;
    public final SpannableString f1510w;
    public boolean f1511x;
    public boolean f1512y;

    public id(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 1;
        this.f1503a = i10;
        setOrientation(0);
        w1 w1Var = new w1(this, context, g6Var);
        addView(w1Var, w7.z5.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f1504b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.f1505c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var2, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f1506f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        y90 y90Var = new y90(context, null);
        this.f1507n = y90Var;
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        y90Var.setTextSize(1, 13.0f);
        y90Var.setEllipsize(truncateAt);
        y90Var.setSingleLine(true);
        linearLayout.addView(y90Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f1508r = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21588z6, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, w7.z5.n(-1, -2));
        TextView textView3 = new TextView(context);
        this.f1509s = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, w7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f1510w = spannableString2;
        xq xqVar = new xq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        xqVar.recolorDrawable = false;
        xqVar.setSize(AndroidUtilities.dp(18.0f));
        xqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(xqVar, 0, spannableString2.length(), 33);
    }

    public static yq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        yq yqVar = (yq) E.get(str);
        if (yqVar == null) {
            HashMap hashMap = E;
            yq a2 = org.telegram.ui.Cells.v6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return yqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f1512y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21304k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f1511x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
