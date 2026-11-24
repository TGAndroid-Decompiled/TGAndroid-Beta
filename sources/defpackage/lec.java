package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
public final class lec extends View {
    public final Paint a;
    public final ho b;
    public boolean c;

    public lec(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(Integer.MIN_VALUE);
        ho hoVar = new ho(false, true, true);
        this.b = hoVar;
        hoVar.n(0.2f, 200L, d53.h);
        hoVar.w(gm.L(13.0f));
        hoVar.u(-1);
        hoVar.x(gm.o());
        hoVar.setCallback(this);
        hoVar.b = 1;
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (!TextUtils.equals(sb, hoVar.i)) {
            hoVar.a();
            hoVar.t(sb, false, true);
        }
    }

    public final void a(boolean z) {
        if (!this.c && z) {
            return;
        }
        this.c = false;
        animate().cancel();
        if (z) {
            wi8.t(animate().translationY(gm.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), d53.h, 220L);
            return;
        }
        setTranslationY(gm.L(6.0f));
        setScaleX(0.8f);
        setScaleY(0.8f);
        setAlpha(0.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ho hoVar = this.b;
        float c = hoVar.c();
        RectF rectF = gm.P;
        rectF.set(((getWidth() - c) / 2.0f) - gm.L(6.0f), gm.L(2.0f), ((getWidth() + c) / 2.0f) + gm.L(6.0f), gm.L(23.0f));
        canvas.drawRoundRect(rectF, gm.L(5.0f), gm.L(5.0f), this.a);
        hoVar.setBounds((int) rectF.left, ((int) rectF.top) - gm.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        hoVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
