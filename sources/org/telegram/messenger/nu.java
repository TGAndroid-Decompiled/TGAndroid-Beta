package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class nu extends mu {
    public final TL_iv.pageBlockPhoto f26038r0;
    public final TLRPC.Photo f26039s0;
    public final TLRPC.PhotoSize f26040t0;
    public final TLRPC.TL_photoStrippedSize f26041u0;

    public nu(fv fvVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(fvVar, rect, i7, z10);
        int i10;
        this.f26038r0 = pageblockphoto;
        TLRPC.Photo v = fvVar.v(pageblockphoto.photo_id);
        this.f26039s0 = v;
        if (v != null) {
            this.f26040t0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f26041u0 = w7.Q(v.sizes);
        } else {
            this.f26040t0 = null;
            this.f26041u0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f26040t0;
        if (photoSize != null) {
            i10 = photoSize.f28459w;
        } else {
            i10 = 100;
        }
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.f22970c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.f24046q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.f25634c0 = i12;
        this.f25635d0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        gc gcVar;
        TLRPC.Photo photo = this.f26039s0;
        if (photo != null && (photoSize = this.f26040t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f26041u0;
            if (tL_photoStrippedSize != null) {
                gcVar = gc.i(tL_photoStrippedSize, photo);
            } else {
                gcVar = null;
            }
            gc gcVar2 = gcVar;
            fv fvVar = this.f22968a;
            ImageReceiver imageReceiver = this.Y;
            if (z10) {
                imageReceiver.u0(null, null, gc.i(photoSize, photo), null, gcVar2, "b1", null, photoSize.size, null, fvVar.f23977b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, gcVar2, "b1", null, photoSize.size, null, fvVar.f23977b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.f26040t0;
        if (photoSize != null) {
            fv fvVar = this.f22968a;
            w7.G(fvVar.f23976a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(fvVar.f23976a);
            File J2 = w7.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f26038r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f26040t0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f26038r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
