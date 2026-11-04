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
public final class qt implements x5 {
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
    public final xu U;
    public final cv f24950a;
    public final TL_iv.PageBlock f24951b;
    public final ImageReceiver f24952c;
    public final ImageReceiver d;
    public Bitmap f24953e;
    public RadialProgress2 f24954f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f24955n;
    public final TLRPC.TL_photoStrippedSize f24956r;
    public final TLRPC.Document f24957s;
    public final TLRPC.PhotoSize f24958w;
    public final TLRPC.TL_photoStrippedSize f24959x;
    public final boolean f24960y;

    public qt(cv cvVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i3;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f24952c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new xu();
        this.f24950a = cvVar;
        this.f24951b = pageblockphoto;
        TLRPC.Photo v = cvVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f24955n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f24956r = w7.R(v.sizes);
        } else {
            this.f24955n = null;
            this.f24956r = null;
        }
        this.f24957s = null;
        this.f24958w = null;
        this.f24959x = null;
        this.f24960y = false;
        this.E = false;
        TLRPC.PhotoSize photoSize = this.f24955n;
        this.F = (photoSize == null || (i3 = photoSize.h) <= 0) ? 1.0f : photoSize.f27026w / i3;
        this.P = z5.q(cvVar.f22065a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }

    @Override
    public final void C(boolean z10) {
        m(this.T, false);
    }

