package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pv extends cv {
    public final TL_iv.pageBlockVideo f17482q0;
    public final TLRPC.Document f17483r0;
    public final TLRPC.PhotoSize f17484s0;
    public final TLRPC.TL_photoStrippedSize f17485t0;
    public final boolean f17486u0;
    public final boolean f17487v0;

    public pv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(vvVar, rect, i10, z10);
        boolean z11;
        int i11;
        int i12;
        this.f17482q0 = pageblockvideo;
        TLRPC.Document s10 = vvVar.s(pageblockvideo.video_id);
        this.f17483r0 = s10;
        boolean K4 = jj.K4(s10);
        this.f17487v0 = K4;
        int i13 = 0;
        if (!K4 && !jj.s3(s10, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f17486u0 = z11;
        if (s10 != null) {
            this.f17484s0 = b8.w(s10.thumbs, 320, false, null, true);
            this.f17485t0 = b8.R(s10.thumbs);
        } else {
            this.f17484s0 = null;
            this.f17485t0 = null;
        }
        if (s10 != null) {
            while (true) {
                if (i13 < this.f17483r0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f17483r0.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i12 = documentAttribute.f19800w;
                        i11 = documentAttribute.h;
                        break;
                    }
                    i13++;
                } else {
                    i11 = 100;
                    i12 = 100;
                    break;
                }
            }
            if (i12 <= 0 || i11 <= 0) {
                TLRPC.PhotoSize photoSize = this.f17484s0;
                if (photoSize != null) {
                    i12 = photoSize.f19818w;
                } else {
                    i12 = 100;
                }
                i11 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i12;
        } else {
            i11 = 100;
        }
        int i14 = this.f17623c;
        int max = (int) ((i14 / Math.max(1, r4)) * i11);
        Point point = i0.f16026q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i14 = (int) ((max2 / Math.max(1, i11)) * r4);
            max = max2;
        }
        this.f15079b0 = i14;
        this.f15080c0 = max;
        l0();
    }

    @Override
    public final boolean h0() {
        if (this.f17487v0) {
            int i10 = tz.f18131a;
            return sc.e(1024);
        }
        int i11 = tz.f18131a;
        return sc.e(2048);
    }

    @Override
    public final void i0(boolean z10) {
        ic icVar;
        TLRPC.Document document = this.f17483r0;
        if (document == null) {
            return;
        }
        ic icVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f17485t0;
        if (tL_photoStrippedSize != null) {
            icVar = ic.c(tL_photoStrippedSize, document);
        } else {
            icVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f17484s0;
        if (photoSize != null) {
            icVar2 = ic.c(photoSize, document);
        }
        ic icVar3 = icVar2;
        vv vvVar = this.f17621a;
        ImageReceiver imageReceiver = this.X;
        if (z10 && this.f17486u0 && (h0() || this.f15089l0)) {
            imageReceiver.f14408t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(ic.b(document), "g", icVar3, null, icVar, "b1", null, document.size, "mp4", vvVar.f18987b, 1);
            return;
        }
        imageReceiver.u0(null, null, icVar3, null, icVar, "b1", null, document.size, "mp4", vvVar.f18987b, 1);
    }

    @Override
    public final boolean j0() {
        TLRPC.Document document = this.f17483r0;
        if (document == null) {
            return false;
        }
        if (!this.f17486u0) {
            return true;
        }
        if (!h0() || !b6.q(this.f17621a.f18986a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f17483r0;
        if (document != null) {
            vv vvVar = this.f17621a;
            b8.G(vvVar.f18986a);
            File I = b8.I(document);
            b8.G(vvVar.f18986a);
            File K = b8.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K == null || !K.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock m0() {
        return this.f17482q0;
    }

    @Override
    public final String n0() {
        return b8.r(null, this.f17483r0);
    }

    @Override
    public final boolean o0() {
        return this.f17486u0;
    }

    @Override
    public final boolean p0() {
        return this.f17487v0;
    }

    @Override
    public final boolean q0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f17482q0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
