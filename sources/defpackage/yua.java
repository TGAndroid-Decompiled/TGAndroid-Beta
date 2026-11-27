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
public final class yua {
    public float A;
    public float B;
    public pkb C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final yza G;
    public final v41 H;
    public final v41 I;
    public final v41 J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public r47 R;
    public boolean S;
    public final t84 T;
    public aw4 U;
    public aw4 V;
    public final int a;
    public final View b;
    public final vnb c;
    public final ImageReceiver d;
    public final ul e;
    public int g;
    public RadialGradient h;
    public final vx4 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public pkb r;
    public float s;
    public pkb t;
    public float u;
    public float v;
    public float x;
    public final iw4 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public yua(int i, vnb vnbVar, View view) {
        iw4 iw4Var = new iw4();
        this.y = iw4Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new yza(1, 25);
        this.K = new RectF();
        this.T = new t84(0, new hja(this, (byte) 5), k43.h, 320L);
        this.a = i;
        this.b = view;
        this.c = vnbVar;
        this.j = new vx4(view, 1.0f);
        this.H = new v41(view);
        this.I = new v41(view);
        this.J = new v41(view);
        this.d = new ImageReceiver(view);
        this.e = new ul(hl.L(28.0f), view);
        iw4Var.r = view;
        iw4Var.d.p0(view);
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
        vx4 vx4Var = this.j;
        if (z && vx4Var != null) {
            int i = this.M;
            int i2 = yob.b;
            if (i != i2) {
                this.M = i2;
                try {
                    vx4Var.f(aob.v0(aob.q7, this.c));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        t84 t84Var = this.T;
        float f = t84Var.f;
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
        path.addRoundRect(rectF, hl.L(14.0f), hl.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a = this.I.a(0.0125f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, hl.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        ul ulVar = this.e;
        if (stargiftattributebackdrop2 != null) {
            ulVar.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        xqa.a(canvas, 1, ulVar, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(f2 - (hl.L(110.0f) / 2.0f), hl.L(10.0f), hl.L(110.0f), hl.L(110.0f));
        imageReceiver.h(canvas, null);
        int p1 = aob.p1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            p1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i3 = p1;
        this.r.p = t84Var.f - hl.L(12.0f);
        pkb pkbVar = this.r;
        pkbVar.c(f2 - (pkbVar.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = t84Var.f - hl.L(12.0f);
        pkb pkbVar2 = this.t;
        Canvas canvas2 = canvas;
        int i4 = i3;
        pkbVar2.c(f2 - (pkbVar2.c / 2.0f), this.s, 1.0f, i4, canvas2);
        if (this.z) {
            iw4 iw4Var = this.y;
            int i5 = iw4Var.t;
            int i6 = iw4Var.u;
            int i7 = (int) (f2 - (i5 / 2.0f));
            int i8 = (int) this.x;
            int i9 = i5 + i7;
            iw4Var.setBounds(i7, i8, i9, i8 + i6);
            float f3 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i7, f3, i9, i6 + f3);
            float a2 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            iw4Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f4 = 9.0f;
            float L = this.u + hl.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                xua xuaVar = (xua) arrayList.get(i10);
                pkb pkbVar3 = xuaVar.b;
                float f5 = f2 - (L / 2.0f);
                float f6 = f4;
                pkbVar3.c((f5 + this.u) - pkbVar3.c, xuaVar.a, 1.0f, i4, canvas2);
                canvas2 = canvas;
                xuaVar.c.c(f5 + this.u + hl.L(f6), xuaVar.a, 1.0f, -1, canvas2);
                i4 = i4;
                i10 = i11;
                f4 = f6;
            }
        }
        int i12 = i4;
        if (!this.p) {
            float f7 = this.A;
            float e2 = qd4.e(this.C.c, hl.L(30.0f), 2.0f, f2);
            float f8 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f2 - ((this.C.c + hl.L(30.0f)) / 2.0f), f7, e2, f8);
            Path path2 = this.E;
            path2.rewind();
            float f9 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
            int p12 = aob.p1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(p12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            vx4Var.setBounds(((int) rectF.right) - hl.L(46.67f), ((int) rectF.top) - hl.L(1.33f), hl.L(1.33f) + ((int) rectF.right), hl.L(46.67f) + ((int) rectF.top));
            vx4Var.y = i12;
            vx4Var.draw(canvas2);
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
        yza yzaVar = this.G;
        yzaVar.g(rectF2);
        yzaVar.d();
        yzaVar.a(canvas, aob.p1(0.7f, -1));
        this.C.c(rectF2.left + hl.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof dl1) {
            ((dl1) view).V();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yua.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(defpackage.r47 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yua.f(r47, boolean):void");
    }

    public final void g(r47 r47Var, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        pkb pkbVar;
        float f;
        pkb pkbVar2;
        int i;
        float f2;
        int L;
        TLObject b2;
        int i2;
        float f3 = this.O;
        boolean O3 = r47Var.O3();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i3 = this.a;
        if (z == O3) {
            B0 = yac.h(i3).e();
        } else {
            B0 = r47.B0(r47Var.k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = wf3.n(peer);
        }
        String s = wf3.s(B0);
        float L2 = hl.L(10.0f) + 0.0f + hl.L(110.0f) + hl.L(9.33f);
        int i4 = 0;
        if (this.p) {
            pkbVar = new pkb(tL_starGiftUnique.title, 14.0f, hl.o());
            this.r = pkbVar;
        } else if (tL_messageActionStarGiftUnique.peer == null && !lbc.C(r47.B0(r47Var.k))) {
            if (r47.B0(r47Var.k) == yac.h(i3).e()) {
                if (tL_starGiftUnique.crafted) {
                    pkbVar = new pkb(ob6.M0(2131750422, null), 14.0f, hl.o());
                    this.r = pkbVar;
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    pkbVar = new pkb(ob6.M0(2131750409, null), 14.0f, hl.o());
                    this.r = pkbVar;
                } else {
                    pkbVar = new pkb(ob6.M0(2131750387, null), 14.0f, hl.o());
                    this.r = pkbVar;
                }
            } else {
                pkb pkbVar3 = new pkb(ob6.a0(null, null, 2131749838, s), 14.0f, hl.o());
                this.r = pkbVar3;
                pkbVar = pkbVar3;
            }
        } else {
            pkbVar = new pkb(ob6.M0(2131749837, null), 14.0f, hl.o());
            this.r = pkbVar;
        }
        this.q = (pkbVar.h() / 2.0f) + L2;
        float h = this.r.h() + L2 + hl.L(3.0f);
        if (this.p) {
            f = 2.0f;
            pkbVar2 = new pkb(ob6.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, hl.o());
            this.t = pkbVar2;
            i = i3;
        } else {
            f = 2.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            i = i3;
            pkbVar2 = new pkb(qu6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
            this.t = pkbVar2;
        }
        this.s = (pkbVar2.h() / f) + h;
        float h2 = this.t.h() + h;
        if (this.p) {
            f2 = 14.0f;
        } else {
            f2 = 11.0f;
        }
        float L3 = h2 + hl.L(f2);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        iw4 iw4Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = iw4Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            r47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = r47.A5(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                b2 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                b2 = uc7.s1(i).b2(wf3.n(tL_messageActionStarGiftUnique.from_id));
            } else {
                b2 = uc7.s1(i).b2(r47Var.Z0());
            }
            this.z = true;
            iw4Var.c(b2);
            iw4Var.m = A5;
            iw4Var.s = -1;
            iw4Var.b(((int) f3) - hl.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = iw4Var.n;
                if (staticLayout != null) {
                    i2 = staticLayout.getLineCount();
                } else {
                    i2 = 0;
                }
                if (i2 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = iw4Var.n;
                    if (staticLayout2 != null) {
                        i4 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i4 - 3) * 0.1f) + 1.0f) * this.O);
                    g(r47Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + hl.L(4.0f);
            this.x = L4;
            L3 = L4 + iw4Var.u + hl.L(3.0f);
        } else {
            this.z = false;
            iw4Var.c(null);
            iw4Var.m = null;
            iw4Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += hl.L(6.0f);
                }
                xua xuaVar = new xua(L3, ob6.M0(2131750348, null), this.m.name);
                arrayList.add(xuaVar);
                float f4 = f3 * 0.5f;
                pkb pkbVar4 = xuaVar.b;
                pkbVar4.p = f4;
                this.u = Math.max(this.u, pkbVar4.c);
                pkb pkbVar5 = xuaVar.c;
                pkbVar5.p = f4;
                this.v = Math.max(this.v, pkbVar5.c);
                L3 += xuaVar.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += hl.L(6.0f);
                }
                xua xuaVar2 = new xua(L3, ob6.M0(2131750349, null), this.k.name);
                arrayList.add(xuaVar2);
                float f5 = f3 * 0.5f;
                pkb pkbVar6 = xuaVar2.b;
                pkbVar6.p = f5;
                this.u = Math.max(this.u, pkbVar6.c);
                pkb pkbVar7 = xuaVar2.c;
                pkbVar7.p = f5;
                this.v = Math.max(this.v, pkbVar7.c);
                L3 = xuaVar2.a() + L3;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += hl.L(6.0f);
                }
                xua xuaVar3 = new xua(L3, ob6.M0(2131750341, null), this.l.name);
                arrayList.add(xuaVar3);
                float f6 = f3 * 0.5f;
                pkb pkbVar8 = xuaVar3.b;
                pkbVar8.p = f6;
                this.u = Math.max(this.u, pkbVar8.c);
                pkb pkbVar9 = xuaVar3.c;
                pkbVar9.p = f6;
                this.v = Math.max(this.v, pkbVar9.c);
                L3 += xuaVar3.a();
            }
        }
        float L5 = L3 + hl.L(11.66f);
        if (!this.p) {
            this.A = L5;
            this.C = new pkb(ob6.M0(2131749834, null), 14.0f, hl.o());
            float L6 = hl.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = hl.L(11.0f);
        } else {
            L = hl.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i;
        float f = this.O;
        float L = hl.L(10.0f) + 0.0f + hl.L(110.0f) + hl.L(9.33f);
        int i2 = 0;
        TLObject tLObject = null;
        pkb pkbVar = new pkb(ob6.a0(null, null, 2131749838, wf3.s(j)), 14.0f, hl.o());
        this.r = pkbVar;
        this.q = (pkbVar.h() / 2.0f) + L;
        float h = this.r.h() + L + hl.L(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        pkb pkbVar2 = new pkb(qu6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        this.t = pkbVar2;
        this.s = (pkbVar2.h() / 2.0f) + h;
        float h2 = this.t.h() + h + hl.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        iw4 iw4Var = this.y;
        TextPaint textPaint = iw4Var.c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            r47.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = r47.A5(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131749693, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j != 0) {
            tLObject = uc7.s1(this.a).b2(j);
        }
        this.z = true;
        iw4Var.c(tLObject);
        iw4Var.m = spanned;
        iw4Var.s = -1;
        iw4Var.b(((int) f) - hl.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = iw4Var.n;
            if (staticLayout != null) {
                i = staticLayout.getLineCount();
            } else {
                i = 0;
            }
            if (i > 3) {
                this.N = true;
                StaticLayout staticLayout2 = iw4Var.n;
                if (staticLayout2 != null) {
                    i2 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i2 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = h2 + hl.L(4.0f);
        this.x = L2;
        float L3 = L2 + iw4Var.u + hl.L(3.0f) + hl.L(11.66f);
        this.A = L3;
        this.C = new pkb(str, 14.0f, hl.o());
        float L4 = hl.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + hl.L(11.0f));
    }
}
