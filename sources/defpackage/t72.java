package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t72 implements k32 {
    public final n12 a;
    public final v72 b;

    public t72(v72 v72Var, n12 n12Var) {
        this.b = v72Var;
        this.a = n12Var;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        String str2;
        pi9 pi9Var = this.b.r;
        if (!arrayList.isEmpty()) {
            pi9Var.Y1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
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
            this.b.b.Z1.startActivityForResult(intent, 21);
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
