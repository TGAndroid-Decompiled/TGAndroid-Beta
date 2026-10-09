package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f12580a;
    public final ImageView f12581b;
    public final TextView f12582c;
    public final TextView d;

    public n0(Context context, o0 o0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12580a = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f12581b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f12582c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.x5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.x5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.x5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(o0Var.f12594a);
        textView.setText(o0Var.f12595b);
        textView2.setText((CharSequence) o0Var.f12596c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12580a;
        this.f12581b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        this.f12582c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.m1(0.75f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
