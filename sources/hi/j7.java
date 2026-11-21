package hi;

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
import org.telegram.ui.Components.r80;
public final class j7 extends FrameLayout {
    public final Paint f14830a;
    public final ImageView f14831b;
    public final ImageView f14832c;
    public final org.telegram.ui.Components.o6 d;
    public final org.telegram.ui.Components.o6 f14833e;
    public final ImageView f14834f;
    public final SpannableString h;
    public final SpannableString f14835n;

    public j7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f14830a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f14831b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231128);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, c8.ma.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f14832c = imageView2;
        imageView2.setBackground(new h7(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(2.4f), -15033089));
        addView(imageView2, c8.ma.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.d = o6Var;
        o6Var.setTextColor(-15033089);
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.21f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.n6 drawable = o6Var.getDrawable();
        Point point = org.telegram.messenger.g0.f24146q;
        drawable.N = point.x;
        addView(o6Var, c8.ma.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f14833e = o6Var2;
        o6Var2.setTextColor(-8355712);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.21f));
        o6Var2.setEllipsizeByGradient(true);
        o6Var2.getDrawable().N = point.x;
        addView(o6Var2, c8.ma.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = o6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        r80 r80Var = new r80(org.telegram.messenger.g0.L(200.0f), o6Var);
        r80Var.f39108e = 0.8f;
        r80Var.a(org.telegram.ui.ActionBar.m6.r1(0.4f, textColor), org.telegram.ui.ActionBar.m6.r1(0.08f, textColor));
        spannableString.setSpan(r80Var, 0, spannableString.length(), 33);
        int textColor2 = o6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f14835n = spannableString2;
        r80 r80Var2 = new r80(org.telegram.messenger.g0.L(140.0f), o6Var2);
        r80Var2.f39108e = 0.8f;
        r80Var2.a(org.telegram.ui.ActionBar.m6.r1(0.4f, textColor2), org.telegram.ui.ActionBar.m6.r1(0.08f, textColor2));
        spannableString2.setSpan(r80Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f14834f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231500);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.m6.h0(436207615, 1, org.telegram.messenger.g0.L(18.0f)));
        addView(imageView3, c8.ma.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f14830a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.f1(), paint);
        canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.f1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }
}
