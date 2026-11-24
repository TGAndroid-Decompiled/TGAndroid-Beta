package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
public final class hrc implements jac {
    public final byte a;
    public final rrc b;

    public hrc(rrc rrcVar, byte b) {
        this.a = b;
        this.b = rrcVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 8;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                rrcVar.q0((TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    rrcVar.f0 = wallettransaction.fee;
                    rrcVar.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                rrcVar.r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    rrcVar.finishFragment();
                    return;
                }
                rrcVar.e = walletuseraddress;
                if (walletuseraddress != null) {
                    rrcVar.h = walletuseraddress.address;
                }
                va vaVar = rrcVar.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                }
                rrcVar.C0();
                rrcVar.s0();
                zqc zqcVar = rrcVar.w;
                if (zqcVar != null) {
                    zqcVar.a(rrcVar.h, rrcVar.f);
                    return;
                }
                return;
            case 3:
                rrcVar.h0 = (String) obj;
                rrcVar.i0 = ((Boolean) obj2).booleanValue();
                rrcVar.Q.setText(rrcVar.h0);
                TextView textView = rrcVar.Q;
                if (!TextUtils.isEmpty(rrcVar.h0)) {
                    i = 0;
                }
                textView.setVisibility(i);
                rrcVar.E0();
                return;
            default:
                rrcVar.h0 = (String) obj;
                rrcVar.i0 = ((Boolean) obj2).booleanValue();
                rrcVar.Q.setText(rrcVar.h0);
                TextView textView2 = rrcVar.Q;
                if (!TextUtils.isEmpty(rrcVar.h0)) {
                    i = 0;
                }
                textView2.setVisibility(i);
                rrcVar.E0();
                return;
        }
    }
}
