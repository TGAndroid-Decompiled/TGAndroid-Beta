package fi;

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
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;
public final class k8 extends View {
    public int f12232a;
    public int f12233b;
    public final Matrix f12234c;
    public final Paint[] d;
    public final org.telegram.ui.Components.d6 f12235e;
    public boolean f12236f;
    public int h;
    public final Drawable[] f12237n;
    public final float[] f12238r;
    public boolean f12239s;
    public final Paint f12240w;
    public final Path f12241x;
    public final mc f12242y;

    public k8(Context context) {
        super(context);
        this.f12234c = new Matrix();
        this.d = r0;
        this.f12235e = new org.telegram.ui.Components.d6(this, 0L, 260L, nr.h);
        this.f12237n = new Drawable[2];
        this.f12238r = new float[2];
        Paint paint = new Paint(1);
        this.f12240w = paint;
        this.f12241x = new Path();
        this.f12242y = new mc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, o6 o6Var, boolean z11) {
        hi.n8 n8Var;
        this.f12239s = z10;
        this.f12236f = true;
        int i7 = 0;
        if (o6Var != null && (n8Var = o6Var.f12375c.E0) != null) {
            int i10 = n8Var.f15128a;
            org.telegram.ui.Components.d6 d6Var = this.f12235e;
            if (i10 == 1) {
                c(15.0f, 2131232388);
                d(-7808710, -13781445);
                d6Var.f(z11, !z11);
            } else if (i10 == 2) {
                c(17.33f, 2131232164);
                d(-3905294, -6923014);
                d6Var.f(z11, !z11);
            } else if (i10 == 3) {
                c(17.33f, 2131232162);
                d(-18621, -618956);
                d6Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, 2131232161);
                d(-15292942, -15630089);
                d6Var.f(z11, !z11);
            } else {
                this.f12236f = false;
            }
        } else {
            this.f12236f = false;
        }
        if (!this.f12236f) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
    }

    public final void b(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f12239s = z10;
        this.f12236f = true;
        int i7 = 0;
        if (storyItem == null) {
            this.f12236f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.d6 d6Var = this.f12235e;
            if (z12) {
                c(15.0f, 2131232388);
                d(-7808710, -13781445);
                d6Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232164);
                d(-3905294, -6923014);
                d6Var.f(z11, true);
            } else if (!storyItem.selected_contacts && (!z10 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z10) {
                    c(17.33f, 2131232161);
                    d(-15292942, -15630089);
                    d6Var.f(z11, true);
                } else {
                    this.f12236f = false;
                }
            } else {
                c(17.33f, 2131232162);
                d(-18621, -618956);
                d6Var.f(z11, true);
            }
        }
        if (!this.f12236f) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
    }

    public final void c(float f10, int i7) {
        if (i7 == 2131232388) {
            setContentDescription(hd.N0(2131744289, null));
        } else if (i7 == 2131232164) {
            setContentDescription(hd.N0(2131744287, null));
        } else if (i7 == 2131232162) {
            setContentDescription(hd.N0(2131744277, null));
        } else if (i7 == 2131232161) {
            setContentDescription(hd.N0(2131744285, null));
        }
        Drawable[] drawableArr = this.f12237n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f12238r;
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
        if (this.f12232a == i7 && this.f12233b == i10) {
            return;
        }
        this.f12232a = i7;
        this.f12233b = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(23.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f12234c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.g0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int L;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f12239s) {
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
        if (!this.f12236f) {
            return;
        }
        if (this.f12239s) {
            N = 0.0f;
        } else {
            N = org.telegram.messenger.g0.N(7.0f);
        }
        if (this.f12239s) {
            N2 = org.telegram.messenger.g0.N(43.0f);
        } else {
            N2 = org.telegram.messenger.g0.N(23.66f);
        }
        float N3 = org.telegram.messenger.g0.N(23.66f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(com.google.android.gms.internal.vision.e2.A(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.f3.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a10 = this.f12242y.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float e10 = this.f12235e.e(false, 0.0f);
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
        Drawable[] drawableArr = this.f12237n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f12238r;
        if (drawable != null && e10 > 0.5f) {
            if (this.f12239s) {
                centerX2 = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f12 = (fArr[1] / 2.0f) * abs;
            f10 = 0.5f;
            c10 = 0;
            f11 = 12.0f;
            drawableArr[1].setBounds((int) o10.w(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f12), (int) (f12 + centerX2), (int) com.google.android.gms.internal.vision.e2.c(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 0.5f;
            c10 = 0;
            f11 = 12.0f;
        }
        if (drawableArr[c10] != null && e10 <= f10) {
            if (this.f12239s) {
                centerX = org.telegram.messenger.g0.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f13 = (fArr[c10] / 2.0f) * abs;
            drawableArr[c10].setBounds((int) o10.w(fArr[c10], 2.0f, abs, centerX), (int) (centerY2 - f13), (int) (f13 + centerX), (int) com.google.android.gms.internal.vision.e2.c(fArr[c10], 2.0f, abs, rectF.centerY()));
            drawableArr[c10].draw(canvas);
        }
        if (this.f12239s) {
            Path path = this.f12241x;
            path.rewind();
            path.moveTo(rectF.right - org.telegram.messenger.g0.N(15.66f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - org.telegram.messenger.g0.N(8.16f), rectF.centerY() - org.telegram.messenger.g0.N(1.33f));
            float N4 = org.telegram.messenger.g0.N(1.33f);
            Paint paint = this.f12240w;
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
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f12242y.c(z10);
    }
}
