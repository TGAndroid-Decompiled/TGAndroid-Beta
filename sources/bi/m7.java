package bi;

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
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wq;
public final class m7 {
    public float A;
    public float B;
    public my0 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final ud G;
    public final org.telegram.ui.Components.hc H;
    public final org.telegram.ui.Components.hc I;
    public final org.telegram.ui.Components.hc J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public ij R;
    public boolean S;
    public final te.c T;
    public z3 U;
    public z3 V;
    public final int f4331a;
    public final View f4332b;
    public final org.telegram.ui.ActionBar.h6 f4333c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.f5 f4334e;
    public int f4336g;
    public RadialGradient h;
    public final zh.b1 f4338j;
    public TL_stars.starGiftAttributeBackdrop f4339k;
    public TL_stars.starGiftAttributePattern f4340l;
    public TL_stars.starGiftAttributeModel f4341m;
    public boolean f4344p;
    public float f4345q;
    public my0 f4346r;
    public float f4347s;
    public my0 f4348t;
    public float f4349u;
    public float v;
    public float f4351x;
    public final zh.i0 f4352y;
    public boolean f4353z;
    public final Paint f4335f = new Paint(1);
    public final Matrix f4337i = new Matrix();
    public final RectF f4342n = new RectF();
    public final Path f4343o = new Path();
    public final ArrayList f4350w = new ArrayList();

