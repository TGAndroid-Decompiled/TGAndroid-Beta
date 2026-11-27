package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg3 implements r69 {
    public final byte a;
    public final uj3 b;

    public yg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void e(int i, View view) {
        ph4 ph4Var;
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                Object obj = uj3Var.D0.y0.G(i).H;
                if (obj instanceof r47) {
                    r47 r47Var = (r47) obj;
                    Bundle bundle = new Bundle();
                    int i2 = (r47.B0(r47Var.k) > 0L ? 1 : (r47.B0(r47Var.k) == 0L ? 0 : -1));
                    TLRPC.Message message = r47Var.k;
                    if (i2 >= 0) {
                        bundle.putLong("user_id", r47.B0(message));
                    } else {
                        bundle.putLong("chat_id", -r47.B0(message));
                    }
                    bundle.putInt("message_id", r47Var.e1());
                    zu1 zu1Var = new zu1(bundle);
                    uj3.C3(zu1Var, r47Var);
                    uj3Var.presentFragment(zu1Var);
                    return;
                } else if (obj instanceof p5b) {
                    p5b p5bVar = (p5b) obj;
                    Bundle j = qu6.j(3, "type");
                    j.putString("hashtag", p5bVar.C);
                    j.putInt("storiesCount", p5bVar.J);
                    uj3Var.presentFragment(new em6(j, null));
                    return;
                } else {
                    return;
                }
            default:
                uj3Var.c0.K0(true);
                ArrayList arrayList = uj3Var.c0.f3;
                if (arrayList.isEmpty()) {
                    ph4Var = rh4.k3[i];
                } else {
                    ph4Var = (ph4) arrayList.get(i);
                }
                uj3Var.B2(ph4Var);
                return;
        }
    }
}
