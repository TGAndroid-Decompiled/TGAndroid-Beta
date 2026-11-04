package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.ui.Components.x70;
public final class l7 extends FrameLayout {
    public final Paint f13119a;
    public final ImageView f13120b;
    public final ImageView f13121c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 f13122e;
    public final ImageView f13123f;
    public final SpannableString h;
    public final SpannableString f13124n;

    public l7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f13119a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f13120b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231128);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, mf.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f13121c = imageView2;
        imageView2.setBackground(new j7(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(2.4f), -15033089));
        addView(imageView2, mf.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.d = h6Var;
        h6Var.setTextColor(-15033089);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.21f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.g6 drawable = h6Var.getDrawable();
        Point point = org.telegram.messenger.g0.f22608q;
        drawable.M = point.x;
        addView(h6Var, mf.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f13122e = h6Var2;
        h6Var2.setTextColor(-8355712);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.21f));
        h6Var2.setEllipsizeByGradient(true);
        h6Var2.getDrawable().M = point.x;
        addView(h6Var2, mf.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = h6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        x70 x70Var = new x70(org.telegram.messenger.g0.L(200.0f), h6Var);
        x70Var.f40262e = 0.8f;
        x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.4f, textColor), org.telegram.ui.ActionBar.k6.r1(0.08f, textColor));
        spannableString.setSpan(x70Var, 0, spannableString.length(), 33);
        int textColor2 = h6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f13124n = spannableString2;
        x70 x70Var2 = new x70(org.telegram.messenger.g0.L(140.0f), h6Var2);
        x70Var2.f40262e = 0.8f;
        x70Var2.a(org.telegram.ui.ActionBar.k6.r1(0.4f, textColor2), org.telegram.ui.ActionBar.k6.r1(0.08f, textColor2));
        spannableString2.setSpan(x70Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f13123f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231500);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.h0(436207615, 1, org.telegram.messenger.g0.L(18.0f)));
        addView(imageView3, mf.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f13119a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f1(), paint);
        canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
