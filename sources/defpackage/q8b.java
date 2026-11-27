package defpackage;

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
public final class q8b extends FrameLayout {
    public final Paint a;
    public final ImageView b;
    public final ImageView c;
    public final in d;
    public final in e;
    public final ImageView f;
    public final SpannableString h;
    public final SpannableString n;

    public q8b(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231130);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, tre.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setBackground(new lg2(hl.L(20.0f), hl.L(2.4f), -15033089));
        addView(imageView2, tre.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.d = inVar;
        inVar.setTextColor(-15033089);
        inVar.setTextSize(hl.L(14.21f));
        inVar.setTypeface(hl.o());
        inVar.setEllipsizeByGradient(true);
        hn drawable = inVar.getDrawable();
        Point point = hl.q;
        drawable.N = point.x;
        addView(inVar, tre.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        in inVar2 = new in(context, false, false, false);
        this.e = inVar2;
        inVar2.setTextColor(-8355712);
        inVar2.setTextSize(hl.L(14.21f));
        inVar2.setEllipsizeByGradient(true);
        inVar2.getDrawable().N = point.x;
        addView(inVar2, tre.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = inVar.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        ya6 ya6Var = new ya6(hl.L(200.0f), inVar);
        ya6Var.e = 0.8f;
        ya6Var.a(aob.p1(0.4f, textColor), aob.p1(0.08f, textColor));
        spannableString.setSpan(ya6Var, 0, spannableString.length(), 33);
        int textColor2 = inVar2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        ya6 ya6Var2 = new ya6(hl.L(140.0f), inVar2);
        ya6Var2.e = 0.8f;
        ya6Var2.a(aob.p1(0.4f, textColor2), aob.p1(0.08f, textColor2));
        spannableString2.setSpan(ya6Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231503);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(aob.f0(436207615, 1, hl.L(18.0f)));
        addView(imageView3, tre.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), hl.e1(), paint);
        canvas.drawRect(0.0f, getHeight() - hl.e1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
    }
}
