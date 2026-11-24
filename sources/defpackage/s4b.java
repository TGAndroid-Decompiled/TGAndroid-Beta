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
public final class s4b extends FrameLayout {
    public final Paint a;
    public final ImageView b;
    public final ImageView c;
    public final hn d;
    public final hn e;
    public final ImageView f;
    public final SpannableString h;
    public final SpannableString n;

    public s4b(Context context) {
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
        addView(imageView, nme.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setBackground(new tf2(gl.L(20.0f), gl.L(2.4f), -15033089));
        addView(imageView2, nme.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.d = hnVar;
        hnVar.setTextColor(-15033089);
        hnVar.setTextSize(gl.L(14.21f));
        hnVar.setTypeface(gl.o());
        hnVar.setEllipsizeByGradient(true);
        gn drawable = hnVar.getDrawable();
        Point point = gl.q;
        drawable.N = point.x;
        addView(hnVar, nme.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        hn hnVar2 = new hn(context, false, false, false);
        this.e = hnVar2;
        hnVar2.setTextColor(-8355712);
        hnVar2.setTextSize(gl.L(14.21f));
        hnVar2.setEllipsizeByGradient(true);
        hnVar2.getDrawable().N = point.x;
        addView(hnVar2, nme.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = hnVar.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        u86 u86Var = new u86(gl.L(200.0f), hnVar);
        u86Var.e = 0.8f;
        u86Var.a(bkb.p1(0.4f, textColor), bkb.p1(0.08f, textColor));
        spannableString.setSpan(u86Var, 0, spannableString.length(), 33);
        int textColor2 = hnVar2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        u86 u86Var2 = new u86(gl.L(140.0f), hnVar2);
        u86Var2.e = 0.8f;
        u86Var2.a(bkb.p1(0.4f, textColor2), bkb.p1(0.08f, textColor2));
        spannableString2.setSpan(u86Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231503);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(bkb.f0(436207615, 1, gl.L(18.0f)));
        addView(imageView3, nme.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), gl.e1(), paint);
        canvas.drawRect(0.0f, getHeight() - gl.e1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
    }
}
