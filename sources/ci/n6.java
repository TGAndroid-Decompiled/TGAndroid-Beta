package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
public final class n6 {
    public float A;
    public float B;
    public ly0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final lc G;
    public final org.telegram.ui.Components.gc H;
    public final org.telegram.ui.Components.gc I;
    public final org.telegram.ui.Components.gc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public zi R;
    public boolean S;
    public final qe.c T;
    public ai.a1 U;
    public ai.a1 V;
    public final int f5609a;
    public final View f5610b;
    public final org.telegram.ui.ActionBar.e6 f5611c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.e5 f5612e;
    public int f5614g;
    public RadialGradient h;
    public final ai.t2 f5616j;
    public TL_stars.starGiftAttributeBackdrop f5617k;
    public TL_stars.starGiftAttributePattern f5618l;
    public TL_stars.starGiftAttributeModel f5619m;
    public boolean f5622p;
    public float f5623q;
    public ly0 f5624r;
    public float f5625s;
    public ly0 f5626t;
    public float f5627u;
    public float v;
    public float f5629x;
    public final ai.j1 f5630y;
    public boolean f5631z;
    public final Paint f5613f = new Paint(1);
    public final Matrix f5615i = new Matrix();
    public final RectF f5620n = new RectF();
    public final Path f5621o = new Path();
    public final ArrayList f5628w = new ArrayList();

