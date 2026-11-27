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
public class tu8 extends View {
    public final v41 E;
    public int F;
    public boolean G;
    public float H;
    public int I;
    public boolean J;
    public RadialGradient K;
    public float L;
    public final Paint M;
    public final Matrix N;
    public jl0 O;
    public float P;
    public float Q;
    public final PorterDuffColorFilter a;
    public final PorterDuffColorFilter b;
    public pkb c;
    public pkb d;
    public tu8 e;
    public tu8 f;
    public final Paint h;
    public final Paint n;
    public final Path r;
    public final Drawable s;
    public final RectF w;
    public final Paint x;
    public final Path y;

    public tu8(Context context) {
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
        this.E = new v41(this);
        this.F = -1;
        this.M = new Paint(1);
        this.N = new Matrix();
        this.s = c00.e(context, 2131231075);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -hl.N(3.33f));
        path.lineTo(hl.N(3.16f), 0.0f);
        path.lineTo(0.0f, hl.N(3.33f));
        setColor(null);
        e("Author", " - Title");
    }

    public final void a() {
        boolean z;
        int i;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.H < 0.8f && hl.B(this.I) > 0.72f) {
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
        this.n.setColor(aob.p1(0.85f, this.F));
        invalidate();
    }

    public void b(Canvas canvas, float f) {
        float height = getHeight() / 2.0f;
        int L = hl.L(13.0f);
        int i = (int) height;
        int i2 = L / 2;
        int i3 = i - i2;
        int i4 = i + i2;
        Drawable drawable = this.s;
        drawable.setBounds(0, i3, L, i4);
        drawable.draw(canvas);
        canvas.translate(hl.L(16.6f), 0.0f);
        this.c.c(0.0f, height, f, this.F, canvas);
        canvas.translate(this.c.j(), 0.0f);
        this.d.c(0.0f, height, f * 0.85f, this.F, canvas);
        canvas.translate(this.d.j(), 0.0f);
        float N = hl.N(1.16f);
        Paint paint = this.n;
        paint.setStrokeWidth(N);
        canvas.translate(hl.N(4.8f), height);
        canvas.drawPath(this.r, paint);
    }

    public float c(float f) {
        float max = Math.max(0.0f, ((f - hl.L(16.0f)) - hl.L(16.6f)) - hl.L(8.0f));
        pkb pkbVar = this.c;
        pkbVar.p = max / 2.0f;
        this.d.p = Math.max(0.0f, max - pkbVar.j());
        float j = this.c.j();
        return this.d.j() + j + hl.L(16.6f) + hl.L(8.0f);
    }

    public final void d(int i, boolean z) {
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.d(i, z);
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
        if (Utilities.l(this.Q / hl.L(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.w;
        v41 v41Var = this.E;
        if (action == 0) {
            v41Var.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && v41Var.i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                v41Var.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (v41Var.i) {
                performClick();
            }
            v41Var.c(false);
        }
        return v41Var.i;
    }

    public final void e(String str, String str2) {
        this.c = new pkb(str, 11.0f, hl.o());
        this.d = new pkb(str2, 11.0f, null);
        setContentDescription(ob6.M0(2131754794, null) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    public final void f(float f, float f2) {
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.f(f, f2);
        }
        this.Q = f2;
        setTranslationY(f - hl.L(12.0f));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float c;
        float width;
        float f;
        if (this.c != null && this.d != null) {
            float l = Utilities.l(this.Q / hl.L(21.0f));
            float a = this.E.a(0.02f);
            if (l <= 0.0f) {
                jl0 jl0Var = this.O;
                if (jl0Var != null) {
                    jl0Var.setAlpha(0);
                    return;
                }
                return;
            }
            int width2 = getWidth() - (hl.L(12.0f) << 1);
            tu8 tu8Var = this.e;
            if (tu8Var == null) {
                tu8Var = this.f;
            }
            if (tu8Var != null && tu8Var.getVisibility() == 0) {
                tu8 tu8Var2 = this.f;
                if (tu8Var2 == null) {
                    tu8Var2 = this;
                }
                tu8 tu8Var3 = this.e;
                if (tu8Var3 == null) {
                    tu8Var3 = this;
                }
                float f2 = width2;
                c = tu8Var3.c(f2 / 2.0f) + hl.L(16.0f);
                float c2 = tu8Var2.c(Math.max(0.0f, (f2 - c) - hl.L(6.0f))) + hl.L(16.0f);
                width = (((getWidth() - c2) - hl.L(6.0f)) - c) / 2.0f;
                if (this.f != null) {
                    width += c2 + hl.L(6.0f);
                } else {
                    c = c2;
                }
            } else {
                c = c(width2) + hl.L(16.0f);
                width = (getWidth() - c) / 2.0f;
            }
            RectF rectF = this.w;
            rectF.set(width, hl.L(10.0f), c + width, (hl.L(17.0f) * l) + hl.L(10.0f));
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
                        RadialGradient radialGradient2 = new RadialGradient(rectF.width() / 2.0f, hl.L(17.0f) / 2.0f, rectF.width() * 0.65f, aob.p1(0.8f, this.I), this.I, Shader.TileMode.CLAMP);
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
            canvas.translate(rectF.left + hl.L(8.0f), 0.0f);
            b(canvas, l);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(37.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.setAlpha(f);
        }
    }

    public void setColor(kc7 kc7Var) {
        boolean z;
        if (kc7Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.G = z;
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.setColor(kc7Var);
        }
        invalidate();
    }

    public void setGlassFactory(ll0 ll0Var) {
        jl0 jl0Var;
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.setGlassFactory(ll0Var);
        }
        if (ll0Var != null) {
            jl0Var = ll0Var.c(this, qs8.o, false);
        } else {
            jl0Var = null;
        }
        this.O = jl0Var;
        this.P = 0.0f;
        invalidate();
    }

    public void setMusicDocument(org.telegram.tgnet.TLRPC.Document r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu8.setMusicDocument(org.telegram.tgnet.TLRPC$Document):void");
    }

    public void setParentExpanded(float f) {
        tu8 tu8Var = this.e;
        if (tu8Var != null) {
            tu8Var.setParentExpanded(f);
        }
        if (this.H != f) {
            this.H = f;
            a();
            invalidate();
        }
    }

    public void setTrailingView(tu8 tu8Var) {
        this.e = tu8Var;
        tu8Var.f = this;
        invalidate();
        tu8Var.invalidate();
    }
}
