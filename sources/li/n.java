package li;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.mj;
public final class n implements mj {
    public final di f18714a;
    public final p f18715b;

    public n(p pVar, di diVar) {
        this.f18715b = pVar;
        this.f18714a = diVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f18715b.f39004b.W1.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        String str2;
        t3 t3Var = this.f18715b.f18760r;
        if (!arrayList.isEmpty()) {
            t3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            ij ijVar = (ij) arrayList3.get(0);
            t3Var.getClass();
            if (ijVar != null && ijVar.F0() != null) {
                TLRPC.Document F0 = ijVar.F0();
                TLRPC.Message message = ijVar.f23262k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                t3Var.g2(F0, str2);
            }
        }
        this.f18714a.a(true);
    }

    @Override
    public final void S() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
    }
}
