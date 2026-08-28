package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class s implements Utilities.Callback2 {
    public final int f18722a;
    public final j0 f18723b;

    public s(j0 j0Var, int i9) {
        this.f18722a = i9;
        this.f18723b = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9 = this.f18722a;
        j0 j0Var = this.f18723b;
        switch (i9) {
            case 0:
                z41 z41Var = (z41) obj2;
                j0Var.T((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                j0.o(j0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                j0.n(j0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                z41 z41Var2 = (z41) obj2;
                int i10 = j0.R;
                j0Var.T((ArrayList) obj, false);
                return;
            case 4:
                z41 z41Var3 = (z41) obj2;
                j0.z(j0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var4 = (z41) obj2;
                q0 q0Var = j0Var.I;
                arrayList.add(l41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(l41.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(j0Var.f18652f)) {
                    arrayList.add(l41.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new u(j0Var, 2)), true)));
                } else {
                    arrayList.add(l41.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(l41.j(2, j0Var.H));
                arrayList.add(l41.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", q0Var.f18707l, new Object[0])));
                q0Var.c(arrayList);
                return;
        }
    }
}
