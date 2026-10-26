package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;
public final class wc extends LinearLayout {
    public final int f5624a;
    public final org.telegram.ui.ActionBar.u6 f5625b;
    public final org.telegram.ui.Components.y9 f5626c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final TextView e;
    public final TextView f5627f;
    public final TextView h;
    public final TextView f5628n;
    public boolean f5629r;
    public boolean f5630s;

    public wc(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f5624a = i10;
        this.f5625b = u6Var;
        setOrientation(0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f5626c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, gb1.t(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.t(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i11, u6Var);
        b6Var.setTextSize(16);
        b6Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(b6Var);
        linearLayout.addView(b6Var, gb1.o(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView e = vh.e(linearLayout, textView, gb1.o(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f5627f = e;
        int i12 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.f7.V(e, i12, u6Var);
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, gb1.t(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.t.r(textView2, i11, u6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView e10 = vh.e(linearLayout2, textView2, gb1.x(-1, -2, 5, 0, 0, 0, 1), context);
        this.f5628n = e10;
        org.telegram.ui.ActionBar.f7.V(e10, i12, u6Var);
        e10.setTextSize(1, 13.0f);
        e10.setGravity(5);
        linearLayout2.addView(e10, gb1.x(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5630s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23478k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f5629r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
