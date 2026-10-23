package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.sl;
public final class gd extends LinearLayout {
    public final int f1364a;
    public final org.telegram.ui.ActionBar.g6 f1365b;
    public final org.telegram.ui.Components.w9 f1366c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final TextView f1367f;
    public final TextView h;
    public final TextView f1368n;
    public boolean f1369r;
    public boolean f1370s;

    public gd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f1364a = i10;
        this.f1365b = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f1366c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(w9Var, w7.z5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i11, g6Var);
        n5Var.setTextSize(16);
        n5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(n5Var);
        linearLayout.addView(n5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f7 = sl.f(linearLayout, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f1367f = f7;
        int i12 = org.telegram.ui.ActionBar.k6.f21588z6;
        org.telegram.ui.ActionBar.r6.W(f7, i12, g6Var);
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.z5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.v0.q(textView2, i11, g6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f10 = sl.f(linearLayout2, textView2, w7.z5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f1368n = f10;
        org.telegram.ui.ActionBar.r6.W(f10, i12, g6Var);
        f10.setTextSize(1, 13.0f);
        f10.setGravity(5);
        linearLayout2.addView(f10, w7.z5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1370s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21304k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f1369r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
