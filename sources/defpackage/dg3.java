package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dg3 implements c39 {
    public final byte a;
    public final cj3 b;

    public dg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void d(int i, View view) {
        rf4 rf4Var;
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                Object obj = cj3Var.D0.y0.G(i).H;
                if (obj instanceof k27) {
                    k27 k27Var = (k27) obj;
                    Bundle bundle = new Bundle();
                    int i2 = (k27.B0(k27Var.k) > 0L ? 1 : (k27.B0(k27Var.k) == 0L ? 0 : -1));
                    TLRPC.Message message = k27Var.k;
                    if (i2 >= 0) {
                        bundle.putLong("user_id", k27.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k27.B0(message));
                    }
                    bundle.putInt("message_id", k27Var.e1());
                    mu1 mu1Var = new mu1(bundle);
                    cj3.A3(mu1Var, k27Var);
                    cj3Var.presentFragment(mu1Var);
                    return;
                } else if (obj instanceof t1b) {
                    t1b t1bVar = (t1b) obj;
                    Bundle j = ls6.j(3, "type");
                    j.putString("hashtag", t1bVar.C);
                    j.putInt("storiesCount", t1bVar.J);
                    cj3Var.presentFragment(new zj6(j, null));
                    return;
                } else {
                    return;
                }
            default:
                cj3Var.c0.J0(true);
                ArrayList arrayList = cj3Var.c0.f3;
                if (arrayList.isEmpty()) {
                    rf4Var = tf4.k3[i];
                } else {
                    rf4Var = (rf4) arrayList.get(i);
                }
                cj3Var.z2(rf4Var);
                return;
        }
    }
}
