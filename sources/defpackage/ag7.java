package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ag7 implements View.OnClickListener {
    public final byte a;
    public final gg7 b;

    public ag7(gg7 gg7Var, byte b) {
        this.a = b;
        this.b = gg7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        gg7 gg7Var = this.b;
        switch (b) {
            case 0:
                fg7 fg7Var = gg7Var.l2;
                HashSet hashSet = gg7Var.Y1;
                if (hashSet.size() != 0 && fg7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : gg7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    fg7Var.a(arrayList);
                    gg7Var.dismiss();
                    return;
                }
                return;
            default:
                gg7Var.Y1.clear();
                gg7Var.T1.d.b(true);
                gg7Var.b1(true, false);
                return;
        }
    }
}
