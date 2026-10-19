package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class c5 implements Utilities.Callback {
    public final int f1066a;
    public final int f1067b;
    public final String f1068c;
    public final Object d;
    public final Object e;
    public final Object f1069f;

    public c5(Object obj, Object obj2, Object obj3, int i10, String str, int i11) {
        this.f1066a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1069f = obj3;
        this.f1067b = i10;
        this.f1068c = str;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.User user;
        int i10 = this.f1066a;
        Object obj2 = this.f1069f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new a2(context, d6Var, this.f1067b, this.f1068c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                pf.c cVar = (pf.c) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.C1;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = messagesController.getUser(l4);
                } else {
                    user = null;
                }
                int i11 = this.f1067b;
                if (user != null && !UserObject.isUserSelf(user)) {
                    launchActivity.Z(i11, user, this.f1068c, cVar);
                    return;
                }
                if (cVar != null) {
                    cVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i11, user.f20422id, null);
                    return;
                }
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    lk.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0(R), null);
                    return;
                }
                return;
        }
    }
}
