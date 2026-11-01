package bi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.nj;
public final class r implements nj {
    public final bi f3310a;
    public final t f3311b;

    public r(t tVar, bi biVar) {
        this.f3311b = tVar;
        this.f3310a = biVar;
    }

    @Override
    public final void B() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f3311b.f30964b.W1.startActivityForResult(intent, 21);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2;
        d4 d4Var = this.f3311b.f3350r;
        if (!arrayList.isEmpty()) {
            d4Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            kj kjVar = (kj) arrayList3.get(0);
            d4Var.getClass();
            if (kjVar != null && kjVar.F0() != null) {
                TLRPC.Document F0 = kjVar.F0();
                TLRPC.Message message = kjVar.f16690k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                d4Var.g2(F0, str2);
            }
        }
        this.f3310a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i10, long j10) {
    }
}
