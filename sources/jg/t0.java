package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t5;
public class t0 extends View {
    public final Drawable D;
    public final Paint E;
    public boolean F;
    public qz0 G;
    public final Paint H;
    public boolean I;
    public qz0 J;
    public boolean K;
    public qz0 L;
    public boolean M;
    public final TextPaint N;
    public StaticLayout O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public final ImageReceiver T;
    public boolean U;
    public int V;
    public s0 W;
    public int f10232a;
    public float f10233a0;
    public int f10234b;
    public float f10235b0;
    public boolean f10236c;
    public float f10237c0;
    public boolean d;
    public float f10238d0;
    public final float e;
    public int f10239e0;
    public final int f10240f;
    public final RectF f10241f0;
    public final RectF f10242g0;
    public final int h;
    public final Path f10243h0;
    public final Path f10244i0;
    public final RectF f10245j0;
    public final RectF f10246k0;
    public final t5 f10247l0;
    public final t5 m0;
    public float f10248n;
    public final t5 f10249n0;
    public final t5 f10250o0;
    public final t5 f10251p0;
    public final t5 f10252q0;
    public final TextPaint f10253r;
    public final t5 f10254r0;
    public StaticLayout f10255s;
    public final t5 f10256s0;
    public float f10257w;
    public float f10258x;
    public final RectF f10259y;

