package oi;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ui;
public final class r1 implements ck {
    public final ui f22357a;
    public final b2 f22358b;

    public r1(b2 b2Var, ui uiVar) {
        this.f22358b = b2Var;
        this.f22357a = uiVar;
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.f22358b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        String str2;
        boolean isEmpty = arrayList.isEmpty();
        b2 b2Var = this.f22358b;
        if (!isEmpty) {
            b2Var.Q.f2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            t3 t3Var = b2Var.Q;
            gj gjVar = (gj) arrayList3.get(0);
            t3Var.getClass();
            if (gjVar != null && gjVar.F0() != null) {
                TLRPC.Document F0 = gjVar.F0();
                TLRPC.Message message = gjVar.f24213k;
                if (message != null) {
                    str2 = message.attachPath;
                } else {
                    str2 = null;
                }
                t3Var.g2(F0, str2);
            }
        }
        this.f22357a.a(true);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
