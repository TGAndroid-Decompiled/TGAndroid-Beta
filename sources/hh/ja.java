package hh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;

public final class ja extends LinearLayout {
    public static HashMap A;

    public final int f9545a;

    public final org.telegram.ui.Components.y8 f9546b;

    public final org.telegram.ui.Components.n9 f9547c;
    public final org.telegram.ui.Components.n9 d;

    public int f9548e;

    public final TextView f9549f;
    public final LinearLayout.LayoutParams h;

    public final p80 f9550n;

    public final TextView f9551r;

    public final TextView f9552s;
    public final SpannableString v;

    public final SpannableString f9553w;

    public boolean f9554x;

    public boolean f9555y;

    public ja(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9548e = 1;
        this.f9545a = i10;
        setOrientation(0);
        h1 h1Var = new h1(this, context, c6Var);
        addView(h1Var, h7.z5.o(72, -1, 0.0f, 115));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(n9Var, h7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9546b = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
        this.f9547c = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        h1Var.addView(n9Var2, h7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, h7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f9549f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        rl.l(i11, c6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParamsK = h7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = layoutParamsK;
        linearLayout.addView(textView, layoutParamsK);
        p80 p80Var = new p80(context, null);
        this.f9550n = p80Var;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        linearLayout.addView(p80Var, h7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f9551r = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.f23441z6, c6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.n(-1, -2), context);
        this.f9552s = textViewI;
        textViewI.setTypeface(AndroidUtilities.bold());
        textViewI.setTextSize(1, 15.3f);
        textViewI.setGravity(5);
        addView(textViewI, h7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        drawableMutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(drawableMutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f9553w = spannableString2;
        cq cqVar = new cq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        cqVar.setSize(AndroidUtilities.dp(18.0f));
        cqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(cqVar, 0, spannableString2.length(), 33);
    }

    public static dq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.q6.a(i10, str);
        }
        if (A == null) {
            A = new HashMap();
        }
        dq dqVar = (dq) A.get(str);
        if (dqVar != null) {
            return dqVar;
        }
        HashMap map = A;
        dq dqVarA = org.telegram.ui.Cells.q6.a(44, str);
        map.put(str, dqVarA);
        return dqVarA;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9555y) {
            canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f9554x ? 71.0f : 58.0f), 1073741824));
    }
}
