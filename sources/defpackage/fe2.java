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
public final class fe2 implements l12 {
    public final n12 a;
    public final TL_stories.TL_premium_boostsStatus b;
    public final vnb c;
    public final wz4 d;
    public final long e;
    public final ah1 f;
    public final wh1 h;

    public fe2(n12 n12Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, vnb vnbVar, wz4 wz4Var, long j, ah1 ah1Var, wh1 wh1Var) {
        this.a = n12Var;
        this.b = tL_premium_boostsStatus;
        this.c = vnbVar;
        this.d = wz4Var;
        this.e = j;
        this.f = ah1Var;
        this.h = wh1Var;
    }

    @Override
    public final boolean E0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void O0(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void e0(Object obj) {
        ee2 ee2Var = new ee2(obj, null, true, (byte) 1);
        ee2Var.X1 = this.b;
        ee2Var.a.a = this.c;
        ee2Var.r1 = this.d;
        ee2Var.h1(this.e);
        ee2Var.K1 = new de2(this.a, this.f, (byte) 1);
        ?? obj2 = new Object();
        obj2.a = true;
        obj2.e = true;
        this.h.showAsSheet(ee2Var, obj2);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        n12 n12Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = n12Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                no6 no6Var = (no6) selectedPhotos.values().iterator().next();
                String str = no6Var.h;
                if (str == null) {
                    str = no6Var.I;
                }
                if (str != null) {
                    File z5 = xb4.z(4);
                    File file = new File(z5, Utilities.b.nextInt() + ".jpg");
                    Point b1 = hl.b1();
                    Bitmap G = in5.G(str, null, (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ee2 ee2Var = new ee2(new zvc(file, file, ""), G, false, (byte) 0);
                    ee2Var.X1 = this.b;
                    ee2Var.a.a = this.c;
                    ee2Var.r1 = this.d;
                    ee2Var.H1 = false;
                    ee2Var.G1 = false;
                    ee2Var.p1 = 0.2f;
                    ee2Var.h1(this.e);
                    ee2Var.K1 = new de2(n12Var, this.f, (byte) 0);
                    ?? obj = new Object();
                    obj.a = true;
                    obj.e = true;
                    this.h.showAsSheet(ee2Var, obj);
                    n12Var.dismiss();
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final void R() {
    }

    @Override
    public final void V() {
    }

    @Override
    public final void i0(TLRPC.User user) {
    }

    @Override
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
