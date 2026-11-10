package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.lj;
public final class r1 implements lj {
    public final ci f18811a;
    public final b2 f18812b;

    public r1(b2 b2Var, ci ciVar) {
        this.f18812b = b2Var;
        this.f18811a = ciVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f18812b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.f18812b;
        if (!isEmpty) {
            b2Var.P.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = b2Var.P;
            ij ijVar = (ij) arrayList3.get(0);
            t3Var.getClass();
            if (ijVar != null && ijVar.F0() != null) {
                TLRPC.Document F0 = ijVar.F0();
                TLRPC.Message message = ijVar.f23266k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                t3Var.g2(F0, str2);
            }
        }
        this.f18811a.a(true);
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
