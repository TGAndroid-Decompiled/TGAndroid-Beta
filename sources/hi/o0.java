package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f9766a;
    public final ImageView f9767b;
    public final TextView f9768c;
    public final TextView d;

    public o0(Context context, p0 p0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f9766a = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f9767b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f9768c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.a6.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.a6.o(0, -2, 1.0f, 119));
        addView(textView2, w7.a6.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(p0Var.f9779a);
        textView.setText(p0Var.f9780b);
        textView2.setText((CharSequence) p0Var.f9781c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f9766a;
        this.f9767b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        this.f9768c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
