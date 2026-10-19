package hi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
public final class s implements Utilities.Callback2 {
    public final int f12218a;
    public final k0 f12219b;

    public s(k0 k0Var, int i10) {
        this.f12218a = i10;
        this.f12219b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f12218a;
        k0 k0Var = this.f12219b;
        switch (i10) {
            case 0:
                t61 t61Var = (t61) obj2;
                k0Var.V((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                k0.p(k0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                k0.o(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                t61 t61Var2 = (t61) obj2;
                int i11 = k0.V;
                k0Var.V((ArrayList) obj, false);
                return;
            case 4:
                t61 t61Var3 = (t61) obj2;
                k0.B(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                t61 t61Var4 = (t61) obj2;
                s0 s0Var = k0Var.M;
                arrayList.add(g61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(g61.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f12172f)) {
                    arrayList.add(g61.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(g61.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(g61.j(2, k0Var.L));
                arrayList.add(g61.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", s0Var.f12228l, new Object[0])));
                s0Var.c(arrayList);
                return;
        }
    }
}
