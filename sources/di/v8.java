package di;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
public final class v8 extends View {
    public int f9870a;
    public int f9871b;
    public final Matrix f9872c;
    public final Paint[] d;
    public final org.telegram.ui.Components.w5 f9873e;
    public boolean f9874f;
    public int h;
    public final Drawable[] f9875n;
    public final float[] f9876r;
    public boolean f9877s;
    public final Paint f9878w;
    public final Path f9879x;
    public final ic f9880y;

    public v8(Context context) {
        super(context);
        this.f9872c = new Matrix();
        this.d = r0;
        this.f9873e = new org.telegram.ui.Components.w5(this, 0L, 260L, xq.h);
        this.f9875n = new Drawable[2];
        this.f9876r = new float[2];
        Paint paint = new Paint(1);
        this.f9878w = paint;
        this.f9879x = new Path();
        this.f9880y = new ic(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z9, y6 y6Var, boolean z10) {
        fi.q8 q8Var;
        this.f9877s = z9;
        this.f9874f = true;
        int i7 = 0;
        if (y6Var != null && (q8Var = y6Var.f9960c.E0) != null) {
            int i10 = q8Var.f12678a;
            org.telegram.ui.Components.w5 w5Var = this.f9873e;
            if (i10 == 1) {
                c(15.0f, 2131232386);
                d(-7808710, -13781445);
                w5Var.f(z10, !z10);
            } else if (i10 == 2) {
                c(17.33f, 2131232162);
                d(-3905294, -6923014);
                w5Var.f(z10, !z10);
            } else if (i10 == 3) {
                c(17.33f, 2131232160);
                d(-18621, -618956);
                w5Var.f(z10, !z10);
            } else if (z9) {
                c(17.33f, 2131232159);
                d(-15292942, -15630089);
                w5Var.f(z10, !z10);
            } else {
                this.f9874f = false;
            }
        } else {
            this.f9874f = false;
        }
        if (!this.f9874f) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
    }

    public final void b(boolean z9, TL_stories.StoryItem storyItem, boolean z10) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f9877s = z9;
        this.f9874f = true;
        int i7 = 0;
        if (storyItem == null) {
            this.f9874f = false;
        } else {
            boolean z11 = storyItem.close_friends;
            org.telegram.ui.Components.w5 w5Var = this.f9873e;
            if (z11) {
                c(15.0f, 2131232386);
                d(-7808710, -13781445);
                w5Var.f(z10, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232162);
                d(-3905294, -6923014);
                w5Var.f(z10, true);
            } else if (!storyItem.selected_contacts && (!z9 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z9) {
                    c(17.33f, 2131232159);
                    d(-15292942, -15630089);
                    w5Var.f(z10, true);
                } else {
                    this.f9874f = false;
                }
            } else {
                c(17.33f, 2131232160);
                d(-18621, -618956);
                w5Var.f(z10, true);
            }
        }
        if (!this.f9874f) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
    }

    public final void c(float f10, int i7) {
        if (i7 == 2131232386) {
            setContentDescription(id.M0(2131744532, null));
        } else if (i7 == 2131232162) {
            setContentDescription(id.M0(2131744530, null));
        } else if (i7 == 2131232160) {
            setContentDescription(id.M0(2131744520, null));
        } else if (i7 == 2131232159) {
            setContentDescription(id.M0(2131744528, null));
        }
        Drawable[] drawableArr = this.f9875n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f9876r;
        fArr[1] = fArr[0];
        if (drawable != null && i7 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i7;
        drawableArr[0] = resources.getDrawable(i7).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = org.telegram.messenger.g0.N(f10);
        invalidate();
    }

    public final void d(int i7, int i10) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f9870a == i7 && this.f9871b == i10) {
            return;
        }
        this.f9870a = i7;
        this.f9871b = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(23.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f9872c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.g0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int L;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f9877s) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(14.0f);
        }
        return width + L;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N;
        float N2;
        float f10;
        char c10;
        float f11;
        float centerX;
        float centerX2;
        if (!this.f9874f) {
            return;
        }
        if (this.f9877s) {
            N = 0.0f;
        } else {
            N = org.telegram.messenger.g0.N(7.0f);
        }
        if (this.f9877s) {
            N2 = org.telegram.messenger.g0.N(43.0f);
        } else {
            N2 = org.telegram.messenger.g0.N(23.66f);
        }
        float N3 = org.telegram.messenger.g0.N(23.66f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(com.google.android.recaptcha.internal.a.A(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.k5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a10 = this.f9880y.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float e10 = this.f9873e.e(false, 0.0f);
        int i7 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i7 > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[1]);
        }
        if (e10 < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - e10) * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[0]);
        }
        float abs = Math.abs(e10 - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f9875n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f9876r;
        if (drawable != null && e10 > 0.5f) {
            if (this.f9877s) {
                centerX2 = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f12 = (fArr[1] / 2.0f) * abs;
            f10 = 0.5f;
            c10 = 0;
            f11 = 12.0f;
            drawableArr[1].setBounds((int) org.telegram.messenger.camera.q.v(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f12), (int) (f12 + centerX2), (int) com.google.android.recaptcha.internal.a.c(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 0.5f;
            c10 = 0;
            f11 = 12.0f;
        }
        if (drawableArr[c10] != null && e10 <= f10) {
            if (this.f9877s) {
                centerX = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f13 = (fArr[c10] / 2.0f) * abs;
            drawableArr[c10].setBounds((int) org.telegram.messenger.camera.q.v(fArr[c10], 2.0f, abs, centerX), (int) (centerY2 - f13), (int) (f13 + centerX), (int) com.google.android.recaptcha.internal.a.c(fArr[c10], 2.0f, abs, rectF.centerY()));
            drawableArr[c10].draw(canvas);
        }
        if (this.f9877s) {
            Path path = this.f9879x;
            path.rewind();
            path.moveTo(rectF.right - org.telegram.messenger.g0.N(15.66f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(8.16f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            float N4 = org.telegram.messenger.g0.N(1.33f);
            Paint paint = this.f9878w;
            paint.setStrokeWidth(N4);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        this.f9880y.c(z9);
    }
}
