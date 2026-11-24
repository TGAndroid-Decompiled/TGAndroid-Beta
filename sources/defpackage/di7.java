package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class di7 implements View.OnClickListener {
    public final byte a;
    public final ji7 b;

    public di7(ji7 ji7Var, byte b) {
        this.a = b;
        this.b = ji7Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ji7 ji7Var = this.b;
        switch (b) {
            case 0:
                ii7 ii7Var = ji7Var.l2;
                HashSet hashSet = ji7Var.Y1;
                if (hashSet.size() != 0 && ii7Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ji7Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.id))) {
                            arrayList.add(Long.valueOf(user.id));
                        }
                    }
                    ii7Var.a(arrayList);
                    ji7Var.dismiss();
                    return;
                }
                return;
            default:
                ji7Var.Y1.clear();
                ji7Var.T1.d.b(true);
                ji7Var.b1(true, false);
                return;
        }
    }
}
