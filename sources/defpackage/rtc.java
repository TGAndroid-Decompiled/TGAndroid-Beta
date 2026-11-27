package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
public final class rtc implements icc {
    public final byte a;
    public final euc b;

    public rtc(euc eucVar, byte b) {
        this.a = b;
        this.b = eucVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 8;
        euc eucVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                eucVar.p0((TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    eucVar.f0 = wallettransaction.fee;
                    eucVar.D0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                eucVar.r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    eucVar.finishFragment();
                    return;
                }
                eucVar.e = walletuseraddress;
                if (walletuseraddress != null) {
                    eucVar.h = walletuseraddress.address;
                }
                wa waVar = eucVar.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                }
                eucVar.C0();
                eucVar.r0();
                ktc ktcVar = eucVar.w;
                if (ktcVar != null) {
                    ktcVar.a(eucVar.h, eucVar.f);
                    return;
                }
                return;
            case 3:
                eucVar.h0 = (String) obj;
                eucVar.i0 = ((Boolean) obj2).booleanValue();
                eucVar.Q.setText(eucVar.h0);
                TextView textView = eucVar.Q;
                if (!TextUtils.isEmpty(eucVar.h0)) {
                    i = 0;
                }
                textView.setVisibility(i);
                eucVar.E0();
                return;
            default:
                eucVar.h0 = (String) obj;
                eucVar.i0 = ((Boolean) obj2).booleanValue();
                eucVar.Q.setText(eucVar.h0);
                TextView textView2 = eucVar.Q;
                if (!TextUtils.isEmpty(eucVar.h0)) {
                    i = 0;
                }
                textView2.setVisibility(i);
                eucVar.E0();
                return;
        }
    }
}
