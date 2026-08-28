package bg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z0 implements Utilities.Callback {
    public final int f2009a;
    public final h1 f2010b;

    public z0(h1 h1Var, int i9) {
        this.f2009a = i9;
        this.f2010b = h1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2009a) {
            case 0:
                Void r42 = (Void) obj;
                h1 h1Var = this.f2010b;
                h1Var.dismiss();
                AndroidUtilities.runOnUIThread(new v0(h1Var, 2), 220L);
                return;
            case 1:
                h1 h1Var2 = this.f2010b;
                h1Var2.m0.b(false);
                u.j(h1Var2.getContext(), (TLRPC.TL_error) obj);
                return;
            case 2:
                h1 h1Var3 = this.f2010b;
                h1Var3.f1817j0 = h1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                h1Var3.Z(true, true);
                h1Var3.Y(true);
                return;
            case 3:
                Void r43 = (Void) obj;
                h1 h1Var4 = this.f2010b;
                h1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new v0(h1Var4, 1), 220L);
                return;
            case 4:
                h1 h1Var5 = this.f2010b;
                h1Var5.m0.b(false);
                u.j(h1Var5.getContext(), (TLRPC.TL_error) obj);
                return;
            case 5:
                h1 h1Var6 = this.f2010b;
                ArrayList arrayList = h1Var6.f1809b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                h1Var6.Z(true, true);
                return;
            default:
                h1 h1Var7 = this.f2010b;
                h1Var7.m0.b(false);
                u.j(h1Var7.getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