    @Override
    public final void M(String str) {
        RadialProgress2 radialProgress2 = this.f24954f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f24960y && (a() || this.S)) {
            b(true);
        }
        m(this.T, true);
    }

    public final boolean a() {
        if (this.E) {
            int i3 = az.f21612a;
            return lc.e(1024);
        }
        int i10 = az.f21612a;
        return lc.e(2048);
    }

    public final void b(boolean z10) {
        ac acVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f24952c;
        ac acVar2 = null;
        cv cvVar = this.f24950a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f24955n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f24956r;
            if (tL_photoStrippedSize != null) {
                acVar2 = ac.i(tL_photoStrippedSize, photo);
            }
            ac acVar3 = acVar2;
            if (z10) {
                imageReceiver.u0(null, null, ac.i(photoSize, photo), null, acVar3, "b1", null, photoSize.size, null, cvVar.f22066b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, acVar3, "b1", null, photoSize.size, null, cvVar.f22066b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f24957s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f24959x;
            if (tL_photoStrippedSize2 != null) {
                acVar = ac.c(tL_photoStrippedSize2, document);
            } else {
                acVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f24958w;
            if (photoSize2 != null) {
                acVar2 = ac.c(photoSize2, document);
            }
            if (z10 && this.f24960y && (a() || this.S)) {
                imageReceiver.f21272u0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(ac.b(document), "g", acVar2, null, acVar, "b1", null, document.size, "mp4", cvVar.f22066b, 1);
                return;
            }
            imageReceiver.u0(null, null, acVar2, null, acVar, "b1", null, document.size, "mp4", cvVar.f22066b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n4;
        ImageReceiver imageReceiver = this.f24952c;
        yh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            xu xuVar = this.U;
            if (!xuVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n4 = imageReceiver.n()) != null && !n4.isRecycled() && (n4 != this.f24953e || imageReceiver2.n() == null)) {
                    this.f24953e = n4;
                    imageReceiver2.v0(Utilities.D(n4, false));
                    if (V == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        V = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.f21261p1 = V;
                }
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                float f13 = imageReceiver.O0;
                if (f12 > 0.0f && f13 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f10, f11, f10 + f12, f11 + f13);
                    xuVar.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.y0(f10, f11, f12, f13);
                        imageReceiver2.setAlpha(imageReceiver.f21249i1);
                        imageReceiver2.h(canvas, null);
                    }
                    cv cvVar = this.f24950a;
                    View view = cvVar.Q;
                    if (view != null) {
                        yh.e eVar2 = cvVar.R;
                        if (eVar2 != null && eVar2.f59502i) {
                            cvVar.R = null;
                        }
                        if (cvVar.R == null) {
                            cvVar.R = yh.e.e(view);
                        }
                        eVar = cvVar.R;
                    }
                    if (eVar != null) {
                        canvas.translate(f10, f11);
                        eVar.c(canvas, this.T, Math.round(f12), Math.round(f13), imageReceiver.f21249i1, false);
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
        RadialProgress2 radialProgress2 = this.f24954f;
        if (radialProgress2 != null && this.L != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f24954f;
        int i3 = this.O;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f24954f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f24954f;
            int i10 = this.M;
            int i11 = this.N;
            radialProgress23.r(i10, i11, i10 + i3, i3 + i11);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f24954f;
            int i12 = this.M;
            int i13 = this.N;
            radialProgress24.r(i12, i13, i12 + i3, i3 + i13);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qt.e():boolean");
    }

    public final CharSequence f() {
        int i3;
        if (this.f24960y) {
            i3 = 2131753933;
        } else {
            i3 = 2131753948;
        }
        String M0 = bd.M0(i3, null);
        if (h() && !this.U.b()) {
            return TextUtils.concat(M0, ", ", bd.M0(2131745272, null));
        }
        return M0;
    }

    public final boolean g(float f10, float f11) {
        int i3 = this.G;
        if (f10 >= i3 && f10 <= i3 + this.I) {
            int i10 = this.H;
            if (f11 >= i10 && f11 <= i10 + this.J) {
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
        TL_iv.PageBlock pageBlock = this.f24951b;
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
        float f10;
        RadialProgress2 radialProgress2 = this.f24954f;
        if (radialProgress2 != null) {
            if (j11 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j10) / ((float) j11);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.L != 1) {
            m(this.T, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            xu xuVar = this.U;
            if (!xuVar.f26446b && xuVar.f26449f == null) {
                ImageReceiver imageReceiver = this.f24952c;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                xuVar.c(view, (f10 / 2.0f) + imageReceiver.L0, (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        cv cvVar = this.f24950a;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        if (l1Var != null) {
            l1Var.e2(cvVar.E, this.f24951b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r12, android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qt.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void l(int i3, int i10, int i11, int i12) {
        boolean z10;
        this.G = i3;
        this.H = i10;
        this.I = i11;
        this.J = i12;
        this.f24952c.y0(i3, i10, i11, i12);
        int i13 = this.O;
        int e10 = k2.p1.e(i11, i13, 2, i3);
        this.M = e10;
        int e11 = k2.p1.e(i12, i13, 2, i10);
        this.N = e11;
        RadialProgress2 radialProgress2 = this.f24954f;
        if (radialProgress2 != null) {
            radialProgress2.r(e10, e11, e10 + i13, i13 + e11);
        }
        boolean z11 = true;
        cv cvVar = this.f24950a;
        TLRPC.Document document = this.f24957s;
        if (document == null ? (z5.q(cvVar.f22065a).m() & 1) != 0 : !(this.f24960y && (!a() || !z5.q(cvVar.f22065a).c(4, document.size)))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K = z10;
        if (!z10 && !e()) {
            z11 = false;
        }
        b(z11);
    }

    public final void m(View view, boolean z10) {
        String str;
        boolean z11;
        if (view == null) {
            view = this.T;
        }
        d(view);
        TLRPC.PhotoSize photoSize = this.f24955n;
        if (photoSize != null) {
            str = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f24957s;
            if (document != null) {
                str = w7.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.L = -1;
            RadialProgress2 radialProgress2 = this.f24954f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f24952c;
        org.telegram.ui.Components.t5 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean e10 = e();
        boolean z12 = this.E;
        boolean z13 = this.f24960y;
        cv cvVar = this.f24950a;
        if (!e10 && (!z13 || !z11)) {
            z5.q(cvVar.f22065a).a(str, null, this);
            float f10 = 0.0f;
            if (!this.K && !this.S && !w7.G(cvVar.f22065a).T(str)) {
                if (z12) {
                    this.L = 3;
                    RadialProgress2 radialProgress22 = this.f24954f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z10);
                    }
                } else {
                    this.L = 0;
                    RadialProgress2 radialProgress23 = this.f24954f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z10);
                    }
                }
            } else {
                this.L = 1;
                Float w10 = zb.D().w(str);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f24954f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress25 = this.f24954f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f10);
            }
        } else {
            z5.q(cvVar.f22065a).v(this);
            if (z12 && !z11) {
                this.L = 3;
                RadialProgress2 radialProgress26 = this.f24954f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (z13 && !z11 && !a() && !this.S) {
                this.L = 2;
                RadialProgress2 radialProgress27 = this.f24954f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z10);
                }
            } else {
                this.L = -1;
                RadialProgress2 radialProgress28 = this.f24954f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z10);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public qt(cv cvVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i3;
        this.f24952c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new xu();
        this.f24950a = cvVar;
        this.f24951b = pageblockvideo;
        this.h = null;
        this.f24955n = null;
        this.f24956r = null;
        TLRPC.Document s6 = cvVar.s(pageblockvideo.video_id);
        this.f24957s = s6;
        boolean L4 = zi.L4(s6);
        this.E = L4;
        this.f24960y = L4 || zi.t3(s6, false);
        if (s6 != null) {
            this.f24958w = w7.w(s6.thumbs, 320, false, null, true);
            this.f24959x = w7.R(s6.thumbs);
        } else {
            this.f24958w = null;
            this.f24959x = null;
        }
        if (s6 != null) {
            for (int i10 = 0; i10 < this.f24957s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.f24957s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i3 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.f27008w / i3;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.F = f10;
        this.P = z5.q(cvVar.f22065a).k();
        ImageReceiver imageReceiver = this.f24952c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.f21247h1 = new pt(this);
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
