package ii;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
public final class s implements Utilities.Callback2 {
    public final int f14428a;
    public final j0 f14429b;

    public s(j0 j0Var, int i10) {
        this.f14428a = i10;
        this.f14429b = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f14428a;
        j0 j0Var = this.f14429b;
        switch (i10) {
            case 0:
                j71 j71Var = (j71) obj2;
                j0Var.e0((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                j0.o(j0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                j0.n(j0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                j71 j71Var2 = (j71) obj2;
                int i11 = j0.V;
                j0Var.e0((ArrayList) obj, false);
                return;
            case 4:
                j71 j71Var3 = (j71) obj2;
                j0.D(j0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var4 = (j71) obj2;
                r0 r0Var = j0Var.M;
                arrayList.add(t61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(t61.E(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(j0Var.f14360f)) {
                    arrayList.add(t61.B(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new u(j0Var, 2)), true)));
                } else {
                    arrayList.add(t61.B(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(t61.j(2, j0Var.L));
                arrayList.add(t61.t(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", r0Var.f14421l, new Object[0])));
                r0Var.c(arrayList);
                return;
        }
    }
}
