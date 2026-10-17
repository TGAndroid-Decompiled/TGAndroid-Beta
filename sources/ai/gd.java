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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.zq;
public final class gd extends LinearLayout {
    public static HashMap E;
    public final int f1384a;
    public final org.telegram.ui.Components.h9 f1385b;
    public final org.telegram.ui.Components.w9 f1386c;
    public final org.telegram.ui.Components.w9 d;
    public int e;
    public final TextView f1387f;
    public final LinearLayout.LayoutParams h;
    public final x90 f1388n;
    public final TextView f1389r;
    public final TextView f1390s;
    public final SpannableString v;
    public final SpannableString f1391w;
    public boolean f1392x;
    public boolean f1393y;

    public gd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = 1;
        this.f1384a = i10;
        setOrientation(0);
        w1 w1Var = new w1(this, context, d6Var);
        addView(w1Var, w7.z5.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var, w7.z5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        this.f1385b = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
        this.f1386c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w1Var.addView(w9Var2, w7.z5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f1387f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        wh.o(i11, d6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        x90 x90Var = new x90(context, null);
        this.f1388n = x90Var;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setEllipsize(truncateAt);
        x90Var.setSingleLine(true);
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f1389r = textView2;
        wh.o(org.telegram.ui.ActionBar.h6.f21391z6, d6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = com.google.android.gms.internal.cast.a6.i(linearLayout, textView2, w7.z5.n(-1, -2), context);
        this.f1390s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, w7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f1391w = spannableString2;
        yq yqVar = new yq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        yqVar.recolorDrawable = false;
        yqVar.setSize(AndroidUtilities.dp(18.0f));
        yqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(yqVar, 0, spannableString2.length(), 33);
    }

    public static zq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.t6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        zq zqVar = (zq) E.get(str);
        if (zqVar == null) {
            HashMap hashMap = E;
            zq a2 = org.telegram.ui.Cells.t6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return zqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f1393y) {
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
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f21107k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f1392x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
