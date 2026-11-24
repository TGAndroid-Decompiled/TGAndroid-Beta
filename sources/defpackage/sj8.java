package defpackage;

import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class sj8 implements k66 {
    public final byte a;
    public final mz0 b;

    public sj8(mz0 mz0Var, byte b) {
        this.a = b;
        this.b = mz0Var;
    }

    @Override
    public final void a(ClickableSpan clickableSpan) {
        byte b = this.a;
        mz0 mz0Var = this.b;
        switch (b) {
            case 0:
                yj8 yj8Var = (yj8) mz0Var;
                ArrayList arrayList = new ArrayList();
                arrayList.add(yj8Var.x2);
                qv0 qv0Var = new qv0(yj8Var, (byte) 10);
                d dVar = yj8Var.o2;
                if (dVar != null) {
                    qv0Var.setParentFragment(dVar);
                }
                new vj8(yj8Var, qv0Var, yj8Var.getContext(), yj8Var.J0, arrayList).show();
                return;
            default:
                c2c c2cVar = (c2c) mz0Var;
                if (clickableSpan != null) {
                    clickableSpan.onClick(c2cVar.b);
                    return;
                }
                return;
        }
    }
}
