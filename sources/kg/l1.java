package kg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
public class l1 extends ImageView {
    public static final int L = 0;
    public Paint D;
    public ImageReceiver E;
    public f5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.g J;
    public Integer K;
    public final int f11169a;
    public final float[] f11170b;
    public final f2 f11171c;
    public final p6 d;
    public boolean e;
    public final float f11172f;
    public boolean h;
    public int f11173n;
    public int f11174r;
    public int f11175s;
    public LinearGradient f11176w;
    public final Path f11177x;
    public Paint f11178y;

    public l1(int i10, Context context, p6 p6Var) {
        super(context);
        int i11;
        this.f11170b = new float[3];
        this.f11172f = 1.0f;
        this.h = false;
        this.f11173n = -1;
        this.f11176w = null;
        this.f11177x = new Path();
        this.f11178y = new Paint(1);
        this.G = 1.0f;
        this.f11169a = i10;
        this.d = p6Var;
        if (i10 == 0) {
            i11 = 2131232307;
        } else {
            i11 = 2131232244;
        }
        setImageResource(i11);
        if (i10 == 0) {
            f2 f2Var = new f2(5);
            this.f11171c = f2Var;
            f2Var.g();
            f2Var.M = false;
            f2Var.f11084s = 4;
            f2Var.f11085t = 4;
            f2Var.f11083r = 2;
            f2Var.f11080o = 0.1f;
            f2Var.c();
        } else if (i10 == 2) {
            this.f11172f = 0.8f;
            this.f11178y.setColor(t6.x0(null, t6.f20873a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232052);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232200);
        }
    }

    public final void a() {
        if (this.e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i10 = this.f11173n;
            float[] fArr = this.f11170b;
            Color.colorToHSV(i10, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i11 = t6.f20930d6;
            p6 p6Var = this.d;
            int f7 = i0.b.f(0.5f, HSVToColor, t6.w0(i11, p6Var));
            int f10 = i0.b.f(0.4f, HSVToColor, t6.w0(i11, p6Var));
            if (this.f11176w == null || this.f11174r != f10 || this.f11175s != f7) {
                if (this.I) {
                    Paint paint = this.f11178y;
                    this.D = paint;
                    paint.setAlpha(255);
                    this.G = 0.0f;
                }
                this.f11178y = new Paint(1);
                this.f11174r = f10;
                this.f11175s = f7;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f10, f7}, (float[]) null, Shader.TileMode.CLAMP);
                this.f11176w = linearGradient;
                this.f11178y.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        if (this.f11169a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.f11178y;
        if (paint != null && this.f11169a != 2) {
            paint.setShader(null);
            this.f11178y = null;
        }
        this.f11176w = null;
        this.I = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: kg.l1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f11169a == 0) {
            Path path = this.f11177x;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), direction);
            path.close();
            f2 f2Var = this.f11171c;
            f2Var.f11069a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            f2Var.f11069a.inset(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(f5 f5Var) {
        this.F = f5Var;
        if (f5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i10 = t6.w(i10, num.intValue());
        }
        if (this.f11173n != i10) {
            this.f11173n = i10;
            int i11 = this.f11169a;
            if (i11 != 0 && i11 != 2) {
                a();
            } else {
                Paint paint = this.f11178y;
                if (paint != null) {
                    paint.setColor(i10);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.E = imageReceiver;
        if (imageReceiver != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        int i10;
        if (this.f11169a != 0) {
            if (z10) {
                i10 = 2131232244;
            } else {
                i10 = 2131232248;
            }
            setImageResource(i10);
        }
    }
}
