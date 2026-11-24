package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
public final class fpc implements i8c {
    public final byte a;
    public final qpc b;

    public fpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 8;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                qpcVar.p0((TL_wallet.walletUserAddress) obj);
                return;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction != null) {
                    qpcVar.f0 = wallettransaction.fee;
                    qpcVar.C0();
                    return;
                }
                return;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                qpcVar.r = false;
                if (TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    qpcVar.finishFragment();
                    return;
                }
                qpcVar.e = walletuseraddress;
                if (walletuseraddress != null) {
                    qpcVar.h = walletuseraddress.address;
                }
                va vaVar = qpcVar.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                }
                qpcVar.B0();
                qpcVar.r0();
                xoc xocVar = qpcVar.w;
                if (xocVar != null) {
                    xocVar.a(qpcVar.h, qpcVar.f);
                    return;
                }
                return;
            case 3:
                qpcVar.h0 = (String) obj;
                qpcVar.i0 = ((Boolean) obj2).booleanValue();
                qpcVar.Q.setText(qpcVar.h0);
                TextView textView = qpcVar.Q;
                if (!TextUtils.isEmpty(qpcVar.h0)) {
                    i = 0;
                }
                textView.setVisibility(i);
                qpcVar.D0();
                return;
            default:
                qpcVar.h0 = (String) obj;
                qpcVar.i0 = ((Boolean) obj2).booleanValue();
                qpcVar.Q.setText(qpcVar.h0);
                TextView textView2 = qpcVar.Q;
                if (!TextUtils.isEmpty(qpcVar.h0)) {
                    i = 0;
                }
                textView2.setVisibility(i);
                qpcVar.D0();
                return;
        }
    }
}
