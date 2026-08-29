package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d90;
public final class x7 extends FrameLayout {
    public final Paint f18833a;
    public final ImageView f18834b;
    public final ImageView f18835c;
    public final org.telegram.ui.Components.o6 d;
    public final org.telegram.ui.Components.o6 f18836e;
    public final ImageView f18837f;
    public final SpannableString h;
    public final SpannableString f18838n;

    public x7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f18833a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f18834b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, i7.f6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f18835c = imageView2;
        imageView2.setBackground(new v7(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, i7.f6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.d = o6Var;
        o6Var.setTextColor(-15033089);
        o6Var.setTextSize(AndroidUtilities.dp(14.21f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setEllipsizeByGradient(true);
        o6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(o6Var, i7.f6.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f18836e = o6Var2;
        o6Var2.setTextColor(-8355712);
        o6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        o6Var2.setEllipsizeByGradient(true);
        o6Var2.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(o6Var2, i7.f6.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = o6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        d90 d90Var = new d90(AndroidUtilities.dp(200.0f), o6Var);
        d90Var.f27720e = 0.8f;
        d90Var.a(org.telegram.ui.ActionBar.g6.l1(0.4f, textColor), org.telegram.ui.ActionBar.g6.l1(0.08f, textColor));
        spannableString.setSpan(d90Var, 0, spannableString.length(), 33);
        int textColor2 = o6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f18838n = spannableString2;
        d90 d90Var2 = new d90(AndroidUtilities.dp(140.0f), o6Var2);
        d90Var2.f27720e = 0.8f;
        d90Var2.a(org.telegram.ui.ActionBar.g6.l1(0.4f, textColor2), org.telegram.ui.ActionBar.g6.l1(0.08f, textColor2));
        spannableString2.setSpan(d90Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f18837f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, i7.f6.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f18833a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
