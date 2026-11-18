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
public final class st implements y5 {
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
    public final zu U;
    public final ev f26848a;
    public final TL_iv.PageBlock f26849b;
    public final ImageReceiver f26850c;
    public final ImageReceiver d;
    public Bitmap f26851e;
    public RadialProgress2 f26852f;
    public final TLRPC.Photo h;
    public final TLRPC.PhotoSize f26853n;
    public final TLRPC.TL_photoStrippedSize f26854r;
    public final TLRPC.Document f26855s;
    public final TLRPC.PhotoSize f26856w;
    public final TLRPC.TL_photoStrippedSize f26857x;
    public final boolean f26858y;

    public st(ev evVar, TL_iv.pageBlockPhoto pageblockphoto) {
        int i7;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f26850c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.d = imageReceiver2;
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new zu();
        this.f26848a = evVar;
        this.f26849b = pageblockphoto;
        TLRPC.Photo v = evVar.v(pageblockphoto.photo_id);
        this.h = v;
        if (v != null) {
            this.f26853n = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f26854r = w7.Q(v.sizes);
        } else {
            this.f26853n = null;
            this.f26854r = null;
        }
        this.f26855s = null;
        this.f26856w = null;
        this.f26857x = null;
        this.f26858y = false;
        this.E = false;
        TLRPC.PhotoSize photoSize = this.f26853n;
        this.F = (photoSize == null || (i7 = photoSize.h) <= 0) ? 1.0f : photoSize.f28428w / i7;
        this.P = a6.q(evVar.f23767a).k();
        imageReceiver.A1 = true;
        imageReceiver2.A1 = true;
    }

    @Override
    public final void C(boolean z10) {
        m(this.T, false);
    }

    @Override
    public final void N(String str) {
        RadialProgress2 radialProgress2 = this.f26852f;
        if (radialProgress2 != null) {
            radialProgress2.p(true, 1.0f);
        }
        if (this.f26858y && (a() || this.S)) {
            b(true);
        }
        m(this.T, true);
    }

    public final boolean a() {
        if (this.E) {
            int i7 = bz.f23145a;
            return pc.e(1024);
        }
        int i10 = bz.f23145a;
        return pc.e(2048);
    }

    public final void b(boolean z10) {
        fc fcVar;
        TLRPC.PhotoSize photoSize;
        ImageReceiver imageReceiver = this.f26850c;
        fc fcVar2 = null;
        ev evVar = this.f26848a;
        TLRPC.Photo photo = this.h;
        if (photo != null && (photoSize = this.f26853n) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26854r;
            if (tL_photoStrippedSize != null) {
                fcVar2 = fc.i(tL_photoStrippedSize, photo);
            }
            fc fcVar3 = fcVar2;
            imageReceiver.O = fc.i(photoSize, photo);
            if (z10) {
                imageReceiver.u0(null, null, fc.i(photoSize, photo), null, fcVar3, "b1", null, photoSize.size, null, evVar.f23768b, 1);
                return;
            } else {
                imageReceiver.u0(null, null, null, null, fcVar3, "b1", null, photoSize.size, null, evVar.f23768b, 1);
                return;
            }
        }
        TLRPC.Document document = this.f26855s;
        if (document != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize2 = this.f26857x;
            if (tL_photoStrippedSize2 != null) {
                fcVar = fc.c(tL_photoStrippedSize2, document);
            } else {
                fcVar = null;
            }
            TLRPC.PhotoSize photoSize2 = this.f26856w;
            if (photoSize2 != null) {
                fcVar2 = fc.c(photoSize2, document);
            }
            imageReceiver.O = fc.b(document);
            if (z10 && this.f26858y && (a() || this.S)) {
                imageReceiver.f22664u0 = true;
                imageReceiver.W(1);
                imageReceiver.u0(fc.b(document), "g", fcVar2, null, fcVar, "b1", null, document.size, "mp4", evVar.f23768b, 1);
                return;
            }
            imageReceiver.u0(null, null, fcVar2, null, fcVar, "b1", null, document.size, "mp4", evVar.f23768b, 1);
        }
    }

