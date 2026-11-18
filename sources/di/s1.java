package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.m90;
import org.telegram.ui.p51;
public final class s1 implements q10 {
    public final int f9697a;
    public final Object f9698b;
    public final Object f9699c;
    public final Object d;
    public final Object f9700e;
    public final Object f9701f;
    public final Object f9702g;

    public s1(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, int i7) {
        this.f9697a = i7;
        this.f9698b = obj;
        this.f9699c = obj2;
        this.d = obj3;
        this.f9700e = obj4;
        this.f9701f = serializable;
        this.f9702g = obj5;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        m90 m90Var;
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f9697a) {
            case 0:
                f6 f6Var = (f6) this.f9698b;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.f9700e;
                Runnable[] runnableArr = (Runnable[]) this.f9701f;
                long[] jArr = (long[]) this.f9702g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!((boolean[]) this.f9699c)[0]) {
                    if (stargiftdepositpayload == null) {
                        textView.setVisibility(8);
                        return;
                    }
                    stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                    if (org.telegram.ui.Wallet.u0.D(f6Var.f30187a).A() < stargiftdepositpayload.amount) {
                        textView.setVisibility(8);
                        return;
                    } else {
                        runnableArr[0] = org.telegram.ui.Wallet.u0.D(f6Var.f30187a).k(stargiftdepositpayload, new bi.l6(2, textView, jArr));
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f9698b;
                m90 m90Var2 = (m90) this.f9699c;
                String str = (String) this.d;
                String str2 = (String) this.f9700e;
                String str3 = (String) this.f9701f;
                String str4 = (String) this.f9702g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l2Var.getClass();
                if (tL_error2 == null && tonconnectsession2 != null) {
                    ArrayList arrayList = l2Var.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                            m90Var = m90Var2;
                            if (tonconnectsession.f28665id != tonconnectsession2.f28665id || (tonconnectsession.manifest == null && tonconnectsession.manifest_error == null && !tonconnectsession.closed && !tonconnectsession.closing)) {
                                m90Var2 = m90Var;
                            }
                        } else {
                            m90Var = m90Var2;
                            tonconnectsession = tonconnectsession2;
                        }
                    }
                    l2Var.p(tonconnectsession);
                    m90Var.a(new org.telegram.ui.Wallet.g2(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                m90Var2.a(null, org.telegram.ui.Wallet.l2.z(tL_error2, "createSession"));
                return;
            case 2:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.f9698b;
                p51 p51Var = (p51) this.f9699c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str5 = (String) this.f9700e;
                byte[] bArr = (byte[]) this.f9701f;
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) this.f9702g;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
                String str6 = (String) obj2;
                l2Var2.getClass();
                if (str6 == null && r0Var != null) {
                    org.telegram.ui.Wallet.r0 b10 = r0Var.b();
                    Utilities.f22779e.c(new m6(l2Var2, b10, tonconnectsession3, str5, bArr, g2Var, new p51(11, b10, p51Var), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                p51Var.a(str6);
                return;
            case 3:
                org.telegram.ui.Wallet.l2 l2Var3 = (org.telegram.ui.Wallet.l2) this.f9698b;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f9699c;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String str7 = (String) this.f9700e;
                byte[] bArr2 = (byte[]) this.f9701f;
                JSONArray jSONArray = (JSONArray) this.f9702g;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Wallet.u0 u0Var = l2Var3.f44480b;
                if (tL_error3 == null && tonconnectsession4 != null) {
                    if (tonconnectsession4.f28665id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession4.dapp_client_id) && !tonconnectsession4.closed && !tonconnectsession4.closing && tonconnectsession4.nonce != null && TextUtils.equals(str7, u0Var.y()) && Arrays.equals(bArr2, u0Var.E())) {
                        u0Var.F(true, false, false, new org.telegram.ui.Wallet.l1(l2Var3, e0Var, tonconnectsession4, str7, bArr2, jSONArray, tL_urlAuthResultRequest));
                        return;
                    } else {
                        e0Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                e0Var.a(null, org.telegram.ui.Wallet.l2.z(tL_error3, "createSession"));
                return;
            case 4:
                org.telegram.ui.Wallet.l2 l2Var4 = (org.telegram.ui.Wallet.l2) this.f9698b;
                p51 p51Var2 = (p51) this.f9699c;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.d;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f9700e;
                String str8 = (String) this.f9701f;
                byte[] bArr3 = (byte[]) this.f9702g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                l2Var4.getClass();
                if (tL_error4 == null && tonconnectnexteventid != null) {
                    Utilities.f22779e.c(new m6(l2Var4, r0Var2, tonconnectsession5, str8, bArr3, tonconnectnexteventid, p51Var2, 13));
                    return;
                } else {
                    p51Var2.a(org.telegram.ui.Wallet.l2.z(tL_error4, "getNextEventId"));
                    return;
                }
            default:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) this.f9698b;
                int[] iArr = (int[]) this.f9699c;
                org.telegram.ui.Wallet.u0 u0Var2 = (org.telegram.ui.Wallet.u0) this.f9700e;
                TextView textView2 = (TextView) this.d;
                org.telegram.ui.Wallet.k2 k2Var = (org.telegram.ui.Wallet.k2) this.f9701f;
                org.telegram.ui.Wallet.v7 v7Var = (org.telegram.ui.Wallet.v7) this.f9702g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!y2Var.f45302e && !y2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.u0.s(wallettransaction.fee, true);
                        CharSequence r10 = u0Var2.r(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(r10)) {
                            V = gd.V(null, null, 2131742881, s5);
                        } else {
                            V = gd.V(null, null, 2131742880, s5, r10);
                        }
                        textView2.setText(V);
                    } else if (u0Var2.A() < k2Var.f44437c) {
                        iArr[0] = 2;
                        textView2.setText(gd.M0(2131742827, null));
                    } else {
                        iArr[0] = 3;
                        textView2.setText(gd.M0(2131742728, null));
                        if (str9 != null) {
                            org.telegram.ui.Wallet.l2.m("widget preview", str9);
                        }
                    }
                    v7Var.run();
                    return;
                }
                return;
        }
    }

    public s1(org.telegram.ui.Wallet.y2 y2Var, int[] iArr, org.telegram.ui.Wallet.u0 u0Var, TextView textView, org.telegram.ui.Wallet.k2 k2Var, org.telegram.ui.Wallet.v7 v7Var) {
        this.f9697a = 5;
        this.f9698b = y2Var;
        this.f9699c = iArr;
        this.f9700e = u0Var;
        this.d = textView;
        this.f9701f = k2Var;
        this.f9702g = v7Var;
    }
}
