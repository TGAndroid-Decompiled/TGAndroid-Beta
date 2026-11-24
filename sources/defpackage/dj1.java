package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dj1 {
    public boolean A;
    public float B;
    public VelocityTracker C;
    public final kr9 D;
    public cj1 E;
    public aj1 F;
    public final gb2 a;
    public int b;
    public long c;
    public k27 d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float n;
    public float o;
    public r86 r;
    public final lm t;
    public tgb u;
    public final n41 x;
    public boolean z;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public int m = gl.L(66.0f);
    public final ArrayList p = new ArrayList();
    public final Path q = new Path();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Paint y = new Paint(1);
    public boolean s = true;

    public dj1(gb2 gb2Var) {
        this.a = gb2Var;
        this.D = new kr9(gb2Var.getContext(), null);
        this.x = new n41(gb2Var);
        this.t = new lm(350L, gb2Var, s33.h);
    }

    public final boolean a(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj1.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        kr9 kr9Var = this.D;
        if (kr9Var.b()) {
            float f = kr9Var.j;
            this.n = f;
            this.n = Utilities.i(f, this.o - (this.v.width() - gl.L(14.0f)), 0.0f);
            this.a.r2();
        }
    }

    public final void c(Canvas canvas) {
        float f;
        float f2;
        float max;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        Canvas canvas2;
        ArrayList arrayList;
        float f7;
        float f8;
        RectF rectF;
        float f9;
        int i3;
        int i4;
        int i5;
        int i6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z;
        float f15;
        int i7;
        boolean z2;
        float[] fArr;
        float f16;
        float f17;
        float f18;
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        if (this.d != null) {
            b();
            float f19 = 0.0f;
            if (this.g != null) {
                canvas.save();
                float width = (gb2Var.getWidth() - this.g.getWidth()) / 2.0f;
                RectF rectF2 = gl.P;
                rectF2.set((this.h + width) - gl.L(8.66f), gl.L(4.0f), this.i + width + gl.L(8.66f), gl.L(10.66f) + this.j);
                gb2Var.w1(canvas, rectF2, gl.L(11.0f));
                canvas.translate(width, gl.L(7.33f));
                this.f.setColor(bkb.v0(bkb.Yc, gb2Var.cc));
                this.g.draw(canvas);
                canvas.restore();
                f = gl.L(10.66f) + this.j + 0.0f;
            } else {
                f = 0.0f;
            }
            if (nb2Var.M2) {
                if (d()) {
                    f2 = nb2Var.L1;
                } else {
                    f2 = 1.0f - nb2Var.L1;
                }
            } else if (d()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            float i8 = Utilities.i((f2 - 0.3f) / 0.7f, 1.0f, 0.0f);
            if (i8 > 0.0f) {
                int width2 = gb2Var.getWidth() - gl.L(18.0f);
                if (width2 > gl.L(441.0f)) {
                    max = gl.L(66.0f);
                } else {
                    max = Math.max((width2 / 4.5f) - gl.L(9.0f), gl.L(66.0f));
                }
                this.m = (int) max;
                ArrayList arrayList2 = this.p;
                this.o = ((arrayList2.size() - 1) * gl.L(9.0f)) + (arrayList2.size() * i);
                int min = (int) Math.min(width2, this.m * 6.5f);
                RectF rectF3 = this.v;
                rectF3.set((gb2Var.getWidth() - min) / 2.0f, gl.L(10.0f) + f, (gb2Var.getWidth() + min) / 2.0f, f + gl.L(138.0f));
                this.n = Utilities.i(this.n, this.o - (rectF3.width() - gl.L(14.0f)), 0.0f);
                int i9 = (Math.abs(i8 - (-1.0f)) > 0.001f ? 1 : (Math.abs(i8 - (-1.0f)) == 0.001f ? 0 : -1));
                Path path = this.l;
                if (i9 < 0) {
                    f6 = 2.0f;
                    i2 = 1;
                    f5 = 9.0f;
                    f3 = 6.0f;
                    f4 = 8.0f;
                } else {
                    float L = gl.L(16.66f) * 2.0f;
                    f3 = 6.0f;
                    float f20 = rectF3.bottom;
                    path.rewind();
                    f4 = 8.0f;
                    RectF rectF4 = gl.P;
                    f5 = 9.0f;
                    float f21 = rectF3.left;
                    f6 = 2.0f;
                    float f22 = rectF3.top;
                    i2 = 1;
                    rectF4.set(f21, f22, f21 + L, f22 + L);
                    path.arcTo(rectF4, -90.0f, -90.0f);
                    float f23 = rectF3.left;
                    float f24 = f20 - L;
                    rectF4.set(f23, f24, f23 + L, f20);
                    path.arcTo(rectF4, -180.0f, -90.0f);
                    float f25 = rectF3.right;
                    rectF4.set(f25 - L, f24, f25, f20);
                    path.arcTo(rectF4, -270.0f, -90.0f);
                    float f26 = rectF3.right;
                    float f27 = rectF3.top;
                    rectF4.set(f26 - L, f27, f26, L + f27);
                    path.arcTo(rectF4, 0.0f, -90.0f);
                    path.lineTo(rectF3.centerX() + gl.L(8.0f), rectF3.top);
                    path.lineTo(rectF3.centerX(), rectF3.top - gl.L(6.0f));
                    path.lineTo(rectF3.centerX() - gl.L(8.0f), rectF3.top);
                    path.close();
                }
                canvas.save();
                float f28 = (i8 * 0.6f) + 0.4f;
                canvas.scale(f28, f28, rectF3.centerX(), rectF3.top - gl.L(f3));
                int v0 = bkb.v0(bkb.qa, gb2Var.cc);
                Paint paint = this.k;
                paint.setColor(v0);
                paint.setAlpha((int) (i8 * 255.0f));
                paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33f), bm2.o(-16777216, (int) (27.0f * i8)));
                canvas.drawPath(path, paint);
                canvas.clipPath(path);
                tgb tgbVar = this.u;
                if (tgbVar != null) {
                    arrayList = arrayList2;
                    tgbVar.c(rectF3.left + gl.L(17.0f), rectF3.top + gl.L(20.0f), i8, bkb.v0(bkb.F6, gb2Var.cc), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                }
                float d = this.t.d(this.s);
                float L2 = (rectF3.left + gl.L(7.0f)) - this.n;
                float L3 = gl.L(f5) + this.m;
                int floor = (int) Math.floor(((rectF3.left - min) - L2) / L3);
                int ceil = (int) Math.ceil((rectF3.right - L2) / L3);
                boolean z3 = false;
                if (d < 1.0f) {
                    int max2 = Math.max(0, floor);
                    f8 = 0.05f;
                    while (true) {
                        int i10 = max2;
                        if (i10 >= Math.min(ceil + 1, arrayList.size())) {
                            break;
                        }
                        cj1 cj1Var = (cj1) arrayList.get(i10);
                        canvas2.save();
                        canvas2.translate((i10 * L3) + L2, rectF3.bottom - gl.L(99.0f));
                        int i11 = this.m;
                        float f29 = (1.0f - d) * i8;
                        pb0[] pb0VarArr = cj1Var.b;
                        boolean z4 = cj1Var.g;
                        float f30 = f19;
                        Drawable drawable = cj1Var.h;
                        boolean z5 = z3;
                        ImageReceiver[] imageReceiverArr = cj1Var.c;
                        float f31 = L3;
                        gb2 gb2Var2 = cj1Var.a;
                        int i12 = floor;
                        n41 n41Var = cj1Var.n;
                        int i13 = ceil;
                        tgb tgbVar2 = cj1Var.k;
                        Paint paint2 = cj1Var.j;
                        canvas2.save();
                        float a = n41Var.a(0.075f);
                        float f32 = i11;
                        float f33 = f32 / f6;
                        canvas2.scale(a, a, f33, gl.L(99.0f) / f6);
                        Paint paint3 = cj1Var.i;
                        paint3.setStrokeWidth(gl.L(2.66f));
                        paint3.setColor(bkb.v0(bkb.qa, gb2Var2.cc));
                        int length = imageReceiverArr.length - 1;
                        while (length >= 0) {
                            int i14 = length;
                            float length2 = (f33 - (((imageReceiverArr.length - 1) * gl.L(7.0f)) / f6)) + (gl.L(7.0f) * i14);
                            float L4 = (gl.L(54.0f) / f6) + gl.L(10.0f);
                            ArrayList arrayList3 = arrayList;
                            RectF rectF5 = rectF3;
                            if (imageReceiverArr.length > i2) {
                                canvas2.drawCircle(length2, L4, gl.L(54.0f) / f6, paint3);
                            }
                            imageReceiverArr[i14].i0(length2 - (gl.L(54.0f) / f6), L4 - (gl.L(54.0f) / f6), gl.L(54.0f), gl.L(54.0f));
                            imageReceiverArr[i14].setAlpha(f29);
                            imageReceiverArr[i14].h(canvas2, null);
                            length = i14 - 1;
                            arrayList = arrayList3;
                            rectF3 = rectF5;
                            gb2Var = gb2Var;
                            i2 = 1;
                        }
                        gb2 gb2Var3 = gb2Var;
                        RectF rectF6 = rectF3;
                        ArrayList arrayList4 = arrayList;
                        if (tgbVar2 != null) {
                            tgbVar2.p = i11 - gl.L(32.0f);
                            if (drawable != null) {
                                f14 = 17.0f;
                            } else {
                                f14 = f4;
                            }
                            float j = tgbVar2.j() + gl.L(f14);
                            float L5 = gl.L(1.0f) + gl.L(54.0f) + gl.L(10.0f);
                            f9 = 32.0f;
                            i3 = 2;
                            gl.P.set((f32 - j) / f6, L5 - gl.L(14.33f), (f32 + j) / f6, L5);
                            if (!cj1Var.m) {
                                if (z4) {
                                    paint2.setColor(bkb.v(bkb.v0(bkb.qa, gb2Var2.cc), bkb.p1(0.85f, bkb.v0(bkb.x6, gb2Var2.cc))));
                                    cj1Var.m = true;
                                } else {
                                    Drawable drawable2 = imageReceiverArr[z5 ? 1 : 0].n0;
                                    if (drawable2 instanceof BitmapDrawable) {
                                        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                        try {
                                            int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                            fArr = new float[3];
                                            bm2.c(Color.red(pixel), Color.green(pixel), Color.blue(pixel), fArr);
                                            f16 = fArr[1];
                                        } catch (Exception e) {
                                            z2 = true;
                                            fa4.g(e, true);
                                        }
                                        if (f16 > 0.05f && f16 < 0.95f) {
                                            float f34 = fArr[2];
                                            if (f34 > 0.02f && f34 < 0.98f) {
                                                fArr[1] = 0.25f;
                                                if (bkb.I.o()) {
                                                    f18 = 0.35f;
                                                } else {
                                                    f18 = 0.65f;
                                                }
                                                fArr[2] = f18;
                                                paint2.setColor(bm2.a(fArr));
                                                z2 = true;
                                                cj1Var.m = z2;
                                            }
                                        }
                                        fArr[1] = f30;
                                        if (bkb.I.o()) {
                                            f17 = 0.38f;
                                        } else {
                                            f17 = 0.7f;
                                        }
                                        fArr[2] = f17;
                                        paint2.setColor(bm2.a(fArr));
                                        z2 = true;
                                        cj1Var.m = z2;
                                    } else if (!cj1Var.l) {
                                        try {
                                            int b = pb0VarArr[z5 ? 1 : 0].b();
                                            pb0 pb0Var = pb0VarArr[z5 ? 1 : 0];
                                            boolean z6 = pb0Var.g;
                                            int i15 = pb0Var.e;
                                            if (z6) {
                                                f15 = 0.95f;
                                                zjb i16 = bkb.I.i(z5);
                                                akb akbVar = bkb.I;
                                                if (i16 != null) {
                                                    i7 = i16.c;
                                                } else {
                                                    i7 = 0;
                                                }
                                                i15 = bkb.B(akbVar, i7, i15);
                                            } else {
                                                f15 = 0.95f;
                                            }
                                            int f35 = bm2.f(0.5f, b, i15);
                                            float[] fArr2 = new float[3];
                                            bm2.c(Color.red(f35), Color.green(f35), Color.blue(f35), fArr2);
                                            float f36 = fArr2[1];
                                            if (f36 > 0.05f && f36 < f15) {
                                                fArr2[1] = Utilities.i(f36 - 0.06f, 0.4f, f30);
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.08f, 0.5f, 0.2f);
                                            } else {
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.1f, 0.6f, 0.3f);
                                            }
                                            paint2.setColor(bm2.a(fArr2));
                                            z = true;
                                        } catch (Exception e2) {
                                            z = true;
                                            fa4.g(e2, true);
                                        }
                                        cj1Var.l = z;
                                    }
                                }
                            }
                            RectF rectF7 = gl.P;
                            canvas2.drawRoundRect(rectF7, gl.L(f4), gl.L(f4), paint2);
                            rectF7.inset((-gl.L(1.0f)) / f6, (-gl.L(1.0f)) / f6);
                            paint3.setStrokeWidth(gl.L(1.0f));
                            canvas2.drawRoundRect(rectF7, gl.L(f4), gl.L(f4), paint3);
                        } else {
                            f9 = 32.0f;
                            i3 = 2;
                        }
                        canvas2.restore();
                        int i17 = this.m;
                        TextPaint textPaint = cj1Var.d;
                        canvas2.save();
                        float a2 = n41Var.a(0.075f);
                        float f37 = i17;
                        canvas2.scale(a2, a2, f37 / f6, gl.L(99.0f) / f6);
                        StaticLayout staticLayout = cj1Var.f;
                        if (staticLayout == null || staticLayout.getWidth() != i17) {
                            CharSequence charSequence = cj1Var.e;
                            cj1Var.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i17).setMaxLines(i3).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                        }
                        if (cj1Var.f != null) {
                            canvas2.save();
                            canvas2.translate((i17 - cj1Var.f.getWidth()) / f6, gl.L(66.33f));
                            i4 = 1;
                            if (imageReceiverArr.length <= 1) {
                                textPaint.setColor(bkb.v0(bkb.Uc, gb2Var2.cc));
                            } else {
                                textPaint.setColor(bkb.v0(bkb.x6, gb2Var2.cc));
                            }
                            textPaint.setAlpha((int) (textPaint.getAlpha() * f29));
                            cj1Var.f.draw(canvas2);
                            canvas2.restore();
                        } else {
                            i4 = 1;
                        }
                        if (tgbVar2 != null) {
                            tgbVar2.p = i17 - gl.L(f9);
                            if (drawable != null) {
                                f10 = 17.0f;
                            } else {
                                f10 = f4;
                            }
                            float j2 = (f37 - (tgbVar2.j() + gl.L(f10))) / f6;
                            float L6 = gl.L(54.0f) + gl.L(4.165f);
                            if (drawable != null) {
                                if (z4) {
                                    f12 = tgbVar2.j() + gl.L(1.33f);
                                } else {
                                    f12 = 0.0f;
                                }
                                int L7 = (int) (f12 + j2 + gl.L(3.0f));
                                int x = (int) de9.x(drawable.getIntrinsicHeight(), f6, 0.625f, L6);
                                if (z4) {
                                    f13 = tgbVar2.j() + gl.L(1.33f);
                                } else {
                                    f13 = 0.0f;
                                }
                                drawable.setBounds(L7, x, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f13 + j2 + gl.L(3.0f)), (int) b00.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                                drawable.draw(canvas2);
                            }
                            tgb tgbVar3 = cj1Var.k;
                            if (!z4) {
                                f11 = 12.66f;
                            } else {
                                f11 = 4.0f;
                            }
                            float L8 = gl.L(f11) + j2;
                            i5 = i12;
                            i6 = i13;
                            Canvas canvas3 = canvas2;
                            tgbVar3.c(L8, L6, f29, -1, canvas3);
                            canvas2 = canvas3;
                        } else {
                            i5 = i12;
                            i6 = i13;
                        }
                        canvas2.restore();
                        canvas2.restore();
                        max2 = i10 + 1;
                        floor = i5;
                        ceil = i6;
                        i2 = i4;
                        L3 = f31;
                        arrayList = arrayList4;
                        rectF3 = rectF6;
                        gb2Var = gb2Var3;
                        f19 = 0.0f;
                        z3 = false;
                        f6 = 2.0f;
                    }
                    f7 = 0.1f;
                } else {
                    f7 = 0.1f;
                    f8 = 0.05f;
                }
                float f38 = L3;
                int i18 = ceil;
                gb2 gb2Var4 = gb2Var;
                RectF rectF8 = rectF3;
                int i19 = floor;
                if (d > 0.0f) {
                    Path path2 = this.q;
                    path2.rewind();
                    for (int max3 = Math.max(0, i19); max3 < i18; max3++) {
                        float f39 = (max3 * f38) + L2;
                        float f40 = this.m;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addCircle((f40 / 2.0f) + f39, (gl.L(54.0f) / 2.0f) + gl.L(10.0f), gl.L(54.0f) / 2.0f, direction);
                        float f41 = f40 * 0.4f;
                        RectF rectF9 = gl.P;
                        rectF9.set(oo1.z(f40, f41, 2.0f, f39), gl.L(69.0f), tb4.e(f40, f41, 2.0f, f39), gl.L(79.0f));
                        path2.addRoundRect(rectF9, gl.L(3.0f), gl.L(3.0f), direction);
                        float f42 = f40 * 0.35f;
                        rectF9.set(oo1.z(f40, f42, 2.0f, f39), gl.L(83.0f), tb4.e(f40, f42, 2.0f, f39), gl.L(91.0f));
                        path2.addRoundRect(rectF9, gl.L(2.5f), gl.L(2.5f), direction);
                    }
                    if (this.r == null) {
                        r86 r86Var = new r86();
                        this.r = r86Var;
                        r86Var.y = path2;
                        r86Var.D = false;
                    }
                    int v02 = bkb.v0(bkb.F6, gb2Var4.cc);
                    this.r.g(bkb.p1(f8, v02), bkb.p1(0.15f, v02), bkb.p1(f7, v02), bkb.p1(0.3f, v02));
                    r86 r86Var2 = this.r;
                    r86Var2.t = 1.5f;
                    r86Var2.setAlpha((int) (d * 255.0f));
                    canvas2.save();
                    rectF = rectF8;
                    canvas2.translate(0.0f, rectF.bottom - gl.L(99.0f));
                    this.r.draw(canvas2);
                    canvas2.restore();
                } else {
                    rectF = rectF8;
                }
                float a3 = this.x.a(0.02f);
                float L9 = rectF.right - gl.L(20.0f);
                float L10 = rectF.top + gl.L(20.0f);
                canvas2.save();
                canvas2.scale(a3, a3, L9, L10);
                Paint paint4 = this.y;
                paint4.setStrokeWidth(gl.L(1.33f));
                canvas2.drawLine(L9 - gl.L(4.0f), L10 - gl.L(4.0f), L9 + gl.L(4.0f), L10 + gl.L(4.0f), paint4);
                canvas.drawLine(L9 - gl.L(4.0f), L10 + gl.L(4.0f), L9 + gl.L(4.0f), L10 - gl.L(4.0f), paint4);
                this.w.set(L9 - gl.L(12.0f), L10 - gl.L(12.0f), L9 + gl.L(12.0f), L10 + gl.L(12.0f));
                canvas.restore();
                canvas.restore();
            }
        }
    }

    public final boolean d() {
        if (this.d.i1 && this.p.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(k27 k27Var) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        int i;
        TLObject tLObject;
        TLObject tLObject2;
        TLObject tLObject3;
        int i2;
        int i3;
        this.b = k27Var.K1;
        this.d = k27Var;
        this.c = k27.B0(k27Var.k);
        na7.q1(this.b).K0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o = gl.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o);
        textPaint.setTextSize(gl.L(14.0f));
        int i4 = bkb.Yc;
        gb2 gb2Var = this.a;
        textPaint.setColor(bkb.v0(i4, gb2Var.cc));
        this.g = new StaticLayout(k96.M0(2131752379, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.i = 0.0f;
        for (int i5 = 0; i5 < this.g.getLineCount(); i5++) {
            this.h = Math.min(this.h, this.g.getLineLeft(i5));
            this.i = Math.max(this.i, this.g.getLineRight(i5));
        }
        this.j = this.g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.y;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(bkb.v0(bkb.V5, gb2Var.cc));
        gb2Var.v0 = gl.L(14.66f) + this.j;
        int i6 = 0;
        while (true) {
            arrayList = this.p;
            if (i6 >= arrayList.size()) {
                break;
            }
            cj1 cj1Var = (cj1) arrayList.get(i6);
            int i7 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = cj1Var.c;
                if (i7 < imageReceiverArr.length) {
                    imageReceiverArr[i7].K();
                    i7++;
                }
            }
            i6++;
        }
        arrayList.clear();
        p97 J0 = na7.q1(this.b).J0(this.c);
        if (J0 != null) {
            arrayList2 = new ArrayList(J0.b);
        } else {
            arrayList2 = new ArrayList();
        }
        int i8 = 0;
        while (i8 < arrayList2.size()) {
            TLObject tLObject4 = (TLObject) arrayList2.get(i8);
            if ((tLObject4 instanceof TLRPC.Chat) && !hc2.r0((TLRPC.Chat) tLObject4)) {
                arrayList2.remove(i8);
                i8--;
            }
            i8++;
        }
        if (!arrayList2.isEmpty() && (y6c.h(this.b).p() || arrayList2.size() != 1)) {
            z = false;
        } else {
            z = true;
        }
        this.s = z;
        if (!z) {
            int size = arrayList2.size();
            if (!y6c.h(this.b).p() && J0.c > 0) {
                size = Math.min(size - 1, na7.q1(this.b).k4.Q1.f());
            }
            int min = Math.min(size, 10);
            for (int i9 = 0; i9 < min; i9++) {
                arrayList.add(new cj1(gb2Var, (TLObject) arrayList2.get(i9)));
            }
            if (min < arrayList2.size()) {
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i3 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i3);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i2 = min + 2) < arrayList2.size()) {
                    tLObject3 = (TLObject) arrayList2.get(i2);
                } else {
                    tLObject3 = null;
                }
                arrayList.add(new cj1(gb2Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + J0.c) - min));
            }
        }
        if (this.u == null) {
            if (this.c > 0) {
                i = 2131745127;
            } else {
                i = 2131745125;
            }
            tgb tgbVar = new tgb(k96.M0(i, null), 14.0f, gl.o());
            tgbVar.o = true;
            this.u = tgbVar;
        }
        if (d()) {
            gb2Var.v0 = gl.L(144.0f) + gb2Var.v0;
            this.k.setColor(bkb.v0(bkb.qa, gb2Var.cc));
        }
        float size2 = ((arrayList.size() - 1) * gl.L(9.0f)) + (arrayList.size() * this.m);
        this.o = size2;
        this.n = Utilities.i(this.n, size2, 0.0f);
    }
}
