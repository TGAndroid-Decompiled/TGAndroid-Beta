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
public final class bf2 implements g22 {
    public final if2 a;

    public bf2(if2 if2Var) {
        this.a = if2Var;
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        if2 if2Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = if2Var.R1.d2.getSelectedPhotos();
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
                    ye2 ye2Var = new ye2(new ntc(file, file, ""), G, false, (byte) 2);
                    ye2Var.X1 = if2Var.Y1;
                    ye2Var.H1 = false;
                    ye2Var.G1 = false;
                    ye2Var.p1 = 0.2f;
                    ye2Var.h1(if2Var.u1.a());
                    ye2Var.K1 = new af2(this, (byte) 0);
                    if2Var.Q0(ye2Var);
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
        ye2 ye2Var = new ye2(obj, null, true, (byte) 3);
        if2 if2Var = this.a;
        ye2Var.X1 = if2Var.Y1;
        ye2Var.h1(if2Var.u1.a());
        ye2Var.K1 = new af2(this, (byte) 1);
        if2Var.Q0(ye2Var);
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
