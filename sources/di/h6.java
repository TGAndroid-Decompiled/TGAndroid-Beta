package di;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
public final class h6 {
    public float A;
    public float B;
    public vy0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ec G;
    public final org.telegram.ui.Components.mc H;
    public final org.telegram.ui.Components.mc I;
    public final org.telegram.ui.Components.mc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public fj R;
    public boolean S;
    public final te.c T;
    public bi.y0 U;
    public bi.y0 V;
    public final int f8939a;
    public final View f8940b;
    public final org.telegram.ui.ActionBar.i6 f8941c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.m5 f8942e;
    public int f8944g;
    public RadialGradient h;
    public final bi.f3 f8946j;
    public TL_stars.starGiftAttributeBackdrop f8947k;
    public TL_stars.starGiftAttributePattern f8948l;
    public TL_stars.starGiftAttributeModel f8949m;
    public boolean f8952p;
    public float f8953q;
    public vy0 f8954r;
    public float f8955s;
    public vy0 f8956t;
    public float f8957u;
    public float v;
    public float f8959x;
    public final bi.h1 f8960y;
    public boolean f8961z;
    public final Paint f8943f = new Paint(1);
    public final Matrix f8945i = new Matrix();
    public final RectF f8950n = new RectF();
    public final Path f8951o = new Path();
    public final ArrayList f8958w = new ArrayList();

