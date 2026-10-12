package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.a6;
public final class i extends FrameLayout {
    public final ImageView f9311a;
    public final FrameLayout.LayoutParams f9312b;
    public final FrameLayout.LayoutParams f9313c;
    public final TextView d;
    public final TextView e;
    public final TextView f9314f;

    public i(Context context, c6 c6Var) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f9311a = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams a2 = a6.a(28.0f, 17.0f, 14.33f, 0.0f, 0.0f, 28, 51);
        this.f9312b = a2;
        addView(imageView, a2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams a10 = a6.a(-2.0f, 62.0f, 10.0f, 40.0f, 8.66f, -1, 55);
        this.f9313c = a10;
        addView(linearLayout, a10);
        TextView textView = new TextView(context);
        this.d = textView;
        yh.k(15.0f, 1, textView);
        textView.setTextColor(g6.w0(g6.G6, c6Var));
        TextView i10 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, a6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.e = i10;
        i10.setTextSize(1, 14.0f);
        i10.setTextColor(g6.w0(g6.f20305z6, c6Var));
        linearLayout.addView(i10, a6.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.M6, c6Var), mode));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, a6.a(24.0f, 0.0f, 0.0f, 10.0f, 0.0f, 24, 21));
        TextView textView2 = new TextView(context);
        this.f9314f = textView2;
        textView2.setTextColor(-1);
        textView2.setBackground(g6.c0(AndroidUtilities.dp(4.0f), g6.w0(g6.uj, c6Var)));
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, a6.a(18.0f, 0.0f, 0.0f, 35.33f, 0.0f, -2, 21));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f9311a;
        imageView.setImageResource(i11);
        imageView.setBackground(g6.c0(AndroidUtilities.dp(9.0f), i10));
        TextView textView = this.d;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.e;
        FrameLayout.LayoutParams layoutParams = this.f9313c;
        FrameLayout.LayoutParams layoutParams2 = this.f9312b;
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
        TextView textView = this.f9314f;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
