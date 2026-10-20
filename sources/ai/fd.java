package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.mk;
public final class fd extends LinearLayout {
    public final int f1322a;
    public final org.telegram.ui.ActionBar.d6 f1323b;
    public final org.telegram.ui.Components.w9 f1324c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final TextView f1325f;
    public final TextView h;
    public final TextView f1326n;
    public boolean f1327r;
    public boolean f1328s;

    public fd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1322a = i10;
        this.f1323b = d6Var;
        setOrientation(0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f1324c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(w9Var, w7.z5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        j5Var.setTextSize(16);
        j5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(j5Var);
        linearLayout.addView(j5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        mk.o(i11, d6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f1325f = i12;
        int i13 = org.telegram.ui.ActionBar.h6.f21395z6;
        mk.o(i13, d6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.z5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.c1.r(i11, d6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, textView2, w7.z5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f1326n = i14;
        mk.o(i13, d6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, w7.z5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1328s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f21111k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f1327r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
