package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.si;
public final class p1 implements ak {
    public final si f22235a;
    public final z1 f22236b;

    public p1(z1 z1Var, si siVar) {
        this.f22236b = z1Var;
        this.f22235a = siVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f22236b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        z1 z1Var = this.f22236b;
        if (!isEmpty) {
            z1Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            s3 s3Var = z1Var.Q;
            fj fjVar = (fj) arrayList3.get(0);
            s3Var.getClass();
            if (fjVar != null && fjVar.F0() != null) {
                TLRPC.Document F0 = fjVar.F0();
                TLRPC.Message message = fjVar.f23965k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                s3Var.g2(F0, str2);
            }
        }
        this.f22235a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
