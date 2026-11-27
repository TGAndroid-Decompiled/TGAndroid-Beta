package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class xj9 implements jq3 {
    public static ColorMatrixColorFilter V;
    public final boolean E;
    public final float F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public final int O;
    public final int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public View T;
    public final dl9 U;
    public final hl9 a;
    public final TL_iv.PageBlock b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public Bitmap e;
    public RadialProgress2 f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize n;
    public final TLRPC.TL_photoStrippedSize r;
    public final TLRPC.Document s;
    public final TLRPC.PhotoSize w;
    public final TLRPC.TL_photoStrippedSize x;
    public final boolean y;

    public xj9(hl9 hl9Var, TL_iv.pageBlockVideo pageblockvideo) {
        boolean z;
        float f;
        int i;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = hl.L(48.0f);
        this.U = new dl9();
        this.a = hl9Var;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s = hl9Var.s(pageblockvideo.video_id);
        this.s = s;
        boolean J4 = r47.J4(s);
        this.E = J4;
        if (!J4 && !r47.s3(s, false)) {
            z = false;
        } else {
            z = true;
        }
        this.y = z;
        if (s != null) {
            this.w = xb4.w(s.thumbs, 320, false, null, true);
            this.x = xb4.Q(s.thumbs);
        } else {
            this.w = null;
            this.x = null;
        }
        if (s != null) {
            for (int i2 = 0; i2 < this.s.attributes.size(); i2++) {
                TLRPC.DocumentAttribute documentAttribute = this.s.attributes.get(i2);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i = documentAttribute.h) > 0) {
                    f = documentAttribute.w / i;
                    break;
                }
            }
        }
        f = 1.0f;
        this.F = f;
        this.P = lq3.q(hl9Var.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.h1 = new wj9(this);
    }

    @Override
    public final void B(boolean z) {
        n(this.T, false);
    }

    @Override
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.o(true, 1.0f);
        }
        if (this.y && (a() || this.S)) {
            b(true);
        }
        n(this.T, true);
    }

    public final boolean a() {
        if (this.E) {
            boolean z = xea.a;
            return i86.e(1024);
        }
        boolean z2 = xea.a;
        return i86.e(2048);
    }

    public final void b(boolean z) {
        jn5 jn5Var;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        jn5 jn5Var2 = null;
        hl9 hl9Var = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            if (tL_photoStrippedSize != null) {
                jn5Var2 = jn5.i(tL_photoStrippedSize, photo);
            }
            jn5 jn5Var3 = jn5Var2;
            imageReceiver.O = jn5.i(photoSize, photo);
            if (z) {
                imageReceiver.Y(null, null, jn5.i(photoSize, photo), null, jn5Var3, "b1", null, photoSize.size, null, hl9Var.b, 1);
                return;
            } else {
                imageReceiver.Y(null, null, null, null, jn5Var3, "b1", null, photoSize.size, null, hl9Var.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            if (tL_photoStrippedSize2 != null) {
                jn5Var = jn5.c(tL_photoStrippedSize2, document);
            } else {
                jn5Var = null;
            }
            TLRPC.PhotoSize photoSize2 = this.w;
            if (photoSize2 != null) {
                jn5Var2 = jn5.c(photoSize2, document);
            }
            imageReceiver.O = jn5.b(document);
            if (z && this.y && (a() || this.S)) {
                imageReceiver.u0 = true;
                imageReceiver.M(1);
                imageReceiver.Y(jn5.b(document), "g", jn5Var2, null, jn5Var, "b1", null, document.size, "mp4", hl9Var.b, 1);
                return;
            }
            imageReceiver.Y(null, null, jn5Var2, null, jn5Var, "b1", null, document.size, "mp4", hl9Var.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n;
        ImageReceiver imageReceiver = this.c;
        mpa mpaVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            dl9 dl9Var = this.U;
            if (!dl9Var.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n = imageReceiver.n()) != null && !n.isRecycled() && (n != this.e || imageReceiver2.n() == null)) {
                    this.e = n;
                    imageReceiver2.f0(Utilities.D(n, false));
                    ColorMatrixColorFilter colorMatrixColorFilter = V;
                    if (colorMatrixColorFilter == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        hl.l2(colorMatrix, 0.9f);
                        hl.i(colorMatrix, 0.6f);
                        ColorMatrixColorFilter colorMatrixColorFilter2 = new ColorMatrixColorFilter(colorMatrix);
                        V = colorMatrixColorFilter2;
                        colorMatrixColorFilter = colorMatrixColorFilter2;
                    }
                    imageReceiver2.p1 = colorMatrixColorFilter;
                }
                float f = imageReceiver.L0;
                float f2 = imageReceiver.M0;
                float f3 = imageReceiver.N0;
                float f4 = imageReceiver.O0;
                if (f3 > 0.0f && f4 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f, f2, f + f3, f2 + f4);
                    dl9Var.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.i0(f, f2, f3, f4);
                        imageReceiver2.setAlpha(imageReceiver.i1);
                        imageReceiver2.h(canvas, null);
                    }
                    hl9 hl9Var = this.a;
                    View view = hl9Var.Q;
                    if (view != null) {
                        mpa mpaVar2 = hl9Var.R;
                        if (mpaVar2 != null && mpaVar2.i) {
                            hl9Var.R = null;
                        } else {
                            mpaVar = mpaVar2;
                        }
                        if (mpaVar == null) {
                            mpaVar = mpa.e(view);
                            hl9Var.R = mpaVar;
                        }
                    }
                    if (mpaVar != null) {
                        canvas.translate(f, f2);
                        mpaVar.c(canvas, this.T, Math.round(f3), Math.round(f4), imageReceiver.i1, false);
                    }
                    canvas.restore();
                    View view2 = this.T;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null && this.L != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f;
        int i = this.O;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f;
            int i2 = this.M;
            int i3 = this.N;
            radialProgress23.p(i2, i3, i2 + i, i + i3);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.m(view);
            RadialProgress2 radialProgress24 = this.f;
            int i4 = this.M;
            int i5 = this.N;
            radialProgress24.p(i4, i5, i4 + i, i + i5);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj9.e():boolean");
    }

    public final CharSequence f() {
        int i;
        if (this.y) {
            i = 2131753926;
        } else {
            i = 2131753941;
        }
        String M0 = ob6.M0(i, null);
        if (h() && !this.U.b()) {
            return TextUtils.concat(M0, ", ", ob6.M0(2131744919, null));
        }
        return M0;
    }

    public final boolean g(float f, float f2) {
        int i = this.G;
        if (f >= i && f <= i + this.I) {
            int i2 = this.H;
            if (f2 >= i2 && f2 <= i2 + this.J) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int getObserverTag() {
        return this.P;
    }

    public final boolean h() {
        TL_iv.PageBlock pageBlock = this.b;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
        }
        return false;
    }

    @Override
    public final void i(long j, long j2) {
        float f;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            if (j2 <= 0) {
                f = 0.0f;
            } else {
                f = ((float) j) / ((float) j2);
            }
            radialProgress2.o(true, Math.min(1.0f, f));
        }
        if (this.L != 1) {
            n(this.T, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            dl9 dl9Var = this.U;
            if (!dl9Var.b && dl9Var.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f = imageReceiver.N0;
                float f2 = imageReceiver.O0;
                dl9Var.c(view, (f / 2.0f) + imageReceiver.L0, (f2 / 2.0f) + imageReceiver.M0, f, f2);
                return true;
            }
        }
        hl9 hl9Var = this.a;
        rb2 rb2Var = hl9Var.F;
        if (rb2Var != null) {
            rb2Var.P0(hl9Var.E, this.b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r13, android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj9.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void m(int i, int i2, int i3, int i4) {
        boolean z;
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.c.i0(i, i2, i3, i4);
        int i5 = this.O;
        int g = ik8.g(i3, i5, 2, i);
        this.M = g;
        int g2 = ik8.g(i4, i5, 2, i2);
        this.N = g2;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(g, g2, g + i5, i5 + g2);
        }
        int i6 = this.a.a;
        boolean z2 = true;
        TLRPC.Document document = this.s;
        if (document == null ? (lq3.q(i6).m() & 1) != 0 : !(this.y && (!a() || !lq3.q(i6).c(4, document.size)))) {
            z = true;
        } else {
            z = false;
        }
        this.K = z;
        if (!z && !e()) {
            z2 = false;
        }
        b(z2);
    }

    public final void n(View view, boolean z) {
        String str;
        boolean z2;
        int i = this.a.a;
        if (view == null) {
            view = this.T;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.n;
        if (photoSize != null) {
            str = xb4.r(null, photoSize);
        } else {
            TLRPC.Document document = this.s;
            if (document != null) {
                str = xb4.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.L = -1;
            RadialProgress2 radialProgress2 = this.f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.c;
        lm m = imageReceiver.m();
        if (m != null && (m.s() || imageReceiver.F())) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean e = e();
        boolean z3 = this.E;
        boolean z4 = this.y;
        if (!e && (!z4 || !z2)) {
            lq3.q(i).a(str, null, this);
            float f = 0.0f;
            if (!this.K && !this.S && !xb4.G(i).S(str)) {
                if (z3) {
                    this.L = 3;
                    RadialProgress2 radialProgress22 = this.f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z);
                    }
                } else {
                    this.L = 0;
                    RadialProgress2 radialProgress23 = this.f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z);
                    }
                }
            } else {
                this.L = 1;
                Float s = in5.z().s(str);
                if (s != null) {
                    f = s.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z);
                }
            }
            RadialProgress2 radialProgress25 = this.f;
            if (radialProgress25 != null) {
                radialProgress25.o(false, f);
            }
        } else {
            lq3.q(i).v(this);
            if (z3 && !z2) {
                this.L = 3;
                RadialProgress2 radialProgress26 = this.f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z);
                }
            } else if (z4 && !z2 && !a() && !this.S) {
                this.L = 2;
                RadialProgress2 radialProgress27 = this.f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z);
                }
            } else {
                this.L = -1;
                RadialProgress2 radialProgress28 = this.f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void l(long j, long j2) {
    }

    public xj9(hl9 hl9Var, TL_iv.pageBlockPhoto pageblockphoto) {
        TLRPC.PhotoSize photoSize;
        int i;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = hl.L(48.0f);
        this.U = new dl9();
        this.a = hl9Var;
        this.b = pageblockphoto;
        TLRPC.Photo u = hl9Var.u(pageblockphoto.photo_id);
        this.h = u;
        if (u != null) {
            photoSize = xb4.w(u.sizes, hl.Y0(false), false, null, false);
            this.n = photoSize;
            this.r = xb4.Q(u.sizes);
        } else {
            this.n = null;
            this.r = null;
            photoSize = null;
        }
        this.s = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.E = false;
        this.F = (photoSize == null || (i = photoSize.h) <= 0) ? 1.0f : photoSize.w / i;
        this.P = lq3.q(hl9Var.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }
}
