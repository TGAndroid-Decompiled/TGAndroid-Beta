package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
public final class igc extends View {
    public final Paint a;
    public final hn b;
    public boolean c;

    public igc(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(Integer.MIN_VALUE);
        hn hnVar = new hn(false, true, true);
        this.b = hnVar;
        hnVar.n(0.2f, 200L, k43.h);
        hnVar.w(hl.L(13.0f));
        hnVar.u(-1);
        hnVar.x(hl.o());
        hnVar.setCallback(this);
        hnVar.b = 1;
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (!TextUtils.equals(sb, hnVar.i)) {
            hnVar.a();
            hnVar.t(sb, false, true);
        }
    }

    public final void a(boolean z) {
        if (!this.c && z) {
            return;
        }
        this.c = false;
        animate().cancel();
        if (z) {
            ik8.t(animate().translationY(hl.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), k43.h, 220L);
            return;
        }
        setTranslationY(hl.L(6.0f));
        setScaleX(0.8f);
        setScaleY(0.8f);
        setAlpha(0.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hn hnVar = this.b;
        float c = hnVar.c();
        RectF rectF = hl.P;
        rectF.set(((getWidth() - c) / 2.0f) - hl.L(6.0f), hl.L(2.0f), ((getWidth() + c) / 2.0f) + hl.L(6.0f), hl.L(23.0f));
        canvas.drawRoundRect(rectF, hl.L(5.0f), hl.L(5.0f), this.a);
        hnVar.setBounds((int) rectF.left, ((int) rectF.top) - hl.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        hnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
