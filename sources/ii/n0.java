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
import org.telegram.ui.ActionBar.j6;
public final class n0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f11509a;
    public final ImageView f11510b;
    public final TextView f11511c;
    public final TextView d;

    public n0(Context context, o0 o0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f11509a = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f11510b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f11511c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.y5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.y5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.y5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(o0Var.f11526a);
        textView.setText(o0Var.f11527b);
        textView2.setText((CharSequence) o0Var.f11528c.get(0));
        e();
    }

    @Override
    public final void e() {
        int i10 = j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f11509a;
        this.f11510b.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        this.f11511c.setTextColor(j6.v0(i10, e6Var));
        this.d.setTextColor(j6.l1(0.75f, j6.v0(i10, e6Var)));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
