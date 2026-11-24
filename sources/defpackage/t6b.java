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
public final class t6b extends FrameLayout {
    public final Paint a;
    public final ImageView b;
    public final ImageView c;
    public final io d;
    public final io e;
    public final ImageView f;
    public final SpannableString h;
    public final SpannableString n;

    public t6b(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231131);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, qoe.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setBackground(new gh2(gm.L(20.0f), gm.L(2.4f), -15033089));
        addView(imageView2, qoe.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        io ioVar = new io(context, false, false, false);
        this.d = ioVar;
        ioVar.setTextColor(-15033089);
        ioVar.setTextSize(gm.L(14.21f));
        ioVar.setTypeface(gm.o());
        ioVar.setEllipsizeByGradient(true);
        ho drawable = ioVar.getDrawable();
        Point point = gm.q;
        drawable.N = point.x;
        addView(ioVar, qoe.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.e = ioVar2;
        ioVar2.setTextColor(-8355712);
        ioVar2.setTextSize(gm.L(14.21f));
        ioVar2.setEllipsizeByGradient(true);
        ioVar2.getDrawable().N = point.x;
        addView(ioVar2, qoe.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = ioVar.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        ta6 ta6Var = new ta6(gm.L(200.0f), ioVar);
        ta6Var.e = 0.8f;
        ta6Var.a(cmb.p1(0.4f, textColor), cmb.p1(0.08f, textColor));
        spannableString.setSpan(ta6Var, 0, spannableString.length(), 33);
        int textColor2 = ioVar2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.n = spannableString2;
        ta6 ta6Var2 = new ta6(gm.L(140.0f), ioVar2);
        ta6Var2.e = 0.8f;
        ta6Var2.a(cmb.p1(0.4f, textColor2), cmb.p1(0.08f, textColor2));
        spannableString2.setSpan(ta6Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231504);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(cmb.f0(436207615, 1, gm.L(18.0f)));
        addView(imageView3, qoe.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), gm.e1(), paint);
        canvas.drawRect(0.0f, getHeight() - gm.e1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
    }
}
