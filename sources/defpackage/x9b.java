package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class x9b extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final mm e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final v41 y;

    public x9b(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = r0;
        this.e = new mm(this, 0L, 260L, k43.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new v41(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z, b6b b6bVar, boolean z2) {
        u9b u9bVar;
        this.s = z;
        this.f = true;
        int i = 0;
        if (b6bVar != null && (u9bVar = b6bVar.c.E0) != null) {
            int i2 = u9bVar.a;
            mm mmVar = this.e;
            if (i2 == 1) {
                c(15.0f, 2131232391);
                d(-7808710, -13781445);
                mmVar.f(z2, !z2);
            } else if (i2 == 2) {
                c(17.33f, 2131232167);
                d(-3905294, -6923014);
                mmVar.f(z2, !z2);
            } else if (i2 == 3) {
                c(17.33f, 2131232165);
                d(-18621, -618956);
                mmVar.f(z2, !z2);
            } else if (z) {
                c(17.33f, 2131232164);
                d(-15292942, -15630089);
                mmVar.f(z2, !z2);
            } else {
                this.f = false;
            }
        } else {
            this.f = false;
        }
        if (!this.f) {
            i = 8;
        }
        setVisibility(i);
        invalidate();
    }

    public final void b(boolean z, TL_stories.StoryItem storyItem, boolean z2) {
        this.s = z;
        this.f = true;
        int i = 0;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z3 = storyItem.close_friends;
            mm mmVar = this.e;
            if (z3) {
                c(15.0f, 2131232391);
                d(-7808710, -13781445);
                mmVar.f(z2, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232167);
                d(-3905294, -6923014);
                mmVar.f(z2, true);
            } else {
                if (!storyItem.selected_contacts) {
                    if (z) {
                        ArrayList<TLRPC.PrivacyRule> arrayList = storyItem.privacy;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            c(17.33f, 2131232164);
                            d(-15292942, -15630089);
                            mmVar.f(z2, true);
                        }
                    } else {
                        this.f = false;
                    }
                }
                c(17.33f, 2131232165);
                d(-18621, -618956);
                mmVar.f(z2, true);
            }
        }
        if (!this.f) {
            i = 8;
        }
        setVisibility(i);
        invalidate();
    }

    public final void c(float f, int i) {
        if (i == 2131232391) {
            setContentDescription(ob6.M0(2131744186, null));
        } else if (i == 2131232167) {
            setContentDescription(ob6.M0(2131744184, null));
        } else if (i == 2131232165) {
            setContentDescription(ob6.M0(2131744174, null));
        } else if (i == 2131232164) {
            setContentDescription(ob6.M0(2131744182, null));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable != null && i == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i;
        drawableArr[0] = resources.getDrawable(i).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = hl.N(f);
        invalidate();
    }

    public final void d(int i, int i2) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i && this.b == i2) {
            return;
        }
        this.a = i;
        this.b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(23.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, hl.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int L;
        float width = (getWidth() / 2.0f) + getX();
        if (this.s) {
            L = 0;
        } else {
            L = hl.L(14.0f);
        }
        return width + L;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float N;
        float N2;
        float f;
        char c;
        float f2;
        float centerX;
        float centerX2;
        if (!this.f) {
            return;
        }
        if (this.s) {
            N = 0.0f;
        } else {
            N = hl.N(7.0f);
        }
        if (this.s) {
            N2 = hl.N(43.0f);
        } else {
            N2 = hl.N(23.66f);
        }
        float N3 = hl.N(23.66f);
        RectF rectF = hl.P;
        rectF.set(bp1.z(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, qd4.e(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a = this.y.a(0.075f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float e = this.e.e(false, 0.0f);
        int i = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paintArr[1]);
        }
        if (e < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - e) * 255.0f));
            canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paintArr[0]);
        }
        float abs = Math.abs(e - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.r;
        if (drawable != null && e > 0.5f) {
            if (this.s) {
                centerX2 = hl.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f3 = (fArr[1] / 2.0f) * abs;
            f = 0.5f;
            c = 0;
            f2 = 12.0f;
            drawableArr[1].setBounds((int) uh9.x(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f3), (int) (f3 + centerX2), (int) c00.B(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f = 0.5f;
            c = 0;
            f2 = 12.0f;
        }
        if (drawableArr[c] != null && e <= f) {
            if (this.s) {
                centerX = hl.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f4 = (fArr[c] / 2.0f) * abs;
            drawableArr[c].setBounds((int) uh9.x(fArr[c], 2.0f, abs, centerX), (int) (centerY2 - f4), (int) (f4 + centerX), (int) c00.B(fArr[c], 2.0f, abs, rectF.centerY()));
            drawableArr[c].draw(canvas);
        }
        if (this.s) {
            Path path = this.x;
            path.rewind();
            path.moveTo(rectF.right - hl.N(15.66f), rectF.centerY() - hl.N(1.33f));
            path.lineTo(rectF.right - hl.N(f2), hl.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - hl.N(8.16f), rectF.centerY() - hl.N(1.33f));
            float N4 = hl.N(1.33f);
            Paint paint = this.w;
            paint.setStrokeWidth(N4);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.y.c(z);
    }
}
