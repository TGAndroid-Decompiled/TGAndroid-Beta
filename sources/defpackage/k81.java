package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k81 implements View.OnClickListener {
    public final byte a;
    public final i91 b;

    public k81(i91 i91Var, byte b) {
        this.a = b;
        this.b = i91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l = (Long) view.getTag();
                i91 i91Var = this.b;
                vc2 g1 = i91Var.getMessagesController().g1(l.longValue(), false, null);
                TLRPC.Chat M0 = i91Var.getMessagesController().M0(l);
                i91Var.M = M0;
                if (g1 != null) {
                    xkc.l(M0, null, false, null, i91Var.getParentActivity(), i91Var, i91Var.getAccountInstance());
                    return;
                }
                i91Var.N = l;
                i91Var.getMessagesController().e3(0, l.longValue(), true);
                return;
            default:
                i91.j0(this.b);
                return;
        }
    }
}
