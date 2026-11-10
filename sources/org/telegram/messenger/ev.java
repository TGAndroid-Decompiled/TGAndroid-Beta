package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ev extends ru {
    public final TL_iv.pageBlockVideo f22282q0;
    public final TLRPC.Document f22283r0;
    public final TLRPC.PhotoSize f22284s0;
    public final TLRPC.TL_photoStrippedSize f22285t0;
    public final boolean f22286u0;
    public final boolean f22287v0;

    public ev(kv kvVar, Rect rect, int i7, TL_iv.pageBlockVideo pageblockvideo, boolean z9) {
        super(kvVar, rect, i7, z9);
        boolean z10;
        int i10;
        int i11;
        this.f22282q0 = pageblockvideo;
        TLRPC.Document s5 = kvVar.s(pageblockvideo.video_id);
        this.f22283r0 = s5;
        boolean K4 = ij.K4(s5);
        this.f22287v0 = K4;
        int i12 = 0;
        if (!K4 && !ij.s3(s5, false)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22286u0 = z10;
        if (s5 != null) {
            this.f22284s0 = w7.w(s5.thumbs, 320, false, null, true);
            this.f22285t0 = w7.Q(s5.thumbs);
        } else {
            this.f22284s0 = null;
            this.f22285t0 = null;
        }
        if (s5 != null) {
            while (true) {
                if (i12 < this.f22283r0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f22283r0.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i11 = documentAttribute.f26967w;
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
                TLRPC.PhotoSize photoSize = this.f22284s0;
                if (photoSize != null) {
                    i11 = photoSize.f26985w;
                } else {
                    i11 = 100;
                }
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.f22475c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.f22567q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.f25337b0 = i13;
        this.f25338c0 = max;
        m0();
    }

    @Override
    public final boolean i0() {
        if (this.f22287v0) {
            int i7 = iz.f23389a;
            return sc.e(1024);
        }
        int i10 = iz.f23389a;
        return sc.e(2048);
    }

    @Override
    public final void j0(boolean z9) {
        hc hcVar;
        TLRPC.Document document = this.f22283r0;
        if (document == null) {
            return;
        }
        hc hcVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f22285t0;
        if (tL_photoStrippedSize != null) {
            hcVar = hc.c(tL_photoStrippedSize, document);
        } else {
            hcVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f22284s0;
        if (photoSize != null) {
            hcVar2 = hc.c(photoSize, document);
        }
        hc hcVar3 = hcVar2;
        kv kvVar = this.f22473a;
        ImageReceiver imageReceiver = this.X;
        if (z9 && this.f22286u0 && (i0() || this.f25347l0)) {
            imageReceiver.f21225t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(hc.b(document), "g", hcVar3, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23768b, 1);
            return;
        }
        imageReceiver.u0(null, null, hcVar3, null, hcVar, "b1", null, document.size, "mp4", kvVar.f23768b, 1);
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f22283r0;
        if (document == null) {
            return false;
        }
        if (!this.f22286u0) {
            return true;
        }
        if (!i0() || !z5.q(this.f22473a.f23767a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        TLRPC.Document document = this.f22283r0;
        if (document != null) {
            kv kvVar = this.f22473a;
            w7.G(kvVar.f23767a);
            File I = w7.I(document);
            w7.G(kvVar.f23767a);
            File J = w7.J(document, null, true, true);
            if ((I == null || !I.exists()) && (J == null || !J.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f22282q0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f22283r0);
    }

    @Override
    public final boolean p0() {
        return this.f22286u0;
    }

    @Override
    public final boolean q0() {
        return this.f22287v0;
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f22282q0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
