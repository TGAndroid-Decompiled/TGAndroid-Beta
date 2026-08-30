package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.yh;
public final class ca extends LinearLayout {
    public final int f12262a;
    public final org.telegram.ui.ActionBar.f6 f12263b;
    public final org.telegram.ui.Components.p9 f12264c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final TextView f12265f;
    public final TextView h;
    public final TextView f12266n;
    public boolean f12267r;
    public boolean f12268s;

    public ca(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12262a = i10;
        this.f12263b = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f12264c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(p9Var, k7.b6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k5Var.setTextSize(16);
        k5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(k5Var);
        linearLayout.addView(k5Var, k7.b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView j10 = yh.j(linearLayout, textView, k7.b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f12265f = j10;
        int i12 = org.telegram.ui.ActionBar.j6.f20298z6;
        org.telegram.ui.b.l(i12, f6Var, j10, 1, 14.0f);
        linearLayout.addView(j10, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, k7.b6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.b.w(i11, f6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView j11 = yh.j(linearLayout2, textView2, k7.b6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f12266n = j11;
        org.telegram.ui.b.l(i12, f6Var, j11, 1, 13.0f);
        j11.setGravity(5);
        linearLayout2.addView(j11, k7.b6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12268s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f12267r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
