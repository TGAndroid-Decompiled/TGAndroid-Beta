package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class dv extends cv {
    public final TL_iv.pageBlockPhoto f15312q0;
    public final TLRPC.Photo f15313r0;
    public final TLRPC.PhotoSize f15314s0;
    public final TLRPC.TL_photoStrippedSize f15315t0;

    public dv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(vvVar, rect, i10, z10);
        int i11;
        this.f15312q0 = pageblockphoto;
        TLRPC.Photo v = vvVar.v(pageblockphoto.photo_id);
        this.f15313r0 = v;
        if (v != null) {
            this.f15314s0 = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.f15315t0 = b8.R(v.sizes);
        } else {
            this.f15314s0 = null;
            this.f15315t0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f15314s0;
        if (photoSize != null) {
            i11 = photoSize.f19818w;
        } else {
            i11 = 100;
        }
        int i12 = photoSize != null ? photoSize.h : 100;
        int i13 = this.f17623c;
        int max = (int) ((i13 / Math.max(1, i11)) * i12);
        Point point = i0.f16026q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i11);
            max = max2;
        }
        this.f15079b0 = i13;
        this.f15080c0 = max;
        l0();
    }

    @Override
    public final void i0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        ic icVar;
        TLRPC.Photo photo = this.f15313r0;
        if (photo != null && (photoSize = this.f15314s0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f15315t0;
            if (tL_photoStrippedSize != null) {
                icVar = ic.i(tL_photoStrippedSize, photo);
            } else {
                icVar = null;
            }
            ic icVar2 = icVar;
            vv vvVar = this.f17621a;
            ImageReceiver imageReceiver = this.X;
            if (z10) {
                imageReceiver.u0(null, null, ic.i(photoSize, photo), null, icVar2, "b1", null, photoSize.size, null, vvVar.f18987b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, icVar2, "b1", null, photoSize.size, null, vvVar.f18987b, 1);
            }
        }
    }

    @Override
    public final boolean k0() {
        TLRPC.PhotoSize photoSize = this.f15314s0;
        if (photoSize != null) {
            vv vvVar = this.f17621a;
            b8.G(vvVar.f18986a);
            File K = b8.K(photoSize, null, true, true);
            b8.G(vvVar.f18986a);
            File K2 = b8.K(photoSize, null, false, true);
            if (!K.exists() && (K2 == null || !K2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock m0() {
        return this.f15312q0;
    }

    @Override
    public final String n0() {
        return b8.r(null, this.f15314s0);
    }

    @Override
    public final boolean q0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f15312q0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
