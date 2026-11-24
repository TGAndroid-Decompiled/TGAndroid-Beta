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
public final class ze2 implements g22 {
    public final i22 a;
    public final TL_stories.TL_premium_boostsStatus b;
    public final ylb c;
    public final sz4 d;
    public final long e;
    public final zh1 f;
    public final vi1 h;

    public ze2(i22 i22Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ylb ylbVar, sz4 sz4Var, long j, zh1 zh1Var, vi1 vi1Var) {
        this.a = i22Var;
        this.b = tL_premium_boostsStatus;
        this.c = ylbVar;
        this.d = sz4Var;
        this.e = j;
        this.f = zh1Var;
        this.h = vi1Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = i22Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                jo6 jo6Var = (jo6) selectedPhotos.values().iterator().next();
                String str = jo6Var.h;
                if (str == null) {
                    str = jo6Var.I;
                }
                if (str != null) {
                    File z5 = bc4.z(4);
                    File file = new File(z5, Utilities.b.nextInt() + ".jpg");
                    Point b1 = gm.b1();
                    Bitmap G = fn5.G(str, null, (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    ye2 ye2Var = new ye2(new ntc(file, file, ""), G, false, (byte) 0);
                    ye2Var.X1 = this.b;
                    ye2Var.a.a = this.c;
                    ye2Var.r1 = this.d;
                    ye2Var.H1 = false;
                    ye2Var.G1 = false;
                    ye2Var.p1 = 0.2f;
                    ye2Var.h1(this.e);
                    ye2Var.K1 = new xe2(i22Var, this.f, (byte) 0);
                    ?? obj = new Object();
                    obj.a = true;
                    obj.e = true;
                    this.h.showAsSheet(ye2Var, obj);
                    i22Var.dismiss();
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final boolean K0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override
    public final void f0(Object obj) {
        ye2 ye2Var = new ye2(obj, null, true, (byte) 1);
        ye2Var.X1 = this.b;
        ye2Var.a.a = this.c;
        ye2Var.r1 = this.d;
        ye2Var.h1(this.e);
        ye2Var.K1 = new xe2(this.a, this.f, (byte) 1);
        ?? obj2 = new Object();
        obj2.a = true;
        obj2.e = true;
        this.h.showAsSheet(ye2Var, obj2);
    }

    @Override
    public final void I() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