    public final void c(Canvas canvas) {
        Bitmap n10;
        ImageReceiver imageReceiver = this.f26850c;
        xh.e eVar = null;
        imageReceiver.h(canvas, null);
        if (h()) {
            zu zuVar = this.U;
            if (!zuVar.b()) {
                ImageReceiver imageReceiver2 = this.d;
                if ((imageReceiver2.n() == null || imageReceiver.m() == null) && (n10 = imageReceiver.n()) != null && !n10.isRecycled() && (n10 != this.f26851e || imageReceiver2.n() == null)) {
                    this.f26851e = n10;
                    imageReceiver2.v0(Utilities.D(n10, false));
                    if (V == null) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        g0.n2(colorMatrix, 0.9f);
                        g0.i(colorMatrix, 0.6f);
                        V = new ColorMatrixColorFilter(colorMatrix);
                    }
                    imageReceiver2.f22653p1 = V;
                }
                float f10 = imageReceiver.L0;
                float f11 = imageReceiver.M0;
                float f12 = imageReceiver.N0;
                float f13 = imageReceiver.O0;
                if (f12 > 0.0f && f13 > 0.0f) {
                    canvas.save();
                    canvas.clipRect(f10, f11, f10 + f12, f11 + f13);
                    zuVar.a(canvas);
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.y0(f10, f11, f12, f13);
                        imageReceiver2.setAlpha(imageReceiver.f22641i1);
                        imageReceiver2.h(canvas, null);
                    }
                    ev evVar = this.f26848a;
                    View view = evVar.Q;
                    if (view != null) {
                        xh.e eVar2 = evVar.R;
                        if (eVar2 != null && eVar2.f60542i) {
                            evVar.R = null;
                        }
                        if (evVar.R == null) {
                            evVar.R = xh.e.e(view);
                        }
                        eVar = evVar.R;
                    }
                    if (eVar != null) {
                        canvas.translate(f10, f11);
                        eVar.c(canvas, this.T, Math.round(f12), Math.round(f13), imageReceiver.f22641i1, false);
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
        RadialProgress2 radialProgress2 = this.f26852f;
        if (radialProgress2 != null && this.L != -1) {
            radialProgress2.draw(canvas);
        }
    }

    public final void d(View view) {
        RadialProgress2 radialProgress2 = this.f26852f;
        int i7 = this.O;
        if (radialProgress2 == null && view != null) {
            RadialProgress2 radialProgress22 = new RadialProgress2(view, null);
            this.f26852f = radialProgress22;
            radialProgress22.d = -1;
            radialProgress22.setColors(1711276032, 2130706432, -1, -2500135);
            RadialProgress2 radialProgress23 = this.f26852f;
            int i10 = this.M;
            int i11 = this.N;
            radialProgress23.r(i10, i11, i10 + i7, i7 + i11);
        } else if (radialProgress2 != null && view != null) {
            radialProgress2.n(view);
            RadialProgress2 radialProgress24 = this.f26852f;
            int i12 = this.M;
            int i13 = this.N;
            radialProgress24.r(i12, i13, i12 + i7, i7 + i13);
        }
    }

    public final boolean e() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.st.e():boolean");
    }

    public final CharSequence f() {
        int i7;
        if (this.f26858y) {
            i7 = 2131753931;
        } else {
            i7 = 2131753946;
        }
        String M0 = gd.M0(i7, null);
        if (h() && !this.U.b()) {
            return TextUtils.concat(M0, ", ", gd.M0(2131745027, null));
        }
        return M0;
    }

    public final boolean g(float f10, float f11) {
        int i7 = this.G;
        if (f10 >= i7 && f10 <= i7 + this.I) {
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
        TL_iv.PageBlock pageBlock = this.f26849b;
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            return ((TL_iv.pageBlockPhoto) pageBlock).spoiler;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return ((TL_iv.pageBlockVideo) pageBlock).spoiler;
        }
        return false;
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        RadialProgress2 radialProgress2 = this.f26852f;
        if (radialProgress2 != null) {
            if (j10 <= 0) {
                f10 = 0.0f;
            } else {
                f10 = ((float) j3) / ((float) j10);
            }
            radialProgress2.p(true, Math.min(1.0f, f10));
        }
        if (this.L != 1) {
            m(this.T, true);
        }
    }

    public final boolean j(View view) {
        if (h()) {
            zu zuVar = this.U;
            if (!zuVar.f28361b && zuVar.f28364f == null) {
                ImageReceiver imageReceiver = this.f26850c;
                float f10 = imageReceiver.N0;
                float f11 = imageReceiver.O0;
                zuVar.c(view, (f10 / 2.0f) + imageReceiver.L0, (f11 / 2.0f) + imageReceiver.M0, f10, f11);
                return true;
            }
        }
        ev evVar = this.f26848a;
        org.telegram.ui.Cells.m1 m1Var = evVar.F;
        if (m1Var != null) {
            m1Var.p2(evVar.E, this.f26849b);
            return true;
        }
        return false;
    }

    public final boolean k(android.view.View r12, android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.st.k(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void l(int i7, int i10, int i11, int i12) {
        boolean z10;
        this.G = i7;
        this.H = i10;
        this.I = i11;
        this.J = i12;
        this.f26850c.y0(i7, i10, i11, i12);
        int i13 = this.O;
        int e10 = i5.c.e(i11, i13, 2, i7);
        this.M = e10;
        int e11 = i5.c.e(i12, i13, 2, i10);
        this.N = e11;
        RadialProgress2 radialProgress2 = this.f26852f;
        if (radialProgress2 != null) {
            radialProgress2.r(e10, e11, e10 + i13, i13 + e11);
        }
        boolean z11 = true;
        ev evVar = this.f26848a;
        TLRPC.Document document = this.f26855s;
        if (document == null ? (a6.q(evVar.f23767a).m() & 1) != 0 : !(this.f26858y && (!a() || !a6.q(evVar.f23767a).c(4, document.size)))) {
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
        TLRPC.PhotoSize photoSize = this.f26853n;
        if (photoSize != null) {
            str = w7.r(null, photoSize);
        } else {
            TLRPC.Document document = this.f26855s;
            if (document != null) {
                str = w7.r(null, document);
            } else {
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.L = -1;
            RadialProgress2 radialProgress2 = this.f26852f;
            if (radialProgress2 != null) {
                radialProgress2.setIcon(4, false, false);
                return;
            }
            return;
        }
        ImageReceiver imageReceiver = this.f26850c;
        org.telegram.ui.Components.b6 m10 = imageReceiver.m();
        if (m10 != null && (m10.s() || imageReceiver.M())) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean e10 = e();
        boolean z12 = this.E;
        boolean z13 = this.f26858y;
        ev evVar = this.f26848a;
        if (!e10 && (!z13 || !z11)) {
            a6.q(evVar.f23767a).a(str, null, this);
            float f10 = 0.0f;
            if (!this.K && !this.S && !w7.G(evVar.f23767a).S(str)) {
                if (z12) {
                    this.L = 3;
                    RadialProgress2 radialProgress22 = this.f26852f;
                    if (radialProgress22 != null) {
                        radialProgress22.setIcon(0, true, z10);
                    }
                } else {
                    this.L = 0;
                    RadialProgress2 radialProgress23 = this.f26852f;
                    if (radialProgress23 != null) {
                        radialProgress23.setIcon(2, true, z10);
                    }
                }
            } else {
                this.L = 1;
                Float w10 = ec.D().w(str);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                RadialProgress2 radialProgress24 = this.f26852f;
                if (radialProgress24 != null) {
                    radialProgress24.setIcon(3, true, z10);
                }
            }
            RadialProgress2 radialProgress25 = this.f26852f;
            if (radialProgress25 != null) {
                radialProgress25.p(false, f10);
            }
        } else {
            a6.q(evVar.f23767a).v(this);
            if (z12 && !z11) {
                this.L = 3;
                RadialProgress2 radialProgress26 = this.f26852f;
                if (radialProgress26 != null) {
                    radialProgress26.setIcon(0, false, z10);
                }
            } else if (z13 && !z11 && !a() && !this.S) {
                this.L = 2;
                RadialProgress2 radialProgress27 = this.f26852f;
                if (radialProgress27 != null) {
                    radialProgress27.setIcon(8, false, z10);
                }
            } else {
                this.L = -1;
                RadialProgress2 radialProgress28 = this.f26852f;
                if (radialProgress28 != null) {
                    radialProgress28.setIcon(4, false, z10);
                }
            }
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public st(ev evVar, TL_iv.pageBlockVideo pageblockvideo) {
        float f10;
        int i7;
        this.f26850c = new ImageReceiver(null);
        this.d = new ImageReceiver(null);
        this.L = -1;
        this.O = g0.L(48.0f);
        this.U = new zu();
        this.f26848a = evVar;
        this.f26849b = pageblockvideo;
        this.h = null;
        this.f26853n = null;
        this.f26854r = null;
        TLRPC.Document s5 = evVar.s(pageblockvideo.video_id);
        this.f26855s = s5;
        boolean K4 = fj.K4(s5);
        this.E = K4;
        this.f26858y = K4 || fj.s3(s5, false);
        if (s5 != null) {
            this.f26856w = w7.w(s5.thumbs, 320, false, null, true);
            this.f26857x = w7.Q(s5.thumbs);
        } else {
            this.f26856w = null;
            this.f26857x = null;
        }
        if (s5 != null) {
            for (int i10 = 0; i10 < this.f26855s.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = this.f26855s.attributes.get(i10);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && (i7 = documentAttribute.h) > 0) {
                    f10 = documentAttribute.f28410w / i7;
                    break;
                }
            }
        }
        f10 = 1.0f;
        this.F = f10;
        this.P = a6.q(evVar.f23767a).k();
        ImageReceiver imageReceiver = this.f26850c;
        imageReceiver.A1 = true;
        this.d.A1 = true;
        imageReceiver.f22639h1 = new rt(this);
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
