package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ProfileActivity;
public final class vf3 extends g3b {
    public final hi2 J;

    public vf3(Context context, long j, hi2 hi2Var) {
        super(context);
        this.J = hi2Var;
        this.a = new RectF();
        this.f = 0.0f;
        ho hoVar = new ho(false, true, true);
        this.r = hoVar;
        ho hoVar2 = new ho(false, true, false);
        this.s = hoVar2;
        hoVar.setCallback(this);
        hoVar2.setCallback(this);
        this.n = Long.valueOf(j);
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.p0(this);
        if (j == Long.MAX_VALUE) {
            this.w = jb6.M0(2131752600, null);
            pc0Var.f(14);
            imageReceiver.U(null, pc0Var, null);
            return;
        }
        String G = pg3.G(imageReceiver, pc0Var, oc7.r1(z8c.t0).a2(j));
        this.w = G;
        this.w = gw3.m(G, null, false, null, 0);
    }

    @Override
    public final void b() {
        hi2 hi2Var = this.J;
        y71 y71Var = (y71) hi2Var.c;
        y71Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j = ((s71) hi2Var.b).a;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        y71Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
