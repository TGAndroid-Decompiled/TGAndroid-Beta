package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dma {
    public final e0c a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public int g;
    public final boolean h;
    public final short i;
    public Bitmap j;
    public long k;
    public int n;
    public final Paint e = new Paint();
    public final int f = cmb.z8;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    public dma(int i) {
        short s;
        this.h = i;
        if (i == 0) {
            s = 100;
        } else {
            s = 300;
        }
        this.i = s;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(gm.L(1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStrokeWidth(gm.L(0.5f));
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            this.a = new e0c(s);
            this.b = s4.a(a(true));
        } else {
            this.a = null;
            this.b = null;
        }
        c();
        for (int i2 = 0; i2 < 20; i2++) {
            this.m.add(new cma(this));
        }
    }

    public static Bitmap a(boolean z) {
        int L;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(gm.L(0.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        if (z) {
            L = gm.L(20.0f);
        } else {
            L = gm.L(10.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(L, gm.L(10.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float N = gm.N(2.0f) * 2.0f;
        float f = (-gm.N(0.57f)) * 2.0f;
        float N2 = gm.N(1.55f) * 2.0f;
        float f2 = 5.0f;
        float L2 = gm.L(5.0f);
        float L3 = gm.L(5.0f);
        float f3 = -1.5707964f;
        int i = 0;
        while (i < 6) {
            double d = f3;
            float f4 = f2;
            float f5 = f3;
            float cos = ((float) Math.cos(d)) * N;
            Bitmap bitmap = createBitmap;
            float sin = ((float) Math.sin(d)) * N;
            float f6 = cos * 0.66f;
            float f7 = 0.66f * sin;
            canvas.drawLine(L2, L3, cos + L2, sin + L3, paint);
            float f8 = L2;
            float f9 = L3;
            double d2 = (float) (d - 1.5707963267948966d);
            double d3 = f;
            double d4 = N2;
            float f10 = f8 + f6;
            float f11 = f9 + f7;
            canvas.drawLine(f10, f11, f8 + ((float) ((Math.cos(d2) * d3) - (Math.sin(d2) * d4))), ((float) wi8.d(d2, d4, Math.sin(d2) * d3)) + f9, paint);
            canvas.drawLine(f10, f11, f8 + ((float) (((-Math.cos(d2)) * d3) - (Math.sin(d2) * d4))), ((float) wi8.d(d2, d4, (-Math.sin(d2)) * d3)) + f9, paint);
            f3 = f5 + 1.0471976f;
            i++;
            L3 = f9;
            f2 = f4;
            createBitmap = bitmap;
            L2 = f8;
        }
        Bitmap bitmap2 = createBitmap;
        float f12 = f2;
        if (z) {
            Paint paint2 = new Paint(1);
            paint2.setStrokeWidth(gm.L(1.5f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(-1);
            canvas.drawPoint(gm.L(15.0f), gm.L(f12), paint2);
        }
        return bitmap2;
    }

    public final void b(Canvas canvas, View view) {
        int i;
        short s;
        float nextFloat;
        cma cmaVar;
        float f;
        float f2;
        if (view != null && canvas != null && e86.e(32)) {
            c();
            short s2 = this.i;
            e0c e0cVar = this.a;
            int i2 = 0;
            ArrayList arrayList = this.l;
            if (e0cVar != null) {
                int min = Math.min((int) s2, arrayList.size());
                int L = gm.L(10.0f);
                for (int i3 = 0; i3 < min; i3++) {
                    cma cmaVar2 = (cma) arrayList.get(i3);
                    float f3 = cmaVar2.a;
                    float f4 = cmaVar2.b;
                    if (cmaVar2.j == 0) {
                        f = L / 2.0f;
                        f2 = L;
                    } else {
                        f = (L / 2.0f) * cmaVar2.i;
                        f2 = 0.0f;
                    }
                    e0cVar.s(i3, on2.p(this.n, (int) (cmaVar2.f * 255.0f)));
                    e0c.d((float[]) e0cVar.c, i3, f3 - f, f4 - f, f3 + f, f4 + f);
                    float f5 = L;
                    e0c.d((float[]) e0cVar.d, i3, f2, 0.0f, f2 + f5, f5);
                }
                s4.b(canvas, e0cVar, min, this.b);
            } else {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    cma cmaVar3 = (cma) arrayList.get(i4);
                    int i5 = cmaVar3.j;
                    dma dmaVar = cmaVar3.k;
                    if (i5 != 0) {
                        Bitmap bitmap = dmaVar.j;
                        Paint paint = dmaVar.e;
                        if (bitmap == null) {
                            dmaVar.j = a(false);
                        }
                        paint.setAlpha((int) (cmaVar3.f * 255.0f));
                        canvas.save();
                        float f6 = cmaVar3.i;
                        canvas.scale(f6, f6, cmaVar3.a, cmaVar3.b);
                        canvas.drawBitmap(dmaVar.j, cmaVar3.a, cmaVar3.b, paint);
                        canvas.restore();
                    } else {
                        dmaVar.c.setAlpha((int) (cmaVar3.f * 255.0f));
                        canvas.drawPoint(cmaVar3.a, cmaVar3.b, dmaVar.c);
                    }
                }
            }
            boolean z = this.h;
            if (!z) {
                i = 1;
            } else {
                i = 10;
            }
            int size2 = arrayList.size();
            int i6 = 40;
            ArrayList arrayList2 = this.m;
            if (size2 < s2) {
                int i7 = 0;
                while (i7 < i) {
                    if (arrayList.size() < s2) {
                        SecureRandom secureRandom = Utilities.b;
                        if (secureRandom.nextFloat() > 0.7f) {
                            int i8 = gm.m;
                            float nextFloat2 = secureRandom.nextFloat() * view.getMeasuredWidth();
                            if (!z) {
                                nextFloat = (secureRandom.nextFloat() * kt6.y(20.0f, view.getMeasuredHeight(), i8)) + i8;
                            } else {
                                nextFloat = secureRandom.nextFloat() * view.getMeasuredHeight();
                            }
                            float f7 = nextFloat;
                            double nextInt = (secureRandom.nextInt(40) + 70) * 0.017453292519943295d;
                            s = s2;
                            float cos = (float) Math.cos(nextInt);
                            float sin = (float) Math.sin(nextInt);
                            if (!arrayList2.isEmpty()) {
                                cmaVar = (cma) arrayList2.get(0);
                                arrayList2.remove(0);
                            } else {
                                cmaVar = new cma(this);
                            }
                            cmaVar.a = nextFloat2;
                            cmaVar.b = f7;
                            cmaVar.c = cos;
                            cmaVar.d = sin;
                            cmaVar.f = 0.0f;
                            cmaVar.h = 0.0f;
                            cmaVar.i = secureRandom.nextFloat() * 1.2f;
                            cmaVar.j = secureRandom.nextInt(2);
                            if (!z) {
                                cmaVar.g = secureRandom.nextInt(100) + 2000;
                            } else {
                                cmaVar.g = secureRandom.nextInt(2000) + 3000;
                            }
                            cmaVar.e = (secureRandom.nextFloat() * 4.0f) + 20.0f;
                            arrayList.add(cmaVar);
                            i7++;
                            s2 = s;
                        }
                    }
                    s = s2;
                    i7++;
                    s2 = s;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long min2 = Math.min(17L, currentTimeMillis - this.k);
            int size3 = arrayList.size();
            while (i2 < size3) {
                cma cmaVar4 = (cma) arrayList.get(i2);
                float f8 = cmaVar4.h;
                float f9 = cmaVar4.g;
                if (f8 >= f9) {
                    if (arrayList2.size() < i6) {
                        arrayList2.add(cmaVar4);
                    }
                    arrayList.remove(i2);
                    i2--;
                    size3--;
                } else {
                    int i9 = (f8 > 200.0f ? 1 : (f8 == 200.0f ? 0 : -1));
                    if (!z) {
                        if (i9 < 0) {
                            cmaVar4.f = gm.G.getInterpolation(f8 / 200.0f);
                        } else {
                            cmaVar4.f = 1.0f - gm.F.getInterpolation((f8 - 200.0f) / (f9 - 200.0f));
                        }
                    } else if (i9 < 0) {
                        cmaVar4.f = gm.G.getInterpolation(f8 / 200.0f);
                    } else {
                        float f10 = f9 - f8;
                        if (f10 < 2000.0f) {
                            cmaVar4.f = gm.F.getInterpolation(f10 / 2000.0f);
                        }
                    }
                    float f11 = cmaVar4.a;
                    float f12 = cmaVar4.c;
                    float f13 = cmaVar4.e;
                    float f14 = (float) min2;
                    cmaVar4.a = kt6.d(f12 * f13, f14, 500.0f, f11);
                    cmaVar4.b = (((cmaVar4.d * f13) * f14) / 500.0f) + cmaVar4.b;
                    cmaVar4.h += f14;
                }
                i2++;
                i6 = 40;
            }
            this.k = currentTimeMillis;
            view.invalidate();
        }
    }

    public final void c() {
        int i = this.g;
        if (i == 0) {
            i = cmb.w0(null, this.f, false) & (-1644826);
        }
        if (this.n != i) {
            this.n = i;
            this.c.setColor(i);
            this.d.setColor(i);
        }
    }
}
