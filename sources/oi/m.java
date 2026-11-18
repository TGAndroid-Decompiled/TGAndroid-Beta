package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.si;
public final class m implements ak {
    public final si f22171a;
    public final o f22172b;

    public m(o oVar, si siVar) {
        this.f22172b = oVar;
        this.f22171a = siVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f22172b.f36766b.f39659a2.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        s3 s3Var = this.f22172b.f22210r;
        if (!arrayList.isEmpty()) {
            s3Var.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            fj fjVar = (fj) arrayList3.get(0);
            s3Var.getClass();
            if (fjVar != null && fjVar.F0() != null) {
                TLRPC.Document F0 = fjVar.F0();
                TLRPC.Message message = fjVar.f23968k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                s3Var.g2(F0, str2);
            }
        }
        this.f22171a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
