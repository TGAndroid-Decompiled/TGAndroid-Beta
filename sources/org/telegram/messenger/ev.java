package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ev extends ru {
    public final TL_iv.pageBlockVideo f22259q0;
    public final TLRPC.Document f22260r0;
    public final TLRPC.PhotoSize f22261s0;
    public final TLRPC.TL_photoStrippedSize f22262t0;
    public final boolean f22263u0;
    public final boolean f22264v0;

    public ev(kv kvVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z9) {
        super(kvVar, rect, i7, z9);
        boolean z10;
        int i10;
        int i11;
        this.f22259q0 = pageblockvideo;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.f22260r0 = s5;
        boolean L4 = ij.L4(s5);
        this.f22264v0 = L4;
        int i12 = 0;
        if (!L4 && !ij.t3(s5, false)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22263u0 = z10;
        if (s5 != null) {
            this.f22261s0 = w7.w(s5.thumbs, 320, false, null, true);
            this.f22262t0 = w7.Q(s5.thumbs);
        } else {
            this.f22261s0 = null;
            this.f22262t0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 < this.f22260r0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f22260r0.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i11 = documentAttribute.f26960w;
                        i10 = documentAttribute.h;
                        break;
                    }
                    i12++;
                } else {
                    i10 = 100;
                    i11 = 100;
                    break;
                }
            }
            if (i11 <= 0 || i10 <= 0) {
                TLRPC.PhotoSize photoSize = this.f22261s0;
                if (photoSize != null) {
                    i11 = photoSize.f26978w;
                } else {
                    i11 = 100;
                }
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.f22452c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.f22544q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.f25338b0 = i13;
        this.f25339c0 = max;
        m0();
    }

    @Override
    public final boolean i0() {
        if (this.f22264v0) {
            int i7 = iz.f23364a;
            return rc.e(1024);
        }
        int i10 = iz.f23364a;
        return rc.e(2048);
    }

    @Override
    public final void j0(boolean z9) {
        hc hcVar;
        TLRPC.Document document = this.f22260r0;
        if (document == null) {
            return;
        }
        hc hcVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f22262t0;
        if (tL_photoStrippedSize != null) {
            hcVar = hc.c(tL_photoStrippedSize, document);
        } else {
            hcVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f22261s0;
        if (photoSize != null) {
            hcVar2 = hc.c(photoSize, document);
        }
        hc hcVar3 = hcVar2;
        kv kvVar = this.f22450a;
        ImageReceiver imageReceiver = this.X;
        if (z9 && this.f22263u0 && (i0() || this.f25348l0)) {
            imageReceiver.f21217t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(hc.b(document), "g", hcVar3, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23764b, 1);
            return;
        }
        imageReceiver.u0(null, null, hcVar3, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23764b, 1);
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f22260r0;
        if (document == null) {
            return false;
        }
        if (!this.f22263u0) {
            return true;
        }
        if (!i0() || !z5.q(this.f22450a.f23763a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        TLRPC.Document document = this.f22260r0;
        if (document != null) {
            kv kvVar = this.f22450a;
            w7.G(kvVar.f23763a);
            File I = w7.I(document);
            w7.G(kvVar.f23763a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f22259q0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f22260r0);
    }

    @Override
    public final boolean p0() {
        return this.f22263u0;
    }

    @Override
    public final boolean q0() {
        return this.f22264v0;
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f22259q0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
