package defpackage;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class iua extends i98 {
    public final be0 a;
    public final LinearLayout b;
    public final long c;

    public iua(be0 be0Var, LinearLayout linearLayout, long j) {
        this.a = be0Var;
        this.b = linearLayout;
        this.c = j;
    }

    @Override
    public final boolean K() {
        return true;
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        be0 be0Var = this.a;
        ImageReceiver imageReceiver = be0Var.getImageReceiver();
        int[] iArr = new int[2];
        be0Var.getLocationInWindow(iArr);
        p98 p98Var = new p98();
        p98Var.b = iArr[0];
        p98Var.c = iArr[1];
        p98Var.d = this.b;
        p98Var.m = null;
        p98Var.a = imageReceiver;
        if (z) {
            p98Var.e = imageReceiver.p();
        }
        p98Var.h = imageReceiver.z();
        p98Var.f = this.c;
        p98Var.j = 0;
        p98Var.i = 0;
        return p98Var;
    }
}
