package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wu extends ju {
    public final TL_iv.pageBlockVideo f26256r0;
    public final TLRPC.Document f26257s0;
    public final TLRPC.PhotoSize f26258t0;
    public final TLRPC.TL_photoStrippedSize f26259u0;
    public final boolean f26260v0;
    public final boolean f26261w0;

    public wu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockVideo pageblockvideo, boolean z10) {
        super(cvVar, rect, i3, z10);
        boolean z11;
        int i10;
        int i11;
        this.f26256r0 = pageblockvideo;
        TLRPC.Document s6 = cvVar.s(pageblockvideo.video_id);
        this.f26257s0 = s6;
        boolean L4 = zi.L4(s6);
        this.f26261w0 = L4;
        int i12 = 0;
        if (!L4 && !zi.t3(s6, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f26260v0 = z11;
        if (s6 != null) {
            this.f26258t0 = w7.w(s6.thumbs, 320, false, null, true);
            this.f26259u0 = w7.R(s6.thumbs);
        } else {
            this.f26258t0 = null;
            this.f26259u0 = null;
        }
        if (s6 != null) {
            while (true) {
                if (i12 < this.f26257s0.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = this.f26257s0.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        i11 = documentAttribute.f27008w;
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
                TLRPC.PhotoSize photoSize = this.f26258t0;
                if (photoSize != null) {
                    i11 = photoSize.f27026w;
                } else {
                    i11 = 100;
                }
                i10 = photoSize != null ? photoSize.h : 100;
            }
            r4 = i11;
        } else {
            i10 = 100;
        }
        int i13 = this.f26436c;
        int max = (int) ((i13 / Math.max(1, r4)) * i10);
        Point point = g0.f22608q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i10)) * r4);
            max = max2;
        }
        this.f23715c0 = i13;
        this.f23716d0 = max;
        m0();
    }

    @Override
    public final boolean i0() {
        if (this.f26261w0) {
            int i3 = az.f21612a;
            return lc.e(1024);
        }
        int i10 = az.f21612a;
        return lc.e(2048);
    }

    @Override
    public final void j0(boolean z10) {
        ac acVar;
        TLRPC.Document document = this.f26257s0;
        if (document == null) {
            return;
        }
        ac acVar2 = null;
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26259u0;
        if (tL_photoStrippedSize != null) {
            acVar = ac.c(tL_photoStrippedSize, document);
        } else {
            acVar = null;
        }
        TLRPC.PhotoSize photoSize = this.f26258t0;
        if (photoSize != null) {
            acVar2 = ac.c(photoSize, document);
        }
        ac acVar3 = acVar2;
        cv cvVar = this.f26434a;
        ImageReceiver imageReceiver = this.Y;
        if (z10 && this.f26260v0 && (i0() || this.m0)) {
            imageReceiver.f21272u0 = true;
            imageReceiver.W(1);
            imageReceiver.u0(ac.b(document), "g", acVar3, null, acVar, "b1", null, document.size, "mp4", cvVar.f22066b, 1);
            return;
        }
        imageReceiver.u0(null, null, acVar3, null, acVar, "b1", null, document.size, "mp4", cvVar.f22066b, 1);
    }

    @Override
    public final boolean k0() {
        TLRPC.Document document = this.f26257s0;
        if (document == null) {
            return false;
        }
        if (!this.f26260v0) {
            return true;
        }
        if (!i0() || !z5.q(this.f26434a.f22065a).c(4, document.size)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean l0() {
        TLRPC.Document document = this.f26257s0;
        if (document != null) {
            cv cvVar = this.f26434a;
            w7.G(cvVar.f22065a);
            File I = w7.I(document);
            w7.G(cvVar.f22065a);
            File K = w7.K(document, null, true, true);
            if ((I == null || !I.exists()) && (K == null || !K.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f26256r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f26257s0);
    }

    @Override
    public final boolean p0() {
        return this.f26260v0;
    }

    @Override
    public final boolean q0() {
        return this.f26261w0;
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockVideo pageblockvideo = this.f26256r0;
        if (pageblockvideo != null && pageblockvideo.spoiler) {
            return true;
        }
        return false;
    }
}
