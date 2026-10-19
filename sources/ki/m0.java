package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f15379a;
    public final ImageView f15380b;
    public final TextView f15381c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f15379a = d6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f15380b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f15381c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.z5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.z5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.z5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.f15394a);
        textView.setText(n0Var.f15395b);
        textView2.setText((CharSequence) n0Var.f15396c.get(0));
        d();
    }

    @Override
    public final void d() {
        int i10 = h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f15379a;
        this.f15380b.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        this.f15381c.setTextColor(h6.w0(i10, d6Var));
        this.d.setTextColor(h6.m1(0.75f, h6.w0(i10, d6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
