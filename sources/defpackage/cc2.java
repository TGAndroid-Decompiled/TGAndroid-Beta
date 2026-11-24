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
public final class cc2 {
    public final rc2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public cc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cc2.a(android.graphics.Canvas, float, float):void");
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
        rc2 rc2Var = this.a;
        yc2 yc2Var = rc2Var.ub;
        int currentBackgroundRight = rc2Var.getCurrentBackgroundRight() - rc2Var.getCurrentBackgroundLeft();
        if (rc2Var.G) {
            f3 = 6.0f;
        } else {
            f3 = 0.0f;
        }
        int L3 = gm.L(f3) + currentBackgroundRight;
        if (rc2Var.R1) {
            i2 = 10;
        } else {
            i2 = 0;
        }
        int L4 = L3 - gm.L(i2 + 128);
        if (rc2Var.J4 == null) {
            bc2 bc2Var = new bc2(this, rc2Var, rc2Var.E4);
            rc2Var.J4 = bc2Var;
            k47 k47Var = rc2Var.Q5;
            TLRPC.Message message = k47Var.k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && v0c.m(k47Var)) {
                z3 = true;
            } else {
                z3 = false;
            }
            bc2Var.u(z3, false);
            rc2Var.J4.s(v0c.l(rc2Var.Q5), false);
            rc2Var.J4.t(v0c.w(rc2Var.Q5), false);
        }
        if (rc2Var.R8 != 0) {
            this.b = gm.R1(hg9.v(21.0f, i, L4), rc2Var.d9, 1.0f - rc2Var.getVideoTranscriptionProgress());
            R1 = gm.R1(gm.L(3.0f) + rc2Var.H4, rc2Var.e9 - gm.L(40.0f), 1.0f - rc2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float v = hg9.v(21.0f, i, L4);
            k47 k47Var2 = rc2Var.Q5;
            if (k47Var2 != null && k47Var2.O3()) {
                L = (gm.L(28.0f) * f2) + (rc2Var.getCurrentBackgroundLeft() - gm.L(40.0f));
            } else if (rc2Var.v2()) {
                L = Math.min(rc2Var.getPhotoImage().w() + gm.L(8.0f), rc2Var.getCompactRight() - gm.L(32.0f));
            } else {
                L = (gm.L(8.0f) + rc2Var.getCurrentBackgroundRight()) - (gm.L(40.0f) * f2);
            }
            this.b = gm.R1(v, L, 1.0f - rc2Var.getVideoTranscriptionProgress());
            float f11 = rc2Var.e7 + yc2Var.j0;
            if (rc2Var.K) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            float L5 = f11 - gm.L(28 - i3);
            l39 l39Var = rc2Var.O;
            if (!l39Var.p) {
                L5 -= l39Var.i(yc2Var.L1);
            }
            float R12 = gm.R1(L5, (rc2Var.getMediaOffsetY() + (gm.L(44.0f) + rc2Var.gb)) - gm.L(1.7f), rc2Var.getVideoTranscriptionProgress()) + gm.L(1.7f);
            float L6 = gm.L(3.0f) + rc2Var.H4;
            float L7 = R12 - gm.L(12.0f);
            if (rc2Var.Q5.O3()) {
                L2 = 0.0f;
            } else {
                L2 = gm.L(28.0f) * f2;
            }
            R1 = gm.R1(L6, L7 - L2, 1.0f - rc2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        bc2 bc2Var2 = rc2Var.J4;
        int i8 = (int) this.b;
        int i9 = (int) R1;
        int U1 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(30.0f), gm.L(32.0f));
        int U12 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(24.0f), gm.L(32.0f));
        int U13 = gm.U1(1.0f - rc2Var.getVideoTranscriptionProgress(), gm.L(8.0f), gm.L(16.0f));
        Rect rect = bc2Var2.u;
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
            bc2Var2.F = (float) ((Math.atan((f12 - f13) / f14) * 180.0d) / 3.141592653589793d);
            bc2Var2.G = (float) ((Math.atan(f12 / (f14 - f13)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i8, i9, i8 + U1, i9 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        bc2Var2.D = min;
        bc2Var2.E = min << 1;
        bc2 bc2Var3 = rc2Var.J4;
        if (rc2Var.v2()) {
            i5 = cmb.Sa;
        } else {
            i5 = cmb.Yc;
        }
        int v0 = cmb.v0(i5, rc2Var.cc);
        if (rc2Var.Q5.O3()) {
            i6 = cmb.Ic;
        } else {
            i6 = cmb.sk;
        }
        int v02 = cmb.v0(i6, rc2Var.cc);
        if (rc2Var.M1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = rc2Var.getVideoTranscriptionProgress();
        }
        int f15 = on2.f(videoTranscriptionProgress, v0, v02);
        cmb.v0(cmb.x6, rc2Var.cc);
        rc2Var.Q5.N3();
        if (rc2Var.M1 == 3) {
            videoTranscriptionProgress2 = f6;
        } else {
            videoTranscriptionProgress2 = 1.0f - rc2Var.getVideoTranscriptionProgress();
        }
        p09 p09Var = bc2Var3.p;
        p09 p09Var2 = bc2Var3.n;
        if (bc2Var3.b != f15) {
            z = true;
        } else {
            z = false;
        }
        bc2Var3.b = f15;
        bc2Var3.c = f15;
        int p = on2.p(f15, (int) (Color.alpha(f15) * 0.156f));
        bc2Var3.a = p;
        bc2Var3.e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f15);
        if (cmb.I.o()) {
            f7 = 0.3f;
        } else {
            f7 = 0.2f;
        }
        bc2Var3.d = cmb.v(p, on2.p(f15, (int) (alpha * f7)));
        Paint paint2 = bc2Var3.f;
        if (paint2 == null) {
            paint2 = new Paint();
            bc2Var3.f = paint2;
        }
        paint2.setColor(bc2Var3.a);
        bc2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z || bc2Var3.q == null) {
            int L8 = gm.L(8.0f);
            int i10 = bc2Var3.d;
            fg0 i0 = cmb.i0(L8, L8, L8, L8, 0, i10, i10);
            bc2Var3.q = i0;
            i0.setCallback(bc2Var3.r);
        }
        if (z) {
            p09Var2.a0 = true;
            p09Var2.L(bc2Var3.c, "Artboard Outlines");
            p09Var2.j();
            p09Var2.E(true);
            p09Var2.Q(0L);
            int alpha2 = Color.alpha(f15);
            bc2Var3.m = alpha2;
            p09Var2.setAlpha(alpha2);
            p09Var.a0 = true;
            p09Var.L(bc2Var3.c, "Artboard Outlines");
            p09Var.j();
            p09Var.E(true);
            p09Var.Q(0L);
            int alpha3 = Color.alpha(f15);
            bc2Var3.o = alpha3;
            p09Var.setAlpha(alpha3);
        }
        if (bc2Var3.g == null) {
            Paint paint3 = new Paint(1);
            bc2Var3.g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            bc2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        bc2Var3.g.setColor(f15);
        bc2 bc2Var4 = rc2Var.J4;
        p09 p09Var3 = bc2Var4.p;
        p09 p09Var4 = bc2Var4.n;
        Rect rect2 = bc2Var4.v;
        Rect rect3 = bc2Var4.u;
        rect2.set(rect3.left - gm.L(8.0f), rect3.top - gm.L(8.0f), gm.L(8.0f) + rect3.right, gm.L(8.0f) + rect3.bottom);
        Path path = bc2Var4.C;
        if (path == null) {
            bc2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = gm.P;
        rectF.set(rect3);
        Path path2 = bc2Var4.C;
        float f16 = bc2Var4.D;
        path2.addRoundRect(rectF, f16, f16, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(bc2Var4.C);
        float f17 = bc2Var4.e * f;
        if (f17 > f6) {
            rc2 rc2Var2 = bc2Var4.T.a;
            if (rc2Var2.Q5.O5()) {
                c2 = rc2Var2.c2("paintChatActionBackground");
            } else {
                c2 = rc2Var2.c2("paintChatTimeBackground");
            }
            int alpha4 = c2.getAlpha();
            c2.setAlpha((int) (alpha4 * f17));
            rc2Var2.x();
            canvas.drawRect(rect3, c2);
            if (c2 == rc2Var2.c2("paintChatActionBackground") && rc2Var2.i2()) {
                int alpha5 = cmb.g2.getAlpha();
                cmb.g2.setAlpha((int) (alpha5 * f17));
                canvas.drawRect(rect3, cmb.g2);
                cmb.g2.setAlpha(alpha5);
            }
            c2.setAlpha(alpha4);
        }
        Paint paint4 = bc2Var4.f;
        if (paint4 != null) {
            int alpha6 = paint4.getAlpha();
            bc2Var4.f.setAlpha((int) (alpha6 * f));
            canvas.drawRect(rect3, bc2Var4.f);
            bc2Var4.f.setAlpha(alpha6);
        }
        fg0 fg0Var = bc2Var4.q;
        if (fg0Var != null) {
            fg0Var.setBounds(rect3);
            bc2Var4.q.draw(canvas);
        }
        canvas.restore();
        ln lnVar = bc2Var4.l;
        if (bc2Var4.k) {
            f8 = 1.0f;
        } else {
            f8 = f6;
        }
        float e = lnVar.e(false, f8);
        if (e > f6) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - bc2Var4.t)) * 0.75f;
            l94 l94Var = bc2Var4.B;
            float[] fArr2 = bc2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i4];
                bc2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f18 = ((float) (1520 * j)) / 5400.0f;
            fArr2[0] = f18 - 20.0f;
            fArr2[1] = f18;
            int i11 = 0;
            while (true) {
                fArr = bc2Var4.M;
                if (i11 >= 4) {
                    break;
                }
                fArr[1] = (l94Var.getInterpolation(((float) (j - (i11 * 1350))) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = bc2Var4.M;
                fArr3[0] = (l94Var.getInterpolation(((float) (j - (i7 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i11++;
            }
            f9 = 180.0f;
            Path path3 = bc2Var4.h;
            if (path3 == null) {
                bc2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f5, fArr[1] - fArr[0]);
            float f19 = fArr[0];
            float f20 = (1.0f - e) * max;
            if (bc2Var4.k) {
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
            Path path4 = bc2Var4.h;
            int centerX = rect3.centerX();
            int i12 = rect3.top;
            v0c.d(path4, centerX, i12, rect3.right - bc2Var4.D, i12, f25, f26, 0.0f, bc2Var4.F);
            v0c.b(bc2Var4.h, rect3.right, rect3.top, bc2Var4.E, 1, f25, f26, bc2Var4.F, bc2Var4.G);
            Path path5 = bc2Var4.h;
            int i13 = rect3.right;
            int i14 = rect3.top;
            int i15 = bc2Var4.D;
            int i16 = i14 + i15;
            int i17 = rect3.bottom - i15;
            float f27 = bc2Var4.G;
            v0c.d(path5, i13, i16, i13, i17, f25, f26, f27, 180.0f - f27);
            v0c.b(bc2Var4.h, rect3.right, rect3.bottom, bc2Var4.E, 2, f25, f26, 180.0f - bc2Var4.G, 180.0f - bc2Var4.F);
            Path path6 = bc2Var4.h;
            int i18 = rect3.right;
            int i19 = bc2Var4.D;
            int i20 = i18 - i19;
            int i21 = rect3.bottom;
            int i22 = rect3.left + i19;
            float f28 = bc2Var4.F;
            v0c.d(path6, i20, i21, i22, i21, f25, f26, 180.0f - f28, f28 + 180.0f);
            v0c.b(bc2Var4.h, rect3.left, rect3.bottom, bc2Var4.E, 3, f25, f26, bc2Var4.F + 180.0f, bc2Var4.G + 180.0f);
            Path path7 = bc2Var4.h;
            int i23 = rect3.left;
            int i24 = rect3.bottom;
            int i25 = bc2Var4.D;
            int i26 = i24 - i25;
            int i27 = rect3.top + i25;
            float f29 = bc2Var4.G;
            v0c.d(path7, i23, i26, i23, i27, f25, f26, f29 + 180.0f, 360.0f - f29);
            v0c.b(bc2Var4.h, rect3.left, rect3.top, bc2Var4.E, 4, f25, f26, 360.0f - bc2Var4.G, 360.0f - bc2Var4.F);
            v0c.d(bc2Var4.h, rect3.left + bc2Var4.D, rect3.top, rect3.centerX(), rect3.top, f25, f26, 360.0f - bc2Var4.F, 360.0f);
            bc2Var4.g.setStrokeWidth(gm.L(1.5f));
            int alpha7 = bc2Var4.g.getAlpha();
            bc2Var4.g.setAlpha((int) (alpha7 * f));
            canvas.drawPath(bc2Var4.h, bc2Var4.g);
            bc2Var4.g.setAlpha(alpha7);
            bc2Var4.r.invalidate();
        } else {
            f9 = 180.0f;
        }
        canvas.save();
        canvas.translate(gm.L(-13.0f) + rect3.centerX(), gm.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, gm.L(26.0f), gm.L(26.0f), 255, 31);
        if (bc2Var4.y) {
            p09Var4.setAlpha((int) (bc2Var4.m * f));
            p09Var4.draw(canvas);
        } else {
            p09Var3.setAlpha((int) (bc2Var4.o * f));
            p09Var3.draw(canvas);
        }
        ln lnVar2 = bc2Var4.j;
        if (bc2Var4.i && !bc2Var4.y && !bc2Var4.k) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d = lnVar2.d(z2);
        if (d > f6) {
            canvas.save();
            canvas.translate(gm.L(18.0f), gm.L(f4));
            if (bc2Var4.H == null) {
                Paint paint5 = new Paint(1);
                bc2Var4.H = paint5;
                paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = gm.P;
            rectF2.set(f6, -gm.L(0.4f), gm.L(6.666f), gm.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, gm.L(2.0f), gm.L(2.0f), bc2Var4.H);
            Paint paint6 = bc2Var4.I;
            if (paint6 == null) {
                paint6 = new Paint(1);
                bc2Var4.I = paint6;
            }
            paint6.setColor(bc2Var4.c);
            int i28 = (int) (d * 255.0f);
            bc2Var4.I.setAlpha(i28);
            rectF2.set(0.0f, gm.L(3.33f), gm.L(6.666f), gm.L(8.33f));
            canvas.drawRoundRect(rectF2, gm.L(1.33f), gm.L(1.33f), bc2Var4.I);
            if (bc2Var4.L == null || Math.abs(bc2Var4.K - gm.p) > 0.1f) {
                bc2Var4.K = gm.p;
                Path path8 = new Path();
                bc2Var4.L = path8;
                path8.moveTo(gm.L(1.66f), gm.L(3.33f));
                bc2Var4.L.lineTo(gm.L(1.66f), gm.L(2.0f));
                rectF2.set(gm.L(1.66f), gm.L(0.33f), gm.L(4.99f), gm.L(3.6599998f));
                bc2Var4.L.arcTo(rectF2, -180.0f, f9, false);
                bc2Var4.L.lineTo(gm.L(5.0f), gm.L(3.33f));
            }
            if (bc2Var4.J == null) {
                Paint paint7 = new Paint(1);
                bc2Var4.J = paint7;
                paint7.setStyle(Paint.Style.STROKE);
            }
            bc2Var4.J.setStrokeWidth(gm.L(1.0f));
            bc2Var4.J.setColor(bc2Var4.c);
            bc2Var4.J.setAlpha(i28);
            canvas.drawPath(bc2Var4.L, bc2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        int i2;
        canvas.save();
        int L = gm.L(44.0f);
        rc2 rc2Var = this.a;
        canvas.translate(i, rc2Var.getMediaOffsetY() + L + rc2Var.gb + f);
        rc2Var.L4.draw(canvas);
        canvas.restore();
        k47 k47Var = rc2Var.Q5;
        if (k47Var.D != 0 && k47Var.k.media_unread) {
            Paint paint = cmb.R1;
            if (k47Var.O3()) {
                i2 = cmb.sc;
            } else {
                i2 = cmb.qe;
            }
            paint.setColor(cmb.v0(i2, rc2Var.cc));
            canvas.drawCircle(gm.L(6.0f) + i + rc2Var.N4, rc2Var.getMediaOffsetY() + gm.L(51.0f) + rc2Var.gb, gm.L(3.0f), cmb.R1);
        }
    }

    public final void d(k47 k47Var, boolean z) {
        boolean z2;
        boolean z3;
        c47 c47Var;
        int L;
        f47 f47Var;
        rc2 rc2Var = this.a;
        l39 l39Var = rc2Var.O;
        int i = 0;
        if (!rc2Var.u6 && k47Var.k.fwd_from != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        rc2Var.E9 = z2;
        if ((rc2Var.h6 && !k47Var.O3() && (k47Var.P1() < 0 || k47Var.P1() == 2666000)) || (((k47Var.o3() && k47Var.z4()) || (k47Var.y3() && k47Var.k.fwd_from.from_id == null)) && ((c47Var = rc2Var.M) == null || (c47Var.l & 4) != 0))) {
            z3 = true;
        } else {
            z3 = false;
        }
        rc2Var.v9 = z3;
        if (gm.O1()) {
            int P0 = gm.P0();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - gm.L(i + 50);
            rc2Var.b7 = Math.min(gm.L(270.0f), L);
        } else {
            int parentWidth = rc2Var.getParentWidth();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - gm.L(i + 50);
            rc2Var.b7 = Math.min(gm.L(270.0f), L);
        }
        if (rc2Var.M != null) {
            rc2Var.b7 = L;
        }
        int v0 = rc2Var.v0(L, k47Var);
        rc2Var.setMessageObjectInternal(k47Var);
        rc2Var.v0 = gm.L(82.0f) + rc2Var.gb;
        if (gm.L(76.0f) + v0 >= (rc2Var.b7 - rc2Var.M9) - gm.L(12.0f)) {
            rc2Var.v0 = gm.L(14.0f) + rc2Var.v0;
        }
        if (rc2Var.M != null && (f47Var = rc2Var.L) != null && f47Var.d.size() > 1) {
            if ((rc2Var.M.l & 4) == 0) {
                rc2Var.v0 -= gm.L(6.0f);
                rc2Var.X1 -= gm.L(6.0f);
            }
            if ((rc2Var.M.l & 8) == 0) {
                rc2Var.v0 -= gm.L(6.0f);
            }
        }
        if (rc2Var.J) {
            rc2Var.gb -= gm.L(1.0f);
        }
        l39Var.getClass();
        l39Var.o(L - gm.L(24.0f), 3);
        if (!l39Var.p) {
            l39Var.n = gm.L(12.0f) + l39Var.m;
            rc2Var.Z2(k47Var);
            int i2 = l39Var.o;
            if (i2 > rc2Var.b7) {
                rc2Var.b7 = i2;
            }
            if (gm.L(24.0f) + l39Var.r + rc2Var.M9 > rc2Var.b7) {
                l39Var.n = gm.L(12.0f) + l39Var.n;
                l39Var.k -= gm.L(12.0f);
            }
            if (!k47Var.G0 && k47Var.z != null) {
                l39Var.k = gm.L(14.0f) + l39Var.k;
            }
            rc2Var.v0 += l39Var.n;
        }
    }

    public final void e(k47 k47Var, boolean z) {
        int min;
        float f;
        rc2 rc2Var = this.a;
        l39 l39Var = rc2Var.O;
        boolean z2 = true;
        rc2Var.E9 = !rc2Var.u6;
        int i = 0;
        if ((!rc2Var.h6 || k47Var.O3() || (k47Var.P1() >= 0 && k47Var.P1() != 2666000)) && ((!k47Var.o3() || !k47Var.z4()) && ((!k47Var.y3() || k47Var.k.fwd_from.from_id != null) && (!rc2Var.Y6 || k47Var.O3() || (!rc2Var.l6 && (!rc2Var.m6 || !rc2Var.W6)))))) {
            z2 = false;
        }
        rc2Var.v9 = z2;
        if (gm.O1()) {
            int P0 = gm.P0();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - gm.L(i + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        } else {
            int parentWidth = rc2Var.getParentWidth();
            if (rc2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - gm.L(i + 50), gm.L(270.0f));
            rc2Var.b7 = min;
        }
        rc2Var.v0(min, k47Var);
        rc2Var.setMessageObjectInternal(k47Var);
        int L = gm.L(70.0f);
        int i2 = rc2Var.gb;
        rc2Var.v0 = L + i2;
        if (rc2Var.J) {
            rc2Var.gb = i2 - gm.L(1.0f);
        }
        l39Var.getClass();
        if (k47Var.O3()) {
            f = 32.0f;
        } else {
            f = 24.0f;
        }
        l39Var.o(min - gm.L(f), 3);
        if (!l39Var.p) {
            l39Var.n = l39Var.m;
            if (TextUtils.isEmpty(k47Var.z)) {
                l39Var.n = gm.L(12.0f) + l39Var.n;
            } else {
                l39Var.n = gm.L(8.0f) + l39Var.n;
            }
            int i3 = l39Var.o;
            if (i3 > rc2Var.b7) {
                rc2Var.b7 = i3;
            }
            int L2 = gm.L(6.0f) + rc2Var.M9;
            if (k47.a4(k47Var.k) && !k47Var.m4()) {
                L2 -= gm.L(3.0f);
            } else if (k47Var.O3()) {
                L2 += gm.L(20.5f);
            }
            int extraTimeX = rc2Var.getExtraTimeX() + L2;
            if (!rc2Var.y2() && l39Var.r + extraTimeX >= rc2Var.b7) {
                l39Var.n = gm.L(12.0f) + l39Var.n;
                l39Var.k -= gm.L(12.0f);
            }
            rc2Var.v0 += l39Var.n;
        }
    }
}
