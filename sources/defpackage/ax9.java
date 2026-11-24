package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public class ax9 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float a;
    public int f;
    public int g;
    public zw9 h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean p;
    public float q;
    public float r;
    public View s;
    public ArrayList u;
    public CharSequence v;
    public long w;
    public StaticLayout[] z;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF n = new RectF();
    public final int o = gm.L(2.0f);
    public float t = 1.0f;
    public float x = 0.0f;
    public int y = -1;
    public float B = 1.0f;

    public ax9(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.s = view;
        E = gm.L(24.0f);
        this.r = gm.L(6.0f);
    }

    public final void a() {
        this.u = null;
        this.y = -1;
        this.x = 0.0f;
        StaticLayout[] staticLayoutArr = this.z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        float f3 = this.t;
        if (f3 > 0.0f) {
            if (f3 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f, this.g, (int) (f3 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i9 = E / 2;
            int i10 = this.g / 2;
            int i11 = this.o / 2;
            RectF rectF = this.n;
            rectF.set(i9, i10 - i11, this.f - i9, i10 + i11);
            Paint paint = D;
            if (this.p) {
                i = this.m;
            } else {
                i = this.i;
            }
            paint.setColor(i);
            c(canvas2, rectF, D);
            if (this.q > 0.0f) {
                Paint paint2 = D;
                if (this.p) {
                    i7 = this.m;
                } else {
                    i7 = this.j;
                }
                paint2.setColor(i7);
                float f4 = E / 2;
                int i12 = this.g / 2;
                rectF.set(f4, i12 - i11, (this.q * (this.f - i8)) + f4, i12 + i11);
                c(canvas2, rectF, D);
            }
            float f5 = E / 2;
            float f6 = (this.g / 2) - i11;
            if (this.e) {
                i4 = this.c;
            } else {
                i4 = this.b;
            }
            rectF.set(f5, f6, i2 + i4, i11 + i3);
            D.setColor(this.l);
            c(canvas2, rectF, D);
            D.setColor(this.k);
            if (this.e) {
                f = 8.0f;
            } else {
                f = 6.0f;
            }
            float L = gm.L(f);
            if (this.r != L) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f7 = this.r;
                if (f7 < L) {
                    float A = b10.A((float) elapsedRealtime, 60.0f, gm.L(1.0f), f7);
                    this.r = A;
                    if (A > L) {
                        this.r = L;
                    }
                } else {
                    float x = hg9.x((float) elapsedRealtime, 60.0f, gm.L(1.0f), f7);
                    this.r = x;
                    if (x < L) {
                        this.r = L;
                    }
                }
                View view = this.s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i5 = this.c;
            } else {
                i5 = this.b;
            }
            canvas2.drawCircle((E / 2) + i5, this.g / 2, this.r, D);
            if (this.t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i6 = this.c;
                } else {
                    i6 = this.b;
                }
                float f8 = i6 / (this.f - E);
                int size = this.u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.u.get(size)).first).floatValue() - 0.001f <= f8) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.z == null) {
                    this.z = new StaticLayout[2];
                }
                Typeface typeface = gm.a;
                if (size != this.y) {
                    if (this.e) {
                        gm.W3(this.s);
                    }
                    this.y = size;
                    if (size >= 0 && size < this.u.size()) {
                        d((g6c) ((Pair) this.u.get(this.y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.u.size() > 8) {
                        f2 = 160.0f;
                    } else {
                        f2 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f2) + this.B, 1.0f);
                    View view2 = this.s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.x < 1.0f) {
                    this.x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.x, 1.0f);
                    View view3 = this.s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, Paint paint) {
        int i;
        char c;
        float floatValue;
        float floatValue2;
        char c2;
        float f;
        char c3;
        float f2;
        float f3 = E / 2.0f;
        ArrayList arrayList = this.u;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f4 = E / 2.0f;
            float f5 = this.f - f4;
            gm.P.set(rectF);
            float L = gm.L(this.x * 1.0f) / 2.0f;
            Path path = G;
            if (path == null) {
                path = new Path();
                G = path;
            }
            path.reset();
            float L2 = gm.L(4.0f) / (f5 - f4);
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 < this.u.size()) {
                    if (((Float) ((Pair) this.u.get(i2)).first).floatValue() >= L2) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                i2 = 0;
            }
            char c4 = 1;
            int size = this.u.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (1.0f - ((Float) ((Pair) this.u.get(size)).first).floatValue() >= L2) {
                    i = size + 1;
                    break;
                } else {
                    size--;
                }
            }
            if (i < 0) {
                i = this.u.size();
            }
            int i3 = i2;
            while (i3 <= i) {
                float f6 = 0.0f;
                if (i3 == i2) {
                    floatValue = 0.0f;
                    c = 0;
                } else {
                    c = 0;
                    floatValue = ((Float) ((Pair) this.u.get(i3 - 1)).first).floatValue();
                }
                if (i3 == i) {
                    floatValue2 = 1.0f;
                } else {
                    floatValue2 = ((Float) ((Pair) this.u.get(i3)).first).floatValue();
                }
                while (i3 != i && i3 != 0) {
                    c2 = c4;
                    if (i3 >= this.u.size() - 1 || ((Float) ((Pair) this.u.get(i3)).first).floatValue() - floatValue > L2) {
                        break;
                    }
                    i3++;
                    floatValue2 = ((Float) ((Pair) this.u.get(i3)).first).floatValue();
                    c4 = c2;
                }
                c2 = c4;
                RectF rectF2 = gm.P;
                float R1 = gm.R1(f4, f5, floatValue);
                if (i3 > 0) {
                    f = L;
                } else {
                    f = 0.0f;
                }
                rectF2.left = R1 + f;
                float R12 = gm.R1(f4, f5, floatValue2);
                if (i3 < i) {
                    f6 = L;
                }
                float f7 = R12 - f6;
                rectF2.right = f7;
                float f8 = rectF.right;
                if (f7 > f8) {
                    c3 = c2;
                } else {
                    c3 = c;
                }
                if (c3 != 0) {
                    rectF2.right = f8;
                    f7 = f8;
                }
                float f9 = rectF.left;
                if (f7 < f9) {
                    f2 = L2;
                } else {
                    float f10 = rectF2.left;
                    if (f10 < f9) {
                        rectF2.left = f9;
                    } else {
                        f9 = f10;
                    }
                    float[] fArr = F;
                    if (fArr == null) {
                        fArr = new float[8];
                        F = fArr;
                    }
                    f2 = L2;
                    if (i3 != i2 && (c3 == 0 || f9 < rectF.left)) {
                        float f11 = 0.7f * f3 * this.x;
                        if (i3 >= i) {
                            fArr[7] = f11;
                            fArr[6] = f11;
                            fArr[c2] = f11;
                            fArr[c] = f11;
                            fArr[5] = f3;
                            fArr[4] = f3;
                            fArr[3] = f3;
                            fArr[2] = f3;
                        } else {
                            fArr[5] = f11;
                            fArr[4] = f11;
                            fArr[3] = f11;
                            fArr[2] = f11;
                            fArr[7] = f11;
                            fArr[6] = f11;
                            fArr[c2] = f11;
                            fArr[c] = f11;
                        }
                    } else {
                        fArr[7] = f3;
                        fArr[6] = f3;
                        fArr[c2] = f3;
                        fArr[c] = f3;
                        float f12 = 0.7f * f3 * this.x;
                        fArr[5] = f12;
                        fArr[4] = f12;
                        fArr[3] = f12;
                        fArr[2] = f12;
                    }
                    G.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (c3 != 0) {
                        break;
                    }
                }
                i3++;
                c4 = c2;
                L2 = f2;
            }
            canvas.drawPath(G, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    public final boolean e(float f, float f2, int i) {
        zw9 zw9Var;
        int i2 = 0;
        if (i == 0) {
            int i3 = this.g;
            int i4 = E;
            int i5 = (i3 - i4) / 2;
            if (f >= (-i5)) {
                int i6 = this.f;
                if (f <= i6 + i5 && f2 >= 0.0f && f2 <= i3) {
                    int i7 = this.b;
                    if (i7 - i5 > f || f > i7 + i4 + i5) {
                        i7 = ((int) f) - (i4 / 2);
                        this.b = i7;
                        if (i7 < 0) {
                            this.b = 0;
                        } else {
                            i2 = i6 - i4;
                            if (i7 > i2) {
                                this.b = i2;
                            }
                        }
                        this.e = true;
                        this.c = i2;
                        this.d = (int) (f - i2);
                        return true;
                    }
                    i2 = i7;
                    this.e = true;
                    this.c = i2;
                    this.d = (int) (f - i2);
                    return true;
                }
            }
        } else if (i != 1 && i != 3) {
            if (i == 2 && this.e) {
                int i8 = (int) (f - this.d);
                this.c = i8;
                if (i8 < 0) {
                    this.c = 0;
                } else {
                    i2 = this.f - E;
                    if (i8 > i2) {
                        this.c = i2;
                    } else {
                        i2 = i8;
                    }
                }
                zw9 zw9Var2 = this.h;
                if (zw9Var2 != null) {
                    zw9Var2.h(i2 / (this.f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i9 = this.c;
            this.b = i9;
            if (i == 1 && (zw9Var = this.h) != null) {
                zw9Var.f(i9 / (this.f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        this.i = i;
        this.j = i2;
        this.k = i4;
        this.l = i3;
        this.m = i5;
    }

    public final void g(float f) {
        this.a = f;
        int ceil = (int) Math.ceil((this.f - E) * f);
        this.b = ceil;
        if (ceil < 0) {
            this.b = 0;
            return;
        }
        int i = this.f;
        int i2 = E;
        if (ceil > i - i2) {
            this.b = i - i2;
        }
    }

    public final void h(int i, int i2) {
        if (this.f == i && this.g == i2) {
            return;
        }
        this.f = i;
        this.g = i2;
        g(this.a);
    }

    public final void i(k47 k47Var) {
        Integer z;
        String str;
        if (k47Var == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) k47Var.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
            return;
        }
        CharSequence charSequence = k47Var.z;
        if (k47Var.d5()) {
            if (k47Var.B == null && (str = k47Var.k.media.webpage.description) != null) {
                k47Var.B = SpannableString.valueOf(str);
                k47.h(k47Var.N3(), k47Var.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = k47Var.B;
        }
        if (charSequence != this.v || this.w != valueOf.longValue()) {
            this.v = charSequence;
            this.w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.u = null;
                this.y = -1;
                this.x = 0.0f;
                StaticLayout[] staticLayoutArr = this.z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                g6c[] g6cVarArr = (g6c[]) spanned.getSpans(0, spanned.length(), g6c.class);
                this.u = new ArrayList();
                this.x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(gm.L(12.0f));
                    this.A.setColor(-1);
                }
                for (g6c g6cVar : g6cVarArr) {
                    try {
                        if (g6cVar != null && g6cVar.getURL() != null && g6cVar.d != null && g6cVar.getURL().startsWith("audio?")) {
                            if (Utilities.z(g6cVar.getURL().substring(6)).intValue() >= 0) {
                                float intValue = ((float) (z.intValue() * 1000)) / ((float) valueOf.longValue());
                                gw3.l(new SpannableStringBuilder(g6cVar.d), this.A.getFontMetricsInt(), false);
                                this.u.add(new Pair(Float.valueOf(intValue), g6cVar));
                            }
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                Collections.sort(this.u, new qx7((byte) 20));
            } catch (Exception e2) {
                fc4.g(e2, true);
                this.u = null;
                this.y = -1;
                this.x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void d(g6c g6cVar) {
    }
}
