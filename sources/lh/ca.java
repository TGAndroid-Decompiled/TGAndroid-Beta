package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ai;
public final class ca extends LinearLayout {
    public final int f12246a;
    public final org.telegram.ui.ActionBar.f6 f12247b;
    public final org.telegram.ui.Components.p9 f12248c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final TextView f12249f;
    public final TextView h;
    public final TextView f12250n;
    public boolean f12251r;
    public boolean f12252s;

    public ca(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f12246a = i10;
        this.f12247b = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f12248c = p9Var;
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
        TextView i12 = ai.i(linearLayout, textView, k7.b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f12249f = i12;
        int i13 = org.telegram.ui.ActionBar.j6.f20273z6;
        org.telegram.ui.b.l(i13, f6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, k7.b6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.b.w(i11, f6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = ai.i(linearLayout2, textView2, k7.b6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f12250n = i14;
        org.telegram.ui.b.l(i13, f6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, k7.b6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12252s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f12251r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
