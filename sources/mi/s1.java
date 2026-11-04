package mi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.lj;
public final class s1 implements lj {
    public final bi f19877a;
    public final c2 f19878b;

    public s1(c2 c2Var, bi biVar) {
        this.f19878b = c2Var;
        this.f19877a = biVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f19878b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        c2 c2Var = this.f19878b;
        if (!isEmpty) {
            c2Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = c2Var.Q;
            zi ziVar = (zi) arrayList3.get(0);
            t3Var.getClass();
            if (ziVar != null && ziVar.F0() != null) {
                TLRPC.Document F0 = ziVar.F0();
                TLRPC.Message message = ziVar.f26868k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                t3Var.g2(F0, str2);
            }
        }
        this.f19877a.a(true);
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
