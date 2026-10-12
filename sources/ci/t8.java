package ci;

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
import org.telegram.ui.Components.na0;
public final class t8 extends FrameLayout {
    public final Paint f6019a;
    public final ImageView f6020b;
    public final ImageView f6021c;
    public final org.telegram.ui.Components.r6 d;
    public final org.telegram.ui.Components.r6 f6022e;
    public final ImageView f6023f;
    public final SpannableString h;
    public final SpannableString f6024n;

    public t8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f6019a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f6020b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.w5.a(48.0f, 9.0f, 0.0f, 0.0f, 0.0f, 48, 19));
        ImageView imageView2 = new ImageView(context);
        this.f6021c = imageView2;
        imageView2.setBackground(new r8(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, w7.w5.a(48.0f, 9.0f, 0.0f, 0.0f, 0.0f, 48, 19));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, false, false);
        this.d = r6Var;
        r6Var.setTextColor(-15033089);
        r6Var.setTextSize(AndroidUtilities.dp(14.21f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setEllipsizeByGradient(true);
        r6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(r6Var, w7.w5.a(24.0f, 57.0f, 2.33f, 48.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, false, false);
        this.f6022e = r6Var2;
        r6Var2.setTextColor(-8355712);
        r6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        r6Var2.setEllipsizeByGradient(true);
        r6Var2.getDrawable().M = AndroidUtilities.displaySize.x;
        addView(r6Var2, w7.w5.a(24.0f, 57.0f, 20.66f, 48.0f, 0.0f, -1, 55));
        int textColor = r6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        na0 na0Var = new na0(AndroidUtilities.dp(200.0f), r6Var);
        na0Var.f28757e = 0.8f;
        na0Var.a(org.telegram.ui.ActionBar.h6.m1(0.4f, textColor), org.telegram.ui.ActionBar.h6.m1(0.08f, textColor));
        spannableString.setSpan(na0Var, 0, spannableString.length(), 33);
        int textColor2 = r6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f6024n = spannableString2;
        na0 na0Var2 = new na0(AndroidUtilities.dp(140.0f), r6Var2);
        na0Var2.f28757e = 0.8f;
        na0Var2.a(org.telegram.ui.ActionBar.h6.m1(0.4f, textColor2), org.telegram.ui.ActionBar.h6.m1(0.08f, textColor2));
        spannableString2.setSpan(na0Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f6023f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, w7.w5.a(48.0f, 0.0f, 0.0f, 4.0f, 0.0f, 48, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f6019a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
