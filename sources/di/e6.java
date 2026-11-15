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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class e6 {
    public float A;
    public float B;
    public oy0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ac G;
    public final org.telegram.ui.Components.dc H;
    public final org.telegram.ui.Components.dc I;
    public final org.telegram.ui.Components.dc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public gj R;
    public boolean S;
    public final te.c T;
    public bi.y0 U;
    public bi.y0 V;
    public final int f8465a;
    public final View f8466b;
    public final org.telegram.ui.ActionBar.e6 f8467c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.e5 f8468e;
    public int f8470g;
    public RadialGradient h;
    public final bi.l2 f8472j;
    public TL_stars.starGiftAttributeBackdrop f8473k;
    public TL_stars.starGiftAttributePattern f8474l;
    public TL_stars.starGiftAttributeModel f8475m;
    public boolean f8478p;
    public float f8479q;
    public oy0 f8480r;
    public float f8481s;
    public oy0 f8482t;
    public float f8483u;
    public float v;
    public float f8485x;
    public final bi.g1 f8486y;
    public boolean f8487z;
    public final Paint f8469f = new Paint(1);
    public final Matrix f8471i = new Matrix();
    public final RectF f8476n = new RectF();
    public final Path f8477o = new Path();
    public final ArrayList f8484w = new ArrayList();

    public e6(int i7, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        bi.g1 g1Var = new bi.g1();
        this.f8486y = g1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ac(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 26), er.h, 320L);
        this.f8465a = i7;
        this.f8466b = view;
        this.f8467c = e6Var;
        this.f8472j = new bi.l2(view);
        this.H = new org.telegram.ui.Components.dc(view);
        this.I = new org.telegram.ui.Components.dc(view);
        this.J = new org.telegram.ui.Components.dc(view);
        this.d = new ImageReceiver(view);
        this.f8468e = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), view);
        g1Var.f3543r = view;
        g1Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.f8468e.a();
            this.f8486y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        bi.l2 l2Var = this.f8472j;
        if (z10 && l2Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.q6.f29535b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29090q7, this.f8467c);
                    Paint paint = (Paint) l2Var.f220b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        te.c cVar = this.T;
        float f10 = cVar.f57091f;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f8476n;
        rectF.set(0.0f, 0.0f, f10, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f8473k != null && (this.h == null || this.f8470g != height)) {
            this.f8470g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f8473k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f8469f;
        if (radialGradient != null) {
            Matrix matrix = this.f8471i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f8477o;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a10 = this.I.a(0.0125f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint2);
        canvas.save();
        canvas.translate(f11, org.telegram.messenger.g0.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f8473k;
        org.telegram.ui.Components.e5 e5Var = this.f8468e;
        if (stargiftattributebackdrop2 != null) {
            e5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        w0.a(canvas, 1, e5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f));
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f8473k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.f8480r.f38114p = cVar.f57091f - org.telegram.messenger.g0.L(12.0f);
        oy0 oy0Var = this.f8480r;
        oy0Var.c(f11 - (oy0Var.f38103c / 2.0f), this.f8479q, 1.0f, -1, canvas);
        this.f8482t.f38114p = cVar.f57091f - org.telegram.messenger.g0.L(12.0f);
        oy0 oy0Var2 = this.f8482t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        oy0Var2.c(f11 - (oy0Var2.f38103c / 2.0f), this.f8481s, 1.0f, i12, canvas2);
        if (this.f8487z) {
            bi.g1 g1Var = this.f8486y;
            int i13 = g1Var.f3545t;
            int i14 = g1Var.f3546u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.f8485x;
            int i17 = i13 + i15;
            g1Var.setBounds(i15, i16, i17, i16 + i14);
            float f12 = this.f8485x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f12, i17, i14 + f12);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            g1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float L = this.f8483u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.f8484w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                d6 d6Var = (d6) arrayList.get(i18);
                oy0 oy0Var3 = d6Var.f8398b;
                float f14 = f11 - (L / 2.0f);
                float f15 = f13;
                oy0Var3.c((f14 + this.f8483u) - oy0Var3.f38103c, d6Var.f8397a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                d6Var.f8399c.c(f14 + this.f8483u + org.telegram.messenger.g0.L(f15), d6Var.f8397a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f13 = f15;
            }
        }
        int i20 = i12;
        if (!this.f8478p) {
            float f16 = this.A;
            float a12 = org.telegram.messenger.k5.a(this.C.f38103c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f11 - ((this.C.f38103c + org.telegram.messenger.g0.L(30.0f)) / 2.0f), f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.j6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            l2Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            l2Var.f3672y = i20;
            l2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f8478p) {
            return;
        }
        canvas.save();
        float a10 = this.I.a(0.0125f);
        RectF rectF = this.f8476n;
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float a11 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ac acVar = this.G;
        acVar.g(rectF2);
        acVar.d();
        acVar.a(canvas, org.telegram.ui.ActionBar.j6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f8466b;
        if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).W();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f57091f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: di.e6.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.gj r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: di.e6.f(org.telegram.messenger.gj, boolean):void");
    }

    public final void g(gj gjVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f10;
        int i7;
        float f11;
        int L;
        TLObject e22;
        int i10;
        float f12 = this.O;
        boolean P3 = gjVar.P3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f8465a;
        if (z10 == P3) {
            B0 = m10.i(i11).e();
        } else {
            B0 = gj.B0(gjVar.f23819k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.m5.o(peer);
        }
        String t6 = org.telegram.messenger.m5.t(B0);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i12 = 0;
        if (this.f8478p) {
            this.f8480r = new oy0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !q10.A(gj.B0(gjVar.f23819k))) {
            if (gj.B0(gjVar.f23819k) == m10.i(i11).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f8480r = new oy0(hd.M0(2131750461, null), 14.0f, org.telegram.messenger.g0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f8480r = new oy0(hd.M0(2131750448, null), 14.0f, org.telegram.messenger.g0.o());
                } else {
                    this.f8480r = new oy0(hd.M0(2131750426, null), 14.0f, org.telegram.messenger.g0.o());
                }
            } else {
                this.f8480r = new oy0(hd.a0(null, null, 2131749892, t6), 14.0f, org.telegram.messenger.g0.o());
            }
        } else {
            this.f8480r = new oy0(hd.M0(2131749891, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f8479q = (this.f8480r.i() / 2.0f) + L2;
        float i13 = this.f8480r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.f8478p) {
            f10 = 2.0f;
            this.f8482t = new oy0(hd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i11;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i11;
            this.f8482t = new oy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f8481s = (this.f8482t.i() / f10) + i13;
        float i14 = this.f8482t.i() + i13;
        if (this.f8478p) {
            f11 = 14.0f;
        } else {
            f11 = 11.0f;
        }
        float L3 = i14 + org.telegram.messenger.g0.L(f11);
        ArrayList arrayList = this.f8484w;
        arrayList.clear();
        this.f8483u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        bi.g1 g1Var = this.f8486y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = g1Var.f3530c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable B5 = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                e22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                e22 = np.s1(i7).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                e22 = np.s1(i7).e2(gjVar.Z0());
            }
            this.f8487z = true;
            g1Var.c(e22);
            g1Var.f3538m = B5;
            g1Var.f3544s = -1;
            g1Var.b(((int) f12) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = g1Var.f3539n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = g1Var.f3539n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(gjVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.g0.L(4.0f);
            this.f8485x = L4;
            L3 = L4 + g1Var.f3546u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.f8487z = false;
            g1Var.c(null);
            g1Var.f3538m = null;
            g1Var.f3544s = -1;
            if (this.f8475m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var = new d6(L3, hd.M0(2131750387, null), this.f8475m.name);
                arrayList.add(d6Var);
                float f13 = f12 * 0.5f;
                oy0 oy0Var = d6Var.f8398b;
                oy0Var.f38114p = f13;
                this.f8483u = Math.max(this.f8483u, oy0Var.f38103c);
                oy0 oy0Var2 = d6Var.f8399c;
                oy0Var2.f38114p = f13;
                this.v = Math.max(this.v, oy0Var2.f38103c);
                L3 += d6Var.a();
            }
            if (this.f8473k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var2 = new d6(L3, hd.M0(2131750388, null), this.f8473k.name);
                arrayList.add(d6Var2);
                float f14 = f12 * 0.5f;
                oy0 oy0Var3 = d6Var2.f8398b;
                oy0Var3.f38114p = f14;
                this.f8483u = Math.max(this.f8483u, oy0Var3.f38103c);
                oy0 oy0Var4 = d6Var2.f8399c;
                oy0Var4.f38114p = f14;
                this.v = Math.max(this.v, oy0Var4.f38103c);
                L3 = d6Var2.a() + L3;
            }
            if (this.f8474l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                d6 d6Var3 = new d6(L3, hd.M0(2131750380, null), this.f8474l.name);
                arrayList.add(d6Var3);
                float f15 = f12 * 0.5f;
                oy0 oy0Var5 = d6Var3.f8398b;
                oy0Var5.f38114p = f15;
                this.f8483u = Math.max(this.f8483u, oy0Var5.f38103c);
                oy0 oy0Var6 = d6Var3.f8399c;
                oy0Var6.f38114p = f15;
                this.v = Math.max(this.v, oy0Var6.f38103c);
                L3 += d6Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.g0.L(11.66f);
        if (!this.f8478p) {
            this.A = L5;
            this.C = new oy0(hd.M0(2131749888, null), 14.0f, org.telegram.messenger.g0.o());
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
        oy0 oy0Var = new oy0(hd.a0(null, null, 2131749892, org.telegram.messenger.m5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.f8480r = oy0Var;
        this.f8479q = (oy0Var.i() / 2.0f) + L;
        float i11 = this.f8480r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        oy0 oy0Var2 = new oy0(i5.c.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f8482t = oy0Var2;
        this.f8481s = (oy0Var2.i() / 2.0f) + i11;
        float i12 = this.f8482t.i() + i11 + org.telegram.messenger.g0.L(11.0f);
        this.f8484w.clear();
        this.f8483u = 0.0f;
        this.v = 0.0f;
        bi.g1 g1Var = this.f8486y;
        TextPaint textPaint = g1Var.f3530c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749748, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j3 != 0) {
            tLObject = np.s1(this.f8465a).e2(j3);
        }
        this.f8487z = true;
        g1Var.c(tLObject);
        g1Var.f3538m = spanned;
        g1Var.f3544s = -1;
        g1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = g1Var.f3539n;
            if (staticLayout != null) {
                i7 = staticLayout.getLineCount();
            } else {
                i7 = 0;
            }
            if (i7 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = g1Var.f3539n;
                if (staticLayout2 != null) {
                    i10 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i10 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i12 + org.telegram.messenger.g0.L(4.0f);
        this.f8485x = L2;
        float L3 = L2 + g1Var.f3546u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new oy0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
