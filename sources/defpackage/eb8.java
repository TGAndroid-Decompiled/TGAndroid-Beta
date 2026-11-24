package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
public final class eb8 {
    public static Paint B;
    public static final RectF C = new RectF();
    public int A;
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final TextPaint d;
    public final TextPaint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Path j;
    public final Matrix k;
    public final RectF l;
    public final RectF m;
    public final Rect n;
    public final ArrayList o;
    public final ArrayList p;
    public final RectF q;
    public final RectF r;
    public final RectF s;
    public db8 t;
    public boolean u;
    public float v;
    public float w;
    public bb8 x;
    public BitmapShader y;
    public int z;

    public eb8() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.b = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.c = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.d = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.e = textPaint5;
        this.f = new Paint(3);
        Paint paint = new Paint();
        this.g = paint;
        this.h = new Paint(1);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        this.j = new Path();
        this.k = new Matrix();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Rect();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        textPaint.setTextSize(gl.L(10.5f));
        textPaint.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(15.0f));
        textPaint3.setTextSize(gl.L(22.0f));
        textPaint4.setTextSize(gl.L(16.0f));
        textPaint4.setTypeface(gl.o());
        textPaint5.setTextSize(gl.L(12.0f));
        textPaint5.setColor(-16777216);
        paint.setFilterBitmap(false);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gl.L(2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void c(Canvas canvas, float f, float f2, float f3, float f4, float f5) {
        RectF rectF = C;
        rectF.set(f, f2, f3 + f, f4 + f2);
        canvas.drawRoundRect(rectF, f5, f5, B);
    }

    public final void a(Bitmap bitmap, float f, float f2, float f3, float f4) {
        cb8 cb8Var = new cb8();
        cb8Var.a = bitmap;
        cb8Var.b.set(f, f2, f3 + f, f4 + f2);
        this.p.add(cb8Var);
    }

    public final db8 b(float f, float f2, int i, Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, boolean z) {
        int i2;
        if (!TextUtils.isEmpty(charSequence) && i > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(charSequence.toString().replace('\n', ' '), textPaint, i, TextUtils.TruncateAt.END);
            if (z) {
                i2 = Math.min(i, (int) Math.ceil(textPaint.measureText(ellipsize, 0, ellipsize.length())));
            } else {
                i2 = i;
            }
            ?? obj = new Object();
            obj.a = new StaticLayout(ellipsize, textPaint, Math.max(1, i2), alignment, 1.0f, 0.0f, false);
            obj.b = f;
            obj.c = f2;
            this.o.add(obj);
            return obj;
        }
        return null;
    }

    public final float d(ab8[] ab8VarArr, float f, int i, int i2, float f2, float f3) {
        TextPaint textPaint;
        float f4;
        TextPaint textPaint2;
        Layout.Alignment alignment;
        float f5;
        float f6;
        eb8 eb8Var = this;
        int min = Math.min(ab8VarArr.length, 4);
        if (min == 0) {
            return f;
        }
        int L = gl.L(10.0f);
        float[] fArr = new float[min];
        int i3 = 0;
        float f7 = 0.0f;
        while (true) {
            textPaint = eb8Var.b;
            f4 = f7;
            textPaint2 = eb8Var.a;
            if (i3 >= min) {
                break;
            }
            ab8 ab8Var = ab8VarArr[i3];
            String str = (String) ab8Var.b;
            if (str != null) {
                f5 = textPaint2.measureText(str);
            } else {
                f5 = 0.0f;
            }
            String str2 = (String) ab8Var.c;
            if (str2 != null) {
                f6 = textPaint.measureText(str2);
            } else {
                f6 = 0.0f;
            }
            float ceil = (float) Math.ceil(Math.max(f5, f6));
            fArr[i3] = ceil;
            f7 = ceil + f4;
            i3++;
        }
        int i4 = min - 1;
        float f8 = i2 - (L * i4);
        float f9 = L;
        byte b = 1;
        if (f4 > f8) {
            float f10 = f8 / f4;
            for (int i5 = 0; i5 < min; i5++) {
                fArr[i5] = (float) Math.floor(fArr[i5] * f10);
            }
        } else if (min > 1) {
            f9 += (f8 - f4) / i4;
        }
        float f11 = f9;
        float f12 = i;
        int i6 = 0;
        while (i6 < min) {
            ab8 ab8Var2 = ab8VarArr[i6];
            int i7 = (int) fArr[i6];
            if (min == b) {
                i7 = i2;
            }
            byte b2 = ab8Var2.a;
            if (b2 == b) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (b2 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (b2 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (min > b && i6 == i4) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (min > 2 && i6 > 0) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            eb8Var.b(f12, f, i7, alignment, textPaint2, (String) ab8Var2.b, false);
            b(f12, f + f2, i7, alignment, textPaint, (String) ab8Var2.c, false);
            f12 += fArr[i6] + f11;
            i6++;
            eb8Var = this;
            textPaint2 = textPaint2;
            b = 1;
        }
        return f + f2 + f3 + gl.L(12.0f);
    }

    public final int e(bb8 bb8Var, int i) {
        BitmapShader bitmapShader;
        Bitmap bitmap;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float max;
        float f9;
        float f10;
        float f11;
        boolean z;
        boolean z2;
        float f12;
        int i2;
        int i3;
        int i4;
        eb8 eb8Var;
        float f13;
        float f14;
        Bitmap bitmap2;
        float f15;
        float L;
        Bitmap bitmap3;
        float f16;
        float L2;
        float min;
        float f17;
        float f18;
        float f19;
        boolean z3;
        float measureText;
        int i5;
        float f20;
        float f21;
        float f22;
        float f23;
        int i6;
        if (this.x == bb8Var && this.z == i) {
            return this.A;
        }
        this.x = bb8Var;
        this.z = i;
        if (bb8Var.n != null) {
            Bitmap bitmap4 = bb8Var.n;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
        } else {
            bitmapShader = null;
        }
        this.y = bitmapShader;
        ArrayList arrayList = this.o;
        arrayList.clear();
        this.p.clear();
        this.t = null;
        this.u = false;
        RectF rectF = this.s;
        rectF.setEmpty();
        RectF rectF2 = this.q;
        rectF2.setEmpty();
        int L3 = gl.L(12.0f);
        int i7 = this.z;
        int i8 = i7 - (L3 << 1);
        float f24 = L3;
        float f25 = i7 - L3;
        TextPaint textPaint = this.a;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f26 = fontMetrics.descent - fontMetrics.ascent;
        TextPaint textPaint2 = this.b;
        Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
        float f27 = fontMetrics2.descent - fontMetrics2.ascent;
        ab8[] ab8VarArr = this.x.f;
        float L4 = gl.L(28.0f);
        if (this.x.k != null) {
            f = 12.0f;
            float width = bitmap.getWidth() / this.x.k.getHeight();
            f4 = L4 * width;
            f2 = 0.0f;
            float f28 = i8 * 0.5f;
            if (f4 > f28) {
                f4 = f28;
                f3 = f28 / width;
            } else {
                f3 = L4;
            }
        } else {
            f = 12.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        String str = this.x.e;
        TextPaint textPaint3 = this.d;
        if (str != null) {
            if (f4 > f2) {
                f5 = f25;
                i6 = gl.L(8.0f);
            } else {
                f5 = f25;
                i6 = 0;
            }
            f6 = textPaint3.measureText(this.x.e) + i6;
        } else {
            f5 = f25;
            f6 = f2;
        }
        float f29 = f6 + f4;
        TextPaint textPaint4 = textPaint3;
        int min2 = Math.min(2, ab8VarArr.length);
        if (min2 == 0) {
            f7 = f24;
            f8 = L4;
            max = f2;
        } else {
            float f30 = i8;
            f7 = f24;
            f8 = L4;
            max = Math.max(f30 / 4.0f, ((f30 - Math.min(f29, f30 * 0.5f)) - (gl.L(f) * min2)) / min2);
        }
        int length = ab8VarArr.length - 1;
        float f31 = f2;
        while (length >= 0 && length >= ab8VarArr.length - 2) {
            ab8 ab8Var = ab8VarArr[length];
            int i9 = (int) max;
            float f32 = max;
            String str2 = (String) ab8Var.b;
            if (str2 != null) {
                f22 = textPaint.measureText(str2);
            } else {
                f22 = f2;
            }
            int i10 = length;
            String str3 = (String) ab8Var.c;
            if (str3 != null) {
                f23 = textPaint2.measureText(str3);
            } else {
                f23 = f2;
            }
            TextPaint textPaint5 = textPaint2;
            float min3 = Math.min(i9, (float) Math.ceil(Math.max(f22, f23)));
            float f33 = f5 - min3;
            String str4 = (String) ab8Var.b;
            int i11 = (int) min3;
            ab8[] ab8VarArr2 = ab8VarArr;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_OPPOSITE;
            float f34 = f7;
            b(f33, f34, i11, alignment, textPaint, str4, false);
            b(f33, f34 + f26, i11, alignment, textPaint5, (String) ab8Var.c, false);
            f31 = Math.max(f31, f26 + f27);
            f5 = f33 - gl.L(f);
            length = i10 - 1;
            textPaint2 = textPaint5;
            f4 = f4;
            ab8VarArr = ab8VarArr2;
            L3 = L3;
            max = f32;
            textPaint4 = textPaint4;
            f3 = f3;
            f7 = f34;
            textPaint = textPaint;
        }
        TextPaint textPaint6 = textPaint;
        float f35 = f3;
        TextPaint textPaint7 = textPaint4;
        float f36 = f7;
        float f37 = f31;
        float f38 = f4;
        int i12 = L3;
        float f39 = f8;
        if (this.x.k != null) {
            float f40 = f38 / f35;
            float max2 = Math.max(gl.L(40.0f), f5 - f36);
            if (f38 > max2) {
                f21 = max2 / f40;
                f20 = max2;
            } else {
                f20 = f38;
                f21 = f35;
            }
            a(this.x.k, f36, ((Math.max(f37, f39) - f21) / 2.0f) + f36, f20, f21);
            f9 = f36;
            f10 = Math.max(f37, f21);
            f11 = f20 + gl.L(8.0f) + f9;
        } else {
            f9 = f36;
            f10 = f37;
            f11 = f9;
        }
        if (this.x.e != null) {
            Paint.FontMetrics fontMetrics3 = textPaint7.getFontMetrics();
            float f41 = fontMetrics3.descent - fontMetrics3.ascent;
            float max3 = Math.max(f10, f41);
            b(f11, oo1.z(max3, f41, 2.0f, f9), (int) (f5 - f11), Layout.Alignment.ALIGN_NORMAL, textPaint7, this.x.e, true);
            f10 = max3;
        }
        float L5 = f10 + gl.L(f) + f9;
        bb8 bb8Var2 = this.x;
        ab8[] ab8VarArr3 = bb8Var2.g;
        if (bb8Var2.l != null && ((i5 = bb8Var2.a) == 2 || i5 == 3 || i5 == 4)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && bb8Var2.a == 1 && ab8VarArr3.length >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f12 = (i8 - gl.L(48.0f)) / 2.0f;
        } else {
            f12 = i8;
        }
        if (!z && !z2 && this.x.m != null) {
            f12 -= gl.L(74.0f);
        }
        if (z2) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        float L6 = gl.L(22.0f);
        float L7 = gl.L(15.0f);
        float f42 = f12;
        TextPaint textPaint8 = this.c;
        textPaint8.setTextSize(L6);
        int i13 = 0;
        boolean z4 = z2;
        while (i13 < Math.min(i2, ab8VarArr3.length)) {
            String str5 = (String) ab8VarArr3[i13].c;
            if (str5 != null) {
                if (textPaint8.measureText(str5) > f42) {
                    z3 = z;
                    L6 = Math.min(L6, Math.max(L7, (float) Math.floor((L6 * f42) / measureText)));
                    i13++;
                    z = z3;
                }
            }
            z3 = z;
            i13++;
            z = z3;
        }
        boolean z5 = z;
        textPaint8.setTextSize(L6);
        Paint.FontMetrics fontMetrics4 = textPaint6.getFontMetrics();
        float f43 = fontMetrics4.descent - fontMetrics4.ascent;
        Paint.FontMetrics fontMetrics5 = textPaint8.getFontMetrics();
        float f44 = fontMetrics5.descent - fontMetrics5.ascent;
        if (z5) {
            float min4 = Math.min(this.z * (this.x.l.getHeight() / this.x.l.getWidth()), gl.L(150.0f));
            rectF.set(f2, L5, this.z, L5 + min4);
            float max4 = Math.max(gl.L(8.0f), ((min4 - f43) - f44) - gl.L(10.0f)) + L5;
            if (ab8VarArr3.length > 0) {
                ab8 ab8Var2 = ab8VarArr3[0];
                String str6 = (String) ab8Var2.b;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                f19 = f9;
                i4 = 3;
                b(f19, max4, i8, alignment2, textPaint6, str6, false);
                b(f19, max4 + f43, i8, alignment2, textPaint8, (String) ab8Var2.c, false);
                i3 = i8;
            } else {
                f19 = f9;
                i3 = i8;
                i4 = 3;
            }
            eb8Var = this;
            f14 = min4 + gl.L(10.0f) + L5;
            f13 = f19;
        } else {
            float f45 = f9;
            i3 = i8;
            i4 = 3;
            if (z4) {
                int D = ug8.D(48.0f, i3, 2);
                ab8 ab8Var3 = ab8VarArr3[0];
                ab8 ab8Var4 = ab8VarArr3[1];
                String str7 = (String) ab8Var3.b;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                b(f45, L5, D, alignment3, textPaint6, str7, false);
                String str8 = (String) ab8Var3.c;
                float f46 = L5 + f43;
                eb8Var = this;
                eb8Var.b(f45, f46, D, alignment3, textPaint8, str8, false);
                f13 = f45;
                String str9 = (String) ab8Var4.b;
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_OPPOSITE;
                eb8Var.b((eb8Var.z - i12) - D, L5, D, alignment4, textPaint6, str9, false);
                eb8Var.b((eb8Var.z - i12) - D, f46, D, alignment4, textPaint8, (String) ab8Var4.c, false);
                eb8Var.u = true;
                eb8Var.v = eb8Var.z / 2.0f;
                eb8Var.w = (f44 / 2.0f) + f46;
                L = f43 + f44 + gl.L(f) + L5;
            } else {
                eb8Var = this;
                f13 = f45;
                if (ab8VarArr3.length > 0) {
                    float f47 = i3;
                    float f48 = f43 + f44;
                    if (eb8Var.x.m != null) {
                        float width2 = bitmap2.getWidth() / eb8Var.x.m.getHeight();
                        float min5 = Math.min(gl.L(64.0f), gl.L(64.0f) * width2);
                        float f49 = min5 / width2;
                        eb8Var.a(eb8Var.x.m, (eb8Var.z - i12) - min5, L5, min5, f49);
                        f15 = L5;
                        f47 -= min5 + gl.L(10.0f);
                        f48 = Math.max(f48, f49);
                    } else {
                        f15 = L5;
                    }
                    ab8 ab8Var5 = ab8VarArr3[0];
                    int i14 = (int) f47;
                    Layout.Alignment alignment5 = Layout.Alignment.ALIGN_NORMAL;
                    b(f13, f15, i14, alignment5, textPaint6, (String) ab8Var5.b, false);
                    float f50 = f15;
                    String str10 = (String) ab8Var5.c;
                    eb8Var = this;
                    eb8Var.b(f13, f50 + f43, i14, alignment5, textPaint8, str10, false);
                    f13 = f13;
                    L = f48 + gl.L(f) + f50;
                } else {
                    f14 = L5;
                }
            }
            f14 = L;
        }
        int i15 = i3;
        float d = eb8Var.d(eb8Var.x.i, eb8Var.d(eb8Var.x.h, f14, i12, i15, f26, f27), i12, i15, f26, f27);
        if (eb8Var.x.o != null) {
            float height = bitmap3.getHeight() / eb8Var.x.o.getWidth();
            float min6 = Math.min(Math.min(i3, gl.L(286.0f)) * height, gl.L(24.0f));
            float f51 = min6 / height;
            eb8Var.a(eb8Var.x.o, (eb8Var.z - f51) / 2.0f, d, f51, min6);
            f16 = min6 + gl.L(10.0f) + d;
        } else {
            f16 = d;
        }
        if (eb8Var.x.q != null) {
            int L8 = gl.L(8.0f);
            int width3 = eb8Var.x.q.getWidth();
            int height2 = eb8Var.x.q.getHeight();
            int i16 = eb8Var.x.p;
            if (i16 != 1 && i16 != i4) {
                if (i16 == 2) {
                    min = Math.min(i3 - (L8 << 1), gl.L(260.0f));
                    f17 = Math.min(gl.L(90.0f), (height2 * min) / width3);
                } else {
                    min = Math.min(i3 - (L8 << 1), gl.L(260.0f));
                    f17 = gl.L(56.0f);
                }
            } else {
                min = Math.min(gl.L(150.0f), i3 * 0.6f);
                f17 = min;
            }
            float f52 = width3;
            float max5 = Math.max(1.0f, (float) Math.floor(min / f52));
            bb8 bb8Var3 = eb8Var.x;
            int i17 = bb8Var3.p;
            if (i17 != 4 && i17 != 2) {
                f17 = f52 * max5;
                min = f17;
            } else {
                float f53 = f52 * max5;
                if (f53 <= i3 - (L8 << 1)) {
                    min = f53;
                }
            }
            float f54 = L8 << 1;
            float f55 = min + f54;
            float f56 = f17 + f54;
            boolean isEmpty = TextUtils.isEmpty(bb8Var3.r);
            TextPaint textPaint9 = eb8Var.e;
            if (!isEmpty) {
                Paint.FontMetrics fontMetrics6 = textPaint9.getFontMetrics();
                f18 = gl.L(2.0f) + (fontMetrics6.descent - fontMetrics6.ascent);
                f55 = Math.max(f55, Math.min(i3, textPaint9.measureText(eb8Var.x.r) + f54));
            } else {
                f18 = 0.0f;
            }
            float f57 = f56 + f18;
            float f58 = (eb8Var.z - f55) / 2.0f;
            rectF2.set(f58, f16, f58 + f55, f16 + f57);
            float f59 = eb8Var.z;
            float f60 = L8;
            float f61 = f16 + f60;
            RectF rectF3 = eb8Var.r;
            rectF3.set((f59 - min) / 2.0f, f61, (f59 + min) / 2.0f, f17 + f61);
            if (f18 > 0.0f) {
                db8 b = eb8Var.b(f60 + f58, rectF3.bottom + gl.L(2.0f), (int) (f55 - f54), Layout.Alignment.ALIGN_CENTER, textPaint9, eb8Var.x.r, false);
                eb8Var.t = b;
                arrayList.remove(b);
            }
            L2 = f57 + f13 + f16;
        } else {
            L2 = f16 + (i12 - gl.L(f));
        }
        int ceil = (int) Math.ceil(L2);
        eb8Var.A = ceil;
        return ceil;
    }
}