    public t0(Context context, float f7) {
        super(context);
        this.f10236c = true;
        this.f10248n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f10253r = textPaint;
        this.f10259y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f10241f0 = new RectF();
        this.f10242g0 = new RectF();
        this.f10243h0 = new Path();
        this.f10244i0 = new Path();
        this.f10245j0 = new RectF();
        this.f10246k0 = new RectF();
        gr grVar = gr.h;
        this.f10247l0 = new t5(this, 0L, 350L, grVar);
        this.m0 = new t5(this, 0L, 350L, grVar);
        this.f10249n0 = new t5(this, 0L, 350L, grVar);
        this.f10250o0 = new t5(this, 0L, 350L, grVar);
        this.f10251p0 = new t5(this, 0L, 350L, grVar);
        this.f10252q0 = new t5(this, 0L, 350L, grVar);
        this.f10254r0 = new t5(this, 0L, 350L, grVar);
        this.f10256s0 = new t5(this, 0L, 350L, grVar);
        this.e = f7;
        imageReceiver.J0 = true;
        this.f10240f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.D = i0.a.f(context, 2131232763);
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(org.telegram.messenger.i0.o1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: jg.t0.a(android.graphics.Canvas):void");
    }

    public final void b(int i10, s0 s0Var, boolean z10) {
        this.f10232a = i10;
        if (this.W == s0Var && !z10) {
            return;
        }
        this.W = s0Var;
        this.f10236c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.D;
        TextPaint textPaint = this.f10253r;
        if (i10 == 0) {
            this.f10239e0 = i11;
            if (org.telegram.messenger.i0.B(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f10239e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f10239e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f10239e0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        kp kpVar;
        int f7;
        boolean z10;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        ic c10;
        int i13;
        float f12;
        float f13;
        int i14;
        boolean z11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        ic i15;
        if (this.f10236c && this.W != null) {
            boolean e = e();
            int i16 = this.f10240f;
            float f19 = this.e;
            if (e) {
                if (TextUtils.isEmpty(this.W.f10207b)) {
                    str2 = this.W.f10208c;
                } else {
                    str2 = this.W.f10207b;
                }
                TLRPC.WebPage webPage = this.W.d;
                float f20 = (this.f10234b - i16) - i16;
                this.f10235b0 = 0.0f;
                this.f10233a0 = 0.0f;
                this.f10237c0 = 0.0f;
                int e7 = h20.e(d20.i(this.f10232a).f());
                lp lpVar = vp.r1(this.f10232a).f18888r4;
                String str3 = null;
                if (lpVar != null && e7 >= 7) {
                    kpVar = lpVar.d(e7);
                } else {
                    kpVar = null;
                }
                if (kpVar == null) {
                    int[] iArr = t6.f21188r8;
                    f7 = t6.x0(null, iArr[e7 % iArr.length], false);
                } else {
                    f7 = kpVar.f();
                }
                this.H.setColor(f7);
                this.f10235b0 = (7.33f * f19) + this.f10235b0;
                this.F = this.W.f10209f;
                qz0 qz0Var = new qz0(str2, 16.0f, null);
                qz0Var.f29772a.setTextSize(16.0f * f19);
                float f21 = 20.0f * f19;
                qz0Var.p(f20 - f21);
                this.G = qz0Var;
                this.f10233a0 = Math.max(this.f10233a0, Math.min(f21 + qz0Var.f29774c, f20));
                float f22 = 7.0f * f19;
                this.f10235b0 = this.G.i() + this.f10235b0 + f22;
                if (webPage.photo == null && !jj.K4(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.R = z10;
                s0 s0Var = this.W;
                boolean z12 = s0Var.e;
                this.S = !z12;
                if (this.U && (s0Var.f10206a & 4) != 0) {
                    i10 = s0Var.f10210i;
                } else {
                    if (!z12) {
                        f10 = 48.0f;
                    } else {
                        f10 = (f20 / f19) - 40.0f;
                    }
                    i10 = 2 * ((int) f10);
                }
                ImageReceiver imageReceiver = this.T;
                imageReceiver.J0((int) (4.0f * f19));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w9 = b8.w(photo.sizes, 1, false, null, false);
                    f11 = 48.0f;
                    TLRPC.PhotoSize w10 = b8.w(webPage.photo.sizes, (int) (i10 * f19), false, w9, false);
                    if (w10 != null) {
                        i12 = w10.f19818w;
                        i11 = w10.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ic i17 = ic.i(w10, webPage.photo);
                    String i18 = a1.g.i(i10, i10, "_");
                    if (this.U) {
                        i15 = null;
                    } else {
                        i15 = ic.i(w9, webPage.photo);
                    }
                    if (!this.U) {
                        str3 = a1.g.i(i10, i10, "_");
                    }
                    imageReceiver.r0(i17, i18, i15, str3, null, 0L, null, null, 0);
                } else {
                    f11 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize w11 = b8.w(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize w12 = b8.w(webPage.document.thumbs, (int) (i10 * f19), false, w11, false);
                        if (w12 != null) {
                            i12 = w12.f19818w;
                            i11 = w12.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ic c11 = ic.c(w12, webPage.document);
                        String i19 = a1.g.i(i10, i10, "_");
                        if (this.U) {
                            c10 = null;
                        } else {
                            c10 = ic.c(w11, webPage.document);
                        }
                        if (!this.U) {
                            str3 = a1.g.i(i10, i10, "_");
                        }
                        imageReceiver.r0(c11, i19, c10, str3, null, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.f10237c0 = (5.66f * f19) + this.f10237c0;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.K = !isEmpty;
                if (!isEmpty) {
                    qz0 qz0Var2 = new qz0(webPage.site_name, 14.0f, org.telegram.messenger.i0.o());
                    qz0Var2.f29772a.setTextSize(f19 * 14.0f);
                    float f23 = f19 * 40.0f;
                    float f24 = f20 - f23;
                    if (this.R && this.S) {
                        f17 = f19 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    qz0Var2.p((int) Math.ceil(f24 - f17));
                    this.L = qz0Var2;
                    float f25 = this.f10233a0;
                    float f26 = f23 + qz0Var2.f29774c;
                    if (this.R && this.S) {
                        f18 = f19 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    this.f10233a0 = Math.max(f25, Math.min(f26 + f18, f20));
                    this.f10237c0 = (f19 * 2.66f) + this.L.i() + this.f10237c0;
                    i13 = this.L.f29773b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.I = !isEmpty2;
                if (!isEmpty2) {
                    qz0 qz0Var3 = new qz0(webPage.title, 14.0f, org.telegram.messenger.i0.o());
                    qz0Var3.f29772a.setTextSize(f19 * 14.0f);
                    float f27 = f19 * 40.0f;
                    float f28 = f20 - f27;
                    f12 = 2.66f;
                    if (this.R && this.S) {
                        f15 = f19 * 60.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    f13 = f19;
                    qz0Var3.p((int) Math.ceil(f28 - f15));
                    this.J = qz0Var3;
                    float f29 = this.f10233a0;
                    float f30 = f27 + qz0Var3.f29774c;
                    if (this.R && this.S) {
                        f16 = 60.0f * f13;
                    } else {
                        f16 = 0.0f;
                    }
                    this.f10233a0 = Math.max(f29, Math.min(f30 + f16, f20));
                    this.f10237c0 = (f13 * 2.66f) + this.J.i() + this.f10237c0;
                    i13 += this.J.f29773b.getLineCount();
                } else {
                    f12 = 2.66f;
                    f13 = f19;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.M = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.N;
                    textPaint.setTextSize(f13 * 14.0f);
                    String str4 = webPage.description;
                    float f31 = f13 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f20 - f31));
                    if (this.R && this.S) {
                        i14 = 60;
                    } else {
                        i14 = 0;
                    }
                    int i20 = 3 - i13;
                    this.O = org.telegram.ui.Cells.q1.F1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f20 - ((40 + i14) * f13))), i20, 4);
                    this.P = 0.0f;
                    this.Q = Float.MAX_VALUE;
                    for (int i21 = 0; i21 < this.O.getLineCount(); i21++) {
                        if (this.R && this.S && i21 < i20) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f32 = this.P;
                        float lineWidth = this.O.getLineWidth(i21);
                        if (z11) {
                            f14 = f13 * f11;
                        } else {
                            f14 = 0.0f;
                        }
                        this.P = Math.max(f32, lineWidth + f14);
                        this.Q = Math.min(this.Q, this.O.getLineLeft(i21));
                    }
                    this.f10233a0 = Math.max(this.f10233a0, Math.min(f31 + this.P, f20));
                    this.f10237c0 = (f13 * f12) + this.f10237c0 + this.O.getHeight();
                }
                if (this.R && !this.S) {
                    if (i12 > 0 && i11 > 0) {
                        this.f10238d0 = Math.min((Math.max(0.0f, this.f10233a0 - (f13 * 40.0f)) / i12) * i11, f13 * 200.0f);
                    } else {
                        this.f10238d0 = f13 * 120.0f;
                    }
                    this.f10237c0 = (f13 * f12) + this.f10237c0 + this.f10238d0;
                }
                float f33 = f22 + this.f10237c0;
                this.f10237c0 = f33;
                this.f10235b0 = (f13 * 11.0f) + this.f10235b0 + f33;
            } else {
                if (TextUtils.isEmpty(this.W.f10207b)) {
                    String str5 = this.W.f10208c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.W.f10207b;
                }
                RectF rectF = this.f10259y;
                float f34 = ((this.f10234b - i16) - i16) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f19);
                this.f10248n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f10253r;
                this.f10255s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f34), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f10257w = 0.0f;
                this.f10258x = Float.MAX_VALUE;
                for (int i22 = 0; i22 < this.f10255s.getLineCount(); i22++) {
                    this.f10257w = Math.max(this.f10257w, this.f10255s.getLineWidth(i22));
                    this.f10258x = Math.min(this.f10258x, this.f10255s.getLineLeft(i22));
                }
                if (this.f10255s.getLineCount() > 2) {
                    this.f10248n = 0.3f;
                } else {
                    this.f10248n = Math.min(1.0f, f34 / this.f10257w);
                }
                this.f10233a0 = (this.f10257w * this.f10248n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f19);
                this.f10235b0 = Math.max(f19 * 30.0f, this.f10255s.getHeight() * this.f10248n) + ((rectF.top + rectF.bottom) * f19);
            }
            if (!this.d) {
                this.f10247l0.f(this.F, true);
                this.f10249n0.f(this.S, true);
                this.m0.f(this.R, true);
                this.f10252q0.e(true, this.f10237c0);
            } else {
                invalidate();
            }
            this.f10236c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        s0 s0Var = this.W;
        if (s0Var != null && s0Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.f10234b;
            int i11 = this.f10240f;
            f7 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f7) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f7;
        float f10;
        if (e()) {
            f7 = 16.66f;
            f10 = this.e;
        } else {
            f7 = 0.2f;
            f10 = this.f10235b0;
        }
        return f10 * f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.R();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d();
        int i12 = this.f10240f;
        int ceil = ((int) Math.ceil(this.f10233a0)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.f10235b0);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f10234b = i10;
        this.f10236c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