    public n6(int i3, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        ai.j1 j1Var = new ai.j1();
        this.f5630y = j1Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new lc(1, 25);
        this.K = new RectF();
        this.T = new qe.c(0, new a1.c(this, 15), xq.h, 320L);
        this.f5609a = i3;
        this.f5610b = view;
        this.f5611c = e6Var;
        this.f5616j = new ai.t2(view);
        this.H = new org.telegram.ui.Components.gc(view);
        this.I = new org.telegram.ui.Components.gc(view);
        this.J = new org.telegram.ui.Components.gc(view);
        this.d = new ImageReceiver(view);
        this.f5612e = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(28.0f), view);
        j1Var.f744r = view;
        j1Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.f5612e.a();
            this.f5630y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z10 = this.L;
        ai.t2 t2Var = this.f5616j;
        if (z10 && t2Var != null) {
            int i3 = this.M;
            int i10 = org.telegram.ui.ActionBar.r6.f28515b;
            if (i3 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, this.f5611c);
                    Paint paint = (Paint) t2Var.f40801b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        qe.c cVar = this.T;
        float f10 = cVar.f53846f;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f5620n;
        rectF.set(0.0f, 0.0f, f10, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f5617k != null && (this.h == null || this.f5614g != height)) {
            this.f5614g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f5617k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f5613f;
        if (radialGradient != null) {
            Matrix matrix = this.f5615i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f5621o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f5617k;
        org.telegram.ui.Components.e5 e5Var = this.f5612e;
        if (stargiftattributebackdrop2 != null) {
            e5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        b1.a(canvas, 1, e5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f));
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f5617k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.f5624r.f35929p = cVar.f53846f - org.telegram.messenger.g0.L(12.0f);
        ly0 ly0Var = this.f5624r;
        ly0Var.c(f11 - (ly0Var.f35918c / 2.0f), this.f5623q, 1.0f, -1, canvas);
        this.f5626t.f35929p = cVar.f53846f - org.telegram.messenger.g0.L(12.0f);
        ly0 ly0Var2 = this.f5626t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        ly0Var2.c(f11 - (ly0Var2.f35918c / 2.0f), this.f5625s, 1.0f, i12, canvas2);
        if (this.f5631z) {
            ai.j1 j1Var = this.f5630y;
            int i13 = j1Var.f746t;
            int i14 = j1Var.f747u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.f5629x;
            int i17 = i13 + i15;
            j1Var.setBounds(i15, i16, i17, i16 + i14);
            float f12 = this.f5629x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f12, i17, i14 + f12);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            j1Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float L = this.f5627u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.f5628w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                m6 m6Var = (m6) arrayList.get(i18);
                ly0 ly0Var3 = m6Var.f5543b;
                float f14 = f11 - (L / 2.0f);
                float f15 = f13;
                ly0Var3.c((f14 + this.f5627u) - ly0Var3.f35918c, m6Var.f5542a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                m6Var.f5544c.c(f14 + this.f5627u + org.telegram.messenger.g0.L(f15), m6Var.f5542a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f13 = f15;
            }
        }
        int i20 = i12;
        if (!this.f5622p) {
            float f16 = this.A;
            float a12 = org.telegram.messenger.k5.a(this.C.f35918c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f11 - ((this.C.f35918c + org.telegram.messenger.g0.L(30.0f)) / 2.0f), f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            t2Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            t2Var.f986y = i20;
            t2Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f5622p) {
            return;
        }
        canvas.save();
        float a10 = this.I.a(0.0125f);
        RectF rectF = this.f5620n;
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float a11 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        lc lcVar = this.G;
        lcVar.g(rectF2);
        lcVar.d();
        lcVar.a(canvas, org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f5610b;
        if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).T();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f53846f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: ci.n6.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.zi r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: ci.n6.f(org.telegram.messenger.zi, boolean):void");
    }

    public final void g(zi ziVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f10;
        int i3;
        float f11;
        int L;
        TLObject e22;
        int i10;
        float f12 = this.O;
        boolean Q3 = ziVar.Q3();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f5609a;
        if (z10 == Q3) {
            B0 = h10.i(i11).e();
        } else {
            B0 = zi.B0(ziVar.f26868k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.m5.o(peer);
        }
        String t10 = org.telegram.messenger.m5.t(B0);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i12 = 0;
        if (this.f5622p) {
            this.f5624r = new ly0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !l10.A(zi.B0(ziVar.f26868k))) {
            if (zi.B0(ziVar.f26868k) == h10.i(i11).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f5624r = new ly0(bd.M0(2131750469, null), 14.0f, org.telegram.messenger.g0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f5624r = new ly0(bd.M0(2131750456, null), 14.0f, org.telegram.messenger.g0.o());
                } else {
                    this.f5624r = new ly0(bd.M0(2131750434, null), 14.0f, org.telegram.messenger.g0.o());
                }
            } else {
                this.f5624r = new ly0(bd.a0(null, null, 2131749900, t10), 14.0f, org.telegram.messenger.g0.o());
            }
        } else {
            this.f5624r = new ly0(bd.M0(2131749899, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f5623q = (this.f5624r.i() / 2.0f) + L2;
        float i13 = this.f5624r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.f5622p) {
            f10 = 2.0f;
            this.f5626t = new ly0(bd.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i3 = i11;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i3 = i11;
            this.f5626t = new ly0(k2.p1.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f5625s = (this.f5626t.i() / f10) + i13;
        float i14 = this.f5626t.i() + i13;
        if (this.f5622p) {
            f11 = 14.0f;
        } else {
            f11 = 11.0f;
        }
        float L3 = i14 + org.telegram.messenger.g0.L(f11);
        ArrayList arrayList = this.f5628w;
        arrayList.clear();
        this.f5627u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        ai.j1 j1Var = this.f5630y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = j1Var.f731c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            zi.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable C5 = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                e22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                e22 = hp.s1(i3).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                e22 = hp.s1(i3).e2(ziVar.Z0());
            }
            this.f5631z = true;
            j1Var.c(e22);
            j1Var.f739m = C5;
            j1Var.f745s = -1;
            j1Var.b(((int) f12) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = j1Var.f740n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = j1Var.f740n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(ziVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.g0.L(4.0f);
            this.f5629x = L4;
            L3 = L4 + j1Var.f747u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.f5631z = false;
            j1Var.c(null);
            j1Var.f739m = null;
            j1Var.f745s = -1;
            if (this.f5619m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var = new m6(L3, bd.M0(2131750395, null), this.f5619m.name);
                arrayList.add(m6Var);
                float f13 = f12 * 0.5f;
                ly0 ly0Var = m6Var.f5543b;
                ly0Var.f35929p = f13;
                this.f5627u = Math.max(this.f5627u, ly0Var.f35918c);
                ly0 ly0Var2 = m6Var.f5544c;
                ly0Var2.f35929p = f13;
                this.v = Math.max(this.v, ly0Var2.f35918c);
                L3 += m6Var.a();
            }
            if (this.f5617k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var2 = new m6(L3, bd.M0(2131750396, null), this.f5617k.name);
                arrayList.add(m6Var2);
                float f14 = f12 * 0.5f;
                ly0 ly0Var3 = m6Var2.f5543b;
                ly0Var3.f35929p = f14;
                this.f5627u = Math.max(this.f5627u, ly0Var3.f35918c);
                ly0 ly0Var4 = m6Var2.f5544c;
                ly0Var4.f35929p = f14;
                this.v = Math.max(this.v, ly0Var4.f35918c);
                L3 = m6Var2.a() + L3;
            }
            if (this.f5618l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                m6 m6Var3 = new m6(L3, bd.M0(2131750388, null), this.f5618l.name);
                arrayList.add(m6Var3);
                float f15 = f12 * 0.5f;
                ly0 ly0Var5 = m6Var3.f5543b;
                ly0Var5.f35929p = f15;
                this.f5627u = Math.max(this.f5627u, ly0Var5.f35918c);
                ly0 ly0Var6 = m6Var3.f5544c;
                ly0Var6.f35929p = f15;
                this.v = Math.max(this.v, ly0Var6.f35918c);
                L3 += m6Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.g0.L(11.66f);
        if (!this.f5622p) {
            this.A = L5;
            this.C = new ly0(bd.M0(2131749896, null), 14.0f, org.telegram.messenger.g0.o());
            float L6 = org.telegram.messenger.g0.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = org.telegram.messenger.g0.L(11.0f);
        } else {
            L = org.telegram.messenger.g0.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i3;
        float f10 = this.O;
        float L = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i10 = 0;
        TLObject tLObject = null;
        ly0 ly0Var = new ly0(bd.a0(null, null, 2131749900, org.telegram.messenger.m5.t(j10)), 14.0f, org.telegram.messenger.g0.o());
        this.f5624r = ly0Var;
        this.f5623q = (ly0Var.i() / 2.0f) + L;
        float i11 = this.f5624r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        ly0 ly0Var2 = new ly0(k2.p1.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f5626t = ly0Var2;
        this.f5625s = (ly0Var2.i() / 2.0f) + i11;
        float i12 = this.f5626t.i() + i11 + org.telegram.messenger.g0.L(11.0f);
        this.f5628w.clear();
        this.f5627u = 0.0f;
        this.v = 0.0f;
        ai.j1 j1Var = this.f5630y;
        TextPaint textPaint = j1Var.f731c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            zi.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749756, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j10 != 0) {
            tLObject = hp.s1(this.f5609a).e2(j10);
        }
        this.f5631z = true;
        j1Var.c(tLObject);
        j1Var.f739m = spanned;
        j1Var.f745s = -1;
        j1Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = j1Var.f740n;
            if (staticLayout != null) {
                i3 = staticLayout.getLineCount();
            } else {
                i3 = 0;
            }
            if (i3 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = j1Var.f740n;
                if (staticLayout2 != null) {
                    i10 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i10 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i12 + org.telegram.messenger.g0.L(4.0f);
        this.f5629x = L2;
        float L3 = L2 + j1Var.f747u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new ly0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
