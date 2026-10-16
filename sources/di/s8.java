package di;

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
import org.telegram.ui.Components.ia0;
public final class s8 extends FrameLayout {
    public final Paint f7785a;
    public final ImageView f7786b;
    public final ImageView f7787c;
    public final org.telegram.ui.Components.s6 d;
    public final org.telegram.ui.Components.s6 e;
    public final ImageView f7788f;
    public final SpannableString h;
    public final SpannableString f7789n;

    public s8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f7785a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f7786b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.a(48.0f, 9.0f, 0.0f, 0.0f, 0.0f, 48, 19));
        ImageView imageView2 = new ImageView(context);
        this.f7787c = imageView2;
        imageView2.setBackground(new q8(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, w7.z5.a(48.0f, 9.0f, 0.0f, 0.0f, 0.0f, 48, 19));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
        this.d = s6Var;
        s6Var.setTextColor(-15033089);
        s6Var.setTextSize(AndroidUtilities.dp(14.21f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setEllipsizeByGradient(true);
        s6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(s6Var, w7.z5.a(24.0f, 57.0f, 2.33f, 48.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.e = s6Var2;
        s6Var2.setTextColor(-8355712);
        s6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        s6Var2.setEllipsizeByGradient(true);
        s6Var2.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(s6Var2, w7.z5.a(24.0f, 57.0f, 20.66f, 48.0f, 0.0f, -1, 55));
        int textColor = s6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        ia0 ia0Var = new ia0(AndroidUtilities.dp(200.0f), s6Var);
        ia0Var.e = 0.8f;
        ia0Var.a(org.telegram.ui.ActionBar.g6.m1(0.4f, textColor), org.telegram.ui.ActionBar.g6.m1(0.08f, textColor));
        spannableString.setSpan(ia0Var, 0, spannableString.length(), 33);
        int textColor2 = s6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f7789n = spannableString2;
        ia0 ia0Var2 = new ia0(AndroidUtilities.dp(140.0f), s6Var2);
        ia0Var2.e = 0.8f;
        ia0Var2.a(org.telegram.ui.ActionBar.g6.m1(0.4f, textColor2), org.telegram.ui.ActionBar.g6.m1(0.08f, textColor2));
        spannableString2.setSpan(ia0Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f7788f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, w7.z5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f7785a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
