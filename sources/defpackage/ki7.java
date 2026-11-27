package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ki7 implements View.OnClickListener {
    public final byte a;
    public final qi7 b;

    public ki7(qi7 qi7Var, byte b) {
        this.a = b;
        this.b = qi7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        qi7 qi7Var = this.b;
        switch (b) {
            case 0:
                pi7 pi7Var = qi7Var.l2;
                HashSet hashSet = qi7Var.Y1;
                if (hashSet.size() != 0 && pi7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qi7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    pi7Var.a(arrayList);
                    qi7Var.dismiss();
                    return;
                }
                return;
            default:
                qi7Var.Y1.clear();
                qi7Var.T1.d.b(true);
                qi7Var.c1(true, false);
                return;
        }
    }
}
