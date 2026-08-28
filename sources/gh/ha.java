package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.ll;
public final class ha extends LinearLayout {
    public final int f8235a;
    public final org.telegram.ui.ActionBar.b6 f8236b;
    public final org.telegram.ui.Components.o9 f8237c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView f8238e;
    public final TextView f8239f;
    public final TextView h;
    public final TextView f8240n;
    public boolean f8241r;
    public boolean f8242s;

    public ha(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8235a = i9;
        this.f8236b = b6Var;
        setOrientation(0);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f8237c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(o9Var, g7.e6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, g7.e6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f8238e = textView;
        ll.n(i10, b6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f8239f = h;
        int i11 = org.telegram.ui.ActionBar.f6.f23386z6;
        ll.n(i11, b6Var, h, 1, 14.0f);
        linearLayout.addView(h, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, g7.e6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.j2.o(i10, b6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView h10 = j3.r0.h(linearLayout2, textView2, g7.e6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f8240n = h10;
        ll.n(i11, b6Var, h10, 1, 13.0f);
        h10.setGravity(5);
        linearLayout2.addView(h10, g7.e6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8242s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.f8241r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
