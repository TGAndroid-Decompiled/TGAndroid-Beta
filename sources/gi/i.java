package gi;

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
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class i extends FrameLayout {
    public final g6 f11268a;
    public final ImageView f11269b;
    public final FrameLayout.LayoutParams f11270c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f11271f;
    public final TextView h;

    public i(Context context, g6 g6Var) {
        super(context);
        this.f11268a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f11269b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = z5.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f11270c = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d10 = z5.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = d10;
        addView(linearLayout, d10);
        TextView textView = new TextView(context);
        this.e = textView;
        tl.k(15.0f, 1, textView);
        r6.W(textView, k6.G6, g6Var);
        TextView f7 = tl.f(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f11271f = f7;
        f7.setTextSize(1, 14.0f);
        r6.W(f7, k6.f21589z6, g6Var);
        linearLayout.addView(f7, z5.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        r6.t(imageView2, k6.M6, g6Var, mode);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int dp = AndroidUtilities.dp(4.0f);
        int i10 = k6.uj;
        ShapeDrawable c02 = k6.c0(dp, k6.w0(i10, g6Var));
        n6 O = r6.O(i10);
        textView2.setBackground(c02);
        r6.k(textView2, c02, O, null, g6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, z5.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f11269b;
        imageView.setImageResource(i11);
        ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(9.0f), i10);
        int i12 = k6.uj;
        g6 g6Var = this.f11268a;
        if (i10 == k6.w0(i12, g6Var)) {
            r6.D(imageView, c02, r6.O(i12), g6Var);
        } else {
            imageView.setBackground(c02);
        }
        TextView textView = this.e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f11271f;
        FrameLayout.LayoutParams layoutParams = this.d;
        FrameLayout.LayoutParams layoutParams2 = this.f11270c;
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
