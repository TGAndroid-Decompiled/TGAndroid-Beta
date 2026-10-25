package li;

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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class l0 extends LinearLayout implements p6 {
    public final u6 f17337a;
    public final ImageView f17338b;
    public final TextView f17339c;
    public final TextView d;

    public l0(Context context, m0 m0Var, u6 u6Var) {
        super(context);
        this.f17337a = u6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.f17338b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.x(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f17339c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, gb1.x(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), gb1.s(0, -2, 1.0f, 119));
        addView(textView2, gb1.x(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(m0Var.f17353a);
        textView.setText(m0Var.f17354b);
        textView2.setText((CharSequence) m0Var.f17355c.get(0));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10 = y6.G6;
        u6 u6Var = this.f17337a;
        this.f17338b.setColorFilter(new PorterDuffColorFilter(y6.w0(i10, u6Var), PorterDuff.Mode.SRC_IN));
        this.f17339c.setTextColor(y6.w0(i10, u6Var));
        this.d.setTextColor(y6.o1(0.75f, y6.w0(i10, u6Var)));
    }
}
