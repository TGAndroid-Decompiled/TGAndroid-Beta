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
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f14049a;
    public final ImageView f14050b;
    public final TextView f14051c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f14049a = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f14050b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f14051c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.x5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.x5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.x5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.f14069a);
        textView.setText(n0Var.f14070b);
        textView2.setText((CharSequence) n0Var.f14071c.get(0));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f14049a;
        this.f14050b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        this.f14051c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
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
