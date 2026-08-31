package hg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class t0 implements Utilities.Callback {
    public final int f7609a;
    public final b1 f7610b;

    public t0(b1 b1Var, int i10) {
        this.f7609a = i10;
        this.f7610b = b1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7609a) {
            case 0:
                Void r42 = (Void) obj;
                b1 b1Var = this.f7610b;
                b1Var.dismiss();
                AndroidUtilities.runOnUIThread(new q0(b1Var, 2), 220L);
                return;
            case 1:
                b1 b1Var2 = this.f7610b;
                b1Var2.f7414n0.b(false);
                r.j(b1Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                b1 b1Var3 = this.f7610b;
                b1Var3.f7412k0 = b1Var3.V.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                b1Var3.a0(true, true);
                b1Var3.Z(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                b1 b1Var4 = this.f7610b;
                b1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new q0(b1Var4, 1), 220L);
                return;
            case 4:
                b1 b1Var5 = this.f7610b;
                b1Var5.f7414n0.b(false);
                r.j(b1Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                b1 b1Var6 = this.f7610b;
                ArrayList arrayList = b1Var6.f7404c0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                b1Var6.a0(true, true);
                return;
            default:
                b1 b1Var7 = this.f7610b;
                b1Var7.f7414n0.b(false);
                r.j(b1Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
