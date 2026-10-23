package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f15439a;
    public final ImageView f15440b;
    public final TextView f15441c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15439a = g6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f15440b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f15441c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.z5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.z5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.z5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.f15454a);
        textView.setText(n0Var.f15455b);
        textView2.setText((CharSequence) n0Var.f15456c.get(0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10 = k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15439a;
        this.f15440b.setColorFilter(new PorterDuffColorFilter(k6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        this.f15441c.setTextColor(k6.w0(i10, g6Var));
        this.d.setTextColor(k6.o1(0.75f, k6.w0(i10, g6Var)));
    }
}
