package lh;

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
import org.telegram.ui.Components.u80;

public final class i8 extends FrameLayout {

    public final Paint f16128a;

    public final ImageView f16129b;

    public final ImageView f16130c;
    public final org.telegram.ui.Components.j6 d;

    public final org.telegram.ui.Components.j6 f16131e;

    public final ImageView f16132f;
    public final SpannableString h;

    public final SpannableString f16133n;

    public i8(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f16128a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f16129b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, h7.z5.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f16130c = imageView2;
        imageView2.setBackground(new g8(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, h7.z5.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var;
        j6Var.setTextColor(-15033089);
        j6Var.setTextSize(AndroidUtilities.dp(14.21f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setEllipsizeByGradient(true);
        j6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(j6Var, h7.z5.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f16131e = j6Var2;
        j6Var2.setTextColor(-8355712);
        j6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(j6Var2, h7.z5.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = j6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        u80 u80Var = new u80(AndroidUtilities.dp(200.0f), j6Var);
        u80Var.f33016e = 0.8f;
        u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.4f, textColor), org.telegram.ui.ActionBar.g6.l1(0.08f, textColor));
        spannableString.setSpan(u80Var, 0, spannableString.length(), 33);
        int textColor2 = j6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f16133n = spannableString2;
        u80 u80Var2 = new u80(AndroidUtilities.dp(140.0f), j6Var2);
        u80Var2.f33016e = 0.8f;
        u80Var2.a(org.telegram.ui.ActionBar.g6.l1(0.4f, textColor2), org.telegram.ui.ActionBar.g6.l1(0.08f, textColor2));
        spannableString2.setSpan(u80Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f16132f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, h7.z5.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth();
        float shadowHeight = AndroidUtilities.getShadowHeight();
        Paint paint = this.f16128a;
        canvas.drawRect(0.0f, 0.0f, width, shadowHeight, paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
