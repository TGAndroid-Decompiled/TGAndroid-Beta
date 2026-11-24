package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public class jr8 extends View {
    public final n41 E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public il0 O;
    public float P;
    public float Q;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public tgb c;
    public tgb d;
    public jr8 e;
    public jr8 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public jr8(Context context) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.a = new PorterDuffColorFilter(-1, mode);
        this.b = new PorterDuffColorFilter(-16777216, mode);
        this.h = new Paint();
        Paint paint = new Paint();
        this.n = paint;
        Path path = new Path();
        this.r = path;
        this.w = new RectF();
        this.x = new Paint(1);
        this.y = new Path();
        this.E = new n41(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.s = b00.d(context, 2131231075);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -gl.N(3.33f));
        path.lineTo(gl.N(3.16f), 0.0f);
        path.lineTo(0.0f, gl.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z;
        int i;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.H < 0.8f && gl.B(this.I) > 0.72f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = -16777216;
        } else {
            i = -1;
        }
        this.F = i;
        if (z) {
            porterDuffColorFilter = this.b;
        } else {
            porterDuffColorFilter = this.a;
        }
        this.s.setColorFilter(porterDuffColorFilter);
        this.h.setColor(this.F);
        this.n.setColor(bkb.p1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f) {
        float height = getHeight() / 2.0f;
        int L = gl.L(13.0f);
        int i = (int) height;
        int i2 = L / 2;
        int i3 = i - i2;
        int i4 = i + i2;
        Drawable drawable = this.s;
        drawable.setBounds(0, i3, L, i4);
        drawable.draw(canvas);
        canvas.translate(gl.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f, this.F, canvas);
        canvas.translate(this.c.j(), 0.0f);
        this.d.c(0.0f, height, f * 0.85f, this.F, canvas);
        canvas.translate(this.d.j(), 0.0f);
        float N = gl.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(gl.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f) {
        float max = Math.max(0.0f, ((f - gl.L(16.0f)) - gl.L(16.6f)) - gl.L(8.0f));
        tgb tgbVar = this.c;
        tgbVar.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - tgbVar.j());
        float j = this.c.j();
        return this.d.j() + j + gl.L(16.6f) + gl.L(8.0f);
    }

    public final void d(int i, boolean z) {
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.d(i, z);
        }
        if (this.I == i && this.J == z) {
            return;
        }
        this.I = i;
        this.J = z;
        this.K = null;
        this.x.setColor(i);
        a();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.l(this.Q / gl.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        n41 n41Var = this.E;
        if (action == 0) {
            n41Var.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && n41Var.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                n41Var.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (n41Var.i) {
                performClick();
            }
            n41Var.c(false);
        }
        return n41Var.i;
    }

    public final void e(String str, String str2) {
        this.c = new tgb(str, 11.0f, gl.o());
        this.d = new tgb(str2, 11.0f, null);
        setContentDescription(k96.M0(2131754798, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f, float f2) {
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.f(f, f2);
        }
        this.Q = f2;
        setTranslationY(f - gl.L(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float c;
        float width;
        float f;
        if (this.c != null && this.d != null) {
            float l = Utilities.l(this.Q / gl.L(21.0f));
            float a = this.E.a(0.02f);
            if (l <= 0.0f) {
                il0 il0Var = this.O;
                if (il0Var != null) {
                    il0Var.setAlpha(0);
                    return;
                }
                return;
            }
            int width2 = getWidth() - (gl.L(12.0f) << 1);
            jr8 jr8Var = this.e;
            if (jr8Var == null) {
                jr8Var = this.f;
            }
            if (jr8Var != null && jr8Var.getVisibility() == 0) {
                jr8 jr8Var2 = this.f;
                if (jr8Var2 == null) {
                    jr8Var2 = this;
                }
                jr8 jr8Var3 = this.e;
                if (jr8Var3 == null) {
                    jr8Var3 = this;
                }
                float f2 = width2;
                c = jr8Var3.c(f2 / 2.0f) + gl.L(16.0f);
                float c2 = jr8Var2.c(Math.max(0.0f, (f2 - c) - gl.L(6.0f))) + gl.L(16.0f);
                width = (((getWidth() - c2) - gl.L(6.0f)) - c) / 2.0f;
                if (this.f != null) {
                    width += c2 + gl.L(6.0f);
                } else {
                    c = c2;
                }
            } else {
                c = c(width2) + gl.L(16.0f);
                width = (getWidth() - c) / 2.0f;
            }
            RectF rectF = this.w;
            rectF.set(width, gl.L(10.0f), c + width, (gl.L(17.0f) * l) + gl.L(10.0f));
            canvas.save();
            canvas.scale(a, a, rectF.centerX(), getHeight() / 2.0f);
            if (this.O != null) {
                float height = rectF.height() / 2.0f;
                if (this.P != height) {
                    this.P = height;
                    this.O.r(height);
                }
                this.O.setBounds((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
                this.O.setAlpha((int) (255.0f * l));
                this.O.draw(canvas);
            } else {
                if (this.J) {
                    f = 0.1f;
                } else {
                    f = 1.0f;
                }
                Paint paint = this.x;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (alpha * l * f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                paint.setAlpha(alpha);
                if (this.J && this.I != 0) {
                    RadialGradient radialGradient = this.K;
                    Paint paint2 = this.M;
                    if (radialGradient == null || this.L != rectF.width()) {
                        this.L = rectF.width();
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, gl.L(17.0f) / 2.0f, rectF.width() * 0.65f, bkb.p1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
                        this.K = radialGradient2;
                        paint2.setShader(radialGradient2);
                    }
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    Matrix matrix = this.N;
                    matrix.setTranslate(f3, f4);
                    this.K.setLocalMatrix(matrix);
                    paint2.setAlpha((int) (255.0f * l));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                }
            }
            Path path = this.y;
            path.rewind();
            path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas.translate(rectF.left + gl.L(8.0f), 0.0f);
            b(canvas, l);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(37.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.setAlpha(f);
        }
    }

    public void setColor(da7 da7Var) {
        boolean z;
        if (da7Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.G = z;
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.setColor(da7Var);
        }
        invalidate();
    }

    public void setGlassFactory(kl0 kl0Var) {
        il0 il0Var;
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.setGlassFactory(kl0Var);
        }
        if (kl0Var != null) {
            il0Var = kl0Var.c(this, ep8.o, false);
        } else {
            il0Var = null;
        }
        this.O = il0Var;
        this.P = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr8.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f) {
        jr8 jr8Var = this.e;
        if (jr8Var != null) {
            jr8Var.setParentExpanded(f);
        }
        if (this.H != f) {
            this.H = f;
            a();
            invalidate();
        }
    }

    public void setTrailingView(jr8 jr8Var) {
        this.e = jr8Var;
        jr8Var.f = this;
        invalidate();
        jr8Var.invalidate();
    }
}
