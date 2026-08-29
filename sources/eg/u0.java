package eg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class u0 implements Utilities.Callback {
    public final int f6139a;
    public final c1 f6140b;

    public u0(c1 c1Var, int i10) {
        this.f6139a = i10;
        this.f6140b = c1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6139a) {
            case 0:
                Void r42 = (Void) obj;
                c1 c1Var = this.f6140b;
                c1Var.dismiss();
                AndroidUtilities.runOnUIThread(new r0(c1Var, 2), 220L);
                return;
            case 1:
                c1 c1Var2 = this.f6140b;
                c1Var2.m0.b(false);
                s.j(c1Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                c1 c1Var3 = this.f6140b;
                c1Var3.f5944j0 = c1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                c1Var3.a0(true, true);
                c1Var3.Z(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                c1 c1Var4 = this.f6140b;
                c1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new r0(c1Var4, 1), 220L);
                return;
            case 4:
                c1 c1Var5 = this.f6140b;
                c1Var5.m0.b(false);
                s.j(c1Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                c1 c1Var6 = this.f6140b;
                ArrayList arrayList = c1Var6.f5936b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                c1Var6.a0(true, true);
                return;
            default:
                c1 c1Var7 = this.f6140b;
                c1Var7.m0.b(false);
                s.j(c1Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
