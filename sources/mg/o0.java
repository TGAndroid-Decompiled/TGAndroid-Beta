package mg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class o0 implements q20 {
    public final int f13201a;
    public final w0 f13202b;

    public o0(w0 w0Var, int i10) {
        this.f13201a = i10;
        this.f13202b = w0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f13201a) {
            case 0:
                Void r42 = (Void) obj;
                w0 w0Var = this.f13202b;
                w0Var.dismiss();
                org.telegram.messenger.i0.h3(new l0(w0Var, 2), 220L);
                return;
            case 1:
                w0 w0Var2 = this.f13202b;
                w0Var2.f13272i2.b(false);
                p.j(w0Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                w0 w0Var3 = this.f13202b;
                w0Var3.f13269f2 = w0Var3.Q1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                w0Var3.k1(true, true);
                w0Var3.j1(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                w0 w0Var4 = this.f13202b;
                w0Var4.dismiss();
                org.telegram.messenger.i0.h3(new l0(w0Var4, 1), 220L);
                return;
            case 4:
                w0 w0Var5 = this.f13202b;
                w0Var5.f13272i2.b(false);
                p.j(w0Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                w0 w0Var6 = this.f13202b;
                ArrayList arrayList = w0Var6.X1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                w0Var6.k1(true, true);
                return;
            default:
                w0 w0Var7 = this.f13202b;
                w0Var7.f13272i2.b(false);
                p.j(w0Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
