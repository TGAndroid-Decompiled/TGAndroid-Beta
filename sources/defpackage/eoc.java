package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class eoc extends View {
    public final koc a;

    public eoc(koc kocVar, Context context) {
        super(context);
        this.a = kocVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i2;
        RectF rectF;
        float max;
        RectF rectF2;
        RectF rectF3;
        int i3;
        RectF rectF4;
        RectF rectF5;
        RectF rectF6;
        Canvas canvas2;
        Paint paint;
        RectF rectF7;
        koc kocVar;
        int i4;
        boolean z;
        Path path;
        smc smcVar;
        float f8;
        koc kocVar2 = this.a;
        RectF rectF8 = kocVar2.G1;
        Path path2 = kocVar2.J;
        smc smcVar2 = kocVar2.c;
        Matrix matrix = kocVar2.a0;
        Paint paint2 = kocVar2.G;
        RectF rectF9 = kocVar2.I;
        Paint paint3 = kocVar2.y;
        Path path3 = kocVar2.U;
        if (kocVar2.Z0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = kocVar2.T;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                hoc hocVar = (hoc) obj;
                float f9 = hocVar.h / hocVar.f;
                if (f9 < 0.1f) {
                    f8 = f9 / 0.1f;
                } else {
                    float f10 = 1.0f - ((f9 - 0.1f) / 0.9f);
                    f8 = f10 * f10;
                }
                ArrayList arrayList2 = arrayList;
                int i6 = size;
                float z2 = yjb.z(f8, 0.4f, 0.6f, hocVar.e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.l(f8) * 130.0f));
                canvas.save();
                canvas.translate(hocVar.a, hocVar.b);
                canvas.rotate(hocVar.g);
                path3.rewind();
                float f11 = -z2;
                float f12 = f11 * 2.0f;
                path3.moveTo(0.0f, f12);
                float f13 = z2 * 0.35f;
                float f14 = f11 * 0.35f;
                path3.lineTo(f13, f14);
                float f15 = z2 * 2.0f;
                path3.lineTo(f15, 0.0f);
                path3.lineTo(f13, f13);
                path3.lineTo(0.0f, f15);
                path3.lineTo(f14, f13);
                path3.lineTo(f12, 0.0f);
                path3.lineTo(f14, f14);
                path3.close();
                canvas.drawPath(path3, paint3);
                canvas.restore();
                arrayList = arrayList2;
                size = i6;
            }
            float f16 = 1.0f;
            paint3.setAlpha(255);
            ArrayList arrayList3 = kocVar2.n;
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                goc gocVar = (goc) obj2;
                float l = f16 - Utilities.l(gocVar.c / 0.42f);
                float v = oo1.v(l, l, l, f16);
                paint2.setColor(-1);
                paint2.setAlpha((int) (l * 90.0f));
                paint2.setStrokeWidth(gl.L(2.4f) * l);
                canvas.drawCircle(gocVar.a, gocVar.b, yjb.z(v, 0.43f, 0.42f, kocVar2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f16 = 1.0f;
            }
            Paint paint4 = kocVar2.t1;
            Path path4 = kocVar2.v1;
            Paint paint5 = kocVar2.s1;
            float l2 = Utilities.l(kocVar2.r1.a);
            if (l2 >= 0.01f && kocVar2.C()) {
                paint4.setAlpha((int) (22.0f * l2));
                canvas.drawPath(path4, paint4);
                float L = gl.L(6.0f);
                float L2 = gl.L(4.5f);
                float f17 = L + L2;
                i = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f17 - ((kocVar2.o1 * gl.L(18.0f)) % f17)));
                paint5.setStrokeWidth(gl.L(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * l2), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(gl.L(1.8f));
                paint5.setColor(Color.argb((int) (l2 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            } else {
                i = 1;
            }
            float y = b00.y(kocVar2.b0, 0.6f, kocVar2.c0, 10.0f);
            matrix.setScale(kocVar2.Z0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f18 = kocVar2.Z0;
            matrix.postTranslate(b00.w(y, f18, 0.45f, (-f18) * 0.25f), 0.0f);
            kocVar2.W.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = smcVar2.getStickerObstacles();
            RectF rectF10 = stickerObstacles.get(0);
            RectF rectF11 = stickerObstacles.get(i);
            RectF rectF12 = stickerObstacles.get(2);
            RectF rectF13 = stickerObstacles.get(3);
            RectF rectF14 = stickerObstacles.get(4);
            RectF rectF15 = stickerObstacles.get(5);
            ArrayList G = kocVar2.G();
            Path path5 = path2;
            int size3 = G.size();
            smc smcVar3 = smcVar2;
            Paint paint6 = paint3;
            int i8 = 0;
            float f19 = 0.0f;
            float f20 = 0.0f;
            float f21 = 0.0f;
            float f22 = 0.0f;
            while (i8 < size3) {
                int i9 = i8 + 1;
                joc jocVar = (joc) G.get(i8);
                byte b = jocVar.H;
                int i10 = size3;
                ioc iocVar = jocVar.i;
                ArrayList arrayList4 = G;
                ioc iocVar2 = jocVar.f;
                ioc iocVar3 = jocVar.e;
                RectF rectF16 = rectF12;
                ioc iocVar4 = jocVar.j;
                float f23 = f21;
                ioc iocVar5 = jocVar.k;
                RectF rectF17 = rectF15;
                ioc iocVar6 = jocVar.p;
                float f24 = f20;
                if (b != 2 && (b != 1 || (jocVar.O && iocVar4.a > 0.3f))) {
                    kocVar = kocVar2;
                    rectF6 = rectF14;
                    rectF4 = rectF11;
                    rectF = rectF13;
                    max = f19;
                    path = path5;
                    smcVar = smcVar3;
                    paint = paint6;
                    rectF7 = rectF16;
                    rectF5 = rectF17;
                    rectF2 = rectF10;
                    rectF3 = rectF8;
                } else {
                    Bitmap a = jocVar.a();
                    float f25 = jocVar.l.a;
                    float l3 = Utilities.l(jocVar.r.a);
                    RectF rectF18 = rectF11;
                    float f26 = f19;
                    float z3 = yjb.z(l3, 0.2f, 0.8f, (((1.0f - (jocVar.q.a * 0.9f)) * 0.04f * f25) + 1.0f) * kocVar2.U() * jocVar.g.a * jocVar.h.a);
                    if (a != null && z3 >= 1.0f) {
                        float max2 = Math.max(iocVar4.a, 0.7f * f25);
                        float L3 = (gl.L(9.0f) * max2) + gl.L(1.5f);
                        float sin = ((float) Math.sin(Math.toRadians(kocVar2.c0))) * L3 * 2.2f;
                        float sin2 = ((float) Math.sin(Math.toRadians(kocVar2.b0))) * L3 * 2.2f;
                        koc kocVar3 = kocVar2;
                        float f27 = iocVar3.a + jocVar.n.a + sin;
                        float L4 = ((iocVar2.a + jocVar.o.a) + sin2) - (gl.L(4.0f) * max2);
                        float f28 = iocVar3.a - (sin * 0.3f);
                        float f29 = (iocVar2.a - (sin2 * 0.3f)) + (L3 * 0.22f);
                        float l4 = Utilities.l((f25 * 1.5f) + (3.0f * max2) + iocVar6.a + iocVar5.a);
                        rectF8.set(Math.min(f27, f28) - z3, Math.min(L4, f29) - z3, Math.max(f27, f28) + z3, Math.max(L4, f29) + z3);
                        boolean intersects = RectF.intersects(rectF8, rectF13);
                        float f30 = z3 * 0.4f;
                        rectF = rectF13;
                        rectF9.set(f27 - f30, L4 - f30, f27 + f30, L4 + f30);
                        max = Math.max(f26, Math.max(koc.n(rectF9, rectF10), koc.n(rectF9, rectF14)) * l3);
                        f24 = Math.max(f24, koc.n(rectF9, rectF18) * l3);
                        f23 = Math.max(f23, koc.n(rectF9, rectF17) * l3);
                        rectF2 = rectF10;
                        f22 = Math.max(f22, koc.n(rectF9, rectF16) * l3);
                        if (intersects) {
                            rectF3 = rectF8;
                            i3 = canvas.saveLayer(rectF8, null);
                        } else {
                            rectF3 = rectF8;
                            i3 = -1;
                        }
                        canvas.save();
                        canvas.rotate(iocVar.a, f28, f29);
                        rectF4 = rectF18;
                        rectF5 = rectF17;
                        rectF6 = rectF14;
                        kocVar3.t(canvas, jocVar, f28, f29, yjb.z(iocVar6.a, 0.07f, (0.08f * max2) + 0.97f, z3), Math.max(max2, iocVar5.a * 0.5f), iocVar6.a, l4 * l3);
                        canvas.restore();
                        float f31 = f27 - z3;
                        float f32 = L4 - z3;
                        float f33 = f27 + z3;
                        float f34 = L4 + z3;
                        int saveLayer = canvas.saveLayer(f31, f32, f33, f34, null);
                        Paint paint7 = paint6;
                        paint7.setAlpha((int) (255.0f * l3));
                        float f35 = iocVar5.a;
                        if (f35 > 0.004f) {
                            paint = paint7;
                            rectF7 = rectF16;
                            i4 = saveLayer;
                            z = intersects;
                            kocVar3.r(canvas, a, f27, L4, z3, f35, 1.0f, iocVar.a, jocVar.U, jocVar.V);
                            kocVar = kocVar3;
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            paint = paint7;
                            rectF7 = rectF16;
                            kocVar = kocVar3;
                            i4 = saveLayer;
                            z = intersects;
                            canvas2.save();
                            canvas2.rotate(iocVar.a, f27, L4);
                            float f36 = z3 / 2.0f;
                            rectF9.set(f27 - f36, L4 - f36, f27 + f36, L4 + f36);
                            canvas2.drawBitmap(a, (Rect) null, rectF9, paint);
                            canvas2.restore();
                        }
                        paint.setAlpha(255);
                        canvas2.drawRect(f31, f32, f33, f34, kocVar.V);
                        canvas2.restoreToCount(i4);
                        if (z) {
                            if (z) {
                                path = path5;
                                smcVar = smcVar3;
                                smcVar.h(path, kocVar.Z0, kocVar.a1);
                                canvas2.drawPath(path, kocVar.H1);
                            } else {
                                path = path5;
                                smcVar = smcVar3;
                            }
                            canvas2.restoreToCount(i3);
                        } else {
                            path = path5;
                            smcVar = smcVar3;
                        }
                    } else {
                        f19 = f26;
                        path5 = path5;
                        f22 = f22;
                        kocVar2 = kocVar2;
                        smcVar3 = smcVar3;
                        paint6 = paint6;
                        rectF14 = rectF14;
                        i8 = i9;
                        size3 = i10;
                        G = arrayList4;
                        rectF10 = rectF10;
                        rectF8 = rectF8;
                        rectF15 = rectF17;
                        rectF12 = rectF16;
                        f20 = f24;
                        f21 = f23;
                        rectF11 = rectF18;
                        rectF13 = rectF13;
                    }
                }
                path5 = path;
                kocVar2 = kocVar;
                smcVar3 = smcVar;
                paint6 = paint;
                rectF14 = rectF6;
                f19 = max;
                i8 = i9;
                size3 = i10;
                G = arrayList4;
                rectF10 = rectF2;
                f21 = f23;
                rectF8 = rectF3;
                f20 = f24;
                rectF11 = rectF4;
                rectF15 = rectF5;
                rectF13 = rectF;
                rectF12 = rectF7;
            }
            koc kocVar4 = kocVar2;
            float f37 = f19;
            float f38 = f20;
            float f39 = f21;
            smc smcVar4 = smcVar3;
            float f40 = f22;
            Paint paint8 = kocVar4.l0;
            Paint paint9 = kocVar4.m0;
            Paint paint10 = kocVar4.k0;
            joc jocVar2 = kocVar4.i0;
            if (jocVar2 != null && jocVar2.H == 2) {
                float f41 = jocVar2.e.a + jocVar2.n.a;
                float f42 = jocVar2.f.a + jocVar2.o.a;
                float P = (kocVar4.P(jocVar2) * 0.5f) + gl.L(9.0f);
                paint10.setColor(-1);
                Paint.Style style = Paint.Style.STROKE;
                paint10.setStyle(style);
                paint10.setStrokeCap(Paint.Cap.ROUND);
                paint10.setStrokeWidth(gl.L(2.0f));
                if (paint10.getPathEffect() == null) {
                    f7 = f37;
                    i2 = 1;
                    paint10.setPathEffect(new DashPathEffect(new float[]{gl.L(10.0f), gl.L(10.0f)}, 0.5f));
                } else {
                    f7 = f37;
                    i2 = 1;
                }
                paint10.setShadowLayer(gl.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint9.setColor(-1);
                paint9.setStyle(style);
                paint9.setStrokeWidth(gl.L(2.66f));
                paint9.setShadowLayer(gl.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint8.setColor(-15033089);
                canvas.save();
                canvas.rotate(jocVar2.i.a, f41, f42);
                float f43 = f41 - P;
                float f44 = f42 - P;
                float f45 = f41 + P;
                float f46 = f42 + P;
                f3 = f38;
                f2 = f40;
                f5 = 0.0f;
                f4 = f39;
                f = f7;
                int i11 = i2;
                canvas.drawArc(f43, f44, f45, f46, 0.0f, 180.0f, false, paint10);
                canvas.drawArc(f43, f44, f45, f46, 180.0f, 180.0f, false, paint10);
                for (int i12 = -1; i12 <= i11; i12 += 2) {
                    float f47 = (i12 * P) + f41;
                    canvas.drawCircle(f47, f42, gl.L(5.66f), paint9);
                    canvas.drawCircle(f47, f42, gl.L(4.66f), paint8);
                }
                canvas.restore();
            } else {
                f = f37;
                f2 = f40;
                f3 = f38;
                f4 = f39;
                f5 = 0.0f;
            }
            pmc pmcVar = smcVar4.O;
            float round = Math.round(f2 * 20.0f) / 20.0f;
            if (round != smcVar4.K) {
                smcVar4.K = round;
                smcVar4.I.invalidate();
            }
            if (Math.max(f4, f) > f5) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if (f6 != smcVar4.h) {
                smcVar4.h = f6;
                pmcVar.invalidate();
            }
            float round2 = Math.round(f * 20.0f) / 20.0f;
            float round3 = Math.round(f3 * 20.0f) / 20.0f;
            if (round2 != smcVar4.e0) {
                smcVar4.e0 = round2;
                pmcVar.invalidate();
                smcVar4.P.invalidate();
            }
            if (round3 != smcVar4.f0) {
                smcVar4.f0 = round3;
                smcVar4.H.invalidate();
            }
        }
    }
}
