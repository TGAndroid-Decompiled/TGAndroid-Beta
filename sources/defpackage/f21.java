package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class f21 implements h49 {
    public final g21 a;

    public f21(g21 g21Var) {
        this.a = g21Var;
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        boolean z3;
        g21 g21Var = this.a;
        e eVar = g21Var.f;
        if (g21Var.e == null) {
            return;
        }
        long e = yac.h(eVar.getCurrentAccount()).e();
        if ((eVar instanceof zu1) && ((zu1) eVar).a() == e) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = 0;
        for (int i2 = 0; i2 < g21Var.e.size(); i2++) {
            int keyAt = g21Var.e.keyAt(i2);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = eVar.getUserConfig().e();
            message.id = keyAt;
            r47 r47Var = new r47(eVar.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(w49Var);
            eVar.getSendMessagesHelper().r0(r47Var, arrayList, w49Var, false, false, g21Var.f, null);
            i = message.id;
        }
        g21Var.j();
        v21.e();
        hl.d3(new e21(this, w49Var, !z3, eVar.getCurrentAccount(), i), 300L);
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
