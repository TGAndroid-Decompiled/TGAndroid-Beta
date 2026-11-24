package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class w11 implements s09 {
    public final x11 a;

    public w11(x11 x11Var) {
        this.a = x11Var;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        boolean z3;
        x11 x11Var = this.a;
        d dVar = x11Var.f;
        if (x11Var.e == null) {
            return;
        }
        long e = y6c.h(dVar.getCurrentAccount()).e();
        if ((dVar instanceof mu1) && ((mu1) dVar).a() == e) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i = 0;
        for (int i2 = 0; i2 < x11Var.e.size(); i2++) {
            int keyAt = x11Var.e.keyAt(i2);
            TLRPC.Message message = new TLRPC.Message();
            message.dialog_id = dVar.getUserConfig().e();
            message.id = keyAt;
            k27 k27Var = new k27(dVar.getCurrentAccount(), message, false, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(h19Var);
            dVar.getSendMessagesHelper().r0(k27Var, arrayList, h19Var, false, false, x11Var.f, null);
            i = message.id;
        }
        x11Var.f();
        m21.e();
        gl.e3(new v11(this, h19Var, !z3, dVar.getCurrentAccount(), i), 300L);
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
