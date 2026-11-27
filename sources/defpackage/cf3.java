package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ProfileActivity;
public final class cf3 extends b5b {
    public final qx6 J;

    public cf3(Context context, long j, qx6 qx6Var) {
        super(context);
        this.J = qx6Var;
        this.a = new RectF();
        this.f = 0.0f;
        hn hnVar = new hn(false, true, true);
        this.r = hnVar;
        hn hnVar2 = new hn(false, true, false);
        this.s = hnVar2;
        hnVar.setCallback(this);
        hnVar2.setCallback(this);
        this.n = Long.valueOf(j);
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.p0(this);
        if (j == Long.MAX_VALUE) {
            this.w = ob6.M0(2131752628, null);
            rb0Var.f(14);
            imageReceiver.U(null, rb0Var, null);
            return;
        }
        String G = wf3.G(imageReceiver, rb0Var, uc7.s1(yac.t0).b2(j));
        this.w = G;
        this.w = pv3.m(G, null, false, null, 0);
    }

    @Override
    public final void b() {
        qx6 qx6Var = this.J;
        z61 z61Var = (z61) qx6Var.c;
        z61Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j = ((t61) qx6Var.b).a;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        z61Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
