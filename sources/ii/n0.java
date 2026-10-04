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
public final class n0 extends LinearLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f12531a;
    public final ImageView f12532b;
    public final TextView f12533c;
    public final TextView d;

    public n0(Context context, o0 o0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f12531a = d6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f12532b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f12533c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.z5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.z5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.z5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(o0Var.f12547a);
        textView.setText(o0Var.f12548b);
        textView2.setText((CharSequence) o0Var.f12549c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f12531a;
        this.f12532b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.SRC_IN));
        this.f12533c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
