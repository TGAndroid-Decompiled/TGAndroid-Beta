package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.p61;
public final class t implements Utilities.Callback2 {
    public final int f10048a;
    public final k0 f10049b;

    public t(k0 k0Var, int i10) {
        this.f10048a = i10;
        this.f10049b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f10048a;
        k0 k0Var = this.f10049b;
        switch (i10) {
            case 0:
                c71 c71Var = (c71) obj2;
                k0Var.V((ArrayList) obj, true);
                return;
            case 1:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                k0.q(k0Var, (TLRPC.TL_error) obj2);
                return;
            case 2:
                k0.p(k0Var, (ArrayList) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                c71 c71Var2 = (c71) obj2;
                int i11 = k0.V;
                k0Var.V((ArrayList) obj, false);
                return;
            case 4:
                c71 c71Var3 = (c71) obj2;
                k0.C(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var4 = (c71) obj2;
                t0 t0Var = k0Var.M;
                arrayList.add(p61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(p61.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f9993f)) {
                    arrayList.add(p61.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(p61.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(p61.j(2, k0Var.L));
                arrayList.add(p61.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.f10059l, new Object[0])));
                t0Var.c(arrayList);
                return;
        }
    }
}
