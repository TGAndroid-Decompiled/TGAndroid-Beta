package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.th;
public final class ba extends LinearLayout {
    public final int f11815a;
    public final org.telegram.ui.ActionBar.c6 f11816b;
    public final org.telegram.ui.Components.t9 f11817c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView f11818e;
    public final TextView f11819f;
    public final TextView h;
    public final TextView f11820n;
    public boolean f11821r;
    public boolean f11822s;

    public ba(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f11815a = i10;
        this.f11816b = c6Var;
        setOrientation(0);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f11817c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(t9Var, i7.f6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, i7.f6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f11818e = textView;
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView i12 = th.i(linearLayout, textView, i7.f6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f11819f = i12;
        int i13 = org.telegram.ui.ActionBar.g6.f23450z6;
        org.telegram.ui.b.m(i13, c6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, i7.f6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.b.w(i11, c6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = th.i(linearLayout2, textView2, i7.f6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f11820n = i14;
        org.telegram.ui.b.m(i13, c6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, i7.f6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11822s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f11821r) {
            f9 = 68.0f;
        } else {
            f9 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }
}
