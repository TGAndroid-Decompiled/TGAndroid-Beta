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
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.a31;
import org.telegram.ui.l90;
public final class s1 implements p10 {
    public final int f9692a;
    public final Object f9693b;
    public final Object f9694c;
    public final Object d;
    public final Object f9695e;
    public final Object f9696f;
    public final Object f9697g;

    public s1(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, int i7) {
        this.f9692a = i7;
        this.f9693b = obj;
        this.f9694c = obj2;
        this.d = obj3;
        this.f9695e = obj4;
        this.f9696f = serializable;
        this.f9697g = obj5;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        l90 l90Var;
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        switch (this.f9692a) {
            case 0:
                f6 f6Var = (f6) this.f9693b;
                TextView textView = (TextView) this.d;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.f9695e;
                Runnable[] runnableArr = (Runnable[]) this.f9696f;
                long[] jArr = (long[]) this.f9697g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!((boolean[]) this.f9694c)[0]) {
                    if (stargiftdepositpayload == null) {
                        textView.setVisibility(8);
                        return;
                    }
                    stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                    if (org.telegram.ui.Wallet.v0.D(f6Var.f30223a).A() < stargiftdepositpayload.amount) {
                        textView.setVisibility(8);
                        return;
                    } else {
                        runnableArr[0] = org.telegram.ui.Wallet.v0.D(f6Var.f30223a).k(stargiftdepositpayload, new bi.r6(2, textView, jArr));
                        return;
                    }
                }
                return;
            case 1:
                org.telegram.ui.Wallet.m2 m2Var = (org.telegram.ui.Wallet.m2) this.f9693b;
                l90 l90Var2 = (l90) this.f9694c;
                String str = (String) this.d;
                String str2 = (String) this.f9695e;
                String str3 = (String) this.f9696f;
                String str4 = (String) this.f9697g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m2Var.getClass();
                if (tL_error2 == null && tonconnectsession2 != null) {
                    ArrayList arrayList = m2Var.d;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            tonconnectsession = (TL_wallet.tonConnectSession) obj3;
                            l90Var = l90Var2;
                            if (tonconnectsession.f28754id != tonconnectsession2.f28754id || (tonconnectsession.manifest == null && tonconnectsession.manifest_error == null && !tonconnectsession.closed && !tonconnectsession.closing)) {
                                l90Var2 = l90Var;
                            }
                        } else {
                            l90Var = l90Var2;
                            tonconnectsession = tonconnectsession2;
                        }
                    }
                    m2Var.p(tonconnectsession);
                    l90Var.a(new org.telegram.ui.Wallet.h2(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                l90Var2.a(null, org.telegram.ui.Wallet.m2.z(tL_error2, "createSession"));
                return;
            case 2:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) this.f9693b;
                a31 a31Var = (a31) this.f9694c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str5 = (String) this.f9695e;
                byte[] bArr = (byte[]) this.f9696f;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f9697g;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj;
                String str6 = (String) obj2;
                m2Var2.getClass();
                if (str6 == null && s0Var != null) {
                    org.telegram.ui.Wallet.s0 b10 = s0Var.b();
                    Utilities.f22877e.c(new m6(m2Var2, b10, tonconnectsession3, str5, bArr, h2Var, new a31(12, b10, a31Var), 11));
                    return;
                }
                if (str6 == null) {
                    str6 = "Recovery phrase is unavailable";
                }
                a31Var.a(str6);
                return;
            case 3:
                org.telegram.ui.Wallet.m2 m2Var3 = (org.telegram.ui.Wallet.m2) this.f9693b;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f9694c;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.d;
                String str7 = (String) this.f9695e;
                byte[] bArr2 = (byte[]) this.f9696f;
                JSONArray jSONArray = (JSONArray) this.f9697g;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Wallet.v0 v0Var = m2Var3.f44649b;
                if (tL_error3 == null && tonconnectsession4 != null) {
                    if (tonconnectsession4.f28754id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession4.dapp_client_id) && !tonconnectsession4.closed && !tonconnectsession4.closing && tonconnectsession4.nonce != null && TextUtils.equals(str7, v0Var.y()) && Arrays.equals(bArr2, v0Var.E())) {
                        v0Var.F(true, false, false, new org.telegram.ui.Wallet.m1(m2Var3, f0Var, tonconnectsession4, str7, bArr2, jSONArray, tL_urlAuthResultRequest));
                        return;
                    } else {
                        f0Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                f0Var.a(null, org.telegram.ui.Wallet.m2.z(tL_error3, "createSession"));
                return;
            case 4:
                org.telegram.ui.Wallet.m2 m2Var4 = (org.telegram.ui.Wallet.m2) this.f9693b;
                a31 a31Var2 = (a31) this.f9694c;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.d;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) this.f9695e;
                String str8 = (String) this.f9696f;
                byte[] bArr3 = (byte[]) this.f9697g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                m2Var4.getClass();
                if (tL_error4 == null && tonconnectnexteventid != null) {
                    Utilities.f22877e.c(new m6(m2Var4, s0Var2, tonconnectsession5, str8, bArr3, tonconnectnexteventid, a31Var2, 13));
                    return;
                } else {
                    a31Var2.a(org.telegram.ui.Wallet.m2.z(tL_error4, "getNextEventId"));
                    return;
                }
            default:
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) this.f9693b;
                int[] iArr = (int[]) this.f9694c;
                org.telegram.ui.Wallet.v0 v0Var2 = (org.telegram.ui.Wallet.v0) this.f9695e;
                TextView textView2 = (TextView) this.d;
                org.telegram.ui.Wallet.l2 l2Var = (org.telegram.ui.Wallet.l2) this.f9696f;
                org.telegram.ui.Wallet.w7 w7Var = (org.telegram.ui.Wallet.w7) this.f9697g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!z2Var.f45474e && !z2Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.v0.s(wallettransaction.fee, true);
                        CharSequence r10 = v0Var2.r(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(r10)) {
                            V = gd.V(null, null, 2131742868, s5);
                        } else {
                            V = gd.V(null, null, 2131742867, s5, r10);
                        }
                        textView2.setText(V);
                    } else if (v0Var2.A() < l2Var.f44608c) {
                        iArr[0] = 2;
                        textView2.setText(gd.N0(2131742814, null));
                    } else {
                        iArr[0] = 3;
                        textView2.setText(gd.N0(2131742715, null));
                        if (str9 != null) {
                            org.telegram.ui.Wallet.m2.m("widget preview", str9);
                        }
                    }
                    w7Var.run();
                    return;
                }
                return;
        }
    }

    public s1(org.telegram.ui.Wallet.z2 z2Var, int[] iArr, org.telegram.ui.Wallet.v0 v0Var, TextView textView, org.telegram.ui.Wallet.l2 l2Var, org.telegram.ui.Wallet.w7 w7Var) {
        this.f9692a = 5;
        this.f9693b = z2Var;
        this.f9694c = iArr;
        this.f9695e = v0Var;
        this.d = textView;
        this.f9696f = l2Var;
        this.f9697g = w7Var;
    }
}
