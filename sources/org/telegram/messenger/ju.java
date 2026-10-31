package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class ju implements z5 {
    public static ColorMatrixColorFilter U;
    public final boolean D;
    public final float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public View S;
    public final qv T;
    public final vv f16435a;
    public final TL_iv.PageBlock f16436b;
    public final ImageReceiver f16437c;
    public final ImageReceiver d;
    public Bitmap e;
    public RadialProgress2 f16438f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f16439n;
    public final TLRPC.TL_photoStrippedSize f16440r;
    public final TLRPC.Document f16441s;
    public final TLRPC.PhotoSize f16442w;
    public final TLRPC.TL_photoStrippedSize f16443x;
    public final boolean f16444y;

    public ju(vv vvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i10;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f16437c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new qv();
        this.f16435a = vvVar;
        this.f16436b = pageblockphoto;
        TLRPC.Photo v = vvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f16439n = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.f16440r = b8.R(v.sizes);
        } else {
            this.f16439n = null;
            this.f16440r = null;
        }
        this.f16441s = null;
        this.f16442w = null;
        this.f16443x = null;
        this.f16444y = false;
        this.D = false;
        TLRPC.PhotoSize photoSize = this.f16439n;
        this.E = (photoSize == null || (i10 = photoSize.h) <= 0) ? 1.0f : photoSize.f19818w / i10;
        this.O = b6.q(vvVar.f18986a).k();
        imageReceiver.f14424z1 = true;
        imageReceiver2.f14424z1 = true;
    }

    @Override
    public final void C(boolean z10) {
        m(this.S, false);
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f16438f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f16444y && (a() || this.R)) {
            b(true);
        }
        m(this.S, true);
    }

    public final boolean a() {
        if (this.D) {
            int i10 = tz.f18131a;
            return sc.e(1024);
        }
        int i11 = tz.f18131a;
        return sc.e(2048);
    }

    public final void b(boolean z10) {
        ic icVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f16437c;
        ic icVar2 = null;
        vv vvVar = this.f16435a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f16439n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f16440r;
            if (tL_photoStrippedSize != null) {
                icVar2 = ic.i(tL_photoStrippedSize, photo);
            }
            ic icVar3 = icVar2;
            if (z10) {
                imageReceiver.u0(null, null, ic.i(photoSize, photo), null, icVar3, "b1", null, photoSize.size, null, vvVar.f18987b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, icVar3, "b1", null, photoSize.size, null, vvVar.f18987b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f16441s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f16443x;
            if (tL_photoStrippedSize2 != null) {
                icVar = ic.c(tL_photoStrippedSize2, document);
            } else {
                icVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f16442w;
            if (photoSize2 != null) {
                icVar2 = ic.c(photoSize2, document);
            }
            if (z10 && this.f16444y && (a() || this.R)) {
                imageReceiver.f14408t0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(ic.b(document), "g", icVar2, null, icVar, "b1", null, document.size, "mp4", vvVar.f18987b, 1);
                return;
            }
            imageReceiver.u0(null, null, icVar2, null, icVar, "b1", null, document.size, "mp4", vvVar.f18987b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.f16437c;
        nh.h hVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            qv qvVar = this.T;
            if (!qvVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.e || imageReceiver2.n() == null)) {
                    this.e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (U == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        i0.n2(colorMatrix, 0.9f);
                        i0.i(colorMatrix, 0.6f);
                        U = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.f14397o1 = U;
                }
                float f7 = imageReceiver.K0;
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                if (f11 > 0.0f && f12 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f7, f10, f7 + f11, f10 + f12);
                    qvVar.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.y0(f7, f10, f11, f12);
                        imageReceiver2.setAlpha(imageReceiver.f14384h1);
                        imageReceiver2.h(canvas, null);
                    }
                    vv vvVar = this.f16435a;
                    View view = vvVar.Q;
                    if (view != null) {
                        nh.h hVar2 = vvVar.R;
                        if (hVar2 != null && hVar2.f13834i) {
                            vvVar.R = null;
                        }
                        if (vvVar.R == null) {
                            vvVar.R = nh.h.e(view);
                        }
                        hVar = vvVar.R;
                    }
                    if (hVar != null) {
                        canvas.translate(f7, f10);
                        hVar.c(canvas, this.S, Math.round(f11), Math.round(f12), imageReceiver.f14384h1, false);
                    }
                    canvas.restore();
                    View view2 = this.S;
                    if (view2 != null) {
                        view2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        RadialProgress2 radialProgress2 = this.f16438f;
        if (radialProgress2 != null && this.K != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f16438f;
        int i10 = this.N;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f16438f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f16438f;
            int i11 = this.L;
            int i12 = this.M;
            radialProgress23.r(i11, i12, i11 + i10, i10 + i12);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f16438f;
            int i13 = this.L;
            int i14 = this.M;
            radialProgress24.r(i13, i14, i13 + i10, i10 + i14);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ju.e():boolean");
    }

    public final CharSequence f() {
        int i10;
        if (this.f16444y) {
            i10 = 2131753933;
        } else {
            i10 = 2131753948;
        }
        String L0 = cd.L0(i10, null);
        if (h() && !this.T.b()) {
            return TextUtils.concat(L0, ", ", cd.L0(2131745280, null));
        }
        return L0;
    }

    public final boolean g(float f7, float f10) {
        int i10 = this.F;
        if (f7 >= i10 && f7 <= i10 + this.H) {
            int i11 = this.G;
            if (f10 >= i11 && f10 <= i11 + this.I) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int getObserverTag() {
        return this.O;
    }

    public final boolean h() {
        TL_iv.PageBlock pageBlock = this.f16436b;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
        }
        return false;
    }

    @Override
    public final void i(long j10, long j11) {
        float f7;
        RadialProgress2 radialProgress2 = this.f16438f;
        if (radialProgress2 != null) {
            if (j11 <= 0) {
                f7 = 0.0f;
            } else {
                f7 = ((float) j10) / ((float) j11);
            }
            radialProgress2.p(true, Math.min(1.0f, f7));
        }
        if (this.K != 1) {
            m(this.S, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            qv qvVar = this.T;
            if (!qvVar.f17632b && qvVar.f17634f == null) {
                ImageReceiver imageReceiver = this.f16437c;
                float f7 = imageReceiver.M0;
                float f10 = imageReceiver.N0;
                qvVar.c(view, (f7 / 2.0f) + imageReceiver.K0, (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                return true;
            }
        }
        vv vvVar = this.f16435a;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        if (l1Var != null) {
            l1Var.W1(vvVar.E, this.f16436b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r12, android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ju.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void l(int i10, int i11, int i12, int i13) {
        boolean z10;
        this.F = i10;
        this.G = i11;
        this.H = i12;
        this.I = i13;
        this.f16437c.y0(i10, i11, i12, i13);
        int i14 = this.N;
        int u10 = i0.a.u(i12, i14, 2, i10);
        this.L = u10;
        int u11 = i0.a.u(i13, i14, 2, i11);
        this.M = u11;
        RadialProgress2 radialProgress2 = this.f16438f;
        if (radialProgress2 != null) {
            radialProgress2.r(u10, u11, u10 + i14, i14 + u11);
        }
        boolean z11 = true;
        vv vvVar = this.f16435a;
        TLRPC.Document document = this.f16441s;
        if (document == null ? (b6.q(vvVar.f18986a).m() & 1) != 0 : !(this.f16444y && (!a() || !b6.q(vvVar.f18986a).c(4, document.size)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.J = z10;
        if (!z10 && !e()) {
            z11 = false;
        }
        b(z11);
    }

    public final void m(View view, boolean z10) {
        String str;
        boolean z11;
        if (view == null) {
            view = this.S;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.f16439n;
        if (photoSize != null) {
            str = b8.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f16441s;
            if (document != null) {
                str = b8.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.K = -1;
            RadialProgress2 radialProgress2 = this.f16438f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f16437c;
        org.telegram.ui.Components.s5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean e = e();
        boolean z12 = this.D;
        boolean z13 = this.f16444y;
        vv vvVar = this.f16435a;
        if (!e && (!z13 || !z11)) {
            b6.q(vvVar.f18986a).a(str, null, this);
            float f7 = 0.0f;
            if (!this.J && !this.R && !b8.G(vvVar.f18986a).T(str)) {
                if (z12) {
                    this.K = 3;
                    RadialProgress2 radialProgress22 = this.f16438f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z10);
                    }
                } else {
                    this.K = 0;
                    RadialProgress2 radialProgress23 = this.f16438f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z10);
                    }
                }
            } else {
                this.K = 1;
                Float w9 = hc.D().w(str);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f16438f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress25 = this.f16438f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f7);
            }
        } else {
            b6.q(vvVar.f18986a).v(this);
            if (z12 && !z11) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f16438f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (z13 && !z11 && !a() && !this.R) {
                this.K = 2;
                RadialProgress2 radialProgress27 = this.f16438f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z10);
                }
            } else {
                this.K = -1;
                RadialProgress2 radialProgress28 = this.f16438f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z10);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public ju(vv vvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f7;
        int i10;
        this.f16437c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new qv();
        this.f16435a = vvVar;
        this.f16436b = pageblockvideo;
        this.h = null;
        this.f16439n = null;
        this.f16440r = null;
        TLRPC.Document s10 = vvVar.s(pageblockvideo.video_id);
        this.f16441s = s10;
        boolean K4 = jj.K4(s10);
        this.D = K4;
        this.f16444y = K4 || jj.s3(s10, false);
        if (s10 != null) {
            this.f16442w = b8.w(s10.thumbs, 320, false, null, true);
            this.f16443x = b8.R(s10.thumbs);
        } else {
            this.f16442w = null;
            this.f16443x = null;
        }
        if (s10 != null) {
            for (int i11 = 0; i11 < this.f16441s.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = this.f16441s.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i10 = documentAttribute.h) > 0) {
                    f7 = documentAttribute.f19800w / i10;
                    break;
                }
            }
        }
        f7 = 1.0f;
        this.E = f7;
        this.O = b6.q(vvVar.f18986a).k();
        ImageReceiver imageReceiver = this.f16437c;
        imageReceiver.f14424z1 = true;
        this.d.f14424z1 = true;
        imageReceiver.f14382g1 = new iu(this);
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
