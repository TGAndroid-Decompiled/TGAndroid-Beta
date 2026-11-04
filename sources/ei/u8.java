package ei;

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
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xq;
public final class u8 extends View {
    public int f11093a;
    public int f11094b;
    public final Matrix f11095c;
    public final Paint[] d;
    public final org.telegram.ui.Components.u5 f11096e;
    public boolean f11097f;
    public int h;
    public final Drawable[] f11098n;
    public final float[] f11099r;
    public boolean f11100s;
    public final Paint f11101w;
    public final Path f11102x;
    public final gc f11103y;

    public u8(Context context) {
        super(context);
        this.f11095c = new Matrix();
        this.d = r0;
        this.f11096e = new org.telegram.ui.Components.u5(this, 0L, 260L, xq.h);
        this.f11098n = new Drawable[2];
        this.f11099r = new float[2];
        Paint paint = new Paint(1);
        this.f11101w = paint;
        this.f11102x = new Path();
        this.f11103y = new gc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, y6 y6Var, boolean z11) {
        gi.r8 r8Var;
        this.f11100s = z10;
        this.f11097f = true;
        int i3 = 0;
        if (y6Var != null && (r8Var = y6Var.f11236c.E0) != null) {
            int i10 = r8Var.f13526a;
            org.telegram.ui.Components.u5 u5Var = this.f11096e;
            if (i10 == 1) {
                c(15.0f, 2131232386);
                d(-7808710, -13781445);
                u5Var.f(z11, !z11);
            } else if (i10 == 2) {
                c(17.33f, 2131232162);
                d(-3905294, -6923014);
                u5Var.f(z11, !z11);
            } else if (i10 == 3) {
                c(17.33f, 2131232160);
                d(-18621, -618956);
                u5Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, 2131232159);
                d(-15292942, -15630089);
                u5Var.f(z11, !z11);
            } else {
                this.f11097f = false;
            }
        } else {
            this.f11097f = false;
        }
        if (!this.f11097f) {
            i3 = 8;
        }
        setVisibility(i3);
        invalidate();
    }

    public final void b(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f11100s = z10;
        this.f11097f = true;
        int i3 = 0;
        if (storyItem == null) {
            this.f11097f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.u5 u5Var = this.f11096e;
            if (z12) {
                c(15.0f, 2131232386);
                d(-7808710, -13781445);
                u5Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232162);
                d(-3905294, -6923014);
                u5Var.f(z11, true);
            } else if (!storyItem.selected_contacts && (!z10 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z10) {
                    c(17.33f, 2131232159);
                    d(-15292942, -15630089);
                    u5Var.f(z11, true);
                } else {
                    this.f11097f = false;
                }
            } else {
                c(17.33f, 2131232160);
                d(-18621, -618956);
                u5Var.f(z11, true);
            }
        }
        if (!this.f11097f) {
            i3 = 8;
        }
        setVisibility(i3);
        invalidate();
    }

    public final void c(float f10, int i3) {
        if (i3 == 2131232386) {
            setContentDescription(bd.M0(2131744542, null));
        } else if (i3 == 2131232162) {
            setContentDescription(bd.M0(2131744540, null));
        } else if (i3 == 2131232160) {
            setContentDescription(bd.M0(2131744530, null));
        } else if (i3 == 2131232159) {
            setContentDescription(bd.M0(2131744538, null));
        }
        Drawable[] drawableArr = this.f11098n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f11099r;
        fArr[1] = fArr[0];
        if (drawable != null && i3 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i3;
        drawableArr[0] = resources.getDrawable(i3).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = org.telegram.messenger.g0.N(f10);
        invalidate();
    }

    public final void d(int i3, int i10) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f11093a == i3 && this.f11094b == i10) {
            return;
        }
        this.f11093a = i3;
        this.f11094b = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(23.0f), new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f11095c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.g0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int L;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f11100s) {
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
        char c2;
        float f11;
        float centerX;
        float centerX2;
        if (!this.f11097f) {
            return;
        }
        if (this.f11100s) {
            N = 0.0f;
        } else {
            N = org.telegram.messenger.g0.N(7.0f);
        }
        if (this.f11100s) {
            N2 = org.telegram.messenger.g0.N(43.0f);
        } else {
            N2 = org.telegram.messenger.g0.N(23.66f);
        }
        float N3 = org.telegram.messenger.g0.N(23.66f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(com.google.android.recaptcha.internal.a.z(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.k5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a10 = this.f11103y.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float e10 = this.f11096e.e(false, 0.0f);
        int i3 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i3 > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[1]);
        }
        if (e10 < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - e10) * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paintArr[0]);
        }
        float abs = Math.abs(e10 - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f11098n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f11099r;
        if (drawable != null && e10 > 0.5f) {
            if (this.f11100s) {
                centerX2 = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f12 = (fArr[1] / 2.0f) * abs;
            f10 = 0.5f;
            c2 = 0;
            f11 = 12.0f;
            drawableArr[1].setBounds((int) org.telegram.messenger.camera.q.v(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f12), (int) (f12 + centerX2), (int) a1.g.A(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 0.5f;
            c2 = 0;
            f11 = 12.0f;
        }
        if (drawableArr[c2] != null && e10 <= f10) {
            if (this.f11100s) {
                centerX = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f13 = (fArr[c2] / 2.0f) * abs;
            drawableArr[c2].setBounds((int) org.telegram.messenger.camera.q.v(fArr[c2], 2.0f, abs, centerX), (int) (centerY2 - f13), (int) (f13 + centerX), (int) a1.g.A(fArr[c2], 2.0f, abs, rectF.centerY()));
            drawableArr[c2].draw(canvas);
        }
        if (this.f11100s) {
            Path path = this.f11102x;
            path.rewind();
            path.moveTo(rectF.right - org.telegram.messenger.g0.N(15.66f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(8.16f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            float N4 = org.telegram.messenger.g0.N(1.33f);
            Paint paint = this.f11101w;
            paint.setStrokeWidth(N4);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f11103y.c(z10);
    }
}
