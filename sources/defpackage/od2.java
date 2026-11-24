package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.Editable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class od2 implements v02 {
    public final x02 a;
    public final TL_stories.TL_premium_boostsStatus b;
    public final wjb c;
    public final qx4 d;
    public final long e;
    public final rg1 f;
    public final nh1 h;

    public od2(x02 x02Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, wjb wjbVar, qx4 qx4Var, long j, rg1 rg1Var, nh1 nh1Var) {
        this.a = x02Var;
        this.b = tL_premium_boostsStatus;
        this.c = wjbVar;
        this.d = qx4Var;
        this.e = j;
        this.f = rg1Var;
        this.h = nh1Var;
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = x02Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                jm6 jm6Var = (jm6) selectedPhotos.values().iterator().next();
                String str = jm6Var.h;
                if (str == null) {
                    str = jm6Var.I;
                }
                if (str != null) {
                    File z5 = ba4.z(4);
                    File file = new File(z5, Utilities.b.nextInt() + ".jpg");
                    Point b1 = gl.b1();
                    Bitmap G = fl5.G(str, null, (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    nd2 nd2Var = new nd2(new lrc(file, file, ""), G, false, (byte) 0);
                    nd2Var.X1 = this.b;
                    nd2Var.a.a = this.c;
                    nd2Var.r1 = this.d;
                    nd2Var.H1 = false;
                    nd2Var.G1 = false;
                    nd2Var.p1 = 0.2f;
                    nd2Var.g1(this.e);
                    nd2Var.K1 = new md2(x02Var, this.f, (byte) 0);
                    ?? obj = new Object();
                    obj.a = true;
                    obj.e = true;
                    this.h.showAsSheet(nd2Var, obj);
                    x02Var.dismiss();
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override
    public final void P0(Object obj) {
        nd2 nd2Var = new nd2(obj, null, true, (byte) 1);
        nd2Var.X1 = this.b;
        nd2Var.a.a = this.c;
        nd2Var.r1 = this.d;
        nd2Var.g1(this.e);
        nd2Var.K1 = new md2(this.a, this.f, (byte) 1);
        ?? obj2 = new Object();
        obj2.a = true;
        obj2.e = true;
        this.h.showAsSheet(nd2Var, obj2);
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
