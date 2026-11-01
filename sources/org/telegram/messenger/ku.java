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
public final class ku implements z5 {
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
    public final rv T;
    public final wv f16788a;
    public final TL_iv.PageBlock f16789b;
    public final ImageReceiver f16790c;
    public final ImageReceiver d;
    public Bitmap e;
    public RadialProgress2 f16791f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f16792n;
    public final TLRPC.TL_photoStrippedSize f16793r;
    public final TLRPC.Document f16794s;
    public final TLRPC.PhotoSize f16795w;
    public final TLRPC.TL_photoStrippedSize f16796x;
    public final boolean f16797y;

    public ku(wv wvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i10;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f16790c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new rv();
        this.f16788a = wvVar;
        this.f16789b = pageblockphoto;
        TLRPC.Photo v = wvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f16792n = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.f16793r = b8.R(v.sizes);
        } else {
            this.f16792n = null;
            this.f16793r = null;
        }
        this.f16794s = null;
        this.f16795w = null;
        this.f16796x = null;
        this.f16797y = false;
        this.D = false;
        TLRPC.PhotoSize photoSize = this.f16792n;
        this.E = (photoSize == null || (i10 = photoSize.h) <= 0) ? 1.0f : photoSize.f19819w / i10;
        this.O = b6.q(wvVar.f19329a).k();
        imageReceiver.f14425z1 = true;
        imageReceiver2.f14425z1 = true;
    }

    @Override
    public final void D(boolean z10) {
        m(this.S, false);
    }

    @Override
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.f16791f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f16797y && (a() || this.R)) {
            b(true);
        }
        m(this.S, true);
    }

    public final boolean a() {
        if (this.D) {
            int i10 = uz.f18500a;
            return tc.e(1024);
        }
        int i11 = uz.f18500a;
        return tc.e(2048);
    }

    public final void b(boolean z10) {
        jc jcVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f16790c;
        jc jcVar2 = null;
        wv wvVar = this.f16788a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f16792n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f16793r;
            if (tL_photoStrippedSize != null) {
                jcVar2 = jc.i(tL_photoStrippedSize, photo);
            }
            jc jcVar3 = jcVar2;
            if (z10) {
                imageReceiver.u0(null, null, jc.i(photoSize, photo), null, jcVar3, "b1", null, photoSize.size, null, wvVar.f19330b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, jcVar3, "b1", null, photoSize.size, null, wvVar.f19330b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f16794s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f16796x;
            if (tL_photoStrippedSize2 != null) {
                jcVar = jc.c(tL_photoStrippedSize2, document);
            } else {
                jcVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f16795w;
            if (photoSize2 != null) {
                jcVar2 = jc.c(photoSize2, document);
            }
            if (z10 && this.f16797y && (a() || this.R)) {
                imageReceiver.f14409t0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(jc.b(document), "g", jcVar2, null, jcVar, "b1", null, document.size, "mp4", wvVar.f19330b, 1);
                return;
            }
            imageReceiver.u0(null, null, jcVar2, null, jcVar, "b1", null, document.size, "mp4", wvVar.f19330b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.f16790c;
        nh.h hVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            rv rvVar = this.T;
            if (!rvVar.b()) {
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
                    imageReceiver2.f14398o1 = U;
                }
                float f7 = imageReceiver.K0;
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                if (f11 > 0.0f && f12 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f7, f10, f7 + f11, f10 + f12);
                    rvVar.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.y0(f7, f10, f11, f12);
                        imageReceiver2.setAlpha(imageReceiver.f14385h1);
                        imageReceiver2.h(canvas, null);
                    }
                    wv wvVar = this.f16788a;
                    View view = wvVar.Q;
                    if (view != null) {
                        nh.h hVar2 = wvVar.R;
                        if (hVar2 != null && hVar2.f13835i) {
                            wvVar.R = null;
                        }
                        if (wvVar.R == null) {
                            wvVar.R = nh.h.e(view);
                        }
                        hVar = wvVar.R;
                    }
                    if (hVar != null) {
                        canvas.translate(f7, f10);
                        hVar.c(canvas, this.S, Math.round(f11), Math.round(f12), imageReceiver.f14385h1, false);
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
        RadialProgress2 radialProgress2 = this.f16791f;
        if (radialProgress2 != null && this.K != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f16791f;
        int i10 = this.N;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f16791f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f16791f;
            int i11 = this.L;
            int i12 = this.M;
            radialProgress23.r(i11, i12, i11 + i10, i10 + i12);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f16791f;
            int i13 = this.L;
            int i14 = this.M;
            radialProgress24.r(i13, i14, i13 + i10, i10 + i14);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ku.e():boolean");
    }

    public final CharSequence f() {
        int i10;
        if (this.f16797y) {
            i10 = 2131753933;
        } else {
            i10 = 2131753948;
        }
        String L0 = dd.L0(i10, null);
        if (h() && !this.T.b()) {
            return TextUtils.concat(L0, ", ", dd.L0(2131745280, null));
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
        TL_iv.PageBlock pageBlock = this.f16789b;
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
        RadialProgress2 radialProgress2 = this.f16791f;
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
            rv rvVar = this.T;
            if (!rvVar.f17978b && rvVar.f17980f == null) {
                ImageReceiver imageReceiver = this.f16790c;
                float f7 = imageReceiver.M0;
                float f10 = imageReceiver.N0;
                rvVar.c(view, (f7 / 2.0f) + imageReceiver.K0, (f10 / 2.0f) + imageReceiver.L0, f7, f10);
                return true;
            }
        }
        wv wvVar = this.f16788a;
        org.telegram.ui.Cells.l1 l1Var = wvVar.F;
        if (l1Var != null) {
            l1Var.W1(wvVar.E, this.f16789b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r12, android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ku.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void l(int i10, int i11, int i12, int i13) {
        boolean z10;
        this.F = i10;
        this.G = i11;
        this.H = i12;
        this.I = i13;
        this.f16790c.y0(i10, i11, i12, i13);
        int i14 = this.N;
        int u10 = i0.a.u(i12, i14, 2, i10);
        this.L = u10;
        int u11 = i0.a.u(i13, i14, 2, i11);
        this.M = u11;
        RadialProgress2 radialProgress2 = this.f16791f;
        if (radialProgress2 != null) {
            radialProgress2.r(u10, u11, u10 + i14, i14 + u11);
        }
        boolean z11 = true;
        wv wvVar = this.f16788a;
        TLRPC.Document document = this.f16794s;
        if (document == null ? (b6.q(wvVar.f19329a).m() & 1) != 0 : !(this.f16797y && (!a() || !b6.q(wvVar.f19329a).c(4, document.size)))) {
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
        TLRPC.PhotoSize photoSize = this.f16792n;
        if (photoSize != null) {
            str = b8.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f16794s;
            if (document != null) {
                str = b8.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.K = -1;
            RadialProgress2 radialProgress2 = this.f16791f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f16790c;
        org.telegram.ui.Components.s5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean e = e();
        boolean z12 = this.D;
        boolean z13 = this.f16797y;
        wv wvVar = this.f16788a;
        if (!e && (!z13 || !z11)) {
            b6.q(wvVar.f19329a).a(str, null, this);
            float f7 = 0.0f;
            if (!this.J && !this.R && !b8.G(wvVar.f19329a).T(str)) {
                if (z12) {
                    this.K = 3;
                    RadialProgress2 radialProgress22 = this.f16791f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z10);
                    }
                } else {
                    this.K = 0;
                    RadialProgress2 radialProgress23 = this.f16791f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z10);
                    }
                }
            } else {
                this.K = 1;
                Float w9 = ic.D().w(str);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f16791f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress25 = this.f16791f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f7);
            }
        } else {
            b6.q(wvVar.f19329a).v(this);
            if (z12 && !z11) {
                this.K = 3;
                RadialProgress2 radialProgress26 = this.f16791f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (z13 && !z11 && !a() && !this.R) {
                this.K = 2;
                RadialProgress2 radialProgress27 = this.f16791f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z10);
                }
            } else {
                this.K = -1;
                RadialProgress2 radialProgress28 = this.f16791f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z10);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public ku(wv wvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f7;
        int i10;
        this.f16790c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.K = -1;
        this.N = i0.L(48.0f);
        this.T = new rv();
        this.f16788a = wvVar;
        this.f16789b = pageblockvideo;
        this.h = null;
        this.f16792n = null;
        this.f16793r = null;
        TLRPC.Document s10 = wvVar.s(pageblockvideo.video_id);
        this.f16794s = s10;
        boolean K4 = kj.K4(s10);
        this.D = K4;
        this.f16797y = K4 || kj.s3(s10, false);
        if (s10 != null) {
            this.f16795w = b8.w(s10.thumbs, 320, false, null, true);
            this.f16796x = b8.R(s10.thumbs);
        } else {
            this.f16795w = null;
            this.f16796x = null;
        }
        if (s10 != null) {
            for (int i11 = 0; i11 < this.f16794s.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = this.f16794s.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i10 = documentAttribute.h) > 0) {
                    f7 = documentAttribute.f19801w / i10;
                    break;
                }
            }
        }
        f7 = 1.0f;
        this.E = f7;
        this.O = b6.q(wvVar.f19329a).k();
        ImageReceiver imageReceiver = this.f16790c;
        imageReceiver.f14425z1 = true;
        this.d.f14425z1 = true;
        imageReceiver.f14383g1 = new ju(this);
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
