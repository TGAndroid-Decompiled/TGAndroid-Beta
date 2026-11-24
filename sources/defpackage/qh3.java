package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qh3 implements f59 {
    public final byte a;
    public final nk3 b;

    public qh3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void g(int i, View view) {
        sh4 sh4Var;
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                Object obj = nk3Var.D0.y0.G(i).H;
                if (obj instanceof k47) {
                    k47 k47Var = (k47) obj;
                    Bundle bundle = new Bundle();
                    int i2 = (k47.B0(k47Var.k) > 0L ? 1 : (k47.B0(k47Var.k) == 0L ? 0 : -1));
                    TLRPC.Message message = k47Var.k;
                    if (i2 >= 0) {
                        bundle.putLong("user_id", k47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -k47.B0(message));
                    }
                    bundle.putInt("message_id", k47Var.e1());
                    yv1 yv1Var = new yv1(bundle);
                    nk3.C3(yv1Var, k47Var);
                    nk3Var.presentFragment(yv1Var);
                    return;
                } else if (obj instanceof u3b) {
                    u3b u3bVar = (u3b) obj;
                    Bundle j = kt6.j(3, "type");
                    j.putString("hashtag", u3bVar.C);
                    j.putInt("storiesCount", u3bVar.J);
                    nk3Var.presentFragment(new cm6(j, null));
                    return;
                } else {
                    return;
                }
            default:
                nk3Var.c0.J0(true);
                ArrayList arrayList = nk3Var.c0.f3;
                if (arrayList.isEmpty()) {
                    sh4Var = uh4.k3[i];
                } else {
                    sh4Var = (sh4) arrayList.get(i);
                }
                nk3Var.B2(sh4Var);
                return;
        }
    }
}
