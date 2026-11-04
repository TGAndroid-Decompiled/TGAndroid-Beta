package mi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.lj;
public final class n implements lj {
    public final bi f19753a;
    public final p f19754b;

    public n(p pVar, bi biVar) {
        this.f19754b = pVar;
        this.f19753a = biVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f19754b.f38416b.X1.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        String str2;
        t3 t3Var = this.f19754b.f19793r;
        if (!arrayList.isEmpty()) {
            t3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
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
        this.f19753a.a(true);
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
    }
}
