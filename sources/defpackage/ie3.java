package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ProfileActivity;
public final class ie3 extends e1b {
    public final lv6 J;

    public ie3(Context context, long j, lv6 lv6Var) {
        super(context);
        this.J = lv6Var;
        this.a = new RectF();
        this.f = 0.0f;
        gn gnVar = new gn(false, true, true);
        this.r = gnVar;
        gn gnVar2 = new gn(false, true, false);
        this.s = gnVar2;
        gnVar.setCallback(this);
        gnVar2.setCallback(this);
        this.n = Long.valueOf(j);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.p0(this);
        if (j == Long.MAX_VALUE) {
            this.w = k96.M0(2131752635, null);
            pb0Var.f(14);
            imageReceiver.U(null, pb0Var, null);
            return;
        }
        String G = cf3.G(imageReceiver, pb0Var, na7.q1(y6c.t0).Z1(j));
        this.w = G;
        this.w = vu3.m(G, null, false, null, 0);
    }

    @Override
    public final void b() {
        lv6 lv6Var = this.J;
        r61 r61Var = (r61) lv6Var.c;
        r61Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j = ((l61) lv6Var.b).a;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        r61Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
