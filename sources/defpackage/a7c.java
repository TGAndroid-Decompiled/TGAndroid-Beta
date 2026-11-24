package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class a7c implements p8c {
    public final byte a;
    public final UserInfoActivity b;

    public a7c(UserInfoActivity userInfoActivity, byte b) {
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
                userInfoActivity.e0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        ir2.v(null, 2131751221, u21.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.e0(true);
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
