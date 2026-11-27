package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.UserInfoActivity;
public final class abc implements pcc {
    public final byte a;
    public final UserInfoActivity b;

    public abc(UserInfoActivity userInfoActivity, byte b) {
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
                wa waVar = userInfoActivity.y;
                if (waVar != null) {
                    waVar.g3.O(true);
                }
                userInfoActivity.e0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        bs2.v(null, 2131751198, d31.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.e0(true);
                    wa waVar2 = userInfoActivity.y;
                    if (waVar2 != null) {
                        waVar2.g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
