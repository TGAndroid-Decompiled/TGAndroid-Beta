package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qu extends pu {
    public final TL_iv.pageBlockPhoto f26139r0;
    public final TLRPC.Photo f26140s0;
    public final TLRPC.PhotoSize f26141t0;
    public final TLRPC.TL_photoStrippedSize f26142u0;

    public qu(iv ivVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(ivVar, rect, i7, z10);
        int i10;
        this.f26139r0 = pageblockphoto;
        TLRPC.Photo v = ivVar.v(pageblockphoto.photo_id);
        this.f26140s0 = v;
        if (v != null) {
            this.f26141t0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f26142u0 = w7.Q(v.sizes);
        } else {
            this.f26141t0 = null;
            this.f26142u0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f26141t0;
        if (photoSize != null) {
            i10 = photoSize.f28076w;
        } else {
            i10 = 100;
        }
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.f22943c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.f23611q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.f25980c0 = i12;
        this.f25981d0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        gc gcVar;
        TLRPC.Photo photo = this.f26140s0;
        if (photo != null && (photoSize = this.f26141t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26142u0;
            if (tL_photoStrippedSize != null) {
                gcVar = gc.i(tL_photoStrippedSize, photo);
            } else {
                gcVar = null;
            }
            gc gcVar2 = gcVar;
            iv ivVar = this.f22941a;
            ImageReceiver imageReceiver = this.Y;
            if (z10) {
                imageReceiver.u0(null, null, gc.i(photoSize, photo), null, gcVar2, "b1", null, photoSize.size, null, ivVar.f24446b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, gcVar2, "b1", null, photoSize.size, null, ivVar.f24446b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.f26141t0;
        if (photoSize != null) {
            iv ivVar = this.f22941a;
            w7.G(ivVar.f24445a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(ivVar.f24445a);
            File J2 = w7.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f26139r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f26141t0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f26139r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
