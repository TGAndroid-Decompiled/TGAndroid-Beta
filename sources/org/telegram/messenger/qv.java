package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qv extends dv {
    public final TL_iv.pageBlockVideo f17817q0;
    public final TLRPC.Document f17818r0;
    public final TLRPC.PhotoSize f17819s0;
    public final TLRPC.TL_photoStrippedSize f17820t0;
    public final boolean f17821u0;
    public final boolean f17822v0;

    public qv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(wvVar, rect, i10, z10);
        boolean z11;
        int i11;
        int i12;
        this.f17817q0 = pageblockvideo;
        TLRPC.Document s10 = wvVar.s(pageblockvideo.video_id);
        this.f17818r0 = s10;
        boolean K4 = kj.K4(s10);
        this.f17822v0 = K4;
        int i13 = 0;
        if (!K4 && !kj.s3(s10, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f17821u0 = z11;
        if (s10 != null) {
            this.f17819s0 = b8.w(s10.thumbs, 320, false, null, true);
            this.f17820t0 = b8.R(s10.thumbs);
        } else {
            this.f17819s0 = null;
            this.f17820t0 = null;
        }
        if (s10 != null) {
            while (true) {
                if (i13 < this.f17818r0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f17818r0.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i12 = documentAttribute.f19801w;
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
                TLRPC.PhotoSize photoSize = this.f17819s0;
                if (photoSize != null) {
                    i12 = photoSize.f19819w;
                } else {
                    i12 = 100;
                }
                i11 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i12;
        } else {
            i11 = 100;
        }
        int i14 = this.f17969c;
        int max = (int) ((i14 / Math.max(1, r4)) * i11);
        Point point = i0.f16172q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i14 = (int) ((max2 / Math.max(1, i11)) * r4);
            max = max2;
        }
        this.f15435b0 = i14;
        this.f15436c0 = max;
        l0();
    }

    @Override
    public final boolean h0() {
        if (this.f17822v0) {
            int i10 = uz.f18500a;
            return tc.e(1024);
        }
        int i11 = uz.f18500a;
        return tc.e(2048);
    }

    @Override
    public final void i0(boolean z10) {
        jc jcVar;
        TLRPC.Document document = this.f17818r0;
        if (document == null) {
            return;
        }
        jc jcVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f17820t0;
        if (tL_photoStrippedSize != null) {
            jcVar = jc.c(tL_photoStrippedSize, document);
        } else {
            jcVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f17819s0;
        if (photoSize != null) {
            jcVar2 = jc.c(photoSize, document);
        }
        jc jcVar3 = jcVar2;
        wv wvVar = this.f17967a;
        ImageReceiver imageReceiver = this.X;
        if (z10 && this.f17821u0 && (h0() || this.f15445l0)) {
            imageReceiver.f14409t0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(jc.b(document), "g", jcVar3, null, jcVar, "b1", null, document.size, "mp4", wvVar.f19330b, 1);
            return;
        }
        imageReceiver.u0(null, null, jcVar3, null, jcVar, "b1", null, document.size, "mp4", wvVar.f19330b, 1);
    }

    @Override
    public final boolean j0() {
        TLRPC.Document document = this.f17818r0;
        if (document == null) {
            return false;
        }
        if (!this.f17821u0) {
            return true;
        }
        if (!h0() || !b6.q(this.f17967a.f19329a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f17818r0;
        if (document != null) {
            wv wvVar = this.f17967a;
            b8.G(wvVar.f19329a);
            File I = b8.I(document);
            b8.G(wvVar.f19329a);
            File K = b8.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K == null || !K.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock m0() {
        return this.f17817q0;
    }

    @Override
    public final String n0() {
        return b8.r(null, this.f17818r0);
    }

    @Override
    public final boolean o0() {
        return this.f17821u0;
    }

    @Override
    public final boolean p0() {
        return this.f17822v0;
    }

    @Override
    public final boolean q0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f17817q0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
