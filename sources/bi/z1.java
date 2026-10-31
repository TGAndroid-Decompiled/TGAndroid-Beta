package bi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.nj;
public final class z1 implements nj {
    public final bi f3475a;
    public final k2 f3476b;

    public z1(k2 k2Var, bi biVar) {
        this.f3476b = k2Var;
        this.f3475a = biVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f3476b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        k2 k2Var = this.f3476b;
        if (!isEmpty) {
            k2Var.P.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            d4 d4Var = k2Var.P;
            jj jjVar = (jj) arrayList3.get(0);
            d4Var.getClass();
            if (jjVar != null && jjVar.F0() != null) {
                TLRPC.Document F0 = jjVar.F0();
                TLRPC.Message message = jjVar.f16337k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                d4Var.g2(F0, str2);
            }
        }
        this.f3475a.a(true);
    }

    @Override
    public final void S() {
    }

    @Override
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