    public h6(int i7, View view, org.telegram.ui.ActionBar.i6 i6Var) {
        bi.h1 h1Var = new bi.h1();
        this.f8960y = h1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ec(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 26), lr.h, 320L);
        this.f8939a = i7;
        this.f8940b = view;
        this.f8941c = i6Var;
        this.f8946j = new bi.f3(view, 1.0f);
        this.H = new org.telegram.ui.Components.mc(view);
        this.I = new org.telegram.ui.Components.mc(view);
        this.J = new org.telegram.ui.Components.mc(view);
        this.d = new ImageReceiver(view);
        this.f8942e = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(28.0f), view);
        h1Var.f3654r = view;
        h1Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.f8942e.a();
            this.f8960y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        bi.f3 f3Var = this.f8946j;
        if (z10 && f3Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.u6.f30083b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    f3Var.f(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29635q7, this.f8941c));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        te.c cVar = this.T;
        float f10 = cVar.f57663f;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f8950n;
        rectF.set(0.0f, 0.0f, f10, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f8947k != null && (this.h == null || this.f8944g != height)) {
            this.f8944g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f8947k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f8943f;
        if (radialGradient != null) {
            Matrix matrix = this.f8945i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f8951o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a10 = this.I.a(0.0125f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f11, org.telegram.messenger.g0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f8947k;
        org.telegram.ui.Components.m5 m5Var = this.f8942e;
        if (stargiftattributebackdrop2 != null) {
            m5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        v0.a(canvas, 1, m5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f));
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f8947k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.f8954r.f41493p = cVar.f57663f - org.telegram.messenger.g0.L(12.0f);
        vy0 vy0Var = this.f8954r;
        vy0Var.c(f11 - (vy0Var.f41482c / 2.0f), this.f8953q, 1.0f, -1, canvas);
        this.f8956t.f41493p = cVar.f57663f - org.telegram.messenger.g0.L(12.0f);
        vy0 vy0Var2 = this.f8956t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        vy0Var2.c(f11 - (vy0Var2.f41482c / 2.0f), this.f8955s, 1.0f, i12, canvas2);
        if (this.f8961z) {
            bi.h1 h1Var = this.f8960y;
            int i13 = h1Var.f3656t;
            int i14 = h1Var.f3657u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.f8959x;
            int i17 = i13 + i15;
            h1Var.setBounds(i15, i16, i17, i16 + i14);
            float f12 = this.f8959x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f12, i17, i14 + f12);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            h1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float L = this.f8957u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.f8958w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                g6 g6Var = (g6) arrayList.get(i18);
                vy0 vy0Var3 = g6Var.f8862b;
                float f14 = f11 - (L / 2.0f);
                float f15 = f13;
                vy0Var3.c((f14 + this.f8957u) - vy0Var3.f41482c, g6Var.f8861a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                g6Var.f8863c.c(f14 + this.f8957u + org.telegram.messenger.g0.L(f15), g6Var.f8861a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f13 = f15;
            }
        }
        int i20 = i12;
        if (!this.f8952p) {
            float f16 = this.A;
            float a12 = org.telegram.messenger.f3.a(this.C.f41482c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f11 - ((this.C.f41482c + org.telegram.messenger.g0.L(30.0f)) / 2.0f), f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.n6.r1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            f3Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            f3Var.f3573y = i20;
            f3Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f8952p) {
            return;
        }
        canvas.save();
        float a10 = this.I.a(0.0125f);
        RectF rectF = this.f8950n;
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float a11 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ec ecVar = this.G;
        ecVar.g(rectF2);
        ecVar.d();
        ecVar.a(canvas, org.telegram.ui.ActionBar.n6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f8940b;
        if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).U();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f57663f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.h6.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.fj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: di.h6.f(org.telegram.messenger.fj, boolean):void");
    }

    public final void g(fj fjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f10;
        int i7;
        float f11;
        int L;
        TLObject g22;
        int i10;
        float f12 = this.O;
        boolean P3 = fjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f8939a;
        if (z10 == P3) {
            B0 = j10.i(i11).e();
        } else {
            B0 = fj.B0(fjVar.f23965k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.n5.o(peer);
        }
        String t6 = org.telegram.messenger.n5.t(B0);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i12 = 0;
        if (this.f8952p) {
            this.f8954r = new vy0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !o10.B(fj.B0(fjVar.f23965k))) {
            if (fj.B0(fjVar.f23965k) == j10.i(i11).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f8954r = new vy0(gd.M0(2131750445, null), 14.0f, org.telegram.messenger.g0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f8954r = new vy0(gd.M0(2131750432, null), 14.0f, org.telegram.messenger.g0.o());
                } else {
                    this.f8954r = new vy0(gd.M0(2131750410, null), 14.0f, org.telegram.messenger.g0.o());
                }
            } else {
                this.f8954r = new vy0(gd.a0(null, null, 2131749876, t6), 14.0f, org.telegram.messenger.g0.o());
            }
        } else {
            this.f8954r = new vy0(gd.M0(2131749875, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f8953q = (this.f8954r.i() / 2.0f) + L2;
        float i13 = this.f8954r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.f8952p) {
            f10 = 2.0f;
            this.f8956t = new vy0(gd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i11;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i11;
            this.f8956t = new vy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f8955s = (this.f8956t.i() / f10) + i13;
        float i14 = this.f8956t.i() + i13;
        if (this.f8952p) {
            f11 = 14.0f;
        } else {
            f11 = 11.0f;
        }
        float L3 = i14 + org.telegram.messenger.g0.L(f11);
        ArrayList arrayList = this.f8958w;
        arrayList.clear();
        this.f8957u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        bi.h1 h1Var = this.f8960y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = h1Var.f3641c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            fj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable B5 = fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                g22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                g22 = mp.u1(i7).g2(org.telegram.messenger.n5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                g22 = mp.u1(i7).g2(fjVar.Z0());
            }
            this.f8961z = true;
            h1Var.c(g22);
            h1Var.f3649m = B5;
            h1Var.f3655s = -1;
            h1Var.b(((int) f12) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = h1Var.f3650n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = h1Var.f3650n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(fjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.g0.L(4.0f);
            this.f8959x = L4;
            L3 = L4 + h1Var.f3657u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.f8961z = false;
            h1Var.c(null);
            h1Var.f3649m = null;
            h1Var.f3655s = -1;
            if (this.f8949m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var = new g6(L3, gd.M0(2131750371, null), this.f8949m.name);
                arrayList.add(g6Var);
                float f13 = f12 * 0.5f;
                vy0 vy0Var = g6Var.f8862b;
                vy0Var.f41493p = f13;
                this.f8957u = Math.max(this.f8957u, vy0Var.f41482c);
                vy0 vy0Var2 = g6Var.f8863c;
                vy0Var2.f41493p = f13;
                this.v = Math.max(this.v, vy0Var2.f41482c);
                L3 += g6Var.a();
            }
            if (this.f8947k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var2 = new g6(L3, gd.M0(2131750372, null), this.f8947k.name);
                arrayList.add(g6Var2);
                float f14 = f12 * 0.5f;
                vy0 vy0Var3 = g6Var2.f8862b;
                vy0Var3.f41493p = f14;
                this.f8957u = Math.max(this.f8957u, vy0Var3.f41482c);
                vy0 vy0Var4 = g6Var2.f8863c;
                vy0Var4.f41493p = f14;
                this.v = Math.max(this.v, vy0Var4.f41482c);
                L3 = g6Var2.a() + L3;
            }
            if (this.f8948l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                g6 g6Var3 = new g6(L3, gd.M0(2131750364, null), this.f8948l.name);
                arrayList.add(g6Var3);
                float f15 = f12 * 0.5f;
                vy0 vy0Var5 = g6Var3.f8862b;
                vy0Var5.f41493p = f15;
                this.f8957u = Math.max(this.f8957u, vy0Var5.f41482c);
                vy0 vy0Var6 = g6Var3.f8863c;
                vy0Var6.f41493p = f15;
                this.v = Math.max(this.v, vy0Var6.f41482c);
                L3 += g6Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.g0.L(11.66f);
        if (!this.f8952p) {
            this.A = L5;
            this.C = new vy0(gd.M0(2131749872, null), 14.0f, org.telegram.messenger.g0.o());
            float L6 = org.telegram.messenger.g0.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = org.telegram.messenger.g0.L(11.0f);
        } else {
            L = org.telegram.messenger.g0.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i7;
        float f10 = this.O;
        float L = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i10 = 0;
        TLObject tLObject = null;
        vy0 vy0Var = new vy0(gd.a0(null, null, 2131749876, org.telegram.messenger.n5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.f8954r = vy0Var;
        this.f8953q = (vy0Var.i() / 2.0f) + L;
        float i11 = this.f8954r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        vy0 vy0Var2 = new vy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f8956t = vy0Var2;
        this.f8955s = (vy0Var2.i() / 2.0f) + i11;
        float i12 = this.f8956t.i() + i11 + org.telegram.messenger.g0.L(11.0f);
        this.f8958w.clear();
        this.f8957u = 0.0f;
        this.v = 0.0f;
        bi.h1 h1Var = this.f8960y;
        TextPaint textPaint = h1Var.f3641c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            fj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131749731, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j3 != 0) {
            tLObject = mp.u1(this.f8939a).g2(j3);
        }
        this.f8961z = true;
        h1Var.c(tLObject);
        h1Var.f3649m = spanned;
        h1Var.f3655s = -1;
        h1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = h1Var.f3650n;
            if (staticLayout != null) {
                i7 = staticLayout.getLineCount();
            } else {
                i7 = 0;
            }
            if (i7 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = h1Var.f3650n;
                if (staticLayout2 != null) {
                    i10 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i10 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i12 + org.telegram.messenger.g0.L(4.0f);
        this.f8959x = L2;
        float L3 = L2 + h1Var.f3657u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new vy0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
