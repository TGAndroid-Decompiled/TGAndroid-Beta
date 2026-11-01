package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ev extends dv {
    public final TL_iv.pageBlockPhoto f15647q0;
    public final TLRPC.Photo f15648r0;
    public final TLRPC.PhotoSize f15649s0;
    public final TLRPC.TL_photoStrippedSize f15650t0;

    public ev(wv wvVar, Rect rect, int i10, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(wvVar, rect, i10, z10);
        int i11;
        this.f15647q0 = pageblockphoto;
        TLRPC.Photo v = wvVar.v(pageblockphoto.photo_id);
        this.f15648r0 = v;
        if (v != null) {
            this.f15649s0 = b8.w(v.sizes, i0.Z0(false), false, null, false);
            this.f15650t0 = b8.R(v.sizes);
        } else {
            this.f15649s0 = null;
            this.f15650t0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f15649s0;
        if (photoSize != null) {
            i11 = photoSize.f19819w;
        } else {
            i11 = 100;
        }
        int i12 = photoSize != null ? photoSize.h : 100;
        int i13 = this.f17969c;
        int max = (int) ((i13 / Math.max(1, i11)) * i12);
        Point point = i0.f16172q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i11);
            max = max2;
        }
        this.f15435b0 = i13;
        this.f15436c0 = max;
        l0();
    }

    @Override
    public final void i0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        jc jcVar;
        TLRPC.Photo photo = this.f15648r0;
        if (photo != null && (photoSize = this.f15649s0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f15650t0;
            if (tL_photoStrippedSize != null) {
                jcVar = jc.i(tL_photoStrippedSize, photo);
            } else {
                jcVar = null;
            }
            jc jcVar2 = jcVar;
            wv wvVar = this.f17967a;
            ImageReceiver imageReceiver = this.X;
            if (z10) {
                imageReceiver.u0(null, null, jc.i(photoSize, photo), null, jcVar2, "b1", null, photoSize.size, null, wvVar.f19330b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, jcVar2, "b1", null, photoSize.size, null, wvVar.f19330b, 1);
            }
        }
    }

    @Override
    public final boolean k0() {
        TLRPC.PhotoSize photoSize = this.f15649s0;
        if (photoSize != null) {
            wv wvVar = this.f17967a;
            b8.G(wvVar.f19329a);
            File K = b8.K(photoSize, null, true, true);
            b8.G(wvVar.f19329a);
            File K2 = b8.K(photoSize, null, false, true);
            if (!K.exists() && (K2 == null || !K2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock m0() {
        return this.f15647q0;
    }

    @Override
    public final String n0() {
        return b8.r(null, this.f15649s0);
    }

    @Override
    public final boolean q0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f15647q0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
