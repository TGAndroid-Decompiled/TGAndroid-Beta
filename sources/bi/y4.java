package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class y4 implements Utilities.Callback {
    public final int f5755a;
    public final int f5756b;
    public final String f5757c;
    public final Object d;
    public final Object e;
    public final Object f5758f;

    public y4(Object obj, Object obj2, Object obj3, int i10, String str, int i11) {
        this.f5755a = i11;
        this.d = obj;
        this.e = obj2;
        this.f5758f = obj3;
        this.f5756b = i10;
        this.f5757c = str;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.User user;
        int i10 = this.f5755a;
        Object obj2 = this.f5758f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new x1(context, u6Var, this.f5756b, this.f5757c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                qf.c cVar = (qf.c) obj2;
                Long l4 = (Long) obj;
                Pattern pattern = LaunchActivity.D1;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = messagesController.getUser(l4);
                } else {
                    user = null;
                }
                int i11 = this.f5756b;
                if (user != null && !UserObject.isUserSelf(user)) {
                    launchActivity.Z(i11, user, this.f5757c, cVar);
                    return;
                }
                if (cVar != null) {
                    cVar.b();
                }
                if (user != null) {
                    launchActivity.n0(i11, user.f22177id, null);
                    return;
                }
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    wh.n(R.string.NoUsernameFound, org.telegram.ui.Components.wc.b0(R), null);
                    return;
                }
                return;
        }
    }
}
