package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
public final class slb implements wjb {
    public wjb a;
    public final SparseIntArray b = new SparseIntArray();
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f;
    public final TextPaint g;
    public final TextPaint h;
    public Bitmap i;
    public BitmapShader j;
    public Matrix k;
    public final qmb l;
    public final qmb m;

    public slb(qmb qmbVar) {
        this.m = qmbVar;
        this.l = qmbVar;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(gl.L(Math.max(16, gba.T0) - 2));
        textPaint2.setTextSize(gl.L(Math.max(16, gba.T0) - 2));
        textPaint3.setTextSize(gl.L(15.0f));
        textPaint3.setTypeface(gl.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        imb imbVar = this.m.r1;
        if (imbVar != null) {
            return imbVar.a();
        }
        imb imbVar2 = this.l.r1;
        if (imbVar2 != null) {
            return imbVar2.a();
        }
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            return wjbVar.a();
        }
        return bkb.I.o();
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap != null && (bitmapShader = this.j) != null) {
            bkb.r(bitmap, bitmapShader, this.k, i, i2, f, f2);
        } else {
            bkb.q(f, f2, i, i2);
        }
    }

    @Override
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override
    public final Paint d(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c = 0;
                    break;
                }
                break;
            case 561929466:
                if (str.equals("paintChatActionBackground")) {
                    c = 1;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c = 2;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c = 3;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c = 4;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.g;
            case 1:
                return this.c;
            case 2:
                return this.h;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f;
            default:
                wjb wjbVar = this.a;
                if (wjbVar != null) {
                    return wjbVar.d(str);
                }
                return bkb.T0(str);
        }
    }

    @Override
    public final boolean e() {
        return gba.D0;
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            return wjbVar.g();
        }
        return bkb.b1();
    }

    @Override
    public final Drawable getDrawable(String str) {
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            return wjbVar.getDrawable(str);
        }
        return bkb.P0(str);
    }

    @Override
    public final int h(int i) {
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    @Override
    public final int j(int i) {
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            return wjbVar.j(i);
        }
        return h(i);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f) {
        Bitmap bitmap;
        float f2;
        float f3;
        float f4;
        float f5;
        int i = bkb.bd;
        int h = h(i);
        int h2 = h(bkb.cd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = drawable instanceof ye7;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z || (drawable instanceof BitmapDrawable)) && gba.o() != 0 && e66.e(32)) {
            if (z) {
                bitmap = ((ye7) drawable).k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.i != bitmap) {
                this.i = bitmap;
                Bitmap bitmap2 = this.i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.k == null) {
                    this.k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.i = null;
            this.j = null;
            int i2 = bkb.Yc;
            textPaint2.setColor(h(i2));
            textPaint.setColor(h(i2));
            textPaint2.linkColor = h(bkb.Zc);
        }
        Paint paint = this.c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h2);
        if (this.j != null && (this.b.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z) {
                float f6 = -0.06f;
                if (((ye7) drawable).q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f5 = 0.97f;
                    } else {
                        f5 = 0.92f;
                    }
                    gl.l2(colorMatrix, f5);
                    if (a()) {
                        f6 = 0.12f;
                    }
                    gl.h(colorMatrix, f6);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f4 = 0.4f;
                    } else {
                        f4 = 0.8f;
                    }
                    gl.l2(colorMatrix, f4);
                    if (a()) {
                        f6 = 0.08f;
                    }
                    gl.h(colorMatrix, f6);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f2 = 0.9f;
                } else {
                    f2 = 0.84f;
                }
                gl.l2(colorMatrix, f2);
                if (a()) {
                    f3 = -0.04f;
                } else {
                    f3 = 0.06f;
                }
                gl.h(colorMatrix, f3);
            }
            if (z) {
                float f7 = ((ye7) drawable).q;
                if (f != null) {
                    f7 = f.floatValue();
                }
                if (f7 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    gl.l2(colorMatrix, 0.97f);
                    gl.h(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    gl.l2(colorMatrix, 0.35f);
                    gl.h(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                gl.l2(colorMatrix, 0.97f);
                gl.h(colorMatrix, 0.06f);
            }
            paint.setShader(this.j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.j);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            gl.l2(colorMatrix2, 0.85f);
            paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            paint2.setAlpha(255);
            return;
        }
        paint.setColorFilter(null);
        paint.setShader(null);
        paint2.setColorFilter(null);
        paint2.setShader(null);
    }

    @Override
    public final void i(int i, int i2) {
    }
}
