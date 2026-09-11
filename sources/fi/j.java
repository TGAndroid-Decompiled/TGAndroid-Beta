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
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.x5;
public final class j extends FrameLayout {
    public final ImageView f9726a;
    public final FrameLayout.LayoutParams f9727b;
    public final FrameLayout.LayoutParams f9728c;
    public final TextView d;
    public final TextView f9729e;
    public final TextView f9730f;

    public j(Context context, f6 f6Var) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f9726a = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = x5.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f9727b = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d10 = x5.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.f9728c = d10;
        addView(linearLayout, d10);
        TextView textView = new TextView(context);
        this.d = textView;
        vl.j(15.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f9729e = h;
        h.setTextSize(1, 14.0f);
        h.setTextColor(j6.v0(j6.f21061z6, f6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.M6, f6Var), mode));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9730f = textView2;
        textView2.setTextColor(-1);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(4.0f), j6.v0(j6.uj, f6Var)));
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, x5.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f9726a;
        imageView.setImageResource(i11);
        imageView.setBackground(j6.b0(AndroidUtilities.dp(9.0f), i10));
        TextView textView = this.d;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f9729e;
        FrameLayout.LayoutParams layoutParams = this.f9728c;
        FrameLayout.LayoutParams layoutParams2 = this.f9727b;
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
        TextView textView = this.f9730f;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
