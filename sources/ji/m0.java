package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f13396a;
    public final ImageView f13397b;
    public final TextView f13398c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f13396a = c6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f13397b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f13398c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.a6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.a6.o(0, -2, 1.0f, 119));
        addView(textView2, w7.a6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.f13419a);
        textView.setText(n0Var.f13420b);
        textView2.setText((CharSequence) n0Var.f13421c.get(0));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f13396a;
        this.f13397b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, c6Var), PorterDuff.Mode.SRC_IN));
        this.f13398c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.75f, org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
