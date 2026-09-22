package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y51;
public final class t implements Utilities.Callback2 {
    public final int f9177a;
    public final k0 f9178b;

    public t(k0 k0Var, int i10) {
        this.f9177a = i10;
        this.f9178b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f9177a;
        k0 k0Var = this.f9178b;
        switch (i10) {
            case 0:
                m61 m61Var = (m61) obj2;
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
                m61 m61Var2 = (m61) obj2;
                int i11 = k0.V;
                k0Var.U((ArrayList) obj, false);
                return;
            case 4:
                m61 m61Var3 = (m61) obj2;
                k0.z(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var4 = (m61) obj2;
                t0 t0Var = k0Var.M;
                arrayList.add(y51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(y51.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f9127f)) {
                    arrayList.add(y51.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(y51.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(y51.j(2, k0Var.L));
                arrayList.add(y51.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", t0Var.f9187l, new Object[0])));
                t0Var.c(arrayList);
                return;
        }
    }
}
