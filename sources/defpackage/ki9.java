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
public final class ki9 implements cr3 {
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
    public final qj9 U;
    public final uj9 a;
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

    public ki9(uj9 uj9Var, TL_iv.pageBlockVideo pageblockvideo) {
        boolean z;
        float f;
        int i;
        this.c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = gm.L(48.0f);
        this.U = new qj9();
        this.a = uj9Var;
        this.b = pageblockvideo;
        this.h = null;
        this.n = null;
        this.r = null;
        TLRPC.Document s = uj9Var.s(pageblockvideo.video_id);
        this.s = s;
        boolean J4 = k47.J4(s);
        this.E = J4;
        if (!J4 && !k47.s3(s, false)) {
            z = false;
        } else {
            z = true;
        }
        this.y = z;
        if (s != null) {
            this.w = bc4.w(s.thumbs, 320, false, null, true);
            this.x = bc4.Q(s.thumbs);
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
        this.P = er3.q(uj9Var.a).k();
        ImageReceiver imageReceiver = this.c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.h1 = new ji9(this);
    }

    @Override
    public final void A(boolean z) {
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
            boolean z = gda.a;
            return e86.e(1024);
        }
        boolean z2 = gda.a;
        return e86.e(2048);
    }

    public final void b(boolean z) {
        gn5 gn5Var;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.c;
        gn5 gn5Var2 = null;
        uj9 uj9Var = this.a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.r;
            if (tL_photoStrippedSize != null) {
                gn5Var2 = gn5.i(tL_photoStrippedSize, photo);
            }
            gn5 gn5Var3 = gn5Var2;
            imageReceiver.O = gn5.i(photoSize, photo);
            if (z) {
                imageReceiver.Y(null, null, gn5.i(photoSize, photo), null, gn5Var3, "b1", null, photoSize.size, null, uj9Var.b, 1);
                return;
            } else {
                imageReceiver.Y(null, null, null, null, gn5Var3, "b1", null, photoSize.size, null, uj9Var.b, 1);
                return;
            }
        }
        TLRPC.Document document = this.s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.x;
            if (tL_photoStrippedSize2 != null) {
                gn5Var = gn5.c(tL_photoStrippedSize2, document);
            } else {
                gn5Var = null;
            }
            TLRPC.PhotoSize photoSize2 = this.w;
            if (photoSize2 != null) {
                gn5Var2 = gn5.c(photoSize2, document);
            }
            imageReceiver.O = gn5.b(document);
            if (z && this.y && (a() || this.S)) {
                imageReceiver.u0 = true;
                imageReceiver.M(1);
                imageReceiver.Y(gn5.b(document), "g", gn5Var2, null, gn5Var, "b1", null, document.size, "mp4", uj9Var.b, 1);
                return;
            }
            imageReceiver.Y(null, null, gn5Var2, null, gn5Var, "b1", null, document.size, "mp4", uj9Var.b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n;
        ImageReceiver imageReceiver = this.c;
        qna qnaVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            qj9 qj9Var = this.U;
            if (!qj9Var.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n = imageReceiver.n()) != null && !n.isRecycled() && (n != this.e || imageReceiver2.n() == null)) {
                    this.e = n;
                    imageReceiver2.f0(Utilities.D(n, false));
                    ColorMatrixColorFilter colorMatrixColorFilter = V;
                    if (colorMatrixColorFilter == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        gm.l2(colorMatrix, 0.9f);
                        gm.i(colorMatrix, 0.6f);
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
                    qj9Var.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.i0(f, f2, f3, f4);
                        imageReceiver2.setAlpha(imageReceiver.i1);
                        imageReceiver2.h(canvas, null);
                    }
                    uj9 uj9Var = this.a;
                    View view = uj9Var.Q;
                    if (view != null) {
                        qna qnaVar2 = uj9Var.R;
                        if (qnaVar2 != null && qnaVar2.i) {
                            uj9Var.R = null;
                        } else {
                            qnaVar = qnaVar2;
                        }
                        if (qnaVar == null) {
                            qnaVar = qna.e(view);
                            uj9Var.R = qnaVar;
                        }
                    }
                    if (qnaVar != null) {
                        canvas.translate(f, f2);
                        qnaVar.c(canvas, this.T, Math.round(f3), Math.round(f4), imageReceiver.i1, false);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.e():boolean");
    }

    public final CharSequence f() {
        int i;
        if (this.y) {
            i = 2131753898;
        } else {
            i = 2131753913;
        }
        String M0 = jb6.M0(i, null);
        if (h() && !this.U.b()) {
            return TextUtils.concat(M0, ", ", jb6.M0(2131744951, null));
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
            qj9 qj9Var = this.U;
            if (!qj9Var.b && qj9Var.f == null) {
                ImageReceiver imageReceiver = this.c;
                float f = imageReceiver.N0;
                float f2 = imageReceiver.O0;
                qj9Var.c(view, (f / 2.0f) + imageReceiver.L0, (f2 / 2.0f) + imageReceiver.M0, f, f2);
                return true;
            }
        }
        uj9 uj9Var = this.a;
        mc2 mc2Var = uj9Var.F;
        if (mc2Var != null) {
            mc2Var.S0(uj9Var.E, this.b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r13, android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void m(int i, int i2, int i3, int i4) {
        boolean z;
        this.G = i;
        this.H = i2;
        this.I = i3;
        this.J = i4;
        this.c.i0(i, i2, i3, i4);
        int i5 = this.O;
        int g = wi8.g(i3, i5, 2, i);
        this.M = g;
        int g2 = wi8.g(i4, i5, 2, i2);
        this.N = g2;
        RadialProgress2 radialProgress2 = this.f;
        if (radialProgress2 != null) {
            radialProgress2.p(g, g2, g + i5, i5 + g2);
        }
        int i6 = this.a.a;
        boolean z2 = true;
        TLRPC.Document document = this.s;
        if (document == null ? (er3.q(i6).m() & 1) != 0 : !(this.y && (!a() || !er3.q(i6).c(4, document.size)))) {
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
            str = bc4.r(null, photoSize);
        } else {
            TLRPC.Document document = this.s;
            if (document != null) {
                str = bc4.r(null, document);
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
        kn m = imageReceiver.m();
        if (m != null && (m.s() || imageReceiver.F())) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean e = e();
        boolean z3 = this.E;
        boolean z4 = this.y;
        if (!e && (!z4 || !z2)) {
            er3.q(i).a(str, null, this);
            float f = 0.0f;
            if (!this.K && !this.S && !bc4.G(i).S(str)) {
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
                Float s = fn5.z().s(str);
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
            er3.q(i).v(this);
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

    public ki9(uj9 uj9Var, TL_iv.pageBlockPhoto pageblockphoto) {
        TLRPC.PhotoSize photoSize;
        int i;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = gm.L(48.0f);
        this.U = new qj9();
        this.a = uj9Var;
        this.b = pageblockphoto;
        TLRPC.Photo u = uj9Var.u(pageblockphoto.photo_id);
        this.h = u;
        if (u != null) {
            photoSize = bc4.w(u.sizes, gm.Y0(false), false, null, false);
            this.n = photoSize;
            this.r = bc4.Q(u.sizes);
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
        this.P = er3.q(uj9Var.a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }
}
