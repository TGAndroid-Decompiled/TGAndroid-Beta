package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class su extends ru {
    public final TL_iv.pageBlockPhoto f25508q0;
    public final TLRPC.Photo f25509r0;
    public final TLRPC.PhotoSize f25510s0;
    public final TLRPC.TL_photoStrippedSize f25511t0;

    public su(kv kvVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z9) {
        super(kvVar, rect, i7, z9);
        int i10;
        this.f25508q0 = pageblockphoto;
        TLRPC.Photo v = kvVar.v(pageblockphoto.photo_id);
        this.f25509r0 = v;
        if (v != null) {
            this.f25510s0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f25511t0 = w7.R(v.sizes);
        } else {
            this.f25510s0 = null;
            this.f25511t0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f25510s0;
        if (photoSize != null) {
            i10 = photoSize.f26977w;
        } else {
            i10 = 100;
        }
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.f22445c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.f22537q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.f25330b0 = i12;
        this.f25331c0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z9) {
        TLRPC.PhotoSize photoSize;
        hc hcVar;
        TLRPC.Photo photo = this.f25509r0;
        if (photo != null && (photoSize = this.f25510s0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f25511t0;
            if (tL_photoStrippedSize != null) {
                hcVar = hc.i(tL_photoStrippedSize, photo);
            } else {
                hcVar = null;
            }
            hc hcVar2 = hcVar;
            kv kvVar = this.f22443a;
            ImageReceiver imageReceiver = this.X;
            if (z9) {
                imageReceiver.u0(null, null, hc.i(photoSize, photo), null, hcVar2, "b1", null, photoSize.size, null, kvVar.f23757b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, hcVar2, "b1", null, photoSize.size, null, kvVar.f23757b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.f25510s0;
        if (photoSize != null) {
            kv kvVar = this.f22443a;
            w7.G(kvVar.f23756a);
            File K = w7.K(photoSize, null, true, true);
            w7.G(kvVar.f23756a);
            File K2 = w7.K(photoSize, null, false, true);
            if (!K.exists() && (K2 == null || !K2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f25508q0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f25510s0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f25508q0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
