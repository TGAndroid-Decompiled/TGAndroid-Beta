package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ui;
public final class q1 implements ck {
    public final ui f22283a;
    public final a2 f22284b;

    public q1(a2 a2Var, ui uiVar) {
        this.f22284b = a2Var;
        this.f22283a = uiVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f22284b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        a2 a2Var = this.f22284b;
        if (!isEmpty) {
            a2Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            s3 s3Var = a2Var.Q;
            gj gjVar = (gj) arrayList3.get(0);
            s3Var.getClass();
            if (gjVar != null && gjVar.F0() != null) {
                TLRPC.Document F0 = gjVar.F0();
                TLRPC.Message message = gjVar.f24177k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                s3Var.g2(F0, str2);
            }
        }
        this.f22283a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
