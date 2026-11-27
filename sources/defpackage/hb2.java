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
public final class hb2 {
    public final wb2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public hb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final void a(android.graphics.Canvas r18, float r19, float r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb2.a(android.graphics.Canvas, float, float):void");
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
        wb2 wb2Var = this.a;
        dc2 dc2Var = wb2Var.ub;
        int currentBackgroundRight = wb2Var.getCurrentBackgroundRight() - wb2Var.getCurrentBackgroundLeft();
        if (wb2Var.G) {
            f3 = 6.0f;
        } else {
            f3 = 0.0f;
        }
        int L3 = hl.L(f3) + currentBackgroundRight;
        if (wb2Var.R1) {
            i2 = 10;
        } else {
            i2 = 0;
        }
        int L4 = L3 - hl.L(i2 + 128);
        if (wb2Var.J4 == null) {
            gb2 gb2Var = new gb2(this, wb2Var, wb2Var.E4);
            wb2Var.J4 = gb2Var;
            r47 r47Var = wb2Var.Q5;
            TLRPC.Message message = r47Var.k;
            if (message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && u2c.m(r47Var)) {
                z3 = true;
            } else {
                z3 = false;
            }
            gb2Var.u(z3, false);
            wb2Var.J4.s(u2c.l(wb2Var.Q5), false);
            wb2Var.J4.t(u2c.w(wb2Var.Q5), false);
        }
        if (wb2Var.R8 != 0) {
            this.b = hl.R1(uh9.w(21.0f, i, L4), wb2Var.d9, 1.0f - wb2Var.getVideoTranscriptionProgress());
            R1 = hl.R1(hl.L(3.0f) + wb2Var.H4, wb2Var.e9 - hl.L(40.0f), 1.0f - wb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float w = uh9.w(21.0f, i, L4);
            r47 r47Var2 = wb2Var.Q5;
            if (r47Var2 != null && r47Var2.O3()) {
                L = (hl.L(28.0f) * f2) + (wb2Var.getCurrentBackgroundLeft() - hl.L(40.0f));
            } else if (wb2Var.v2()) {
                L = Math.min(wb2Var.getPhotoImage().w() + hl.L(8.0f), wb2Var.getCompactRight() - hl.L(32.0f));
            } else {
                L = (hl.L(8.0f) + wb2Var.getCurrentBackgroundRight()) - (hl.L(40.0f) * f2);
            }
            this.b = hl.R1(w, L, 1.0f - wb2Var.getVideoTranscriptionProgress());
            float f11 = wb2Var.e7 + dc2Var.j0;
            if (wb2Var.K) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            float L5 = f11 - hl.L(28 - i3);
            x49 x49Var = wb2Var.O;
            if (!x49Var.p) {
                L5 -= x49Var.i(dc2Var.L1);
            }
            float R12 = hl.R1(L5, (wb2Var.getMediaOffsetY() + (hl.L(44.0f) + wb2Var.gb)) - hl.L(1.7f), wb2Var.getVideoTranscriptionProgress()) + hl.L(1.7f);
            float L6 = hl.L(3.0f) + wb2Var.H4;
            float L7 = R12 - hl.L(12.0f);
            if (wb2Var.Q5.O3()) {
                L2 = 0.0f;
            } else {
                L2 = hl.L(28.0f) * f2;
            }
            R1 = hl.R1(L6, L7 - L2, 1.0f - wb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        gb2 gb2Var2 = wb2Var.J4;
        int i8 = (int) this.b;
        int i9 = (int) R1;
        int U1 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(30.0f), hl.L(32.0f));
        int U12 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(24.0f), hl.L(32.0f));
        int U13 = hl.U1(1.0f - wb2Var.getVideoTranscriptionProgress(), hl.L(8.0f), hl.L(16.0f));
        Rect rect = gb2Var2.u;
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
            gb2Var2.F = (float) ((Math.atan((f12 - f13) / f14) * 180.0d) / 3.141592653589793d);
            gb2Var2.G = (float) ((Math.atan(f12 / (f14 - f13)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i8, i9, i8 + U1, i9 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        gb2Var2.D = min;
        gb2Var2.E = min << 1;
        gb2 gb2Var3 = wb2Var.J4;
        if (wb2Var.v2()) {
            i5 = aob.Ta;
        } else {
            i5 = aob.Zc;
        }
        int v0 = aob.v0(i5, wb2Var.cc);
        if (wb2Var.Q5.O3()) {
            i6 = aob.Jc;
        } else {
            i6 = aob.tk;
        }
        int v02 = aob.v0(i6, wb2Var.cc);
        if (wb2Var.M1 == 3) {
            videoTranscriptionProgress = 1.0f;
        } else {
            videoTranscriptionProgress = wb2Var.getVideoTranscriptionProgress();
        }
        int f15 = vm2.f(videoTranscriptionProgress, v0, v02);
        aob.v0(aob.y6, wb2Var.cc);
        wb2Var.Q5.N3();
        if (wb2Var.M1 == 3) {
            videoTranscriptionProgress2 = f6;
        } else {
            videoTranscriptionProgress2 = 1.0f - wb2Var.getVideoTranscriptionProgress();
        }
        b29 b29Var = gb2Var3.p;
        b29 b29Var2 = gb2Var3.n;
        if (gb2Var3.b != f15) {
            z = true;
        } else {
            z = false;
        }
        gb2Var3.b = f15;
        gb2Var3.c = f15;
        int o = vm2.o(f15, (int) (Color.alpha(f15) * 0.156f));
        gb2Var3.a = o;
        gb2Var3.e = videoTranscriptionProgress2;
        float alpha = Color.alpha(f15);
        if (aob.I.o()) {
            f7 = 0.3f;
        } else {
            f7 = 0.2f;
        }
        gb2Var3.d = aob.v(o, vm2.o(f15, (int) (alpha * f7)));
        Paint paint2 = gb2Var3.f;
        if (paint2 == null) {
            paint2 = new Paint();
            gb2Var3.f = paint2;
        }
        paint2.setColor(gb2Var3.a);
        gb2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress2) * paint.getAlpha()));
        if (z || gb2Var3.q == null) {
            int L8 = hl.L(8.0f);
            int i10 = gb2Var3.d;
            hf0 i0 = aob.i0(L8, L8, L8, L8, 0, i10, i10);
            gb2Var3.q = i0;
            i0.setCallback(gb2Var3.r);
        }
        if (z) {
            b29Var2.a0 = true;
            b29Var2.L(gb2Var3.c, "Artboard Outlines");
            b29Var2.j();
            b29Var2.E(true);
            b29Var2.Q(0L);
            int alpha2 = Color.alpha(f15);
            gb2Var3.m = alpha2;
            b29Var2.setAlpha(alpha2);
            b29Var.a0 = true;
            b29Var.L(gb2Var3.c, "Artboard Outlines");
            b29Var.j();
            b29Var.E(true);
            b29Var.Q(0L);
            int alpha3 = Color.alpha(f15);
            gb2Var3.o = alpha3;
            b29Var.setAlpha(alpha3);
        }
        if (gb2Var3.g == null) {
            Paint paint3 = new Paint(1);
            gb2Var3.g = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            gb2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        gb2Var3.g.setColor(f15);
        gb2 gb2Var4 = wb2Var.J4;
        b29 b29Var3 = gb2Var4.p;
        b29 b29Var4 = gb2Var4.n;
        Rect rect2 = gb2Var4.v;
        Rect rect3 = gb2Var4.u;
        rect2.set(rect3.left - hl.L(8.0f), rect3.top - hl.L(8.0f), hl.L(8.0f) + rect3.right, hl.L(8.0f) + rect3.bottom);
        Path path = gb2Var4.C;
        if (path == null) {
            gb2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = hl.P;
        rectF.set(rect3);
        Path path2 = gb2Var4.C;
        float f16 = gb2Var4.D;
        path2.addRoundRect(rectF, f16, f16, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(gb2Var4.C);
        float f17 = gb2Var4.e * f;
        if (f17 > f6) {
            wb2 wb2Var2 = gb2Var4.T.a;
            if (wb2Var2.Q5.O5()) {
                c2 = wb2Var2.c2("paintChatActionBackground");
            } else {
                c2 = wb2Var2.c2("paintChatTimeBackground");
            }
            int alpha4 = c2.getAlpha();
            c2.setAlpha((int) (alpha4 * f17));
            wb2Var2.C();
            canvas.drawRect(rect3, c2);
            if (c2 == wb2Var2.c2("paintChatActionBackground") && wb2Var2.i2()) {
                int alpha5 = aob.h2.getAlpha();
                aob.h2.setAlpha((int) (alpha5 * f17));
                canvas.drawRect(rect3, aob.h2);
                aob.h2.setAlpha(alpha5);
            }
            c2.setAlpha(alpha4);
        }
        Paint paint4 = gb2Var4.f;
        if (paint4 != null) {
            int alpha6 = paint4.getAlpha();
            gb2Var4.f.setAlpha((int) (alpha6 * f));
            canvas.drawRect(rect3, gb2Var4.f);
            gb2Var4.f.setAlpha(alpha6);
        }
        hf0 hf0Var = gb2Var4.q;
        if (hf0Var != null) {
            hf0Var.setBounds(rect3);
            gb2Var4.q.draw(canvas);
        }
        canvas.restore();
        mm mmVar = gb2Var4.l;
        if (gb2Var4.k) {
            f8 = 1.0f;
        } else {
            f8 = f6;
        }
        float e = mmVar.e(false, f8);
        if (e > f6) {
            long elapsedRealtime = ((float) (SystemClock.elapsedRealtime() - gb2Var4.t)) * 0.75f;
            x84 x84Var = gb2Var4.B;
            float[] fArr2 = gb2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i4];
                gb2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f18 = ((float) (1520 * j)) / 5400.0f;
            fArr2[0] = f18 - 20.0f;
            fArr2[1] = f18;
            int i11 = 0;
            while (true) {
                fArr = gb2Var4.M;
                if (i11 >= 4) {
                    break;
                }
                fArr[1] = (x84Var.getInterpolation(((float) (j - (i11 * 1350))) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = gb2Var4.M;
                fArr3[0] = (x84Var.getInterpolation(((float) (j - (i7 + 667))) / 667.0f) * 250.0f) + fArr3[0];
                i11++;
            }
            f9 = 180.0f;
            Path path3 = gb2Var4.h;
            if (path3 == null) {
                gb2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f5, fArr[1] - fArr[0]);
            float f19 = fArr[0];
            float f20 = (1.0f - e) * max;
            if (gb2Var4.k) {
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
            Path path4 = gb2Var4.h;
            int centerX = rect3.centerX();
            int i12 = rect3.top;
            u2c.d(path4, centerX, i12, rect3.right - gb2Var4.D, i12, f25, f26, 0.0f, gb2Var4.F);
            u2c.b(gb2Var4.h, rect3.right, rect3.top, gb2Var4.E, 1, f25, f26, gb2Var4.F, gb2Var4.G);
            Path path5 = gb2Var4.h;
            int i13 = rect3.right;
            int i14 = rect3.top;
            int i15 = gb2Var4.D;
            int i16 = i14 + i15;
            int i17 = rect3.bottom - i15;
            float f27 = gb2Var4.G;
            u2c.d(path5, i13, i16, i13, i17, f25, f26, f27, 180.0f - f27);
            u2c.b(gb2Var4.h, rect3.right, rect3.bottom, gb2Var4.E, 2, f25, f26, 180.0f - gb2Var4.G, 180.0f - gb2Var4.F);
            Path path6 = gb2Var4.h;
            int i18 = rect3.right;
            int i19 = gb2Var4.D;
            int i20 = i18 - i19;
            int i21 = rect3.bottom;
            int i22 = rect3.left + i19;
            float f28 = gb2Var4.F;
            u2c.d(path6, i20, i21, i22, i21, f25, f26, 180.0f - f28, f28 + 180.0f);
            u2c.b(gb2Var4.h, rect3.left, rect3.bottom, gb2Var4.E, 3, f25, f26, gb2Var4.F + 180.0f, gb2Var4.G + 180.0f);
            Path path7 = gb2Var4.h;
            int i23 = rect3.left;
            int i24 = rect3.bottom;
            int i25 = gb2Var4.D;
            int i26 = i24 - i25;
            int i27 = rect3.top + i25;
            float f29 = gb2Var4.G;
            u2c.d(path7, i23, i26, i23, i27, f25, f26, f29 + 180.0f, 360.0f - f29);
            u2c.b(gb2Var4.h, rect3.left, rect3.top, gb2Var4.E, 4, f25, f26, 360.0f - gb2Var4.G, 360.0f - gb2Var4.F);
            u2c.d(gb2Var4.h, rect3.left + gb2Var4.D, rect3.top, rect3.centerX(), rect3.top, f25, f26, 360.0f - gb2Var4.F, 360.0f);
            gb2Var4.g.setStrokeWidth(hl.L(1.5f));
            int alpha7 = gb2Var4.g.getAlpha();
            gb2Var4.g.setAlpha((int) (alpha7 * f));
            canvas.drawPath(gb2Var4.h, gb2Var4.g);
            gb2Var4.g.setAlpha(alpha7);
            gb2Var4.r.invalidate();
        } else {
            f9 = 180.0f;
        }
        canvas.save();
        canvas.translate(hl.L(-13.0f) + rect3.centerX(), hl.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, hl.L(26.0f), hl.L(26.0f), 255, 31);
        if (gb2Var4.y) {
            b29Var4.setAlpha((int) (gb2Var4.m * f));
            b29Var4.draw(canvas);
        } else {
            b29Var3.setAlpha((int) (gb2Var4.o * f));
            b29Var3.draw(canvas);
        }
        mm mmVar2 = gb2Var4.j;
        if (gb2Var4.i && !gb2Var4.y && !gb2Var4.k) {
            z2 = true;
        } else {
            z2 = false;
        }
        float d = mmVar2.d(z2);
        if (d > f6) {
            canvas.save();
            canvas.translate(hl.L(18.0f), hl.L(f4));
            if (gb2Var4.H == null) {
                Paint paint5 = new Paint(1);
                gb2Var4.H = paint5;
                paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = hl.P;
            rectF2.set(f6, -hl.L(0.4f), hl.L(6.666f), hl.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, hl.L(2.0f), hl.L(2.0f), gb2Var4.H);
            Paint paint6 = gb2Var4.I;
            if (paint6 == null) {
                paint6 = new Paint(1);
                gb2Var4.I = paint6;
            }
            paint6.setColor(gb2Var4.c);
            int i28 = (int) (d * 255.0f);
            gb2Var4.I.setAlpha(i28);
            rectF2.set(0.0f, hl.L(3.33f), hl.L(6.666f), hl.L(8.33f));
            canvas.drawRoundRect(rectF2, hl.L(1.33f), hl.L(1.33f), gb2Var4.I);
            if (gb2Var4.L == null || Math.abs(gb2Var4.K - hl.p) > 0.1f) {
                gb2Var4.K = hl.p;
                Path path8 = new Path();
                gb2Var4.L = path8;
                path8.moveTo(hl.L(1.66f), hl.L(3.33f));
                gb2Var4.L.lineTo(hl.L(1.66f), hl.L(2.0f));
                rectF2.set(hl.L(1.66f), hl.L(0.33f), hl.L(4.99f), hl.L(3.6599998f));
                gb2Var4.L.arcTo(rectF2, -180.0f, f9, false);
                gb2Var4.L.lineTo(hl.L(5.0f), hl.L(3.33f));
            }
            if (gb2Var4.J == null) {
                Paint paint7 = new Paint(1);
                gb2Var4.J = paint7;
                paint7.setStyle(Paint.Style.STROKE);
            }
            gb2Var4.J.setStrokeWidth(hl.L(1.0f));
            gb2Var4.J.setColor(gb2Var4.c);
            gb2Var4.J.setAlpha(i28);
            canvas.drawPath(gb2Var4.L, gb2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        int i2;
        canvas.save();
        int L = hl.L(44.0f);
        wb2 wb2Var = this.a;
        canvas.translate(i, wb2Var.getMediaOffsetY() + L + wb2Var.gb + f);
        wb2Var.L4.draw(canvas);
        canvas.restore();
        r47 r47Var = wb2Var.Q5;
        if (r47Var.D != 0 && r47Var.k.media_unread) {
            Paint paint = aob.S1;
            if (r47Var.O3()) {
                i2 = aob.tc;
            } else {
                i2 = aob.re;
            }
            paint.setColor(aob.v0(i2, wb2Var.cc));
            canvas.drawCircle(hl.L(6.0f) + i + wb2Var.N4, wb2Var.getMediaOffsetY() + hl.L(51.0f) + wb2Var.gb, hl.L(3.0f), aob.S1);
        }
    }

    public final void d(r47 r47Var, boolean z) {
        boolean z2;
        boolean z3;
        j47 j47Var;
        int L;
        m47 m47Var;
        wb2 wb2Var = this.a;
        x49 x49Var = wb2Var.O;
        int i = 0;
        if (!wb2Var.u6 && r47Var.k.fwd_from != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        wb2Var.E9 = z2;
        if ((wb2Var.h6 && !r47Var.O3() && (r47Var.P1() < 0 || r47Var.P1() == 2666000)) || (((r47Var.o3() && r47Var.z4()) || (r47Var.y3() && r47Var.k.fwd_from.from_id == null)) && ((j47Var = wb2Var.M) == null || (j47Var.l & 4) != 0))) {
            z3 = true;
        } else {
            z3 = false;
        }
        wb2Var.v9 = z3;
        if (hl.O1()) {
            int P0 = hl.P0();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - hl.L(i + 50);
            wb2Var.b7 = Math.min(hl.L(270.0f), L);
        } else {
            int parentWidth = wb2Var.getParentWidth();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - hl.L(i + 50);
            wb2Var.b7 = Math.min(hl.L(270.0f), L);
        }
        if (wb2Var.M != null) {
            wb2Var.b7 = L;
        }
        int w0 = wb2Var.w0(L, r47Var);
        wb2Var.setMessageObjectInternal(r47Var);
        wb2Var.v0 = hl.L(82.0f) + wb2Var.gb;
        if (hl.L(76.0f) + w0 >= (wb2Var.b7 - wb2Var.M9) - hl.L(12.0f)) {
            wb2Var.v0 = hl.L(14.0f) + wb2Var.v0;
        }
        if (wb2Var.M != null && (m47Var = wb2Var.L) != null && m47Var.d.size() > 1) {
            if ((wb2Var.M.l & 4) == 0) {
                wb2Var.v0 -= hl.L(6.0f);
                wb2Var.X1 -= hl.L(6.0f);
            }
            if ((wb2Var.M.l & 8) == 0) {
                wb2Var.v0 -= hl.L(6.0f);
            }
        }
        if (wb2Var.J) {
            wb2Var.gb -= hl.L(1.0f);
        }
        x49Var.getClass();
        x49Var.o(L - hl.L(24.0f), 3);
        if (!x49Var.p) {
            x49Var.n = hl.L(12.0f) + x49Var.m;
            wb2Var.Z2(r47Var);
            int i2 = x49Var.o;
            if (i2 > wb2Var.b7) {
                wb2Var.b7 = i2;
            }
            if (hl.L(24.0f) + x49Var.r + wb2Var.M9 > wb2Var.b7) {
                x49Var.n = hl.L(12.0f) + x49Var.n;
                x49Var.k -= hl.L(12.0f);
            }
            if (!r47Var.G0 && r47Var.z != null) {
                x49Var.k = hl.L(14.0f) + x49Var.k;
            }
            wb2Var.v0 += x49Var.n;
        }
    }

    public final void e(r47 r47Var, boolean z) {
        int min;
        float f;
        wb2 wb2Var = this.a;
        x49 x49Var = wb2Var.O;
        boolean z2 = true;
        wb2Var.E9 = !wb2Var.u6;
        int i = 0;
        if ((!wb2Var.h6 || r47Var.O3() || (r47Var.P1() >= 0 && r47Var.P1() != 2666000)) && ((!r47Var.o3() || !r47Var.z4()) && ((!r47Var.y3() || r47Var.k.fwd_from.from_id != null) && (!wb2Var.Y6 || r47Var.O3() || (!wb2Var.l6 && (!wb2Var.m6 || !wb2Var.W6)))))) {
            z2 = false;
        }
        wb2Var.v9 = z2;
        if (hl.O1()) {
            int P0 = hl.P0();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - hl.L(i + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        } else {
            int parentWidth = wb2Var.getParentWidth();
            if (wb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - hl.L(i + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        }
        wb2Var.w0(min, r47Var);
        wb2Var.setMessageObjectInternal(r47Var);
        int L = hl.L(70.0f);
        int i2 = wb2Var.gb;
        wb2Var.v0 = L + i2;
        if (wb2Var.J) {
            wb2Var.gb = i2 - hl.L(1.0f);
        }
        x49Var.getClass();
        if (r47Var.O3()) {
            f = 32.0f;
        } else {
            f = 24.0f;
        }
        x49Var.o(min - hl.L(f), 3);
        if (!x49Var.p) {
            x49Var.n = x49Var.m;
            if (TextUtils.isEmpty(r47Var.z)) {
                x49Var.n = hl.L(12.0f) + x49Var.n;
            } else {
                x49Var.n = hl.L(8.0f) + x49Var.n;
            }
            int i3 = x49Var.o;
            if (i3 > wb2Var.b7) {
                wb2Var.b7 = i3;
            }
            int L2 = hl.L(6.0f) + wb2Var.M9;
            if (r47.a4(r47Var.k) && !r47Var.m4()) {
                L2 -= hl.L(3.0f);
            } else if (r47Var.O3()) {
                L2 += hl.L(20.5f);
            }
            int extraTimeX = wb2Var.getExtraTimeX() + L2;
            if (!wb2Var.y2() && x49Var.r + extraTimeX >= wb2Var.b7) {
                x49Var.n = hl.L(12.0f) + x49Var.n;
                x49Var.k -= hl.L(12.0f);
            }
            wb2Var.v0 += x49Var.n;
        }
    }
}
