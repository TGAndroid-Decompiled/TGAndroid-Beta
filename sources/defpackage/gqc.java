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
public final class gqc extends View {
    public final mqc a;

    public gqc(mqc mqcVar, Context context) {
        super(context);
        this.a = mqcVar;
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
        mqc mqcVar;
        int i4;
        boolean z;
        Path path;
        soc socVar;
        float f8;
        mqc mqcVar2 = this.a;
        RectF rectF8 = mqcVar2.G1;
        Path path2 = mqcVar2.J;
        soc socVar2 = mqcVar2.c;
        Matrix matrix = mqcVar2.a0;
        Paint paint2 = mqcVar2.G;
        RectF rectF9 = mqcVar2.I;
        Paint paint3 = mqcVar2.y;
        Path path3 = mqcVar2.U;
        if (mqcVar2.Z0 > 0.0f) {
            paint3.setShader(null);
            paint3.setColorFilter(null);
            ArrayList arrayList = mqcVar2.T;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                jqc jqcVar = (jqc) obj;
                float f9 = jqcVar.h / jqcVar.f;
                if (f9 < 0.1f) {
                    f8 = f9 / 0.1f;
                } else {
                    float f10 = 1.0f - ((f9 - 0.1f) / 0.9f);
                    f8 = f10 * f10;
                }
                ArrayList arrayList2 = arrayList;
                int i6 = size;
                float A = mlb.A(f8, 0.4f, 0.6f, jqcVar.e);
                paint3.setColor(-1);
                paint3.setAlpha((int) (Utilities.l(f8) * 130.0f));
                canvas.save();
                canvas.translate(jqcVar.a, jqcVar.b);
                canvas.rotate(jqcVar.g);
                path3.rewind();
                float f11 = -A;
                float f12 = f11 * 2.0f;
                path3.moveTo(0.0f, f12);
                float f13 = A * 0.35f;
                float f14 = f11 * 0.35f;
                path3.lineTo(f13, f14);
                float f15 = A * 2.0f;
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
            ArrayList arrayList3 = mqcVar2.n;
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                iqc iqcVar = (iqc) obj2;
                float l = f16 - Utilities.l(iqcVar.c / 0.42f);
                float v = aq1.v(l, l, l, f16);
                paint2.setColor(-1);
                paint2.setAlpha((int) (l * 90.0f));
                paint2.setStrokeWidth(gm.L(2.4f) * l);
                canvas.drawCircle(iqcVar.a, iqcVar.b, mlb.A(v, 0.43f, 0.42f, mqcVar2.U()), paint2);
                arrayList3 = arrayList3;
                size2 = size2;
                f16 = 1.0f;
            }
            Paint paint4 = mqcVar2.t1;
            Path path4 = mqcVar2.v1;
            Paint paint5 = mqcVar2.s1;
            float l2 = Utilities.l(mqcVar2.r1.a);
            if (l2 >= 0.01f && mqcVar2.C()) {
                paint4.setAlpha((int) (22.0f * l2));
                canvas.drawPath(path4, paint4);
                float L = gm.L(6.0f);
                float L2 = gm.L(4.5f);
                float f17 = L + L2;
                i = 1;
                paint5.setPathEffect(new DashPathEffect(new float[]{L, L2}, f17 - ((mqcVar2.o1 * gm.L(18.0f)) % f17)));
                paint5.setStrokeWidth(gm.L(3.2f));
                paint5.setColor(Color.argb((int) (40.0f * l2), 0, 18, 48));
                canvas.drawPath(path4, paint5);
                paint5.setStrokeWidth(gm.L(1.8f));
                paint5.setColor(Color.argb((int) (l2 * 180.0f), 255, 255, 255));
                canvas.drawPath(path4, paint5);
            } else {
                i = 1;
            }
            float y = b10.y(mqcVar2.b0, 0.6f, mqcVar2.c0, 10.0f);
            matrix.setScale(mqcVar2.Z0 * 1.5f, 1.0f);
            matrix.postRotate(-24.0f);
            float f18 = mqcVar2.Z0;
            matrix.postTranslate(b10.w(y, f18, 0.45f, (-f18) * 0.25f), 0.0f);
            mqcVar2.W.setLocalMatrix(matrix);
            ArrayList<RectF> stickerObstacles = socVar2.getStickerObstacles();
            RectF rectF10 = stickerObstacles.get(0);
            RectF rectF11 = stickerObstacles.get(i);
            RectF rectF12 = stickerObstacles.get(2);
            RectF rectF13 = stickerObstacles.get(3);
            RectF rectF14 = stickerObstacles.get(4);
            RectF rectF15 = stickerObstacles.get(5);
            ArrayList G = mqcVar2.G();
            Path path5 = path2;
            int size3 = G.size();
            soc socVar3 = socVar2;
            Paint paint6 = paint3;
            int i8 = 0;
            float f19 = 0.0f;
            float f20 = 0.0f;
            float f21 = 0.0f;
            float f22 = 0.0f;
            while (i8 < size3) {
                int i9 = i8 + 1;
                lqc lqcVar = (lqc) G.get(i8);
                byte b = lqcVar.H;
                int i10 = size3;
                kqc kqcVar = lqcVar.i;
                ArrayList arrayList4 = G;
                kqc kqcVar2 = lqcVar.f;
                kqc kqcVar3 = lqcVar.e;
                RectF rectF16 = rectF12;
                kqc kqcVar4 = lqcVar.j;
                float f23 = f21;
                kqc kqcVar5 = lqcVar.k;
                RectF rectF17 = rectF15;
                kqc kqcVar6 = lqcVar.p;
                float f24 = f20;
                if (b != 2 && (b != 1 || (lqcVar.O && kqcVar4.a > 0.3f))) {
                    mqcVar = mqcVar2;
                    rectF6 = rectF14;
                    rectF4 = rectF11;
                    rectF = rectF13;
                    max = f19;
                    path = path5;
                    socVar = socVar3;
                    paint = paint6;
                    rectF7 = rectF16;
                    rectF5 = rectF17;
                    rectF2 = rectF10;
                    rectF3 = rectF8;
                } else {
                    Bitmap a = lqcVar.a();
                    float f25 = lqcVar.l.a;
                    float l3 = Utilities.l(lqcVar.r.a);
                    RectF rectF18 = rectF11;
                    float f26 = f19;
                    float A2 = mlb.A(l3, 0.2f, 0.8f, (((1.0f - (lqcVar.q.a * 0.9f)) * 0.04f * f25) + 1.0f) * mqcVar2.U() * lqcVar.g.a * lqcVar.h.a);
                    if (a != null && A2 >= 1.0f) {
                        float max2 = Math.max(kqcVar4.a, 0.7f * f25);
                        float L3 = (gm.L(9.0f) * max2) + gm.L(1.5f);
                        float sin = ((float) Math.sin(Math.toRadians(mqcVar2.c0))) * L3 * 2.2f;
                        float sin2 = ((float) Math.sin(Math.toRadians(mqcVar2.b0))) * L3 * 2.2f;
                        mqc mqcVar3 = mqcVar2;
                        float f27 = kqcVar3.a + lqcVar.n.a + sin;
                        float L4 = ((kqcVar2.a + lqcVar.o.a) + sin2) - (gm.L(4.0f) * max2);
                        float f28 = kqcVar3.a - (sin * 0.3f);
                        float f29 = (kqcVar2.a - (sin2 * 0.3f)) + (L3 * 0.22f);
                        float l4 = Utilities.l((f25 * 1.5f) + (3.0f * max2) + kqcVar6.a + kqcVar5.a);
                        rectF8.set(Math.min(f27, f28) - A2, Math.min(L4, f29) - A2, Math.max(f27, f28) + A2, Math.max(L4, f29) + A2);
                        boolean intersects = RectF.intersects(rectF8, rectF13);
                        float f30 = A2 * 0.4f;
                        rectF = rectF13;
                        rectF9.set(f27 - f30, L4 - f30, f27 + f30, L4 + f30);
                        max = Math.max(f26, Math.max(mqc.n(rectF9, rectF10), mqc.n(rectF9, rectF14)) * l3);
                        f24 = Math.max(f24, mqc.n(rectF9, rectF18) * l3);
                        f23 = Math.max(f23, mqc.n(rectF9, rectF17) * l3);
                        rectF2 = rectF10;
                        f22 = Math.max(f22, mqc.n(rectF9, rectF16) * l3);
                        if (intersects) {
                            rectF3 = rectF8;
                            i3 = canvas.saveLayer(rectF8, null);
                        } else {
                            rectF3 = rectF8;
                            i3 = -1;
                        }
                        canvas.save();
                        canvas.rotate(kqcVar.a, f28, f29);
                        rectF4 = rectF18;
                        rectF5 = rectF17;
                        rectF6 = rectF14;
                        mqcVar3.t(canvas, lqcVar, f28, f29, mlb.A(kqcVar6.a, 0.07f, (0.08f * max2) + 0.97f, A2), Math.max(max2, kqcVar5.a * 0.5f), kqcVar6.a, l4 * l3);
                        canvas.restore();
                        float f31 = f27 - A2;
                        float f32 = L4 - A2;
                        float f33 = f27 + A2;
                        float f34 = L4 + A2;
                        int saveLayer = canvas.saveLayer(f31, f32, f33, f34, null);
                        Paint paint7 = paint6;
                        paint7.setAlpha((int) (255.0f * l3));
                        float f35 = kqcVar5.a;
                        if (f35 > 0.004f) {
                            paint = paint7;
                            rectF7 = rectF16;
                            i4 = saveLayer;
                            z = intersects;
                            mqcVar3.r(canvas, a, f27, L4, A2, f35, 1.0f, kqcVar.a, lqcVar.U, lqcVar.V);
                            mqcVar = mqcVar3;
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            paint = paint7;
                            rectF7 = rectF16;
                            mqcVar = mqcVar3;
                            i4 = saveLayer;
                            z = intersects;
                            canvas2.save();
                            canvas2.rotate(kqcVar.a, f27, L4);
                            float f36 = A2 / 2.0f;
                            rectF9.set(f27 - f36, L4 - f36, f27 + f36, L4 + f36);
                            canvas2.drawBitmap(a, (Rect) null, rectF9, paint);
                            canvas2.restore();
                        }
                        paint.setAlpha(255);
                        canvas2.drawRect(f31, f32, f33, f34, mqcVar.V);
                        canvas2.restoreToCount(i4);
                        if (z) {
                            if (z) {
                                path = path5;
                                socVar = socVar3;
                                socVar.h(path, mqcVar.Z0, mqcVar.a1);
                                canvas2.drawPath(path, mqcVar.H1);
                            } else {
                                path = path5;
                                socVar = socVar3;
                            }
                            canvas2.restoreToCount(i3);
                        } else {
                            path = path5;
                            socVar = socVar3;
                        }
                    } else {
                        f19 = f26;
                        path5 = path5;
                        f22 = f22;
                        mqcVar2 = mqcVar2;
                        socVar3 = socVar3;
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
                mqcVar2 = mqcVar;
                socVar3 = socVar;
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
            mqc mqcVar4 = mqcVar2;
            float f37 = f19;
            float f38 = f20;
            float f39 = f21;
            soc socVar4 = socVar3;
            float f40 = f22;
            Paint paint8 = mqcVar4.l0;
            Paint paint9 = mqcVar4.m0;
            Paint paint10 = mqcVar4.k0;
            lqc lqcVar2 = mqcVar4.i0;
            if (lqcVar2 != null && lqcVar2.H == 2) {
                float f41 = lqcVar2.e.a + lqcVar2.n.a;
                float f42 = lqcVar2.f.a + lqcVar2.o.a;
                float P = (mqcVar4.P(lqcVar2) * 0.5f) + gm.L(9.0f);
                paint10.setColor(-1);
                Paint.Style style = Paint.Style.STROKE;
                paint10.setStyle(style);
                paint10.setStrokeCap(Paint.Cap.ROUND);
                paint10.setStrokeWidth(gm.L(2.0f));
                if (paint10.getPathEffect() == null) {
                    f7 = f37;
                    i2 = 1;
                    paint10.setPathEffect(new DashPathEffect(new float[]{gm.L(10.0f), gm.L(10.0f)}, 0.5f));
                } else {
                    f7 = f37;
                    i2 = 1;
                }
                paint10.setShadowLayer(gm.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint9.setColor(-1);
                paint9.setStyle(style);
                paint9.setStrokeWidth(gm.L(2.66f));
                paint9.setShadowLayer(gm.L(0.75f), 0.0f, 0.0f, 1342177280);
                paint8.setColor(-15033089);
                canvas.save();
                canvas.rotate(lqcVar2.i.a, f41, f42);
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
                    canvas.drawCircle(f47, f42, gm.L(5.66f), paint9);
                    canvas.drawCircle(f47, f42, gm.L(4.66f), paint8);
                }
                canvas.restore();
            } else {
                f = f37;
                f2 = f40;
                f3 = f38;
                f4 = f39;
                f5 = 0.0f;
            }
            poc pocVar = socVar4.O;
            float round = Math.round(f2 * 20.0f) / 20.0f;
            if (round != socVar4.K) {
                socVar4.K = round;
                socVar4.I.invalidate();
            }
            if (Math.max(f4, f) > f5) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            if (f6 != socVar4.h) {
                socVar4.h = f6;
                pocVar.invalidate();
            }
            float round2 = Math.round(f * 20.0f) / 20.0f;
            float round3 = Math.round(f3 * 20.0f) / 20.0f;
            if (round2 != socVar4.e0) {
                socVar4.e0 = round2;
                pocVar.invalidate();
                socVar4.P.invalidate();
            }
            if (round3 != socVar4.f0) {
                socVar4.f0 = round3;
                socVar4.H.invalidate();
            }
        }
    }
}
