package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.rl;

public final class ha extends LinearLayout {

    public final int f9399a;

    public final org.telegram.ui.ActionBar.c6 f9400b;

    public final org.telegram.ui.Components.n9 f9401c;
    public final org.telegram.ui.ActionBar.h5 d;

    public final TextView f9402e;

    public final TextView f9403f;
    public final TextView h;

    public final TextView f9404n;

    public boolean f9405r;

    public boolean f9406s;

    public ha(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9399a = i10;
        this.f9400b = c6Var;
        setOrientation(0);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f9401c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(n9Var, h7.z5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, h7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f9402e = textView;
        rl.l(i11, c6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f9403f = textViewI;
        int i12 = org.telegram.ui.ActionBar.g6.f23441z6;
        rl.l(i12, c6Var, textViewI, 1, 14.0f);
        linearLayout.addView(textViewI, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, h7.z5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        rl.w(i11, c6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayout2, textView2, h7.z5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f9404n = textViewI2;
        rl.l(i12, c6Var, textViewI2, 1, 13.0f);
        textViewI2.setGravity(5);
        linearLayout2.addView(textViewI2, h7.z5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9406s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f9405r ? 68.0f : 58.0f), 1073741824));
    }
}
