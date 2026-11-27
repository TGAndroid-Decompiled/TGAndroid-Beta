package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pg9 implements k32 {
    public final n12 a;
    public final yg9 b;

    public pg9(yg9 yg9Var, n12 n12Var) {
        this.b = yg9Var;
        this.a = n12Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        yg9 yg9Var = this.b;
        if (!isEmpty) {
            yg9Var.Q.Y1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            pi9 pi9Var = yg9Var.Q;
            r47 r47Var = (r47) arrayList3.get(0);
            pi9Var.getClass();
            if (r47Var != null && r47Var.F0() != null) {
                TLRPC.Document F0 = r47Var.F0();
                TLRPC.Message message = r47Var.k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                pi9Var.Z1(F0, str2);
            }
        }
        this.a.a(true);
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
