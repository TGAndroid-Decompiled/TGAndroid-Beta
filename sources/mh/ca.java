package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.yh;
public final class ca extends LinearLayout {
    public final int f13848a;
    public final org.telegram.ui.ActionBar.g6 f13849b;
    public final org.telegram.ui.Components.p9 f13850c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView f13851e;
    public final TextView f13852f;
    public final TextView h;
    public final TextView f13853n;
    public boolean f13854r;
    public boolean f13855s;

    public ca(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f13848a = i10;
        this.f13849b = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f13850c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(p9Var, k7.c6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        l5Var.setTextSize(16);
        l5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(l5Var);
        linearLayout.addView(l5Var, k7.c6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f13851e = textView;
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView i12 = yh.i(linearLayout, textView, k7.c6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f13852f = i12;
        int i13 = org.telegram.ui.ActionBar.k6.f22055z6;
        org.telegram.ui.b.l(i13, g6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, k7.c6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.b.w(i11, g6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = yh.i(linearLayout2, textView2, k7.c6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f13853n = i14;
        org.telegram.ui.b.l(i13, g6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, k7.c6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13855s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f13854r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
