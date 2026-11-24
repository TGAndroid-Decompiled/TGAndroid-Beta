package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d81 implements View.OnClickListener {
    public final byte a;
    public final z81 b;

    public d81(z81 z81Var, byte b) {
        this.a = b;
        this.b = z81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l = (Long) view.getTag();
                z81 z81Var = this.b;
                fc2 e1 = z81Var.getMessagesController().e1(l.longValue(), false, null);
                TLRPC.Chat K0 = z81Var.getMessagesController().K0(l);
                z81Var.M = K0;
                if (e1 != null) {
                    rgc.l(K0, null, false, null, z81Var.getParentActivity(), z81Var, z81Var.getAccountInstance());
                    return;
                }
                z81Var.N = l;
                z81Var.getMessagesController().Y2(0, l.longValue(), true);
                return;
            default:
                z81.j0(this.b);
                return;
        }
    }
}
