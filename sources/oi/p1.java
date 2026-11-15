package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tj;
public final class p1 implements tj {
    public final ki f21871a;
    public final z1 f21872b;

    public p1(z1 z1Var, ki kiVar) {
        this.f21872b = z1Var;
        this.f21871a = kiVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f21872b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        z1 z1Var = this.f21872b;
        if (!isEmpty) {
            z1Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            q3 q3Var = z1Var.Q;
            gj gjVar = (gj) arrayList3.get(0);
            q3Var.getClass();
            if (gjVar != null && gjVar.F0() != null) {
                TLRPC.Document F0 = gjVar.F0();
                TLRPC.Message message = gjVar.f23817k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                q3Var.g2(F0, str2);
            }
        }
        this.f21871a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
