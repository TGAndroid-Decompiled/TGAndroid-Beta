package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public class oh8 extends ImageView {
    public static final int M = 0;
    public Paint E;
    public ImageReceiver F;
    public vl G;
    public float H;
    public boolean I;
    public boolean J;
    public wd1 K;
    public Integer L;
    public final byte a;
    public final float[] b;
    public final bra c;
    public final wjb d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    public oh8(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.H = 1.0f;
        this.a = i;
        this.d = wjbVar;
        if (i == 0) {
            i2 = 2131232313;
        } else {
            i2 = 2131232250;
        }
        setImageResource(i2);
        if (i == 0) {
            bra braVar = new bra(5);
            this.c = braVar;
            braVar.g();
            braVar.L = false;
            braVar.s = (byte) 4;
            braVar.t = (byte) 4;
            braVar.r = (byte) 2;
            braVar.o = 0.1f;
            braVar.c();
        } else if (i == 2) {
            this.f = 0.8f;
            this.y.setColor(bkb.w0(null, bkb.Z6, false));
        } else if (i == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232058);
        } else if (i == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(2131232206);
        }
    }

    public final void a() {
        if (this.e && getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            int i = this.n;
            float[] fArr = this.b;
            Color.colorToHSV(i, fArr);
            fArr[1] = fArr[1] * 1.0f;
            if (fArr[2] > 0.7f) {
                fArr[2] = 0.7f;
            }
            int HSVToColor = Color.HSVToColor(fArr);
            int i2 = bkb.c6;
            wjb wjbVar = this.d;
            int f = bm2.f(0.5f, HSVToColor, bkb.v0(i2, wjbVar));
            int f2 = bm2.f(0.4f, HSVToColor, bkb.v0(i2, wjbVar));
            if (this.w == null || this.r != f2 || this.s != f) {
                if (this.J) {
                    Paint paint = this.y;
                    this.E = paint;
                    paint.setAlpha(255);
                    this.H = 0.0f;
                }
                this.y = new Paint(1);
                this.r = f2;
                this.s = f;
                LinearGradient linearGradient = new LinearGradient(0.0f, getMeasuredHeight(), 0.0f, 0.0f, new int[]{f2, f}, (float[]) null, Shader.TileMode.CLAMP);
                this.w = linearGradient;
                this.y.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public ImageReceiver getImageReceiver() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        if (this.a != 0) {
            a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.y;
        if (paint != null && this.a != 2) {
            paint.setShader(null);
            this.y = null;
        }
        this.w = null;
        this.J = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == 0) {
            Path path = this.x;
            path.rewind();
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            Path.Direction direction = Path.Direction.CW;
            path.addCircle(rectF.width() / 2.0f, rectF.centerY(), rectF.width() / 2.0f, direction);
            rectF.set((getMeasuredWidth() / 2.0f) + gl.L(2.5f), gl.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.N(0.2f), getMeasuredHeight());
            path.addRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), direction);
            path.close();
            bra braVar = this.c;
            braVar.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            braVar.a.inset(gl.L(6.0f), gl.L(6.0f));
            return;
        }
        a();
    }

    public void setAnimatedEmojiDrawable(vl vlVar) {
        this.G = vlVar;
        if (vlVar != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.L = num;
    }

    public void setColor(int i) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i = bkb.v(i, num.intValue());
        }
        if (this.n != i) {
            this.n = i;
            byte b = this.a;
            if (b != 0 && b != 2) {
                a();
            } else {
                Paint paint = this.y;
                if (paint != null) {
                    paint.setColor(i);
                }
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.F = imageReceiver;
        if (imageReceiver != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        int i;
        if (this.a != 0) {
            if (z) {
                i = 2131232250;
            } else {
                i = 2131232254;
            }
            setImageResource(i);
        }
    }
}
