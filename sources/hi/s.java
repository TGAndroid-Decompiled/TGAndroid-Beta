package hi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
public final class s implements Utilities.Callback2 {
    public final int f12217a;
    public final k0 f12218b;

    public s(k0 k0Var, int i10) {
        this.f12217a = i10;
        this.f12218b = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f12217a;
        k0 k0Var = this.f12218b;
        switch (i10) {
            case 0:
                s61 s61Var = (s61) obj2;
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
                s61 s61Var2 = (s61) obj2;
                int i11 = k0.V;
                k0Var.V((ArrayList) obj, false);
                return;
            case 4:
                s61 s61Var3 = (s61) obj2;
                k0.B(k0Var, (ArrayList) obj);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var4 = (s61) obj2;
                s0 s0Var = k0Var.M;
                arrayList.add(f61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
                arrayList.add(f61.D(0, AndroidUtilities.dp(48.0f)));
                if (ChatObject.canBlockUsers(k0Var.f12171f)) {
                    arrayList.add(f61.A(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new v(k0Var, 2)), true)));
                } else {
                    arrayList.add(f61.A(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
                }
                arrayList.add(f61.j(2, k0Var.L));
                arrayList.add(f61.s(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", s0Var.f12227l, new Object[0])));
                s0Var.c(arrayList);
                return;
        }
    }
}
