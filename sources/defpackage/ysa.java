package defpackage;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ysa {
    public float A;
    public float B;
    public uib C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final yxa G;
    public final u51 H;
    public final u51 I;
    public final u51 J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public k47 R;
    public boolean S;
    public final h94 T;
    public yv4 U;
    public yv4 V;
    public final int a;
    public final View b;
    public final ylb c;
    public final ImageReceiver d;
    public final tm e;
    public int g;
    public RadialGradient h;
    public final rx4 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public uib r;
    public float s;
    public uib t;
    public float u;
    public float v;
    public float x;
    public final gw4 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public ysa(int i, ylb ylbVar, View view) {
        gw4 gw4Var = new gw4();
        this.y = gw4Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new yxa(1, 25);
        this.K = new RectF();
        this.T = new h94(0, new yf9(this, (byte) 26), d53.h, 320L);
        this.a = i;
        this.b = view;
        this.c = ylbVar;
        this.j = new rx4(view, 1.0f);
        this.H = new u51(view);
        this.I = new u51(view);
        this.J = new u51(view);
        this.d = new ImageReceiver(view);
        this.e = new tm(gm.L(28.0f), view);
        gw4Var.r = view;
        gw4Var.d.p0(view);
    }

    public final void a() {
        this.S = true;
        if (this.Q != null) {
            this.d.I();
            this.e.a();
            this.y.d.I();
        }
    }

    public final void b(Canvas canvas) {
        boolean z = this.L;
        rx4 rx4Var = this.j;
        if (z && rx4Var != null) {
            int i = this.M;
            int i2 = anb.b;
            if (i != i2) {
                this.M = i2;
                try {
                    rx4Var.f(cmb.v0(cmb.p7, this.c));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        h94 h94Var = this.T;
        float f = h94Var.f;
        float f2 = f / 2.0f;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, this.P);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.k != null && (this.h == null || this.g != height)) {
            this.g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f;
        if (radialGradient != null) {
            Matrix matrix = this.i;
            matrix.reset();
            matrix.postTranslate(f2, f2);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.o;
        path.rewind();
        path.addRoundRect(rectF, gm.L(14.0f), gm.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a = this.I.a(0.0125f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, gm.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        tm tmVar = this.e;
        if (stargiftattributebackdrop2 != null) {
            tmVar.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        bpa.a(canvas, 1, tmVar, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(f2 - (gm.L(110.0f) / 2.0f), gm.L(10.0f), gm.L(110.0f), gm.L(110.0f));
        imageReceiver.h(canvas, null);
        int p1 = cmb.p1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            p1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i3 = p1;
        this.r.p = h94Var.f - gm.L(12.0f);
        uib uibVar = this.r;
        uibVar.c(f2 - (uibVar.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = h94Var.f - gm.L(12.0f);
        uib uibVar2 = this.t;
        Canvas canvas2 = canvas;
        int i4 = i3;
        uibVar2.c(f2 - (uibVar2.c / 2.0f), this.s, 1.0f, i4, canvas2);
        if (this.z) {
            gw4 gw4Var = this.y;
            int i5 = gw4Var.t;
            int i6 = gw4Var.u;
            int i7 = (int) (f2 - (i5 / 2.0f));
            int i8 = (int) this.x;
            int i9 = i5 + i7;
            gw4Var.setBounds(i7, i8, i9, i8 + i6);
            float f3 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i7, f3, i9, i6 + f3);
            float a2 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            gw4Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f4 = 9.0f;
            float L = this.u + gm.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                xsa xsaVar = (xsa) arrayList.get(i10);
                uib uibVar3 = xsaVar.b;
                float f5 = f2 - (L / 2.0f);
                float f6 = f4;
                uibVar3.c((f5 + this.u) - uibVar3.c, xsaVar.a, 1.0f, i4, canvas2);
                canvas2 = canvas;
                xsaVar.c.c(f5 + this.u + gm.L(f6), xsaVar.a, 1.0f, -1, canvas2);
                i4 = i4;
                i10 = i11;
                f4 = f6;
            }
        }
        int i12 = i4;
        if (!this.p) {
            float f7 = this.A;
            float e2 = td4.e(this.C.c, gm.L(30.0f), 2.0f, f2);
            float f8 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f2 - ((this.C.c + gm.L(30.0f)) / 2.0f), f7, e2, f8);
            Path path2 = this.E;
            path2.rewind();
            float f9 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
            int p12 = cmb.p1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(p12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            rx4Var.setBounds(((int) rectF.right) - gm.L(46.67f), ((int) rectF.top) - gm.L(1.33f), gm.L(1.33f) + ((int) rectF.right), gm.L(46.67f) + ((int) rectF.top));
            rx4Var.y = i12;
            rx4Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.p) {
            return;
        }
        canvas.save();
        float a = this.I.a(0.0125f);
        RectF rectF = this.n;
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        float a2 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        yxa yxaVar = this.G;
        yxaVar.g(rectF2);
        yxaVar.d();
        yxaVar.a(canvas, cmb.p1(0.7f, -1));
        this.C.c(rectF2.left + gm.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof cm1) {
            ((cm1) view).T();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysa.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(defpackage.k47 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysa.f(k47, boolean):void");
    }

    public final void g(k47 k47Var, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        uib uibVar;
        float f;
        uib uibVar2;
        int i;
        float f2;
        int L;
        TLObject a2;
        int i2;
        float f3 = this.O;
        boolean O3 = k47Var.O3();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i3 = this.a;
        if (z == O3) {
            B0 = z8c.h(i3).e();
        } else {
            B0 = k47.B0(k47Var.k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = pg3.n(peer);
        }
        String s = pg3.s(B0);
        float L2 = gm.L(10.0f) + 0.0f + gm.L(110.0f) + gm.L(9.33f);
        int i4 = 0;
        if (this.p) {
            uibVar = new uib(tL_starGiftUnique.title, 14.0f, gm.o());
            this.r = uibVar;
        } else if (tL_messageActionStarGiftUnique.peer == null && !m9c.C(k47.B0(k47Var.k))) {
            if (k47.B0(k47Var.k) == z8c.h(i3).e()) {
                if (tL_starGiftUnique.crafted) {
                    uibVar = new uib(jb6.M0(2131750394, null), 14.0f, gm.o());
                    this.r = uibVar;
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    uibVar = new uib(jb6.M0(2131750381, null), 14.0f, gm.o());
                    this.r = uibVar;
                } else {
                    uibVar = new uib(jb6.M0(2131750359, null), 14.0f, gm.o());
                    this.r = uibVar;
                }
            } else {
                uib uibVar3 = new uib(jb6.a0(null, null, 2131749825, s), 14.0f, gm.o());
                this.r = uibVar3;
                uibVar = uibVar3;
            }
        } else {
            uibVar = new uib(jb6.M0(2131749824, null), 14.0f, gm.o());
            this.r = uibVar;
        }
        this.q = (uibVar.h() / 2.0f) + L2;
        float h = this.r.h() + L2 + gm.L(3.0f);
        if (this.p) {
            f = 2.0f;
            uibVar2 = new uib(jb6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, gm.o());
            this.t = uibVar2;
            i = i3;
        } else {
            f = 2.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            i = i3;
            uibVar2 = new uib(kt6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
            this.t = uibVar2;
        }
        this.s = (uibVar2.h() / f) + h;
        float h2 = this.t.h() + h;
        if (this.p) {
            f2 = 14.0f;
        } else {
            f2 = 11.0f;
        }
        float L3 = h2 + gm.L(f2);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        gw4 gw4Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = gw4Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            k47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = k47.A5(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                a2 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                a2 = oc7.r1(i).a2(pg3.n(tL_messageActionStarGiftUnique.from_id));
            } else {
                a2 = oc7.r1(i).a2(k47Var.Z0());
            }
            this.z = true;
            gw4Var.c(a2);
            gw4Var.m = A5;
            gw4Var.s = -1;
            gw4Var.b(((int) f3) - gm.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = gw4Var.n;
                if (staticLayout != null) {
                    i2 = staticLayout.getLineCount();
                } else {
                    i2 = 0;
                }
                if (i2 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = gw4Var.n;
                    if (staticLayout2 != null) {
                        i4 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i4 - 3) * 0.1f) + 1.0f) * this.O);
                    g(k47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + gm.L(4.0f);
            this.x = L4;
            L3 = L4 + gw4Var.u + gm.L(3.0f);
        } else {
            this.z = false;
            gw4Var.c(null);
            gw4Var.m = null;
            gw4Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gm.L(6.0f);
                }
                xsa xsaVar = new xsa(L3, jb6.M0(2131750320, null), this.m.name);
                arrayList.add(xsaVar);
                float f4 = f3 * 0.5f;
                uib uibVar4 = xsaVar.b;
                uibVar4.p = f4;
                this.u = Math.max(this.u, uibVar4.c);
                uib uibVar5 = xsaVar.c;
                uibVar5.p = f4;
                this.v = Math.max(this.v, uibVar5.c);
                L3 += xsaVar.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gm.L(6.0f);
                }
                xsa xsaVar2 = new xsa(L3, jb6.M0(2131750321, null), this.k.name);
                arrayList.add(xsaVar2);
                float f5 = f3 * 0.5f;
                uib uibVar6 = xsaVar2.b;
                uibVar6.p = f5;
                this.u = Math.max(this.u, uibVar6.c);
                uib uibVar7 = xsaVar2.c;
                uibVar7.p = f5;
                this.v = Math.max(this.v, uibVar7.c);
                L3 = xsaVar2.a() + L3;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gm.L(6.0f);
                }
                xsa xsaVar3 = new xsa(L3, jb6.M0(2131750313, null), this.l.name);
                arrayList.add(xsaVar3);
                float f6 = f3 * 0.5f;
                uib uibVar8 = xsaVar3.b;
                uibVar8.p = f6;
                this.u = Math.max(this.u, uibVar8.c);
                uib uibVar9 = xsaVar3.c;
                uibVar9.p = f6;
                this.v = Math.max(this.v, uibVar9.c);
                L3 += xsaVar3.a();
            }
        }
        float L5 = L3 + gm.L(11.66f);
        if (!this.p) {
            this.A = L5;
            this.C = new uib(jb6.M0(2131749821, null), 14.0f, gm.o());
            float L6 = gm.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = gm.L(11.0f);
        } else {
            L = gm.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i;
        float f = this.O;
        float L = gm.L(10.0f) + 0.0f + gm.L(110.0f) + gm.L(9.33f);
        int i2 = 0;
        TLObject tLObject = null;
        uib uibVar = new uib(jb6.a0(null, null, 2131749825, pg3.s(j)), 14.0f, gm.o());
        this.r = uibVar;
        this.q = (uibVar.h() / 2.0f) + L;
        float h = this.r.h() + L + gm.L(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        uib uibVar2 = new uib(kt6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        this.t = uibVar2;
        this.s = (uibVar2.h() / 2.0f) + h;
        float h2 = this.t.h() + h + gm.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        gw4 gw4Var = this.y;
        TextPaint textPaint = gw4Var.c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            k47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = k47.A5(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131749680, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j != 0) {
            tLObject = oc7.r1(this.a).a2(j);
        }
        this.z = true;
        gw4Var.c(tLObject);
        gw4Var.m = spanned;
        gw4Var.s = -1;
        gw4Var.b(((int) f) - gm.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = gw4Var.n;
            if (staticLayout != null) {
                i = staticLayout.getLineCount();
            } else {
                i = 0;
            }
            if (i > 3) {
                this.N = true;
                StaticLayout staticLayout2 = gw4Var.n;
                if (staticLayout2 != null) {
                    i2 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i2 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = h2 + gm.L(4.0f);
        this.x = L2;
        float L3 = L2 + gw4Var.u + gm.L(3.0f) + gm.L(11.66f);
        this.A = L3;
        this.C = new uib(str, 14.0f, gm.o());
        float L4 = gm.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + gm.L(11.0f));
    }
}
