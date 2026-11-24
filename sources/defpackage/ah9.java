package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ah9 extends zg9 {
    public final TL_iv.pageBlockPhoto r0;
    public final TLRPC.Photo s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;

    public ah9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockPhoto pageblockphoto, boolean z) {
        super(rh9Var, rect, i, z);
        int i2;
        int i3;
        this.r0 = pageblockphoto;
        TLRPC.Photo u = rh9Var.u(pageblockphoto.photo_id);
        this.s0 = u;
        TLRPC.PhotoSize photoSize = null;
        if (u != null) {
            photoSize = ba4.w(u.sizes, gl.Y0(false), false, null, false);
            this.t0 = photoSize;
            this.u0 = ba4.Q(u.sizes);
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
        Point point = gl.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i4 = (int) ((max2 / Math.max(1, i3)) * i2);
            max = max2;
        }
        this.c0 = i4;
        this.d0 = max;
        m0();
    }

    @Override
    public final void j0(boolean z) {
        TLRPC.PhotoSize photoSize;
        gl5 gl5Var;
        TLRPC.Photo photo = this.s0;
        if (photo != null && (photoSize = this.t0) != null) {
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
            if (tL_photoStrippedSize != null) {
                gl5Var = gl5.i(tL_photoStrippedSize, photo);
            } else {
                gl5Var = null;
            }
            gl5 gl5Var2 = gl5Var;
            rh9 rh9Var = this.a;
            ImageReceiver imageReceiver = this.Y;
            if (z) {
                imageReceiver.Y(null, null, gl5.i(photoSize, photo), null, gl5Var2, "b1", null, photoSize.size, null, rh9Var.b, 1);
            } else {
                imageReceiver.Y(null, null, null, null, gl5Var2, "b1", null, photoSize.size, null, rh9Var.b, 1);
            }
        }
    }

    @Override
    public final boolean l0() {
        TLRPC.PhotoSize photoSize = this.t0;
        if (photoSize != null) {
            rh9 rh9Var = this.a;
            ba4.G(rh9Var.a);
            File J = ba4.J(photoSize, null, true, true);
            ba4.G(rh9Var.a);
            File J2 = ba4.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final TL_iv.PageBlock n0() {
        return this.r0;
    }

    @Override
    public final String o0() {
        return ba4.r(null, this.t0);
    }

    @Override
    public final boolean r0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.r0;
        if (pageblockphoto != null && pageblockphoto.spoiler) {
            return true;
        }
        return false;
    }
}
