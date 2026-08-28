package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class i extends FrameLayout {
    public final ImageView f17889a;
    public final FrameLayout.LayoutParams f17890b;
    public final FrameLayout.LayoutParams f17891c;
    public final TextView d;
    public final TextView f17892e;
    public final TextView f17893f;

    public i(Context context, b6 b6Var) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f17889a = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = e6.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f17890b = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d9 = e6.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.f17891c = d9;
        addView(linearLayout, d9);
        TextView textView = new TextView(context);
        this.d = textView;
        ll.k(15.0f, 1, textView);
        textView.setTextColor(f6.v0(f6.G6, b6Var));
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f17892e = h;
        h.setTextSize(1, 14.0f);
        h.setTextColor(f6.v0(f6.f23386z6, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.M6, b6Var), mode));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, e6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f17893f = textView2;
        textView2.setTextColor(-1);
        textView2.setBackground(f6.b0(AndroidUtilities.dp(4.0f), f6.v0(f6.uj, b6Var)));
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, e6.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i9, int i10, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f17889a;
        imageView.setImageResource(i10);
        imageView.setBackground(f6.b0(AndroidUtilities.dp(9.0f), i9));
        TextView textView = this.d;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f17892e;
        FrameLayout.LayoutParams layoutParams = this.f17891c;
        FrameLayout.LayoutParams layoutParams2 = this.f17890b;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setPercent(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f17893f;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
