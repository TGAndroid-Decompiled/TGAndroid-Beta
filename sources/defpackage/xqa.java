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
public final class xqa {
    public float A;
    public float B;
    public tgb C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final vva G;
    public final n41 H;
    public final n41 I;
    public final n41 J;
    public final RectF K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public TLRPC.TL_messageActionStarGiftUnique Q;
    public k27 R;
    public boolean S;
    public final y74 T;
    public wt4 U;
    public wt4 V;
    public final int a;
    public final View b;
    public final wjb c;
    public final ImageReceiver d;
    public final tl e;
    public int g;
    public RadialGradient h;
    public final qv4 j;
    public TL_stars.starGiftAttributeBackdrop k;
    public TL_stars.starGiftAttributePattern l;
    public TL_stars.starGiftAttributeModel m;
    public boolean p;
    public float q;
    public tgb r;
    public float s;
    public tgb t;
    public float u;
    public float v;
    public float x;
    public final eu4 y;
    public boolean z;
    public final Paint f = new Paint(1);
    public final Matrix i = new Matrix();
    public final RectF n = new RectF();
    public final Path o = new Path();
    public final ArrayList w = new ArrayList();

    public xqa(int i, wjb wjbVar, View view) {
        eu4 eu4Var = new eu4();
        this.y = eu4Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new vva(1, 25);
        this.K = new RectF();
        this.T = new y74(0, new wh9(this, (byte) 22), s33.h, 320L);
        this.a = i;
        this.b = view;
        this.c = wjbVar;
        this.j = new qv4(view, 1.0f);
        this.H = new n41(view);
        this.I = new n41(view);
        this.J = new n41(view);
        this.d = new ImageReceiver(view);
        this.e = new tl(gl.L(28.0f), view);
        eu4Var.r = view;
        eu4Var.d.p0(view);
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
        qv4 qv4Var = this.j;
        if (z && qv4Var != null) {
            int i = this.M;
            int i2 = zkb.b;
            if (i != i2) {
                this.M = i2;
                try {
                    qv4Var.f(bkb.v0(bkb.p7, this.c));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        y74 y74Var = this.T;
        float f = y74Var.f;
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
        path.addRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), Path.Direction.CW);
        canvas.save();
        float a = this.I.a(0.0125f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, gl.L(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.k;
        tl tlVar = this.e;
        if (stargiftattributebackdrop2 != null) {
            tlVar.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        ana.a(canvas, 1, tlVar, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(f2 - (gl.L(110.0f) / 2.0f), gl.L(10.0f), gl.L(110.0f), gl.L(110.0f));
        imageReceiver.h(canvas, null);
        int p1 = bkb.p1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.k;
        if (stargiftattributebackdrop3 != null) {
            p1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i3 = p1;
        this.r.p = y74Var.f - gl.L(12.0f);
        tgb tgbVar = this.r;
        tgbVar.c(f2 - (tgbVar.c / 2.0f), this.q, 1.0f, -1, canvas);
        this.t.p = y74Var.f - gl.L(12.0f);
        tgb tgbVar2 = this.t;
        Canvas canvas2 = canvas;
        int i4 = i3;
        tgbVar2.c(f2 - (tgbVar2.c / 2.0f), this.s, 1.0f, i4, canvas2);
        if (this.z) {
            eu4 eu4Var = this.y;
            int i5 = eu4Var.t;
            int i6 = eu4Var.u;
            int i7 = (int) (f2 - (i5 / 2.0f));
            int i8 = (int) this.x;
            int i9 = i5 + i7;
            eu4Var.setBounds(i7, i8, i9, i8 + i6);
            float f3 = this.x;
            RectF rectF2 = this.K;
            rectF2.set(i7, f3, i9, i6 + f3);
            float a2 = this.J.a(0.04f);
            canvas2.save();
            canvas2.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            eu4Var.draw(canvas2);
            canvas2.restore();
        } else {
            float f4 = 9.0f;
            float L = this.u + gl.L(9.0f) + this.v;
            ArrayList arrayList = this.w;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                wqa wqaVar = (wqa) arrayList.get(i10);
                tgb tgbVar3 = wqaVar.b;
                float f5 = f2 - (L / 2.0f);
                float f6 = f4;
                tgbVar3.c((f5 + this.u) - tgbVar3.c, wqaVar.a, 1.0f, i4, canvas2);
                canvas2 = canvas;
                wqaVar.c.c(f5 + this.u + gl.L(f6), wqaVar.a, 1.0f, -1, canvas2);
                i4 = i4;
                i10 = i11;
                f4 = f6;
            }
        }
        int i12 = i4;
        if (!this.p) {
            float f7 = this.A;
            float e2 = tb4.e(this.C.c, gl.L(30.0f), 2.0f, f2);
            float f8 = this.A + this.B;
            RectF rectF3 = this.D;
            rectF3.set(f2 - ((this.C.c + gl.L(30.0f)) / 2.0f), f7, e2, f8);
            Path path2 = this.E;
            path2.rewind();
            float f9 = this.B / 2.0f;
            path2.addRoundRect(rectF3, f9, f9, Path.Direction.CW);
            int p12 = bkb.p1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(p12);
            float a3 = this.H.a(0.075f);
            canvas2.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            qv4Var.setBounds(((int) rectF.right) - gl.L(46.67f), ((int) rectF.top) - gl.L(1.33f), gl.L(1.33f) + ((int) rectF.right), gl.L(46.67f) + ((int) rectF.top));
            qv4Var.y = i12;
            qv4Var.draw(canvas2);
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
        vva vvaVar = this.G;
        vvaVar.g(rectF2);
        vvaVar.d();
        vvaVar.a(canvas, bkb.p1(0.7f, -1));
        this.C.c(rectF2.left + gl.L(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.b;
        if (view instanceof uk1) {
            ((uk1) view).W();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.T.f;
    }

    public final boolean e(float r18, float r19, android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqa.e(float, float, android.view.MotionEvent):boolean");
    }

    public final void f(defpackage.k27 r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqa.f(k27, boolean):void");
    }

    public final void g(k27 k27Var, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long B0;
        tgb tgbVar;
        float f;
        tgb tgbVar2;
        int i;
        float f2;
        int L;
        TLObject Z1;
        int i2;
        float f3 = this.O;
        boolean O3 = k27Var.O3();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i3 = this.a;
        if (z == O3) {
            B0 = y6c.h(i3).e();
        } else {
            B0 = k27.B0(k27Var.k);
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            B0 = cf3.n(peer);
        }
        String s = cf3.s(B0);
        float L2 = gl.L(10.0f) + 0.0f + gl.L(110.0f) + gl.L(9.33f);
        int i4 = 0;
        if (this.p) {
            tgbVar = new tgb(tL_starGiftUnique.title, 14.0f, gl.o());
            this.r = tgbVar;
        } else if (tL_messageActionStarGiftUnique.peer == null && !l7c.C(k27.B0(k27Var.k))) {
            if (k27.B0(k27Var.k) == y6c.h(i3).e()) {
                if (tL_starGiftUnique.crafted) {
                    tgbVar = new tgb(k96.M0(2131750445, null), 14.0f, gl.o());
                    this.r = tgbVar;
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    tgbVar = new tgb(k96.M0(2131750432, null), 14.0f, gl.o());
                    this.r = tgbVar;
                } else {
                    tgbVar = new tgb(k96.M0(2131750410, null), 14.0f, gl.o());
                    this.r = tgbVar;
                }
            } else {
                tgb tgbVar3 = new tgb(k96.a0(null, null, 2131749876, s), 14.0f, gl.o());
                this.r = tgbVar3;
                tgbVar = tgbVar3;
            }
        } else {
            tgbVar = new tgb(k96.M0(2131749875, null), 14.0f, gl.o());
            this.r = tgbVar;
        }
        this.q = (tgbVar.h() / 2.0f) + L2;
        float h = this.r.h() + L2 + gl.L(3.0f);
        if (this.p) {
            f = 2.0f;
            tgbVar2 = new tgb(k96.H(',', "Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, gl.o());
            this.t = tgbVar2;
            i = i3;
        } else {
            f = 2.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            i = i3;
            tgbVar2 = new tgb(ls6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
            this.t = tgbVar2;
        }
        this.s = (tgbVar2.h() / f) + h;
        float h2 = this.t.h() + h;
        if (this.p) {
            f2 = 14.0f;
        } else {
            f2 = 11.0f;
        }
        float L3 = h2 + gl.L(f2);
        ArrayList arrayList = this.w;
        arrayList.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        eu4 eu4Var = this.y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = eu4Var.c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            k27.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            Spannable A5 = k27.A5(vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
            if (tL_messageActionStarGiftUnique.name_hidden) {
                Z1 = null;
            } else if (tL_messageActionStarGiftUnique.from_id != null) {
                Z1 = na7.q1(i).Z1(cf3.n(tL_messageActionStarGiftUnique.from_id));
            } else {
                Z1 = na7.q1(i).Z1(k27Var.Z0());
            }
            this.z = true;
            eu4Var.c(Z1);
            eu4Var.m = A5;
            eu4Var.s = -1;
            eu4Var.b(((int) f3) - gl.L(24.0f));
            if (!this.N) {
                StaticLayout staticLayout = eu4Var.n;
                if (staticLayout != null) {
                    i2 = staticLayout.getLineCount();
                } else {
                    i2 = 0;
                }
                if (i2 > 3) {
                    this.N = true;
                    StaticLayout staticLayout2 = eu4Var.n;
                    if (staticLayout2 != null) {
                        i4 = staticLayout2.getLineCount();
                    }
                    this.O = (int) ((Math.min(0.4f, (i4 - 3) * 0.1f) + 1.0f) * this.O);
                    g(k27Var, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float L4 = L3 + gl.L(4.0f);
            this.x = L4;
            L3 = L4 + eu4Var.u + gl.L(3.0f);
        } else {
            this.z = false;
            eu4Var.c(null);
            eu4Var.m = null;
            eu4Var.s = -1;
            if (this.m != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gl.L(6.0f);
                }
                wqa wqaVar = new wqa(L3, k96.M0(2131750371, null), this.m.name);
                arrayList.add(wqaVar);
                float f4 = f3 * 0.5f;
                tgb tgbVar4 = wqaVar.b;
                tgbVar4.p = f4;
                this.u = Math.max(this.u, tgbVar4.c);
                tgb tgbVar5 = wqaVar.c;
                tgbVar5.p = f4;
                this.v = Math.max(this.v, tgbVar5.c);
                L3 += wqaVar.a();
            }
            if (this.k != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gl.L(6.0f);
                }
                wqa wqaVar2 = new wqa(L3, k96.M0(2131750372, null), this.k.name);
                arrayList.add(wqaVar2);
                float f5 = f3 * 0.5f;
                tgb tgbVar6 = wqaVar2.b;
                tgbVar6.p = f5;
                this.u = Math.max(this.u, tgbVar6.c);
                tgb tgbVar7 = wqaVar2.c;
                tgbVar7.p = f5;
                this.v = Math.max(this.v, tgbVar7.c);
                L3 = wqaVar2.a() + L3;
            }
            if (this.l != null) {
                if (!arrayList.isEmpty()) {
                    L3 += gl.L(6.0f);
                }
                wqa wqaVar3 = new wqa(L3, k96.M0(2131750364, null), this.l.name);
                arrayList.add(wqaVar3);
                float f6 = f3 * 0.5f;
                tgb tgbVar8 = wqaVar3.b;
                tgbVar8.p = f6;
                this.u = Math.max(this.u, tgbVar8.c);
                tgb tgbVar9 = wqaVar3.c;
                tgbVar9.p = f6;
                this.v = Math.max(this.v, tgbVar9.c);
                L3 += wqaVar3.a();
            }
        }
        float L5 = L3 + gl.L(11.66f);
        if (!this.p) {
            this.A = L5;
            this.C = new tgb(k96.M0(2131749872, null), 14.0f, gl.o());
            float L6 = gl.L(30.0f);
            this.B = L6;
            L5 += L6;
            L = gl.L(11.0f);
        } else {
            L = gl.L(10.0f);
        }
        this.P = (int) (L5 + L);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i;
        float f = this.O;
        float L = gl.L(10.0f) + 0.0f + gl.L(110.0f) + gl.L(9.33f);
        int i2 = 0;
        TLObject tLObject = null;
        tgb tgbVar = new tgb(k96.a0(null, null, 2131749876, cf3.s(j)), 14.0f, gl.o());
        this.r = tgbVar;
        this.q = (tgbVar.h() / 2.0f) + L;
        float h = this.r.h() + L + gl.L(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        tgb tgbVar2 = new tgb(ls6.m(tL_starGiftUnique.num, ',', sb), 12.0f, null);
        this.t = tgbVar2;
        this.s = (tgbVar2.h() / 2.0f) + h;
        float h2 = this.t.h() + h + gl.L(11.0f);
        this.w.clear();
        this.u = 0.0f;
        this.v = 0.0f;
        eu4 eu4Var = this.y;
        TextPaint textPaint = eu4Var.c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            k27.b(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false, 0);
            spanned = k27.A5(vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131749731, null));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j != 0) {
            tLObject = na7.q1(this.a).Z1(j);
        }
        this.z = true;
        eu4Var.c(tLObject);
        eu4Var.m = spanned;
        eu4Var.s = -1;
        eu4Var.b(((int) f) - gl.L(24.0f));
        if (!this.N) {
            StaticLayout staticLayout = eu4Var.n;
            if (staticLayout != null) {
                i = staticLayout.getLineCount();
            } else {
                i = 0;
            }
            if (i > 3) {
                this.N = true;
                StaticLayout staticLayout2 = eu4Var.n;
                if (staticLayout2 != null) {
                    i2 = staticLayout2.getLineCount();
                }
                this.O = (int) ((Math.min(0.4f, (i2 - 3) * 0.1f) + 1.0f) * this.O);
                h(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float L2 = h2 + gl.L(4.0f);
        this.x = L2;
        float L3 = L2 + eu4Var.u + gl.L(3.0f) + gl.L(11.66f);
        this.A = L3;
        this.C = new tgb(str, 14.0f, gl.o());
        float L4 = gl.L(30.0f);
        this.B = L4;
        this.P = (int) (L3 + L4 + gl.L(11.0f));
    }
}
