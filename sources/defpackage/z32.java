package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class z32 implements icc {
    public final byte a;
    public final h42 b;

    public z32(h42 h42Var, byte b) {
        this.a = b;
        this.b = h42Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        h42 h42Var = this.b;
        switch (b) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                TLRPC.User user = h42Var.r;
                if (!h42Var.L) {
                    h42Var.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        h42Var.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        h42Var.H = walletuseraddress.address;
                        h42Var.I = walletuseraddress.public_key;
                    }
                    h42Var.w.a(h42Var.H, user);
                    h42Var.h0();
                    h42Var.X();
                    return;
                }
                return;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (!h42Var.L && wallettransaction != null) {
                    h42Var.h0 = wallettransaction.fee;
                    h42Var.i0();
                    return;
                }
                return;
        }
    }
}
