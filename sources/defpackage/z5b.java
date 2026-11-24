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
public final class z5b extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final lm e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final n41 y;

    public z5b(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = r0;
        this.e = new lm(this, 0L, 260L, s33.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new n41(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z, f2b f2bVar, boolean z2) {
        w5b w5bVar;
        this.s = z;
        this.f = true;
        int i = 0;
        if (f2bVar != null && (w5bVar = f2bVar.c.E0) != null) {
            int i2 = w5bVar.a;
            lm lmVar = this.e;
            if (i2 == 1) {
                c(15.0f, 2131232391);
                d(-7808710, -13781445);
                lmVar.f(z2, !z2);
            } else if (i2 == 2) {
                c(17.33f, 2131232167);
                d(-3905294, -6923014);
                lmVar.f(z2, !z2);
            } else if (i2 == 3) {
                c(17.33f, 2131232165);
                d(-18621, -618956);
                lmVar.f(z2, !z2);
            } else if (z) {
                c(17.33f, 2131232164);
                d(-15292942, -15630089);
                lmVar.f(z2, !z2);
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
            lm lmVar = this.e;
            if (z3) {
                c(15.0f, 2131232391);
                d(-7808710, -13781445);
                lmVar.f(z2, true);
            } else if (storyItem.contacts) {
                c(17.33f, 2131232167);
                d(-3905294, -6923014);
                lmVar.f(z2, true);
            } else {
                if (!storyItem.selected_contacts) {
                    if (z) {
                        ArrayList<TLRPC.PrivacyRule> arrayList = storyItem.privacy;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            c(17.33f, 2131232164);
                            d(-15292942, -15630089);
                            lmVar.f(z2, true);
                        }
                    } else {
                        this.f = false;
                    }
                }
                c(17.33f, 2131232165);
                d(-18621, -618956);
                lmVar.f(z2, true);
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
            setContentDescription(k96.M0(2131744292, null));
        } else if (i == 2131232167) {
            setContentDescription(k96.M0(2131744290, null));
        } else if (i == 2131232165) {
            setContentDescription(k96.M0(2131744280, null));
        } else if (i == 2131232164) {
            setContentDescription(k96.M0(2131744288, null));
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
        fArr[0] = gl.N(f);
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
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(23.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, gl.L(8.0f));
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
            L = gl.L(14.0f);
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
            N = gl.N(7.0f);
        }
        if (this.s) {
            N2 = gl.N(43.0f);
        } else {
            N2 = gl.N(23.66f);
        }
        float N3 = gl.N(23.66f);
        RectF rectF = gl.P;
        rectF.set(oo1.z(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, tb4.e(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
        float a = this.y.a(0.075f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float e = this.e.e(false, 0.0f);
        int i = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        Paint[] paintArr = this.d;
        if (i > 0) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paintArr[1]);
        }
        if (e < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - e) * 255.0f));
            canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paintArr[0]);
        }
        float abs = Math.abs(e - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.r;
        if (drawable != null && e > 0.5f) {
            if (this.s) {
                centerX2 = gl.N(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f3 = (fArr[1] / 2.0f) * abs;
            f = 0.5f;
            c = 0;
            f2 = 12.0f;
            drawableArr[1].setBounds((int) de9.x(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f3), (int) (f3 + centerX2), (int) b00.A(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            f = 0.5f;
            c = 0;
            f2 = 12.0f;
        }
        if (drawableArr[c] != null && e <= f) {
            if (this.s) {
                centerX = gl.N(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f4 = (fArr[c] / 2.0f) * abs;
            drawableArr[c].setBounds((int) de9.x(fArr[c], 2.0f, abs, centerX), (int) (centerY2 - f4), (int) (f4 + centerX), (int) b00.A(fArr[c], 2.0f, abs, rectF.centerY()));
            drawableArr[c].draw(canvas);
        }
        if (this.s) {
            Path path = this.x;
            path.rewind();
            path.moveTo(rectF.right - gl.N(15.66f), rectF.centerY() - gl.N(1.33f));
            path.lineTo(rectF.right - gl.N(f2), gl.N(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - gl.N(8.16f), rectF.centerY() - gl.N(1.33f));
            float N4 = gl.N(1.33f);
            Paint paint = this.w;
            paint.setStrokeWidth(N4);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.y.c(z);
    }
}
