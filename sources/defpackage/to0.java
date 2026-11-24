package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class to0 implements qac {
    public final byte a;
    public final ap0 b;

    public to0(ap0 ap0Var, byte b) {
        this.a = b;
        this.b = ap0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ap0 ap0Var = this.b;
        switch (b) {
            case 0:
                Void r6 = (Void) obj;
                ap0Var.dismiss();
                gm.d3(new ro0(ap0Var, (byte) 2), 220L);
                return;
            case 1:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                ap0Var.i2 = ap0Var.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                ap0Var.f1(true, true);
                ap0Var.e1(true);
                return;
            case 3:
                Void r62 = (Void) obj;
                ap0Var.dismiss();
                gm.d3(new ro0(ap0Var, (byte) 1), 220L);
                return;
            case 4:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                ArrayList arrayList = ap0Var.a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ap0Var.f1(true, true);
                return;
            default:
                ap0Var.l2.b(false);
                yn0.j(ap0Var.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
