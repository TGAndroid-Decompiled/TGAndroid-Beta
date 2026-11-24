package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class dj9 extends cj9 {
    public final TL_iv.pageBlockPhoto r0;
    public final TLRPC.Photo s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;

    public dj9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockPhoto pageblockphoto, boolean z) {
        super(uj9Var, rect, i, z);
        int i2;
        int i3;
        this.r0 = pageblockphoto;
        TLRPC.Photo u = uj9Var.u(pageblockphoto.photo_id);
        this.s0 = u;
        TLRPC.PhotoSize photoSize = null;
        if (u != null) {
            photoSize = bc4.w(u.sizes, gm.Y0(false), false, null, false);
            this.t0 = photoSize;
            this.u0 = bc4.Q(u.sizes);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
        if (photoSize != null) {
            i2 = photoSize.w;
            i3 = photoSize.h;
        } else {
            i2 = 100;
            i3 = 100;
        }
        int i4 = this.c;
        int max = (int) ((i4 / Math.max(1, i2)) * i3);
        Point point = gm.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i4 = (int) ((max2 / Math.max(1, i3)) * i2);
            max = max2;
        }
        this.c0 = i4;
        this.d0 = max;
        l0();
    }

    @Override
    public final void i0(boolean z) {
        TLRPC.PhotoSize photoSize;
        gn5 gn5Var;
        TLRPC.Photo photo = this.s0;
        if (photo != null && (photoSize = this.t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
            if (tL_photoStrippedSize != null) {
                gn5Var = gn5.i(tL_photoStrippedSize, photo);
            } else {
                gn5Var = null;
            }
            gn5 gn5Var2 = gn5Var;
            uj9 uj9Var = this.a;
            ImageReceiver imageReceiver = this.Y;
            if (z) {
                imageReceiver.Y(null, null, gn5.i(photoSize, photo), null, gn5Var2, "b1", null, photoSize.size, null, uj9Var.b, 1);
            } else {
                imageReceiver.Y(null, null, null, null, gn5Var2, "b1", null, photoSize.size, null, uj9Var.b, 1);
            }
        }
    }

    @Override
    public final boolean k0() {
        TLRPC.PhotoSize photoSize = this.t0;
        if (photoSize != null) {
            uj9 uj9Var = this.a;
            bc4.G(uj9Var.a);
            File J = bc4.J(photoSize, null, true, true);
            bc4.G(uj9Var.a);
            File J2 = bc4.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock m0() {
        return this.r0;
    }

    @Override
    public final String n0() {
        return bc4.r(null, this.t0);
    }

    @Override
    public final boolean q0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
