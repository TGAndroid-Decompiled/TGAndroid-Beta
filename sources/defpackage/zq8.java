package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
public class zq8 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final yq8 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public vj7 n;

    public zq8(Context context) {
        super(context);
        float f;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && gba.o() >= 1) {
            if (gba.o() == 2) {
                f = 1.0f;
            } else {
                f = 1.5f;
            }
            this.c = new xq8(this, f);
        } else {
            this.c = new wq8(this);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, gl.L(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
            return;
        }
        this.c.c(new k88(this, (byte) 12), canvas);
    }

    public float getAvatarEndScale() {
        float min;
        int L;
        vj7 vj7Var = this.n;
        if (vj7Var == null) {
            return 0.8f;
        }
        boolean z = vj7Var.c;
        RectF rectF = vj7Var.e;
        if (z) {
            min = rectF.width() - gl.L(2.0f);
            L = gl.L(100.0f);
        } else {
            min = Math.min(rectF.width(), this.n.e.height());
            L = gl.L(100.0f);
        }
        return Math.min(0.8f, min / L);
    }

    public float getHiddenAvatarSizeDp() {
        vj7 vj7Var = this.n;
        if (vj7Var != null && vj7Var.c) {
            return (vj7Var.e.width() * 0.5f) / gl.p;
        }
        return 24.0f;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        vj7 vj7Var;
        float f;
        byte b;
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 28) {
            ?? obj = new Object();
            int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier != 0) {
                String string = context.getString(identifier);
                if (!string.isEmpty()) {
                    String trim = string.trim();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i5 = displayMetrics.widthPixels;
                    float f2 = displayMetrics.density;
                    byte b2 = 3;
                    byte b3 = 5;
                    boolean z2 = false;
                    if (trim.endsWith("@right")) {
                        f = i5;
                        trim = trim.substring(0, trim.length() - 6).trim();
                        b = 5;
                    } else if (trim.endsWith("@left")) {
                        trim = trim.substring(0, trim.length() - 5).trim();
                        f = 0.0f;
                        b = 3;
                    } else {
                        f = i5 / 2.0f;
                        b = 17;
                    }
                    boolean endsWith = trim.endsWith("@dp");
                    if (endsWith) {
                        trim = ir2.n(3, 0, trim);
                    }
                    if (trim.contains("@bottom")) {
                        trim = trim.split("@bottom", 2)[0].trim();
                    }
                    try {
                        ky7[] c = mqe.c(trim);
                        Path path = new Path();
                        mqe.f(c, path);
                        Matrix matrix = new Matrix();
                        if (endsWith) {
                            matrix.postScale(f2, f2);
                        }
                        matrix.postTranslate(f, 0.0f);
                        path.transform(matrix);
                        obj.d = path;
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        obj.e = rectF;
                        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        if (b != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= gl.L(2.0f)) {
                            b = 17;
                        }
                        if (b != 17 || rectF.left >= displayMetrics2.widthPixels / 4.0f) {
                            b2 = b;
                        }
                        if (b2 != 17 || rectF.right <= (displayMetrics2.widthPixels / 4.0f) * 3.0f) {
                            b3 = b2;
                        }
                        obj.a = b3;
                        if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        obj.b = z;
                        if (rectF.width() <= gl.L(32.0f) || rectF.width() <= rectF.height()) {
                            z2 = true;
                        }
                        obj.c = z2;
                        vj7Var = obj;
                    } catch (Throwable th) {
                        fa4.e("Failed to parse notch info", th);
                    }
                    this.n = vj7Var;
                    if ((vj7Var != null && vj7Var.a != 17) || getWidth() > getHeight()) {
                        this.n = null;
                    }
                    this.c.d(i, i2);
                }
            }
        }
        vj7Var = null;
        this.n = vj7Var;
        if (vj7Var != null) {
            this.n = null;
            this.c.d(i, i2);
        }
        this.n = null;
        this.c.d(i, i2);
    }

    public void setBlurIntensity(float f) {
        this.f = f;
        this.c.b(f);
        invalidate();
    }

    public void setGooeyEnabled(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setHideProgress(float f) {
        boolean z;
        setPullProgress(f);
        setBlurIntensity(Math.min((moe.a(f, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
        int i = 0;
        if (f > 0.0f && f < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        setGooeyEnabled(z);
        if (f >= 1.0f) {
            i = 8;
        }
        setVisibility(i);
    }

    public void setIntensity(float f) {
        this.d = f;
        this.c.a(f);
        invalidate();
    }

    public void setPullProgress(float f) {
        this.e = f;
        invalidate();
    }
}
