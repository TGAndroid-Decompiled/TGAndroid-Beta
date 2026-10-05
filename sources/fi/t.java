package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
public final class t implements Utilities.Callback2 {
    public final int f9973a;
    public final k0 f9974b;

    public t(k0 k0Var, int i10) {
        this.f9973a = i10;
        this.f9974b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f9973a;
        k0 k0Var = this.f9974b;
        switch (i10) {
            case 0:
                w61 w61Var = (w61) obj2;
                k0Var.S((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                k0.o(k0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                k0.n(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                w61 w61Var2 = (w61) obj2;
                int i11 = k0.V;
                k0Var.S((ArrayList) obj, false);
                return;
            case 4:
                w61 w61Var3 = (w61) obj2;
                k0.z(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var4 = (w61) obj2;
                t0 t0Var = k0Var.M;
                arrayList.add(h61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(h61.E(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f9918f)) {
                    arrayList.add(h61.B(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(h61.B(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(h61.j(2, k0Var.L));
                arrayList.add(h61.t(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.f9984l, new Object[0])));
                t0Var.c(arrayList);
                return;
        }
    }
}
