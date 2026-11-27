package defpackage;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mya extends yc8 {
    public final de0 a;
    public final LinearLayout b;
    public final long c;

    public mya(de0 de0Var, LinearLayout linearLayout, long j) {
        this.a = de0Var;
        this.b = linearLayout;
        this.c = j;
    }

    @Override
    public final boolean K() {
        return true;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        de0 de0Var = this.a;
        ImageReceiver imageReceiver = de0Var.getImageReceiver();
        int[] iArr = new int[2];
        de0Var.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = this.b;
        fd8Var.m = null;
        fd8Var.a = imageReceiver;
        if (z) {
            fd8Var.e = imageReceiver.p();
        }
        fd8Var.h = imageReceiver.z();
        fd8Var.f = this.c;
        fd8Var.j = 0;
        fd8Var.i = 0;
        return fd8Var;
    }
}
