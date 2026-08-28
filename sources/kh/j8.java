package kh;

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
import org.telegram.ui.Components.q80;
public final class j8 extends FrameLayout {
    public final Paint f15476a;
    public final ImageView f15477b;
    public final ImageView f15478c;
    public final org.telegram.ui.Components.j6 d;
    public final org.telegram.ui.Components.j6 f15479e;
    public final ImageView f15480f;
    public final SpannableString h;
    public final SpannableString f15481n;

    public j8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f15476a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f15477b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, g7.e6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f15478c = imageView2;
        imageView2.setBackground(new h8(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, g7.e6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var;
        j6Var.setTextColor(-15033089);
        j6Var.setTextSize(AndroidUtilities.dp(14.21f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setEllipsizeByGradient(true);
        j6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(j6Var, g7.e6.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f15479e = j6Var2;
        j6Var2.setTextColor(-8355712);
        j6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(j6Var2, g7.e6.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = j6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        q80 q80Var = new q80(AndroidUtilities.dp(200.0f), j6Var);
        q80Var.f31862e = 0.8f;
        q80Var.a(org.telegram.ui.ActionBar.f6.l1(0.4f, textColor), org.telegram.ui.ActionBar.f6.l1(0.08f, textColor));
        spannableString.setSpan(q80Var, 0, spannableString.length(), 33);
        int textColor2 = j6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f15481n = spannableString2;
        q80 q80Var2 = new q80(AndroidUtilities.dp(140.0f), j6Var2);
        q80Var2.f31862e = 0.8f;
        q80Var2.a(org.telegram.ui.ActionBar.f6.l1(0.4f, textColor2), org.telegram.ui.ActionBar.f6.l1(0.08f, textColor2));
        spannableString2.setSpan(q80Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f15480f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.f6.f0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, g7.e6.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f15476a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
