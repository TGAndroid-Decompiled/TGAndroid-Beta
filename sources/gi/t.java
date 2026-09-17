package gi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class t implements Utilities.Callback2 {
    public final int f10795a;
    public final k0 f10796b;

    public t(k0 k0Var, int i10) {
        this.f10795a = i10;
        this.f10796b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f10795a;
        k0 k0Var = this.f10796b;
        switch (i10) {
            case 0:
                v51 v51Var = (v51) obj2;
                k0Var.U((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                k0.o(k0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                k0.n(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                v51 v51Var2 = (v51) obj2;
                int i11 = k0.V;
                k0Var.U((ArrayList) obj, false);
                return;
            case 4:
                v51 v51Var3 = (v51) obj2;
                k0.A(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var4 = (v51) obj2;
                t0 t0Var = k0Var.M;
                arrayList.add(h51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(h51.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f10740f)) {
                    arrayList.add(h51.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(h51.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(h51.j(2, k0Var.L));
                arrayList.add(h51.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.f10806l, new Object[0])));
                t0Var.c(arrayList);
                return;
        }
    }
}
