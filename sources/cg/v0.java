package cg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class v0 implements Utilities.Callback {

    public final int f2838a;

    public final d1 f2839b;

    public v0(d1 d1Var, int i10) {
        this.f2838a = i10;
        this.f2839b = d1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2838a) {
            case 0:
                d1 d1Var = this.f2839b;
                d1Var.dismiss();
                AndroidUtilities.runOnUIThread(new r0(d1Var, 2), 220L);
                break;
            case 1:
                d1 d1Var2 = this.f2839b;
                d1Var2.m0.b(false);
                r.j(d1Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                d1 d1Var3 = this.f2839b;
                d1Var3.f2643j0 = d1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                d1Var3.a0(true, true);
                d1Var3.Z(true);
                break;
            case 3:
                d1 d1Var4 = this.f2839b;
                d1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new r0(d1Var4, 1), 220L);
                break;
            case 4:
                d1 d1Var5 = this.f2839b;
                d1Var5.m0.b(false);
                r.j(d1Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                d1 d1Var6 = this.f2839b;
                ArrayList arrayList = d1Var6.f2635b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                d1Var6.a0(true, true);
                break;
            default:
                d1 d1Var7 = this.f2839b;
                d1Var7.m0.b(false);
                r.j(d1Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
