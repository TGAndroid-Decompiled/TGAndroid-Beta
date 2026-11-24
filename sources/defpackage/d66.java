package defpackage;

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
import org.telegram.tgnet.TLRPC;
public class d66 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public uib H;
    public final Paint I;
    public boolean J;
    public uib K;
    public boolean L;
    public uib M;
    public boolean N;
    public final TextPaint O;
    public StaticLayout P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public final ImageReceiver U;
    public boolean V;
    public int W;
    public int a;
    public c66 a0;
    public int b;
    public float b0;
    public boolean c;
    public float c0;
    public boolean d;
    public float d0;
    public final float e;
    public float e0;
    public final int f;
    public int f0;
    public final RectF g0;
    public final int h;
    public final RectF h0;
    public final Path i0;
    public final Path j0;
    public final RectF k0;
    public final RectF l0;
    public final ln m0;
    public float n;
    public final ln n0;
    public final ln o0;
    public final ln p0;
    public final ln q0;
    public final TextPaint r;
    public final ln r0;
    public StaticLayout s;
    public final ln s0;
    public final ln t0;
    public float w;
    public float x;
    public final RectF y;

    public d66(Context context, float f) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Path();
        this.j0 = new Path();
        this.k0 = new RectF();
        this.l0 = new RectF();
        d53 d53Var = d53.h;
        this.m0 = new ln(this, 0L, 350L, d53Var);
        this.n0 = new ln(this, 0L, 350L, d53Var);
        this.o0 = new ln(this, 0L, 350L, d53Var);
        this.p0 = new ln(this, 0L, 350L, d53Var);
        this.q0 = new ln(this, 0L, 350L, d53Var);
        this.r0 = new ln(this, 0L, 350L, d53Var);
        this.s0 = new ln(this, 0L, 350L, d53Var);
        this.t0 = new ln(this, 0L, 350L, d53Var);
        this.e = f;
        imageReceiver.K0 = true;
        this.f = (int) (f * 3.0f);
        this.h = (int) (f * 1.0f);
        this.E = b10.d(context, 2131232783);
        textPaint.setTextSize(24.0f * f);
        textPaint.setTypeface(gm.n1("fonts/rcondensedbold.ttf"));
    }

    public final void a(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d66.a(android.graphics.Canvas):void");
    }

    public final void b(int i, c66 c66Var, boolean z) {
        this.a = i;
        if (this.a0 == c66Var && !z) {
            return;
        }
        this.a0 = c66Var;
        this.c = true;
        this.d = z;
        requestLayout();
    }

    public final void c(int i, int i2) {
        int i3 = -16777216;
        Drawable drawable = this.E;
        TextPaint textPaint = this.r;
        if (i == 0) {
            this.f0 = i2;
            if (gm.B(i2) < 0.721f) {
                i3 = -1;
            }
            textPaint.setColor(i3);
            drawable.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        } else if (i == 1) {
            this.f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i == 2) {
            this.f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        float min;
        String str2;
        ec7 ec7Var;
        int f;
        boolean z;
        float f2;
        int i;
        float f3;
        int i2;
        int i3;
        gn5 c;
        int i4;
        float f4;
        float f5;
        float f6;
        int i5;
        boolean z2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        gn5 i6;
        if (this.c && this.a0 != null) {
            boolean e = e();
            c66 c66Var = this.a0;
            int i7 = this.f;
            float f12 = this.e;
            if (e) {
                boolean isEmpty = TextUtils.isEmpty(c66Var.b);
                c66 c66Var2 = this.a0;
                if (isEmpty) {
                    str2 = c66Var2.c;
                } else {
                    str2 = c66Var2.b;
                }
                TLRPC.WebPage webPage = c66Var2.d;
                float f13 = (this.b - i7) - i7;
                this.c0 = 0.0f;
                this.b0 = 0.0f;
                this.d0 = 0.0f;
                int f14 = m9c.f(z8c.h(this.a).f());
                fc7 fc7Var = oc7.r1(this.a).E3;
                String str3 = null;
                if (fc7Var != null && f14 >= 7) {
                    ec7Var = fc7Var.d(f14);
                } else {
                    ec7Var = null;
                }
                if (ec7Var == null) {
                    int[] iArr = cmb.q8;
                    f = cmb.w0(null, iArr[f14 % iArr.length], false);
                } else {
                    f = ec7Var.f();
                }
                this.I.setColor(f);
                this.c0 = (7.33f * f12) + this.c0;
                this.G = this.a0.f;
                uib uibVar = new uib(str2, 16.0f, null);
                uibVar.a.setTextSize(16.0f * f12);
                float f15 = 20.0f * f12;
                uibVar.o(f13 - f15);
                this.H = uibVar;
                this.b0 = Math.max(this.b0, Math.min(f15 + uibVar.c, f13));
                float f16 = 7.0f * f12;
                this.c0 = this.H.h() + this.c0 + f16;
                if (webPage.photo == null && !k47.J4(webPage.document)) {
                    z = false;
                } else {
                    z = true;
                }
                this.S = z;
                c66 c66Var3 = this.a0;
                boolean z3 = c66Var3.e;
                this.T = !z3;
                if (this.V && (c66Var3.a & 4) != 0) {
                    i = c66Var3.i;
                } else {
                    if (!z3) {
                        f2 = 48.0f;
                    } else {
                        f2 = (f13 / f12) - 40.0f;
                    }
                    i = ((int) f2) << 1;
                }
                ImageReceiver imageReceiver = this.U;
                imageReceiver.q0((int) (4.0f * f12));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, 1, false, null, false);
                    f3 = 40.0f;
                    TLRPC.PhotoSize w2 = bc4.w(webPage.photo.sizes, (int) (i * f12), false, w, false);
                    if (w2 != null) {
                        i3 = w2.w;
                        i2 = w2.h;
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                    gn5 i8 = gn5.i(w2, webPage.photo);
                    String n = td4.n(i, i, "_");
                    if (this.V) {
                        i6 = null;
                    } else {
                        i6 = gn5.i(w, webPage.photo);
                    }
                    if (!this.V) {
                        str3 = td4.n(i, i, "_");
                    }
                    imageReceiver.Z(i8, n, i6, str3, null, 0L, null, null, 0);
                } else {
                    f3 = 40.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize w3 = bc4.w(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize w4 = bc4.w(webPage.document.thumbs, (int) (i * f12), false, w3, false);
                        if (w4 != null) {
                            i3 = w4.w;
                            i2 = w4.h;
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                        gn5 c2 = gn5.c(w4, webPage.document);
                        String n2 = td4.n(i, i, "_");
                        if (this.V) {
                            c = null;
                        } else {
                            c = gn5.c(w3, webPage.document);
                        }
                        if (!this.V) {
                            str3 = td4.n(i, i, "_");
                        }
                        imageReceiver.Z(c2, n2, c, str3, null, 0L, null, null, 0);
                    } else {
                        i2 = 0;
                        i3 = 0;
                    }
                }
                this.d0 = (5.66f * f12) + this.d0;
                boolean isEmpty2 = TextUtils.isEmpty(webPage.site_name);
                this.L = !isEmpty2;
                if (!isEmpty2) {
                    uib uibVar2 = new uib(webPage.site_name, 14.0f, gm.o());
                    uibVar2.a.setTextSize(f12 * 14.0f);
                    float f17 = f12 * f3;
                    float f18 = f13 - f17;
                    if (this.S && this.T) {
                        f10 = f12 * 60.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    uibVar2.o((int) Math.ceil(f18 - f10));
                    this.M = uibVar2;
                    float f19 = this.b0;
                    float f20 = f17 + uibVar2.c;
                    if (this.S && this.T) {
                        f11 = f12 * 60.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    this.b0 = Math.max(f19, Math.min(f20 + f11, f13));
                    this.d0 = (f12 * 2.66f) + this.M.h() + this.d0;
                    i4 = this.M.b.getLineCount();
                } else {
                    i4 = 0;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.title);
                this.J = !isEmpty3;
                if (!isEmpty3) {
                    uib uibVar3 = new uib(webPage.title, 14.0f, gm.o());
                    uibVar3.a.setTextSize(f12 * 14.0f);
                    float f21 = f12 * f3;
                    float f22 = f13 - f21;
                    f4 = 2.66f;
                    if (this.S && this.T) {
                        f8 = f12 * 60.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    f5 = 14.0f;
                    uibVar3.o((int) Math.ceil(f22 - f8));
                    this.K = uibVar3;
                    float f23 = this.b0;
                    float f24 = f21 + uibVar3.c;
                    if (this.S && this.T) {
                        f9 = 60.0f * f12;
                    } else {
                        f9 = 0.0f;
                    }
                    this.b0 = Math.max(f23, Math.min(f24 + f9, f13));
                    this.d0 = (f12 * 2.66f) + this.K.h() + this.d0;
                    i4 += this.K.b.getLineCount();
                } else {
                    f4 = 2.66f;
                    f5 = 14.0f;
                }
                boolean isEmpty4 = TextUtils.isEmpty(webPage.description);
                this.N = !isEmpty4;
                if (!isEmpty4) {
                    TextPaint textPaint = this.O;
                    textPaint.setTextSize(f12 * f5);
                    String str4 = webPage.description;
                    float f25 = f12 * f3;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f13 - f25));
                    if (this.S && this.T) {
                        i5 = 60;
                    } else {
                        i5 = 0;
                    }
                    int i9 = 3 - i4;
                    this.P = rc2.K1(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f13 - ((40 + i5) * f12))), i9, 4);
                    this.Q = 0.0f;
                    this.R = Float.MAX_VALUE;
                    for (int i10 = 0; i10 < this.P.getLineCount(); i10++) {
                        if (this.S && this.T && i10 < i9) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float f26 = this.Q;
                        float lineWidth = this.P.getLineWidth(i10);
                        if (z2) {
                            f7 = f12 * 48.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.Q = Math.max(f26, lineWidth + f7);
                        this.R = Math.min(this.R, this.P.getLineLeft(i10));
                    }
                    this.b0 = Math.max(this.b0, Math.min(f25 + this.Q, f13));
                    this.d0 = (f12 * f4) + this.d0 + this.P.getHeight();
                }
                if (this.S && !this.T) {
                    if (i3 > 0 && i2 > 0) {
                        f6 = Math.min((Math.max(0.0f, this.b0 - (f12 * f3)) / i3) * i2, 200.0f * f12);
                        this.e0 = f6;
                    } else {
                        f6 = 120.0f * f12;
                        this.e0 = f6;
                    }
                    this.d0 = (f12 * f4) + this.d0 + f6;
                }
                float f27 = f16 + this.d0;
                this.d0 = f27;
                this.c0 = (f12 * 11.0f) + this.c0 + f27;
            } else {
                boolean isEmpty5 = TextUtils.isEmpty(c66Var.b);
                c66 c66Var4 = this.a0;
                if (isEmpty5) {
                    String str5 = c66Var4.c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = c66Var4.b;
                }
                RectF rectF = this.y;
                float f28 = ((this.b - i7) - i7) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f12);
                this.n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.r;
                this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f28), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.w = 0.0f;
                this.x = Float.MAX_VALUE;
                for (int i11 = 0; i11 < this.s.getLineCount(); i11++) {
                    this.w = Math.max(this.w, this.s.getLineWidth(i11));
                    this.x = Math.min(this.x, this.s.getLineLeft(i11));
                }
                if (this.s.getLineCount() > 2) {
                    min = 0.3f;
                    this.n = 0.3f;
                } else {
                    min = Math.min(1.0f, f28 / this.w);
                    this.n = min;
                }
                this.b0 = (this.w * min) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f12);
                this.c0 = Math.max(f12 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f12);
            }
            if (!this.d) {
                this.m0.f(this.G, true);
                this.o0.f(this.T, true);
                this.n0.f(this.S, true);
                this.r0.e(true, this.d0);
            } else {
                invalidate();
            }
            this.c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        c66 c66Var = this.a0;
        if (c66Var != null && c66Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f;
        if (this.T) {
            f = 48.0f;
        } else {
            int i = this.b;
            int i2 = this.f;
            f = (((i - i2) - i2) / this.e) - 40.0f;
        }
        return ((int) f) << 1;
    }

    public int getPreviewType() {
        return this.W;
    }

    public float getRadius() {
        float f;
        float f2;
        if (e()) {
            f = 16.66f;
            f2 = this.e;
        } else {
            f = 0.2f;
            f2 = this.c0;
        }
        return f2 * f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        d();
        int i3 = this.f;
        int ceil = ((int) Math.ceil(this.b0)) + i3 + i3;
        int ceil2 = (int) Math.ceil(this.c0);
        int i4 = this.h;
        setMeasuredDimension(ceil, ceil2 + i4 + i4);
    }

    public void setMaxWidth(int i) {
        this.b = i;
        this.c = true;
    }

    public void setPreviewType(int i) {
        this.W = i;
        invalidate();
    }
}
