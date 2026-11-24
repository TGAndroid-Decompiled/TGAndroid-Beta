package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class b9c implements qac {
    public final byte a;
    public final UserInfoActivity b;

    public b9c(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                va vaVar = userInfoActivity.y;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                }
                userInfoActivity.f0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        ts2.u(null, 2131751170, c41.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.f0(true);
                    va vaVar2 = userInfoActivity.y;
                    if (vaVar2 != null) {
                        vaVar2.g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
