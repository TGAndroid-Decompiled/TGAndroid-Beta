package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ku extends ju {
    public final TL_iv.pageBlockPhoto f23872r0;
    public final TLRPC.Photo f23873s0;
    public final TLRPC.PhotoSize f23874t0;
    public final TLRPC.TL_photoStrippedSize f23875u0;

    public ku(cv cvVar, Rect rect, int i3, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(cvVar, rect, i3, z10);
        int i10;
        this.f23872r0 = pageblockphoto;
        TLRPC.Photo v = cvVar.v(pageblockphoto.photo_id);
        this.f23873s0 = v;
        if (v != null) {
            this.f23874t0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f23875u0 = w7.R(v.sizes);
        } else {
            this.f23874t0 = null;
            this.f23875u0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f23874t0;
        if (photoSize != null) {
            i10 = photoSize.f27026w;
        } else {
            i10 = 100;
        }
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.f26436c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.f22608q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.f23715c0 = i12;
        this.f23716d0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        ac acVar;
        TLRPC.Photo photo = this.f23873s0;
        if (photo != null && (photoSize = this.f23874t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f23875u0;
            if (tL_photoStrippedSize != null) {
                acVar = ac.i(tL_photoStrippedSize, photo);
            } else {
                acVar = null;
            }
            ac acVar2 = acVar;
            cv cvVar = this.f26434a;
            ImageReceiver imageReceiver = this.Y;
            if (z10) {
                imageReceiver.u0(null, null, ac.i(photoSize, photo), null, acVar2, "b1", null, photoSize.size, null, cvVar.f22066b, 1);
            } else {
                imageReceiver.u0(null, null, null, null, acVar2, "b1", null, photoSize.size, null, cvVar.f22066b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.f23874t0;
        if (photoSize != null) {
            cv cvVar = this.f26434a;
            w7.G(cvVar.f22065a);
            File K = w7.K(photoSize, null, true, true);
            w7.G(cvVar.f22065a);
            File K2 = w7.K(photoSize, null, false, true);
            if (!K.exists() && (K2 == null || !K2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f23872r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f23874t0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f23872r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
