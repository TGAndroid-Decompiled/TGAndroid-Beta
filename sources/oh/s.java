package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n41;

public final class s implements Utilities.Callback2 {

    public final int f19571a;

    public final j0 f19572b;

    public s(j0 j0Var, int i10) {
        this.f19571a = i10;
        this.f19572b = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f19571a;
        j0 j0Var = this.f19572b;
        switch (i10) {
            case 0:
                j0Var.U((ArrayList) obj, true);
                break;
            case 1:
                j0.p(j0Var, (TLRPC.TL_error) obj2);
                break;
            case 2:
                j0.n(j0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                int i11 = j0.R;
                j0Var.U((ArrayList) obj, false);
                break;
            case 4:
                j0.B(j0Var, (ArrayList) obj);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                q0 q0Var = j0Var.I;
                arrayList.add(n41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(n41.D(0, AndroidUtilities.dp(48.0f)));
                int i12 = 2;
                if (ChatObject.canBlockUsers(j0Var.f19501f)) {
                    arrayList.add(n41.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new u(j0Var, i12)), true)));
                } else {
                    arrayList.add(n41.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(n41.j(2, j0Var.H));
                arrayList.add(n41.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", q0Var.f19556l, new Object[0])));
                q0Var.c(arrayList);
                break;
        }
    }
}
