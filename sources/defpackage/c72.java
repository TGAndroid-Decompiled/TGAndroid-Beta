package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c72 implements t22 {
    public final x02 a;
    public final e72 b;

    public c72(e72 e72Var, x02 x02Var) {
        this.b = e72Var;
        this.a = x02Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        String str2;
        ye9 ye9Var = this.b.r;
        if (!arrayList.isEmpty()) {
            ye9Var.X1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            k27 k27Var = (k27) arrayList3.get(0);
            ye9Var.getClass();
            if (k27Var != null && k27Var.F0() != null) {
                TLRPC.Document F0 = k27Var.F0();
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                ye9Var.Y1(F0, str2);
            }
        }
        this.a.a(true);
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.Z1.startActivityForResult(intent, 21);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
