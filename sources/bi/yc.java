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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
public final class yc extends LinearLayout {
    public static HashMap E;
    public final int f5781a;
    public final org.telegram.ui.Components.j9 f5782b;
    public final org.telegram.ui.Components.y9 f5783c;
    public final org.telegram.ui.Components.y9 d;
    public int e;
    public final TextView f5784f;
    public final LinearLayout.LayoutParams h;
    public final z90 f5785n;
    public final TextView f5786r;
    public final TextView f5787s;
    public final SpannableString v;
    public final SpannableString f5788w;
    public boolean f5789x;
    public boolean f5790y;

    public yc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = 1;
        this.f5781a = i10;
        setOrientation(0);
        t1 t1Var = new t1(this, context, u6Var);
        addView(t1Var, gb1.s(72, -1, 0.0f, 115));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        t1Var.addView(y9Var, gb1.h(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f5782b = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.f5783c = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        t1Var.addView(y9Var2, gb1.h(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, gb1.s(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f5784f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams o10 = gb1.o(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = o10;
        linearLayout.addView(textView, o10);
        z90 z90Var = new z90(context, null);
        this.f5785n = z90Var;
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
        z90Var.setTextSize(1, 13.0f);
        z90Var.setEllipsize(truncateAt);
        z90Var.setSingleLine(true);
        linearLayout.addView(z90Var, gb1.o(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f5786r = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23767z6, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, gb1.r(-1, -2));
        TextView textView3 = new TextView(context);
        this.f5787s = textView3;
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, gb1.t(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f5788w = spannableString2;
        zq zqVar = new zq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        zqVar.recolorDrawable = false;
        zqVar.setSize(AndroidUtilities.dp(18.0f));
        zqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(zqVar, 0, spannableString2.length(), 33);
    }

    public static ar a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.z6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        ar arVar = (ar) E.get(str);
        if (arVar == null) {
            HashMap hashMap = E;
            ar a2 = org.telegram.ui.Cells.z6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return arVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f5790y) {
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
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f5789x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
