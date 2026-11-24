package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class nq8 extends View {
    public static final int r = 0;
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final qt7 f;
    public boolean h;
    public final ProfileActivity n;

    public nq8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        qt7 adapter = profileActivity.o0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(gm.N(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(d53.j);
        ofFloat.addUpdateListener(new fx7(this, (byte) 18));
        ofFloat.addListener(new jf4((byte) 26, this, profileActivity.n1));
        profileActivity.o0.b(new xi2(this, (byte) 1));
        adapter.a.registerObserver(new n53(this, (byte) 2));
    }

    public final void a(boolean z) {
        a aVar;
        int i;
        a aVar2;
        ProfileActivity profileActivity = this.n;
        if (z) {
            mq8 mq8Var = profileActivity.N;
            mq8Var.K = mq8Var.M;
            mq8Var.L = mq8Var.N;
            mq8Var.O = 0.0f;
            mq8Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - gm.L(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (gm.N(16.0f) + measureText);
        aVar = ((d) profileActivity).actionBar;
        if (aVar != null) {
            aVar2 = ((d) profileActivity).actionBar;
            if (aVar2.getOccupyStatusBar()) {
                i = gm.m;
                float L = gm.L(15.0f) + i;
                rectF.top = L;
                rectF.bottom = L + gm.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i = 0;
        float L2 = gm.L(15.0f) + i;
        rectF.top = L2;
        rectF.bottom = L2 + gm.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f) {
        boolean z;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.q2 && profileActivity.o0.getRealCount() > 20) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.h) {
            this.h = z;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float S1 = gm.S1(animatedFraction, fArr);
            float f2 = 0.0f;
            if (f <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z) {
                valueAnimator.setDuration(((1.0f - S1) * 250.0f) / f);
            } else {
                valueAnimator.setDuration((250.0f * S1) / f);
            }
            fArr[0] = S1;
            if (z) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            valueAnimator.start();
        }
    }

    public final void c() {
        zo8 zo8Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.T0 != null && (zo8Var = profileActivity.o0) != null && profileActivity.q2) {
            int realPosition = zo8Var.getRealPosition();
            zja zjaVar = profileActivity.T0;
            if (realPosition == 0) {
                zjaVar.u(33);
                profileActivity.T0.S(36);
                return;
            }
            zjaVar.S(33);
            profileActivity.T0.u(36);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N = gm.N(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f.d(this.n.o0.getCurrentItem())).toString(), rectF.centerX(), gm.N(18.5f) + rectF.top, this.b);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        a(false);
    }
}
