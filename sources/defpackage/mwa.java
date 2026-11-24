package defpackage;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mwa extends jb8 {
    public final bf0 a;
    public final LinearLayout b;
    public final long c;

    public mwa(bf0 bf0Var, LinearLayout linearLayout, long j) {
        this.a = bf0Var;
        this.b = linearLayout;
        this.c = j;
    }

    @Override
    public final boolean L() {
        return true;
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        bf0 bf0Var = this.a;
        ImageReceiver imageReceiver = bf0Var.getImageReceiver();
        int[] iArr = new int[2];
        bf0Var.getLocationInWindow(iArr);
        qb8 qb8Var = new qb8();
        qb8Var.b = iArr[0];
        qb8Var.c = iArr[1];
        qb8Var.d = this.b;
        qb8Var.m = null;
        qb8Var.a = imageReceiver;
        if (z) {
            qb8Var.e = imageReceiver.p();
        }
        qb8Var.h = imageReceiver.z();
        qb8Var.f = this.c;
        qb8Var.j = 0;
        qb8Var.i = 0;
        return qb8Var;
    }
}
