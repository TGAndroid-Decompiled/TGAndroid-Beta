package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
public final class t implements Utilities.Callback2 {
    public final int f9972a;
    public final k0 f9973b;

    public t(k0 k0Var, int i10) {
        this.f9972a = i10;
        this.f9973b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f9972a;
        k0 k0Var = this.f9973b;
        switch (i10) {
            case 0:
                u61 u61Var = (u61) obj2;
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
                u61 u61Var2 = (u61) obj2;
                int i11 = k0.V;
                k0Var.S((ArrayList) obj, false);
                return;
            case 4:
                u61 u61Var3 = (u61) obj2;
                k0.z(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var4 = (u61) obj2;
                t0 t0Var = k0Var.M;
                arrayList.add(g61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(g61.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f9917f)) {
                    arrayList.add(g61.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(g61.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(g61.j(2, k0Var.L));
                arrayList.add(g61.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.f9983l, new Object[0])));
                t0Var.c(arrayList);
                return;
        }
    }
}
