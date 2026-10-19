package ei;

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
import org.telegram.ui.Components.ca0;
public final class i8 extends FrameLayout {
    public final Paint f9202a;
    public final ImageView f9203b;
    public final ImageView f9204c;
    public final org.telegram.ui.Components.q6 d;
    public final org.telegram.ui.Components.q6 e;
    public final ImageView f9205f;
    public final SpannableString h;
    public final SpannableString f9206n;

    public i8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9202a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f9203b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9204c = imageView2;
        imageView2.setBackground(new g8(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, w7.z5.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.d = q6Var;
        q6Var.setTextColor(-15033089);
        q6Var.setTextSize(AndroidUtilities.dp(14.21f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setEllipsizeByGradient(true);
        q6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(q6Var, w7.z5.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, false, false, false);
        this.e = q6Var2;
        q6Var2.setTextColor(-8355712);
        q6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        q6Var2.setEllipsizeByGradient(true);
        q6Var2.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(q6Var2, w7.z5.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = q6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        ca0 ca0Var = new ca0(AndroidUtilities.dp(200.0f), q6Var);
        ca0Var.e = 0.8f;
        ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.4f, textColor), org.telegram.ui.ActionBar.h6.m1(0.08f, textColor));
        spannableString.setSpan(ca0Var, 0, spannableString.length(), 33);
        int textColor2 = q6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f9206n = spannableString2;
        ca0 ca0Var2 = new ca0(AndroidUtilities.dp(140.0f), q6Var2);
        ca0Var2.e = 0.8f;
        ca0Var2.a(org.telegram.ui.ActionBar.h6.m1(0.4f, textColor2), org.telegram.ui.ActionBar.h6.m1(0.08f, textColor2));
        spannableString2.setSpan(ca0Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f9205f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, w7.z5.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f9202a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
