package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ze9 implements f42 {
    public final i22 a;
    public final jf9 b;

    public ze9(jf9 jf9Var, i22 i22Var) {
        this.b = jf9Var;
        this.a = i22Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        jf9 jf9Var = this.b;
        if (!isEmpty) {
            jf9Var.Q.X1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            ch9 ch9Var = jf9Var.Q;
            k47 k47Var = (k47) arrayList3.get(0);
            ch9Var.getClass();
            if (k47Var != null && k47Var.F0() != null) {
                TLRPC.Document F0 = k47Var.F0();
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                ch9Var.Y1(F0, str2);
            }
        }
        this.a.a(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
