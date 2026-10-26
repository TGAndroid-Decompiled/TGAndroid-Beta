package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class h extends FrameLayout {
    public final u6 f13001a;
    public final ImageView f13002b;
    public final FrameLayout.LayoutParams f13003c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f13004f;
    public final TextView h;

    public h(Context context, u6 u6Var) {
        super(context);
        this.f13001a = u6Var;
        ImageView imageView = new ImageView(context);
        this.f13002b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams h = gb1.h(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f13003c = h;
        addView(imageView, h);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams h10 = gb1.h(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = h10;
        addView(linearLayout, h10);
        TextView textView = new TextView(context);
        this.e = textView;
        vh.j(15.0f, 1, textView);
        f7.V(textView, y6.G6, u6Var);
        TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 55, 0, 0, 0, 0), context);
        this.f13004f = e;
        e.setTextSize(1, 14.0f);
        f7.V(e, y6.f23767z6, u6Var);
        linearLayout.addView(e, gb1.x(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        f7.t(imageView2, y6.M6, u6Var, mode);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int dp = AndroidUtilities.dp(4.0f);
        int i10 = y6.uj;
        ShapeDrawable c02 = y6.c0(dp, y6.w0(i10, u6Var));
        b7 N = f7.N(i10);
        textView2.setBackground(c02);
        f7.k(textView2, c02, N, null, u6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, gb1.h(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f13002b;
        imageView.setImageResource(i11);
        ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(9.0f), i10);
        int i12 = y6.uj;
        u6 u6Var = this.f13001a;
        if (i10 == y6.w0(i12, u6Var)) {
            f7.C(imageView, c02, f7.N(i12), u6Var);
        } else {
            imageView.setBackground(c02);
        }
        TextView textView = this.e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f13004f;
        FrameLayout.LayoutParams layoutParams = this.d;
        FrameLayout.LayoutParams layoutParams2 = this.f13003c;
        if (isEmpty) {
            layoutParams2.topMargin = AndroidUtilities.dp(10.0f);
            layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
            textView.setTypeface(null);
            textView.setTextSize(1, 16.0f);
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.gravity = 23;
            textView2.setVisibility(8);
            return;
        }
        layoutParams2.topMargin = AndroidUtilities.dp(14.33f);
        layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 15.0f);
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        layoutParams.bottomMargin = AndroidUtilities.dp(8.66f);
        layoutParams.gravity = 55;
        textView2.setText(charSequence2);
        textView2.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setPercent(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.h;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
