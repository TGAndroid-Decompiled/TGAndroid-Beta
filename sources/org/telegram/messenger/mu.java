package org.telegram.messenger;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mu extends lu {
    public final TL_iv.pageBlockPhoto f25934r0;
    public final TLRPC.Photo f25935s0;
    public final TLRPC.PhotoSize f25936t0;
    public final TLRPC.TL_photoStrippedSize f25937u0;

    public mu(ev evVar, Rect rect, int i7, TL_iv.pageBlockPhoto pageblockphoto, boolean z10) {
        super(evVar, rect, i7, z10);
        int i10;
        this.f25934r0 = pageblockphoto;
        TLRPC.Photo v = evVar.v(pageblockphoto.photo_id);
        this.f25935s0 = v;
        if (v != null) {
            this.f25936t0 = w7.w(v.sizes, g0.Z0(false), false, null, false);
            this.f25937u0 = w7.Q(v.sizes);
        } else {
            this.f25936t0 = null;
            this.f25937u0 = null;
        }
        TLRPC.PhotoSize photoSize = this.f25936t0;
        if (photoSize != null) {
            i10 = photoSize.f28517w;
        } else {
            i10 = 100;
        }
        int i11 = photoSize != null ? photoSize.h : 100;
        int i12 = this.f28443c;
        int max = (int) ((i12 / Math.max(1, i10)) * i11);
        Point point = g0.f24226q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i12 = (int) ((max2 / Math.max(1, i11)) * i10);
            max = max2;
        }
        this.f25547c0 = i12;
        this.f25548d0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z10) {
        TLRPC.PhotoSize photoSize;
        fc fcVar;
        TLRPC.Photo photo = this.f25935s0;
        if (photo != null && (photoSize = this.f25936t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.f25937u0;
            if (tL_photoStrippedSize != null) {
                fcVar = fc.i(tL_photoStrippedSize, photo);
            } else {
                fcVar = null;
            }
            fc fcVar2 = fcVar;
            ev evVar = this.f28441a;
            ImageReceiver imageReceiver = this.Y;
            if (z10) {
                imageReceiver.v0(null, null, fc.i(photoSize, photo), null, fcVar2, "b1", null, photoSize.size, null, evVar.f23873b, 1);
            } else {
                imageReceiver.v0(null, null, null, null, fcVar2, "b1", null, photoSize.size, null, evVar.f23873b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.f25936t0;
        if (photoSize != null) {
            ev evVar = this.f28441a;
            w7.G(evVar.f23872a);
            File J = w7.J(photoSize, null, true, true);
            w7.G(evVar.f23872a);
            File J2 = w7.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.f25934r0;
    }

    @Override
    public final String o0() {
        return w7.r(null, this.f25936t0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.f25934r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
