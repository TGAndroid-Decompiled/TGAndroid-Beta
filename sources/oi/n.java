package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.ti;
public final class n implements bk {
    public final ti f22319a;
    public final p f22320b;

    public n(p pVar, ti tiVar) {
        this.f22320b = pVar;
        this.f22319a = tiVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f22320b.f37135b.f39956a2.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        t3 t3Var = this.f22320b.f22367r;
        if (!arrayList.isEmpty()) {
            t3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            fj fjVar = (fj) arrayList3.get(0);
            t3Var.getClass();
            if (fjVar != null && fjVar.F0() != null) {
                TLRPC.Document F0 = fjVar.F0();
                TLRPC.Message message = fjVar.f24073k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                t3Var.g2(F0, str2);
            }
        }
        this.f22319a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
