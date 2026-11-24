package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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
public final class lk1 {
    public boolean A;
    public float B;
    public VelocityTracker C;
    public final mt9 D;
    public kk1 E;
    public uj1 F;
    public final rc2 a;
    public int b;
    public long c;
    public k47 d;
    public long e;
    public StaticLayout g;
    public float h;
    public float i;
    public int j;
    public float n;
    public float o;
    public qa6 r;
    public final ln t;
    public uib u;
    public final u51 x;
    public boolean z;
    public final TextPaint f = new TextPaint(1);
    public final Paint k = new Paint(1);
    public final Path l = new Path();
    public int m = gm.L(66.0f);
    public final ArrayList p = new ArrayList();
    public final Path q = new Path();
    public final RectF v = new RectF();
    public final RectF w = new RectF();
    public final Paint y = new Paint(1);
    public boolean s = true;

    public lk1(rc2 rc2Var) {
        this.a = rc2Var;
        this.D = new mt9(rc2Var.getContext(), null);
        this.x = new u51(rc2Var);
        this.t = new ln(350L, rc2Var, d53.h);
    }

    public final boolean a(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk1.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        mt9 mt9Var = this.D;
        if (mt9Var.b()) {
            float f = mt9Var.j;
            this.n = f;
            this.n = Utilities.i(f, this.o - (this.v.width() - gm.L(14.0f)), 0.0f);
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
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        if (this.d != null) {
            b();
            float f19 = 0.0f;
            if (this.g != null) {
                canvas.save();
                float width = (rc2Var.getWidth() - this.g.getWidth()) / 2.0f;
                RectF rectF2 = gm.P;
                rectF2.set((this.h + width) - gm.L(8.66f), gm.L(4.0f), this.i + width + gm.L(8.66f), gm.L(10.66f) + this.j);
                rc2Var.w1(canvas, rectF2, gm.L(11.0f));
                canvas.translate(width, gm.L(7.33f));
                this.f.setColor(cmb.v0(cmb.Yc, rc2Var.cc));
                this.g.draw(canvas);
                canvas.restore();
                f = gm.L(10.66f) + this.j + 0.0f;
            } else {
                f = 0.0f;
            }
            if (yc2Var.M2) {
                if (d()) {
                    f2 = yc2Var.L1;
                } else {
                    f2 = 1.0f - yc2Var.L1;
                }
            } else if (d()) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            float i8 = Utilities.i((f2 - 0.3f) / 0.7f, 1.0f, 0.0f);
            if (i8 > 0.0f) {
                int width2 = rc2Var.getWidth() - gm.L(18.0f);
                if (width2 > gm.L(441.0f)) {
                    max = gm.L(66.0f);
                } else {
                    max = Math.max((width2 / 4.5f) - gm.L(9.0f), gm.L(66.0f));
                }
                this.m = (int) max;
                ArrayList arrayList2 = this.p;
                this.o = ((arrayList2.size() - 1) * gm.L(9.0f)) + (arrayList2.size() * i);
                int min = (int) Math.min(width2, this.m * 6.5f);
                RectF rectF3 = this.v;
                rectF3.set((rc2Var.getWidth() - min) / 2.0f, gm.L(10.0f) + f, (rc2Var.getWidth() + min) / 2.0f, f + gm.L(138.0f));
                this.n = Utilities.i(this.n, this.o - (rectF3.width() - gm.L(14.0f)), 0.0f);
                int i9 = (Math.abs(i8 - (-1.0f)) > 0.001f ? 1 : (Math.abs(i8 - (-1.0f)) == 0.001f ? 0 : -1));
                Path path = this.l;
                if (i9 < 0) {
                    f6 = 2.0f;
                    i2 = 1;
                    f5 = 9.0f;
                    f3 = 6.0f;
                    f4 = 8.0f;
                } else {
                    float L = gm.L(16.66f) * 2.0f;
                    f3 = 6.0f;
                    float f20 = rectF3.bottom;
                    path.rewind();
                    f4 = 8.0f;
                    RectF rectF4 = gm.P;
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
                    path.lineTo(rectF3.centerX() + gm.L(8.0f), rectF3.top);
                    path.lineTo(rectF3.centerX(), rectF3.top - gm.L(6.0f));
                    path.lineTo(rectF3.centerX() - gm.L(8.0f), rectF3.top);
                    path.close();
                }
                canvas.save();
                float f28 = (i8 * 0.6f) + 0.4f;
                canvas.scale(f28, f28, rectF3.centerX(), rectF3.top - gm.L(f3));
                int v0 = cmb.v0(cmb.qa, rc2Var.cc);
                Paint paint = this.k;
                paint.setColor(v0);
                paint.setAlpha((int) (i8 * 255.0f));
                paint.setShadowLayer(gm.N(1.0f), 0.0f, gm.N(0.33f), on2.p(-16777216, (int) (27.0f * i8)));
                canvas.drawPath(path, paint);
                canvas.clipPath(path);
                uib uibVar = this.u;
                if (uibVar != null) {
                    arrayList = arrayList2;
                    uibVar.c(rectF3.left + gm.L(17.0f), rectF3.top + gm.L(20.0f), i8, cmb.v0(cmb.F6, rc2Var.cc), canvas);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList2;
                }
                float d = this.t.d(this.s);
                float L2 = (rectF3.left + gm.L(7.0f)) - this.n;
                float L3 = gm.L(f5) + this.m;
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
                        kk1 kk1Var = (kk1) arrayList.get(i10);
                        canvas2.save();
                        canvas2.translate((i10 * L3) + L2, rectF3.bottom - gm.L(99.0f));
                        int i11 = this.m;
                        float f29 = (1.0f - d) * i8;
                        pc0[] pc0VarArr = kk1Var.b;
                        boolean z4 = kk1Var.g;
                        float f30 = f19;
                        Drawable drawable = kk1Var.h;
                        boolean z5 = z3;
                        ImageReceiver[] imageReceiverArr = kk1Var.c;
                        float f31 = L3;
                        rc2 rc2Var2 = kk1Var.a;
                        int i12 = floor;
                        u51 u51Var = kk1Var.n;
                        int i13 = ceil;
                        uib uibVar2 = kk1Var.k;
                        Paint paint2 = kk1Var.j;
                        canvas2.save();
                        float a = u51Var.a(0.075f);
                        float f32 = i11;
                        float f33 = f32 / f6;
                        canvas2.scale(a, a, f33, gm.L(99.0f) / f6);
                        Paint paint3 = kk1Var.i;
                        paint3.setStrokeWidth(gm.L(2.66f));
                        paint3.setColor(cmb.v0(cmb.qa, rc2Var2.cc));
                        int length = imageReceiverArr.length - 1;
                        while (length >= 0) {
                            int i14 = length;
                            float length2 = (f33 - (((imageReceiverArr.length - 1) * gm.L(7.0f)) / f6)) + (gm.L(7.0f) * i14);
                            float L4 = (gm.L(54.0f) / f6) + gm.L(10.0f);
                            ArrayList arrayList3 = arrayList;
                            RectF rectF5 = rectF3;
                            if (imageReceiverArr.length > i2) {
                                canvas2.drawCircle(length2, L4, gm.L(54.0f) / f6, paint3);
                            }
                            imageReceiverArr[i14].i0(length2 - (gm.L(54.0f) / f6), L4 - (gm.L(54.0f) / f6), gm.L(54.0f), gm.L(54.0f));
                            imageReceiverArr[i14].setAlpha(f29);
                            imageReceiverArr[i14].h(canvas2, null);
                            length = i14 - 1;
                            arrayList = arrayList3;
                            rectF3 = rectF5;
                            rc2Var = rc2Var;
                            i2 = 1;
                        }
                        rc2 rc2Var3 = rc2Var;
                        RectF rectF6 = rectF3;
                        ArrayList arrayList4 = arrayList;
                        if (uibVar2 != null) {
                            uibVar2.p = i11 - gm.L(32.0f);
                            if (drawable != null) {
                                f14 = 17.0f;
                            } else {
                                f14 = f4;
                            }
                            float j = uibVar2.j() + gm.L(f14);
                            float L5 = gm.L(1.0f) + gm.L(54.0f) + gm.L(10.0f);
                            f9 = 32.0f;
                            i3 = 2;
                            gm.P.set((f32 - j) / f6, L5 - gm.L(14.33f), (f32 + j) / f6, L5);
                            if (!kk1Var.m) {
                                if (z4) {
                                    paint2.setColor(cmb.v(cmb.v0(cmb.qa, rc2Var2.cc), cmb.p1(0.85f, cmb.v0(cmb.x6, rc2Var2.cc))));
                                    kk1Var.m = true;
                                } else {
                                    Drawable drawable2 = imageReceiverArr[z5 ? 1 : 0].n0;
                                    if (drawable2 instanceof BitmapDrawable) {
                                        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                        try {
                                            fArr = new float[3];
                                            on2.j(bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2), fArr);
                                            f16 = fArr[1];
                                        } catch (Exception e) {
                                            z2 = true;
                                            fc4.g(e, true);
                                        }
                                        if (f16 > 0.05f && f16 < 0.95f) {
                                            float f34 = fArr[2];
                                            if (f34 > 0.02f && f34 < 0.98f) {
                                                fArr[1] = 0.25f;
                                                if (cmb.I.o()) {
                                                    f18 = 0.35f;
                                                } else {
                                                    f18 = 0.65f;
                                                }
                                                fArr[2] = f18;
                                                paint2.setColor(on2.a(fArr));
                                                z2 = true;
                                                kk1Var.m = z2;
                                            }
                                        }
                                        fArr[1] = f30;
                                        if (cmb.I.o()) {
                                            f17 = 0.38f;
                                        } else {
                                            f17 = 0.7f;
                                        }
                                        fArr[2] = f17;
                                        paint2.setColor(on2.a(fArr));
                                        z2 = true;
                                        kk1Var.m = z2;
                                    } else if (!kk1Var.l) {
                                        try {
                                            int b = pc0VarArr[z5 ? 1 : 0].b();
                                            pc0 pc0Var = pc0VarArr[z5 ? 1 : 0];
                                            boolean z6 = pc0Var.g;
                                            int i15 = pc0Var.e;
                                            if (z6) {
                                                f15 = 0.95f;
                                                amb i16 = cmb.I.i(z5);
                                                bmb bmbVar = cmb.I;
                                                if (i16 != null) {
                                                    i7 = i16.c;
                                                } else {
                                                    i7 = 0;
                                                }
                                                i15 = cmb.B(bmbVar, i7, i15);
                                            } else {
                                                f15 = 0.95f;
                                            }
                                            int f35 = on2.f(0.5f, b, i15);
                                            float[] fArr2 = new float[3];
                                            on2.j(f35, fArr2);
                                            float f36 = fArr2[1];
                                            if (f36 > 0.05f && f36 < f15) {
                                                fArr2[1] = Utilities.i(f36 - 0.06f, 0.4f, f30);
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.08f, 0.5f, 0.2f);
                                            } else {
                                                fArr2[2] = Utilities.i(fArr2[2] - 0.1f, 0.6f, 0.3f);
                                            }
                                            paint2.setColor(on2.a(fArr2));
                                            z = true;
                                        } catch (Exception e2) {
                                            z = true;
                                            fc4.g(e2, true);
                                        }
                                        kk1Var.l = z;
                                    }
                                }
                            }
                            RectF rectF7 = gm.P;
                            canvas2.drawRoundRect(rectF7, gm.L(f4), gm.L(f4), paint2);
                            rectF7.inset((-gm.L(1.0f)) / f6, (-gm.L(1.0f)) / f6);
                            paint3.setStrokeWidth(gm.L(1.0f));
                            canvas2.drawRoundRect(rectF7, gm.L(f4), gm.L(f4), paint3);
                        } else {
                            f9 = 32.0f;
                            i3 = 2;
                        }
                        canvas2.restore();
                        int i17 = this.m;
                        TextPaint textPaint = kk1Var.d;
                        canvas2.save();
                        float a2 = u51Var.a(0.075f);
                        float f37 = i17;
                        canvas2.scale(a2, a2, f37 / f6, gm.L(99.0f) / f6);
                        StaticLayout staticLayout = kk1Var.f;
                        if (staticLayout == null || staticLayout.getWidth() != i17) {
                            CharSequence charSequence = kk1Var.e;
                            kk1Var.f = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i17).setMaxLines(i3).setEllipsize(TextUtils.TruncateAt.END).setBreakStrategy(0).setAlignment(Layout.Alignment.ALIGN_CENTER).build();
                        }
                        if (kk1Var.f != null) {
                            canvas2.save();
                            canvas2.translate((i17 - kk1Var.f.getWidth()) / f6, gm.L(66.33f));
                            i4 = 1;
                            if (imageReceiverArr.length <= 1) {
                                textPaint.setColor(cmb.v0(cmb.Uc, rc2Var2.cc));
                            } else {
                                textPaint.setColor(cmb.v0(cmb.x6, rc2Var2.cc));
                            }
                            textPaint.setAlpha((int) (textPaint.getAlpha() * f29));
                            kk1Var.f.draw(canvas2);
                            canvas2.restore();
                        } else {
                            i4 = 1;
                        }
                        if (uibVar2 != null) {
                            uibVar2.p = i17 - gm.L(f9);
                            if (drawable != null) {
                                f10 = 17.0f;
                            } else {
                                f10 = f4;
                            }
                            float j2 = (f37 - (uibVar2.j() + gm.L(f10))) / f6;
                            float L6 = gm.L(54.0f) + gm.L(4.165f);
                            if (drawable != null) {
                                if (z4) {
                                    f12 = uibVar2.j() + gm.L(1.33f);
                                } else {
                                    f12 = 0.0f;
                                }
                                int L7 = (int) (f12 + j2 + gm.L(3.0f));
                                int x = (int) hg9.x(drawable.getIntrinsicHeight(), f6, 0.625f, L6);
                                if (z4) {
                                    f13 = uibVar2.j() + gm.L(1.33f);
                                } else {
                                    f13 = 0.0f;
                                }
                                drawable.setBounds(L7, x, (int) ((drawable.getIntrinsicWidth() * 0.625f) + f13 + j2 + gm.L(3.0f)), (int) b10.A(drawable.getIntrinsicHeight(), 2.0f, 0.625f, L6));
                                drawable.draw(canvas2);
                            }
                            uib uibVar3 = kk1Var.k;
                            if (!z4) {
                                f11 = 12.66f;
                            } else {
                                f11 = 4.0f;
                            }
                            float L8 = gm.L(f11) + j2;
                            i5 = i12;
                            i6 = i13;
                            Canvas canvas3 = canvas2;
                            uibVar3.c(L8, L6, f29, -1, canvas3);
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
                        rc2Var = rc2Var3;
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
                rc2 rc2Var4 = rc2Var;
                RectF rectF8 = rectF3;
                int i19 = floor;
                if (d > 0.0f) {
                    Path path2 = this.q;
                    path2.rewind();
                    for (int max3 = Math.max(0, i19); max3 < i18; max3++) {
                        float f39 = (max3 * f38) + L2;
                        float f40 = this.m;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addCircle((f40 / 2.0f) + f39, (gm.L(54.0f) / 2.0f) + gm.L(10.0f), gm.L(54.0f) / 2.0f, direction);
                        float f41 = f40 * 0.4f;
                        RectF rectF9 = gm.P;
                        rectF9.set(aq1.z(f40, f41, 2.0f, f39), gm.L(69.0f), td4.e(f40, f41, 2.0f, f39), gm.L(79.0f));
                        path2.addRoundRect(rectF9, gm.L(3.0f), gm.L(3.0f), direction);
                        float f42 = f40 * 0.35f;
                        rectF9.set(aq1.z(f40, f42, 2.0f, f39), gm.L(83.0f), td4.e(f40, f42, 2.0f, f39), gm.L(91.0f));
                        path2.addRoundRect(rectF9, gm.L(2.5f), gm.L(2.5f), direction);
                    }
                    if (this.r == null) {
                        qa6 qa6Var = new qa6();
                        this.r = qa6Var;
                        qa6Var.y = path2;
                        qa6Var.D = false;
                    }
                    int v02 = cmb.v0(cmb.F6, rc2Var4.cc);
                    this.r.g(cmb.p1(f8, v02), cmb.p1(0.15f, v02), cmb.p1(f7, v02), cmb.p1(0.3f, v02));
                    qa6 qa6Var2 = this.r;
                    qa6Var2.t = 1.5f;
                    qa6Var2.setAlpha((int) (d * 255.0f));
                    canvas2.save();
                    rectF = rectF8;
                    canvas2.translate(0.0f, rectF.bottom - gm.L(99.0f));
                    this.r.draw(canvas2);
                    canvas2.restore();
                } else {
                    rectF = rectF8;
                }
                float a3 = this.x.a(0.02f);
                float L9 = rectF.right - gm.L(20.0f);
                float L10 = rectF.top + gm.L(20.0f);
                canvas2.save();
                canvas2.scale(a3, a3, L9, L10);
                Paint paint4 = this.y;
                paint4.setStrokeWidth(gm.L(1.33f));
                canvas2.drawLine(L9 - gm.L(4.0f), L10 - gm.L(4.0f), L9 + gm.L(4.0f), L10 + gm.L(4.0f), paint4);
                canvas.drawLine(L9 - gm.L(4.0f), L10 + gm.L(4.0f), L9 + gm.L(4.0f), L10 - gm.L(4.0f), paint4);
                this.w.set(L9 - gm.L(12.0f), L10 - gm.L(12.0f), L9 + gm.L(12.0f), L10 + gm.L(12.0f));
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

    public final void e(k47 k47Var) {
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
        this.b = k47Var.K1;
        this.d = k47Var;
        this.c = k47.B0(k47Var.k);
        oc7.r1(this.b).L0(Long.valueOf(-this.c));
        this.e = -this.c;
        Typeface o = gm.o();
        TextPaint textPaint = this.f;
        textPaint.setTypeface(o);
        textPaint.setTextSize(gm.L(14.0f));
        int i4 = cmb.Yc;
        rc2 rc2Var = this.a;
        textPaint.setColor(cmb.v0(i4, rc2Var.cc));
        this.g = new StaticLayout(jb6.M0(2131752335, null), textPaint, this.d.l1(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
        paint.setColor(cmb.v0(cmb.V5, rc2Var.cc));
        rc2Var.v0 = gm.L(14.66f) + this.j;
        int i6 = 0;
        while (true) {
            arrayList = this.p;
            if (i6 >= arrayList.size()) {
                break;
            }
            kk1 kk1Var = (kk1) arrayList.get(i6);
            int i7 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = kk1Var.c;
                if (i7 < imageReceiverArr.length) {
                    imageReceiverArr[i7].K();
                    i7++;
                }
            }
            i6++;
        }
        arrayList.clear();
        qb7 K0 = oc7.r1(this.b).K0(this.c);
        if (K0 != null) {
            arrayList2 = new ArrayList(K0.b);
        } else {
            arrayList2 = new ArrayList();
        }
        int i8 = 0;
        while (i8 < arrayList2.size()) {
            TLObject tLObject4 = (TLObject) arrayList2.get(i8);
            if ((tLObject4 instanceof TLRPC.Chat) && !sd2.r0((TLRPC.Chat) tLObject4)) {
                arrayList2.remove(i8);
                i8--;
            }
            i8++;
        }
        if (!arrayList2.isEmpty() && (z8c.h(this.b).p() || arrayList2.size() != 1)) {
            z = false;
        } else {
            z = true;
        }
        this.s = z;
        if (!z) {
            int size = arrayList2.size();
            if (!z8c.h(this.b).p() && K0.c > 0) {
                size = Math.min(size - 1, oc7.r1(this.b).l4.Q1.f());
            }
            int min = Math.min(size, 10);
            for (int i9 = 0; i9 < min; i9++) {
                arrayList.add(new kk1(rc2Var, (TLObject) arrayList2.get(i9)));
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
                arrayList.add(new kk1(rc2Var, new TLObject[]{tLObject, tLObject2, tLObject3}, (arrayList2.size() + K0.c) - min));
            }
        }
        if (this.u == null) {
            if (this.c > 0) {
                i = 2131745053;
            } else {
                i = 2131745051;
            }
            uib uibVar = new uib(jb6.M0(i, null), 14.0f, gm.o());
            uibVar.o = true;
            this.u = uibVar;
        }
        if (d()) {
            rc2Var.v0 = gm.L(144.0f) + rc2Var.v0;
            this.k.setColor(cmb.v0(cmb.qa, rc2Var.cc));
        }
        float size2 = ((arrayList.size() - 1) * gm.L(9.0f)) + (arrayList.size() * this.m);
        this.o = size2;
        this.n = Utilities.i(this.n, size2, 0.0f);
    }
}
