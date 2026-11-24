package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class ra2 {
    public final gb2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public ra2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra2.a(android.graphics.Canvas, float, float):void");
    }

    public final void b(Canvas canvas, float f, float f2, int i) {
        float f3;
        int i2;
        float L;
        int i3;
        float L2;
        float R1;
        float f4;
        float f5;
        float f6;
        int i4;
        int i5;
        int i6;
        float videoTranscriptionProgress;
        float videoTranscriptionProgress2;
        boolean z;
        float f7;
        Paint paint;
        float f8;
        float f9;
        boolean z2;
        float[] fArr;
        float f10;
        int i7;
        Paint c2;
        boolean z3;
        canvas.save();
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        int currentBackgroundRight = gb2Var.getCurrentBackgroundRight() - gb2Var.getCurrentBackgroundLeft();
        if (gb2Var.G) {
            f3 = 6.0f;
        } else {
            f3 = 0.0f;
        }
        int L3 = gl.L(f3) + currentBackgroundRight;
        if (gb2Var.R1) {
            i2 = 10;
        } else {
            i2 = 0;
        }
        int L4 = L3 - gl.L(i2 + 128);
        if (gb2Var.J4 == null) {
            qa2 qa2Var = new qa2(this, gb2Var, gb2Var.E4);
            gb2Var.J4 = qa2Var;
            k27 k27Var = gb2Var.Q5;
            TLRPC.Message message = k27Var.k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && uyb.m(k27Var)) {
                z3 = true;
            } else {
                z3 = false;
            }
            qa2Var.u(z3, false);
            gb2Var.J4.s(uyb.l(gb2Var.Q5), false);
            gb2Var.J4.t(uyb.w(gb2Var.Q5), false);
        }
        if (gb2Var.R8 != 0) {
            this.b = gl.R1(de9.w(21.0f, i, L4), gb2Var.d9, 1.0f - gb2Var.getVideoTranscriptionProgress());
            R1 = gl.R1(gl.L(3.0f) + gb2Var.H4, gb2Var.e9 - gl.L(40.0f), 1.0f - gb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float w = de9.w(21.0f, i, L4);
            k27 k27Var2 = gb2Var.Q5;
            if (k27Var2 != null && k27Var2.O3()) {
                L = (gl.L(28.0f) * f2) + (gb2Var.getCurrentBackgroundLeft() - gl.L(40.0f));
            } else if (gb2Var.v2()) {
                L = Math.min(gb2Var.getPhotoImage().w() + gl.L(8.0f), gb2Var.getCompactRight() - gl.L(32.0f));
            } else {
                L = (gl.L(8.0f) + gb2Var.getCurrentBackgroundRight()) - (gl.L(40.0f) * f2);
            }
            this.b = gl.R1(w, L, 1.0f - gb2Var.getVideoTranscriptionProgress());
            float f11 = gb2Var.e7 + nb2Var.j0;
            if (gb2Var.K) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            float L5 = f11 - gl.L(28 - i3);
            i19 i19Var = gb2Var.O;
            if (!i19Var.p) {
                L5 -= i19Var.i(nb2Var.L1);
            }
            float R12 = gl.R1(L5, (gb2Var.getMediaOffsetY() + (gl.L(44.0f) + gb2Var.gb)) - gl.L(1.7f), gb2Var.getVideoTranscriptionProgress()) + gl.L(1.7f);
            float L6 = gl.L(3.0f) + gb2Var.H4;
            float L7 = R12 - gl.L(12.0f);
            if (gb2Var.Q5.O3()) {
                L2 = 0.0f;
            } else {
                L2 = gl.L(28.0f) * f2;
            }
            R1 = gl.R1(L6, L7 - L2, 1.0f - gb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        qa2 qa2Var2 = gb2Var.J4;
        int i8 = (int) this.b;
        int i9 = (int) R1;
        int U1 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(30.0f), gl.L(32.0f));
        int U12 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(24.0f), gl.L(32.0f));
        int U13 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(8.0f), gl.L(16.0f));
        Rect rect = qa2Var2.u;
        if (U1 == rect.width() && U12 == rect.height()) {
            f4 = 12.0f;
            f5 = 40.0f;
            i4 = 2;
            f6 = 0.0f;
        } else {
            float f12 = U1 / 2.0f;
            f4 = 12.0f;
            float f13 = U13;
            f5 = 40.0f;
            float f14 = U12 / 2.0f;
            f6 = 0.0f;
            i4 = 2;
            qa2Var2.F = (float) ((Math.atan((f12 - f13) / f14) * 180.0d) / 3.141592653589793d);
            qa2Var2.G = (float) ((Math.atan(f12 / (f14 - f13)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i8, i9, i8 + U1, i9 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        qa2Var2.D = min;
        qa2Var2.E = min << 1;
        qa2 qa2Var3 = gb2Var.J4;
        if (gb2Var.v2()) {
            i5 = bkb.Sa;
        } else {
            i5 = bkb.Yc;
        }
        int v0 = bkb.v0(i5, gb2Var.cc);
        if (gb2Var.Q5.O3()) {
            i6 = bkb.Ic;
        } else {
            i6 = bkb.sk;
        }
        int v02 = bkb.v0(i6, gb2Var.cc);
        if (gb2Var.M1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = gb2Var.getVideoTranscriptionProgress();
        }
        int f15 = bm2.f(videoTranscriptionProgress, v0, v02);
        bkb.v0(bkb.x6, gb2Var.cc);
        gb2Var.Q5.N3();
        if (gb2Var.M1 == 3) {
            videoTranscriptionProgress2 = f6;
        } else {
            videoTranscriptionProgress2 = 1.0f - gb2Var.getVideoTranscriptionProgress();
        }
        oy8 oy8Var = qa2Var3.p;
        oy8 oy8Var2 = qa2Var3.n;
        if (qa2Var3.b != f15) {
            z = true;
        } else {
            z = false;
        }
        qa2Var3.b = f15;
        qa2Var3.c = f15;
        int o = bm2.o(f15, (int) (Color.alpha(f15) * 0.156f));
        qa2Var3.a = o;
        qa2Var3.e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f15);
        if (bkb.I.o()) {
            f7 = 0.3f;
        } else {
            f7 = 0.2f;
        }
        qa2Var3.d = bkb.v(o, bm2.o(f15, (int) (alpha * f7)));
        Paint paint2 = qa2Var3.f;
        if (paint2 == null) {
            paint2 = new Paint();
            qa2Var3.f = paint2;
        }
        paint2.setColor(qa2Var3.a);
        qa2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z || qa2Var3.q == null) {
            int L8 = gl.L(8.0f);
            int i10 = qa2Var3.d;
            ff0 i0 = bkb.i0(L8, L8, L8, L8, 0, i10, i10);
            qa2Var3.q = i0;
            i0.setCallback(qa2Var3.r);
        }
        if (z) {
            oy8Var2.a0 = true;
            oy8Var2.L(qa2Var3.c, "Artboard Outlines");
            oy8Var2.j();
            oy8Var2.E(true);
            oy8Var2.Q(0L);
            int alpha2 = Color.alpha(f15);
            qa2Var3.m = alpha2;
            oy8Var2.setAlpha(alpha2);
            oy8Var.a0 = true;
            oy8Var.L(qa2Var3.c, "Artboard Outlines");
            oy8Var.j();
            oy8Var.E(true);
            oy8Var.Q(0L);
            int alpha3 = Color.alpha(f15);
            qa2Var3.o = alpha3;
            oy8Var.setAlpha(alpha3);
        }
        if (qa2Var3.g == null) {
            Paint paint3 = new Paint(1);
            qa2Var3.g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            qa2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        qa2Var3.g.setColor(f15);
        qa2 qa2Var4 = gb2Var.J4;
        oy8 oy8Var3 = qa2Var4.p;
        oy8 oy8Var4 = qa2Var4.n;
        Rect rect2 = qa2Var4.v;
        Rect rect3 = qa2Var4.u;
        rect2.set(rect3.left - gl.L(8.0f), rect3.top - gl.L(8.0f), gl.L(8.0f) + rect3.right, gl.L(8.0f) + rect3.bottom);
        Path path = qa2Var4.C;
        if (path == null) {
            qa2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = gl.P;
        rectF.set(rect3);
        Path path2 = qa2Var4.C;
        float f16 = qa2Var4.D;
        path2.addRoundRect(rectF, f16, f16, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(qa2Var4.C);
        float f17 = qa2Var4.e * f;
        if (f17 > f6) {
            gb2 gb2Var2 = qa2Var4.T.a;
            if (gb2Var2.Q5.O5()) {
                c2 = gb2Var2.c2("paintChatActionBackground");
            } else {
                c2 = gb2Var2.c2("paintChatTimeBackground");
            }
            int alpha4 = c2.getAlpha();
            c2.setAlpha((int) (alpha4 * f17));
            gb2Var2.z();
            canvas.drawRect(rect3, c2);
            if (c2 == gb2Var2.c2("paintChatActionBackground") && gb2Var2.i2()) {
                int alpha5 = bkb.g2.getAlpha();
                bkb.g2.setAlpha((int) (alpha5 * f17));
                canvas.drawRect(rect3, bkb.g2);
                bkb.g2.setAlpha(alpha5);
            }
            c2.setAlpha(alpha4);
        }
        Paint paint4 = qa2Var4.f;
        if (paint4 != null) {
            int alpha6 = paint4.getAlpha();
            qa2Var4.f.setAlpha((int) (alpha6 * f));
            canvas.drawRect(rect3, qa2Var4.f);
            qa2Var4.f.setAlpha(alpha6);
        }
        ff0 ff0Var = qa2Var4.q;
        if (ff0Var != null) {
            ff0Var.setBounds(rect3);
            qa2Var4.q.draw(canvas);
        }
        canvas.restore();
        lm lmVar = qa2Var4.l;
        if (qa2Var4.k) {
            f8 = 1.0f;
        } else {
            f8 = f6;
        }
        float e = lmVar.e(false, f8);
        if (e > f6) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - qa2Var4.t)) * 0.75f;
            c84 c84Var = qa2Var4.B;
            float[] fArr2 = qa2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i4];
                qa2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f18 = ((float) (1520 * j)) / 5400.0f;
            fArr2[0] = f18 - 20.0f;
            fArr2[1] = f18;
            int i11 = 0;
            while (true) {
                fArr = qa2Var4.M;
                if (i11 >= 4) {
                    break;
                }
                fArr[1] = (c84Var.getInterpolation(((float) (j - (i11 * 1350))) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = qa2Var4.M;
                fArr3[0] = (c84Var.getInterpolation(((float) (j - (i7 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i11++;
            }
            f9 = 180.0f;
            Path path3 = qa2Var4.h;
            if (path3 == null) {
                qa2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f5, fArr[1] - fArr[0]);
            float f19 = fArr[0];
            float f20 = (1.0f - e) * max;
            if (qa2Var4.k) {
                f10 = f6;
            } else {
                f10 = 1.0f;
            }
            float f21 = (f20 * f10) + f19;
            float f22 = (max * e) + f21;
            float f23 = f21 % 360.0f;
            float f24 = f22 % 360.0f;
            if (f23 < f6) {
                f23 += 360.0f;
            }
            float f25 = f23;
            if (f24 < f6) {
                f24 += 360.0f;
            }
            float f26 = f24;
            Path path4 = qa2Var4.h;
            int centerX = rect3.centerX();
            int i12 = rect3.top;
            uyb.d(path4, centerX, i12, rect3.right - qa2Var4.D, i12, f25, f26, 0.0f, qa2Var4.F);
            uyb.b(qa2Var4.h, rect3.right, rect3.top, qa2Var4.E, 1, f25, f26, qa2Var4.F, qa2Var4.G);
            Path path5 = qa2Var4.h;
            int i13 = rect3.right;
            int i14 = rect3.top;
            int i15 = qa2Var4.D;
            int i16 = i14 + i15;
            int i17 = rect3.bottom - i15;
            float f27 = qa2Var4.G;
            uyb.d(path5, i13, i16, i13, i17, f25, f26, f27, 180.0f - f27);
            uyb.b(qa2Var4.h, rect3.right, rect3.bottom, qa2Var4.E, 2, f25, f26, 180.0f - qa2Var4.G, 180.0f - qa2Var4.F);
            Path path6 = qa2Var4.h;
            int i18 = rect3.right;
            int i19 = qa2Var4.D;
            int i20 = i18 - i19;
            int i21 = rect3.bottom;
            int i22 = rect3.left + i19;
            float f28 = qa2Var4.F;
            uyb.d(path6, i20, i21, i22, i21, f25, f26, 180.0f - f28, f28 + 180.0f);
            uyb.b(qa2Var4.h, rect3.left, rect3.bottom, qa2Var4.E, 3, f25, f26, qa2Var4.F + 180.0f, qa2Var4.G + 180.0f);
            Path path7 = qa2Var4.h;
            int i23 = rect3.left;
            int i24 = rect3.bottom;
            int i25 = qa2Var4.D;
            int i26 = i24 - i25;
            int i27 = rect3.top + i25;
            float f29 = qa2Var4.G;
            uyb.d(path7, i23, i26, i23, i27, f25, f26, f29 + 180.0f, 360.0f - f29);
            uyb.b(qa2Var4.h, rect3.left, rect3.top, qa2Var4.E, 4, f25, f26, 360.0f - qa2Var4.G, 360.0f - qa2Var4.F);
            uyb.d(qa2Var4.h, rect3.left + qa2Var4.D, rect3.top, rect3.centerX(), rect3.top, f25, f26, 360.0f - qa2Var4.F, 360.0f);
            qa2Var4.g.setStrokeWidth(gl.L(1.5f));
            int alpha7 = qa2Var4.g.getAlpha();
            qa2Var4.g.setAlpha((int) (alpha7 * f));
            canvas.drawPath(qa2Var4.h, qa2Var4.g);
            qa2Var4.g.setAlpha(alpha7);
            qa2Var4.r.invalidate();
        } else {
            f9 = 180.0f;
        }
        canvas.save();
        canvas.translate(gl.L(-13.0f) + rect3.centerX(), gl.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, gl.L(26.0f), gl.L(26.0f), 255, 31);
        if (qa2Var4.y) {
            oy8Var4.setAlpha((int) (qa2Var4.m * f));
            oy8Var4.draw(canvas);
        } else {
            oy8Var3.setAlpha((int) (qa2Var4.o * f));
            oy8Var3.draw(canvas);
        }
        lm lmVar2 = qa2Var4.j;
        if (qa2Var4.i && !qa2Var4.y && !qa2Var4.k) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d = lmVar2.d(z2);
        if (d > f6) {
            canvas.save();
            canvas.translate(gl.L(18.0f), gl.L(f4));
            if (qa2Var4.H == null) {
                Paint paint5 = new Paint(1);
                qa2Var4.H = paint5;
                paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = gl.P;
            rectF2.set(f6, -gl.L(0.4f), gl.L(6.666f), gl.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, gl.L(2.0f), gl.L(2.0f), qa2Var4.H);
            Paint paint6 = qa2Var4.I;
            if (paint6 == null) {
                paint6 = new Paint(1);
                qa2Var4.I = paint6;
            }
            paint6.setColor(qa2Var4.c);
            int i28 = (int) (d * 255.0f);
            qa2Var4.I.setAlpha(i28);
            rectF2.set(0.0f, gl.L(3.33f), gl.L(6.666f), gl.L(8.33f));
            canvas.drawRoundRect(rectF2, gl.L(1.33f), gl.L(1.33f), qa2Var4.I);
            if (qa2Var4.L == null || Math.abs(qa2Var4.K - gl.p) > 0.1f) {
                qa2Var4.K = gl.p;
                Path path8 = new Path();
                qa2Var4.L = path8;
                path8.moveTo(gl.L(1.66f), gl.L(3.33f));
                qa2Var4.L.lineTo(gl.L(1.66f), gl.L(2.0f));
                rectF2.set(gl.L(1.66f), gl.L(0.33f), gl.L(4.99f), gl.L(3.6599998f));
                qa2Var4.L.arcTo(rectF2, -180.0f, f9, false);
                qa2Var4.L.lineTo(gl.L(5.0f), gl.L(3.33f));
            }
            if (qa2Var4.J == null) {
                Paint paint7 = new Paint(1);
                qa2Var4.J = paint7;
                paint7.setStyle(Paint.Style.STROKE);
            }
            qa2Var4.J.setStrokeWidth(gl.L(1.0f));
            qa2Var4.J.setColor(qa2Var4.c);
            qa2Var4.J.setAlpha(i28);
            canvas.drawPath(qa2Var4.L, qa2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        int i2;
        canvas.save();
        int L = gl.L(44.0f);
        gb2 gb2Var = this.a;
        canvas.translate(i, gb2Var.getMediaOffsetY() + L + gb2Var.gb + f);
        gb2Var.L4.draw(canvas);
        canvas.restore();
        k27 k27Var = gb2Var.Q5;
        if (k27Var.D != 0 && k27Var.k.media_unread) {
            Paint paint = bkb.R1;
            if (k27Var.O3()) {
                i2 = bkb.sc;
            } else {
                i2 = bkb.qe;
            }
            paint.setColor(bkb.v0(i2, gb2Var.cc));
            canvas.drawCircle(gl.L(6.0f) + i + gb2Var.N4, gb2Var.getMediaOffsetY() + gl.L(51.0f) + gb2Var.gb, gl.L(3.0f), bkb.R1);
        }
    }

    public final void d(k27 k27Var, boolean z) {
        boolean z2;
        boolean z3;
        c27 c27Var;
        int L;
        f27 f27Var;
        gb2 gb2Var = this.a;
        i19 i19Var = gb2Var.O;
        int i = 0;
        if (!gb2Var.u6 && k27Var.k.fwd_from != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        gb2Var.E9 = z2;
        if ((gb2Var.h6 && !k27Var.O3() && (k27Var.P1() < 0 || k27Var.P1() == 2666000)) || (((k27Var.o3() && k27Var.z4()) || (k27Var.y3() && k27Var.k.fwd_from.from_id == null)) && ((c27Var = gb2Var.M) == null || (c27Var.l & 4) != 0))) {
            z3 = true;
        } else {
            z3 = false;
        }
        gb2Var.v9 = z3;
        if (gl.O1()) {
            int P0 = gl.P0();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - gl.L(i + 50);
            gb2Var.b7 = Math.min(gl.L(270.0f), L);
        } else {
            int parentWidth = gb2Var.getParentWidth();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - gl.L(i + 50);
            gb2Var.b7 = Math.min(gl.L(270.0f), L);
        }
        if (gb2Var.M != null) {
            gb2Var.b7 = L;
        }
        int w0 = gb2Var.w0(L, k27Var);
        gb2Var.setMessageObjectInternal(k27Var);
        gb2Var.v0 = gl.L(82.0f) + gb2Var.gb;
        if (gl.L(76.0f) + w0 >= (gb2Var.b7 - gb2Var.M9) - gl.L(12.0f)) {
            gb2Var.v0 = gl.L(14.0f) + gb2Var.v0;
        }
        if (gb2Var.M != null && (f27Var = gb2Var.L) != null && f27Var.d.size() > 1) {
            if ((gb2Var.M.l & 4) == 0) {
                gb2Var.v0 -= gl.L(6.0f);
                gb2Var.X1 -= gl.L(6.0f);
            }
            if ((gb2Var.M.l & 8) == 0) {
                gb2Var.v0 -= gl.L(6.0f);
            }
        }
        if (gb2Var.J) {
            gb2Var.gb -= gl.L(1.0f);
        }
        i19Var.getClass();
        i19Var.o(L - gl.L(24.0f), 3);
        if (!i19Var.p) {
            i19Var.n = gl.L(12.0f) + i19Var.m;
            gb2Var.Z2(k27Var);
            int i2 = i19Var.o;
            if (i2 > gb2Var.b7) {
                gb2Var.b7 = i2;
            }
            if (gl.L(24.0f) + i19Var.r + gb2Var.M9 > gb2Var.b7) {
                i19Var.n = gl.L(12.0f) + i19Var.n;
                i19Var.k -= gl.L(12.0f);
            }
            if (!k27Var.G0 && k27Var.z != null) {
                i19Var.k = gl.L(14.0f) + i19Var.k;
            }
            gb2Var.v0 += i19Var.n;
        }
    }

    public final void e(k27 k27Var, boolean z) {
        int min;
        float f;
        gb2 gb2Var = this.a;
        i19 i19Var = gb2Var.O;
        boolean z2 = true;
        gb2Var.E9 = !gb2Var.u6;
        int i = 0;
        if ((!gb2Var.h6 || k27Var.O3() || (k27Var.P1() >= 0 && k27Var.P1() != 2666000)) && ((!k27Var.o3() || !k27Var.z4()) && ((!k27Var.y3() || k27Var.k.fwd_from.from_id != null) && (!gb2Var.Y6 || k27Var.O3() || (!gb2Var.l6 && (!gb2Var.m6 || !gb2Var.W6)))))) {
            z2 = false;
        }
        gb2Var.v9 = z2;
        if (gl.O1()) {
            int P0 = gl.P0();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - gl.L(i + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        } else {
            int parentWidth = gb2Var.getParentWidth();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - gl.L(i + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        }
        gb2Var.w0(min, k27Var);
        gb2Var.setMessageObjectInternal(k27Var);
        int L = gl.L(70.0f);
        int i2 = gb2Var.gb;
        gb2Var.v0 = L + i2;
        if (gb2Var.J) {
            gb2Var.gb = i2 - gl.L(1.0f);
        }
        i19Var.getClass();
        if (k27Var.O3()) {
            f = 32.0f;
        } else {
            f = 24.0f;
        }
        i19Var.o(min - gl.L(f), 3);
        if (!i19Var.p) {
            i19Var.n = i19Var.m;
            if (TextUtils.isEmpty(k27Var.z)) {
                i19Var.n = gl.L(12.0f) + i19Var.n;
            } else {
                i19Var.n = gl.L(8.0f) + i19Var.n;
            }
            int i3 = i19Var.o;
            if (i3 > gb2Var.b7) {
                gb2Var.b7 = i3;
            }
            int L2 = gl.L(6.0f) + gb2Var.M9;
            if (k27.a4(k27Var.k) && !k27Var.m4()) {
                L2 -= gl.L(3.0f);
            } else if (k27Var.O3()) {
                L2 += gl.L(20.5f);
            }
            int extraTimeX = gb2Var.getExtraTimeX() + L2;
            if (!gb2Var.y2() && i19Var.r + extraTimeX >= gb2Var.b7) {
                i19Var.n = gl.L(12.0f) + i19Var.n;
                i19Var.k -= gl.L(12.0f);
            }
            gb2Var.v0 += i19Var.n;
        }
    }
}
