package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class tn0 implements p8c {
    public final byte a;
    public final ao0 b;

    public tn0(ao0 ao0Var, byte b) {
        this.a = b;
        this.b = ao0Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ao0 ao0Var = this.b;
        switch (b) {
            case 0:
                Void r6 = (Void) obj;
                ao0Var.dismiss();
                gl.e3(new rn0(ao0Var, (byte) 2), 220L);
                return;
            case 1:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                ao0Var.i2 = ao0Var.T1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                ao0Var.f1(true, true);
                ao0Var.e1(true);
                return;
            case 3:
                Void r62 = (Void) obj;
                ao0Var.dismiss();
                gl.e3(new rn0(ao0Var, (byte) 1), 220L);
                return;
            case 4:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                ArrayList arrayList = ao0Var.a2;
                arrayList.clear();
                arrayList.addAll((List) obj);
                ao0Var.f1(true, true);
                return;
            default:
                ao0Var.l2.b(false);
                ym0.j(ao0Var.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