    public m7(int i7, View view, org.telegram.ui.ActionBar.h6 h6Var) {
        zh.i0 i0Var = new zh.i0();
        this.f4352y = i0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new ud(1, 25);
        this.K = new RectF();
        this.T = new te.c(0, new a1.c(this, 14), wq.h, 320L);
        this.f4331a = i7;
        this.f4332b = view;
        this.f4333c = h6Var;
        this.f4338j = new zh.b1(view);
        this.H = new org.telegram.ui.Components.hc(view);
        this.I = new org.telegram.ui.Components.hc(view);
        this.J = new org.telegram.ui.Components.hc(view);
        this.d = new ImageReceiver(view);
        this.f4334e = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(28.0f), view);
        i0Var.f60396r = view;
        i0Var.d.H0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.P();
            this.f4334e.a();
            this.f4352y.d.P();
        }
    }

    public final void b(Canvas canvas) {
        boolean z9 = this.L;
        zh.b1 b1Var = this.f4338j;
        if (z9 && b1Var != null) {
            int i7 = this.M;
            int i10 = org.telegram.ui.ActionBar.t6.f28531b;
            if (i7 != i10) {
                this.M = i10;
                try {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28131q7, this.f4333c);
                    Paint paint = (Paint) b1Var.f220b;
                    paint.setShader(null);
                    paint.setColor(w02);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        te.c cVar = this.T;
        float f10 = cVar.f55504f;
        float f11 = f10 / 2.0f;
        RectF rectF = this.f4342n;
        rectF.set(0.0f, 0.0f, f10, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f4339k != null && (this.h == null || this.f4336g != height)) {
            this.f4336g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f4339k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint2 = this.f4335f;
        if (radialGradient != null) {
            Matrix matrix = this.f4337i;
            matrix.reset();
            matrix.postTranslate(f11, f11);
            this.h.setLocalMatrix(matrix);
            paint2.setShader(this.h);
        }
        Path path = this.f4343o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f4339k;
        org.telegram.ui.Components.f5 f5Var = this.f4334e;
        if (stargiftattributebackdrop2 != null) {
            f5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        i1.a(canvas, 1, f5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(f11 - (org.telegram.messenger.g0.L(110.0f) / 2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f));
        imageReceiver.h(canvas, null);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f4339k;
        if (stargiftattributebackdrop3 != null) {
            r12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i11 = r12;
        this.f4346r.f36144p = cVar.f55504f - org.telegram.messenger.g0.L(12.0f);
        my0 my0Var = this.f4346r;
        my0Var.c(f11 - (my0Var.f36133c / 2.0f), this.f4345q, 1.0f, -1, canvas);
        this.f4348t.f36144p = cVar.f55504f - org.telegram.messenger.g0.L(12.0f);
        my0 my0Var2 = this.f4348t;
        Canvas canvas2 = canvas;
        int i12 = i11;
        my0Var2.c(f11 - (my0Var2.f36133c / 2.0f), this.f4347s, 1.0f, i12, canvas2);
        if (this.f4353z) {
            zh.i0 i0Var = this.f4352y;
            int i13 = i0Var.f60398t;
            int i14 = i0Var.f60399u;
            int i15 = (int) (f11 - (i13 / 2.0f));
            int i16 = (int) this.f4351x;
            int i17 = i13 + i15;
            i0Var.setBounds(i15, i16, i17, i16 + i14);
            float f12 = this.f4351x;
            RectF rectF2 = this.K;
            rectF2.set(i15, f12, i17, i14 + f12);
            float a11 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            i0Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f13 = 9.0f;
            float L = this.f4349u + org.telegram.messenger.g0.L(9.0f) + this.v;
            ArrayList arrayList = this.f4350w;
            int size = arrayList.size();
            int i18 = 0;
            while (i18 < size) {
                int i19 = i18 + 1;
                l7 l7Var = (l7) arrayList.get(i18);
                my0 my0Var3 = l7Var.f4270b;
                float f14 = f11 - (L / 2.0f);
                float f15 = f13;
                my0Var3.c((f14 + this.f4349u) - my0Var3.f36133c, l7Var.f4269a, 1.0f, i12, canvas2);
                canvas2 = canvas;
                l7Var.f4271c.c(f14 + this.f4349u + org.telegram.messenger.g0.L(f15), l7Var.f4269a, 1.0f, -1, canvas2);
                i12 = i12;
                i18 = i19;
                f13 = f15;
            }
        }
        int i20 = i12;
        if (!this.f4344p) {
            float f16 = this.A;
            float a12 = org.telegram.messenger.k5.a(this.C.f36133c, org.telegram.messenger.g0.L(30.0f), 2.0f, f11);
            float f17 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f11 - ((this.C.f36133c + org.telegram.messenger.g0.L(30.0f)) / 2.0f), f16, a12, f17);
            Path path2 = this.E;
            path2.rewind();
            float f18 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f18, f18, Path.Direction.CW);
            int r13 = org.telegram.ui.ActionBar.m6.r1(0.13f, -16777216);
            Paint paint3 = this.F;
            paint3.setColor(r13);
            float a13 = this.H.a(0.075f);
            canvas2.scale(a13, a13, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint3);
            canvas2.restore();
            b1Var.setBounds(((int) rectF.right) - org.telegram.messenger.g0.L(46.67f), ((int) rectF.top) - org.telegram.messenger.g0.L(1.33f), org.telegram.messenger.g0.L(1.33f) + ((int) rectF.right), org.telegram.messenger.g0.L(46.67f) + ((int) rectF.top));
            b1Var.f60226y = i20;
            b1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f4344p) {
            return;
        }
        canvas.save();
        float a10 = this.I.a(0.0125f);
        RectF rectF = this.f4342n;
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        float a11 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        ud udVar = this.G;
        udVar.g(rectF2);
        udVar.d();
        udVar.a(canvas, org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
        this.C.c(rectF2.left + org.telegram.messenger.g0.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f4332b;
        if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).T();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f55504f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m7.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(org.telegram.messenger.ij r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m7.f(org.telegram.messenger.ij, boolean):void");
    }

    public final void g(ij ijVar, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        float f10;
        int i7;
        float f11;
        int L;
        TLObject e22;
        int i10;
        float f12 = this.O;
        boolean P3 = ijVar.P3();
        boolean z9 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f4331a;
        if (z9 == P3) {
            B0 = p10.i(i11).e();
        } else {
            B0 = ij.B0(ijVar.f23266k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = org.telegram.messenger.m5.o(peer);
        }
        String t6 = org.telegram.messenger.m5.t(B0);
        float L2 = org.telegram.messenger.g0.L(10.0f) + 0.0f + org.telegram.messenger.g0.L(110.0f) + org.telegram.messenger.g0.L(9.33f);
        int i12 = 0;
        if (this.f4344p) {
            this.f4346r = new my0(tL_starGiftUnique.title, 14.0f, org.telegram.messenger.g0.o());
        } else if (tL_messageActionStarGiftUnique.peer == null && !t10.A(ij.B0(ijVar.f23266k))) {
            if (ij.B0(ijVar.f23266k) == p10.i(i11).e()) {
                if (tL_starGiftUnique.crafted) {
                    this.f4346r = new my0(org.telegram.messenger.id.M0(2131750461, null), 14.0f, org.telegram.messenger.g0.o());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f4346r = new my0(org.telegram.messenger.id.M0(2131750448, null), 14.0f, org.telegram.messenger.g0.o());
                } else {
                    this.f4346r = new my0(org.telegram.messenger.id.M0(2131750426, null), 14.0f, org.telegram.messenger.g0.o());
                }
            } else {
                this.f4346r = new my0(org.telegram.messenger.id.a0(null, null, 2131749892, t6), 14.0f, org.telegram.messenger.g0.o());
            }
        } else {
            this.f4346r = new my0(org.telegram.messenger.id.M0(2131749891, null), 14.0f, org.telegram.messenger.g0.o());
        }
        this.f4345q = (this.f4346r.i() / 2.0f) + L2;
        float i13 = this.f4346r.i() + L2 + org.telegram.messenger.g0.L(3.0f);
        if (this.f4344p) {
            f10 = 2.0f;
            this.f4348t = new my0(org.telegram.messenger.id.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, org.telegram.messenger.g0.o());
            i7 = i11;
        } else {
            f10 = 2.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            i7 = i11;
            this.f4348t = new my0(jg.g.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f4347s = (this.f4348t.i() / f10) + i13;
        float i14 = this.f4348t.i() + i13;
        if (this.f4344p) {
            f11 = 14.0f;
        } else {
            f11 = 11.0f;
        }
        float L3 = i14 + org.telegram.messenger.g0.L(f11);
        ArrayList arrayList = this.f4350w;
        arrayList.clear();
        this.f4349u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        zh.i0 i0Var = this.f4352y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = i0Var.f60383c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            ij.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable B5 = ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                e22 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                e22 = qp.s1(i7).e2(org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.from_id));
            } else {
                e22 = qp.s1(i7).e2(ijVar.Z0());
            }
            this.f4353z = true;
            i0Var.c(e22);
            i0Var.f60391m = B5;
            i0Var.f60397s = -1;
            i0Var.b(((int) f12) - org.telegram.messenger.g0.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = i0Var.f60392n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = i0Var.f60392n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.O);
                    g(ijVar, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + org.telegram.messenger.g0.L(4.0f);
            this.f4351x = L4;
            L3 = L4 + i0Var.f60399u + org.telegram.messenger.g0.L(3.0f);
        } else {
            this.f4353z = false;
            i0Var.c(null);
            i0Var.f60391m = null;
            i0Var.f60397s = -1;
            if (this.f4341m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var = new l7(L3, org.telegram.messenger.id.M0(2131750387, null), this.f4341m.name);
                arrayList.add(l7Var);
                float f13 = f12 * 0.5f;
                my0 my0Var = l7Var.f4270b;
                my0Var.f36144p = f13;
                this.f4349u = Math.max(this.f4349u, my0Var.f36133c);
                my0 my0Var2 = l7Var.f4271c;
                my0Var2.f36144p = f13;
                this.v = Math.max(this.v, my0Var2.f36133c);
                L3 += l7Var.a();
            }
            if (this.f4339k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var2 = new l7(L3, org.telegram.messenger.id.M0(2131750388, null), this.f4339k.name);
                arrayList.add(l7Var2);
                float f14 = f12 * 0.5f;
                my0 my0Var3 = l7Var2.f4270b;
                my0Var3.f36144p = f14;
                this.f4349u = Math.max(this.f4349u, my0Var3.f36133c);
                my0 my0Var4 = l7Var2.f4271c;
                my0Var4.f36144p = f14;
                this.v = Math.max(this.v, my0Var4.f36133c);
                L3 = l7Var2.a() + L3;
            }
            if (this.f4340l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += org.telegram.messenger.g0.L(6.0f);
                }
                l7 l7Var3 = new l7(L3, org.telegram.messenger.id.M0(2131750380, null), this.f4340l.name);
                arrayList.add(l7Var3);
                float f15 = f12 * 0.5f;
                my0 my0Var5 = l7Var3.f4270b;
                my0Var5.f36144p = f15;
                this.f4349u = Math.max(this.f4349u, my0Var5.f36133c);
                my0 my0Var6 = l7Var3.f4271c;
                my0Var6.f36144p = f15;
                this.v = Math.max(this.v, my0Var6.f36133c);
                L3 += l7Var3.a();
            }
        }
        float L5 = L3 + org.telegram.messenger.g0.L(11.66f);
        if (!this.f4344p) {
            this.A = L5;
            this.C = new my0(org.telegram.messenger.id.M0(2131749888, null), 14.0f, org.telegram.messenger.g0.o());
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
        my0 my0Var = new my0(org.telegram.messenger.id.a0(null, null, 2131749892, org.telegram.messenger.m5.t(j3)), 14.0f, org.telegram.messenger.g0.o());
        this.f4346r = my0Var;
        this.f4345q = (my0Var.i() / 2.0f) + L;
        float i11 = this.f4346r.i() + L + org.telegram.messenger.g0.L(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        my0 my0Var2 = new my0(jg.g.m(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        this.f4348t = my0Var2;
        this.f4347s = (my0Var2.i() / 2.0f) + i11;
        float i12 = this.f4348t.i() + i11 + org.telegram.messenger.g0.L(11.0f);
        this.f4350w.clear();
        this.f4349u = 0.0f;
        this.v = 0.0f;
        zh.i0 i0Var = this.f4352y;
        TextPaint textPaint = i0Var.f60383c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            ij.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749748, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j3 != 0) {
            tLObject = qp.s1(this.f4331a).e2(j3);
        }
        this.f4353z = true;
        i0Var.c(tLObject);
        i0Var.f60391m = spanned;
        i0Var.f60397s = -1;
        i0Var.b(((int) f10) - org.telegram.messenger.g0.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = i0Var.f60392n;
            if (staticLayout != null) {
                i7 = staticLayout.getLineCount();
            } else {
                i7 = 0;
            }
            if (i7 > 3) {
                this.N = true;
                StaticLayout staticLayout2 = i0Var.f60392n;
                if (staticLayout2 != null) {
                    i10 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i10 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = i12 + org.telegram.messenger.g0.L(4.0f);
        this.f4351x = L2;
        float L3 = L2 + i0Var.f60399u + org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(11.66f);
        this.A = L3;
        this.C = new my0(str, 14.0f, org.telegram.messenger.g0.o());
        float L4 = org.telegram.messenger.g0.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + org.telegram.messenger.g0.L(11.0f));
    }
}
