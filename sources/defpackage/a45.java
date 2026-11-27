package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class a45 implements icc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public a45(a55 a55Var, v35 v35Var, c35 c35Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        this.a = (byte) 3;
        this.b = a55Var;
        this.d = v35Var;
        this.e = c35Var;
        this.f = tonconnectsession;
        this.c = str;
        this.g = bArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TL_wallet.tonConnectSession tonconnectsession;
        CharSequence V;
        int i = 0;
        switch (this.a) {
            case 0:
                a55 a55Var = (a55) this.b;
                x56 x56Var = (x56) this.d;
                String str = (String) this.c;
                String str2 = (String) this.e;
                String str3 = (String) this.f;
                String str4 = (String) this.g;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                a55Var.getClass();
                if (tL_error == null && tonconnectsession2 != null) {
                    ArrayList arrayList = a55Var.d;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj3;
                        if (tonconnectsession3.id == tonconnectsession2.id && (tonconnectsession3.manifest != null || tonconnectsession3.manifest_error != null || tonconnectsession3.closed || tonconnectsession3.closing)) {
                            tonconnectsession = tonconnectsession3;
                            a55Var.p(tonconnectsession);
                            x56Var.a(new v45(tonconnectsession, str, str2, str3, str4), null);
                            return;
                        }
                    }
                    tonconnectsession = tonconnectsession2;
                    a55Var.p(tonconnectsession);
                    x56Var.a(new v45(tonconnectsession, str, str2, str3, str4), null);
                    return;
                }
                x56Var.a(null, a55.z(tL_error, "createSession"));
                return;
            case 1:
                a55 a55Var2 = (a55) this.b;
                v35 v35Var = (v35) this.d;
                TL_wallet.tonConnectSession tonconnectsession4 = (TL_wallet.tonConnectSession) this.e;
                String str5 = (String) this.c;
                byte[] bArr = (byte[]) this.f;
                v45 v45Var = (v45) this.g;
                c35 c35Var = (c35) obj;
                String str6 = (String) obj2;
                a55Var2.getClass();
                if (str6 == null) {
                    if (c35Var == null) {
                        str6 = "Recovery phrase is unavailable";
                    } else {
                        c35 b = c35Var.b();
                        Utilities.e.c(new ra7(a55Var2, b, tonconnectsession4, str5, bArr, v45Var, new v35(b, v35Var, (byte) 0), (byte) 8));
                        return;
                    }
                }
                v35Var.a(str6);
                return;
            case 2:
                a55 a55Var3 = (a55) this.b;
                qe2 qe2Var = (qe2) this.d;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.e;
                String str7 = (String) this.c;
                byte[] bArr2 = (byte[]) this.f;
                JSONArray jSONArray = (JSONArray) this.g;
                TL_wallet.tonConnectSession tonconnectsession5 = (TL_wallet.tonConnectSession) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                c cVar = a55Var3.b;
                if (tL_error2 == null && tonconnectsession5 != null) {
                    if (tonconnectsession5.id == tL_urlAuthResultRequest.tc_session_id && tL_urlAuthResultRequest.tc_client_id.equals(tonconnectsession5.dapp_client_id) && !tonconnectsession5.closed && !tonconnectsession5.closing && tonconnectsession5.nonce != null && TextUtils.equals(str7, cVar.x()) && Arrays.equals(bArr2, cVar.D())) {
                        cVar.E(true, false, false, new z35(a55Var3, qe2Var, tonconnectsession5, str7, bArr2, jSONArray, tL_urlAuthResultRequest));
                        return;
                    } else {
                        qe2Var.a(null, "Wallet or TON Connect session changed. Open the request again.");
                        return;
                    }
                }
                qe2Var.a(null, a55.z(tL_error2, "createSession"));
                return;
            case 3:
                a55 a55Var4 = (a55) this.b;
                v35 v35Var2 = (v35) this.d;
                c35 c35Var2 = (c35) this.e;
                TL_wallet.tonConnectSession tonconnectsession6 = (TL_wallet.tonConnectSession) this.f;
                String str8 = (String) this.c;
                byte[] bArr3 = (byte[]) this.g;
                TL_wallet.tonConnectNextEventId tonconnectnexteventid = (TL_wallet.tonConnectNextEventId) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                a55Var4.getClass();
                if (tL_error3 == null && tonconnectnexteventid != null) {
                    Utilities.e.c(new ra7(a55Var4, c35Var2, tonconnectsession6, str8, bArr3, tonconnectnexteventid, v35Var2, (byte) 10));
                    return;
                } else {
                    v35Var2.a(a55.z(tL_error3, "getNextEventId"));
                    return;
                }
            case 4:
                n55 n55Var = (n55) this.b;
                int[] iArr = (int[]) this.d;
                c cVar2 = (c) this.c;
                TextView textView = (TextView) this.e;
                z45 z45Var = (z45) this.f;
                ao1 ao1Var = (ao1) this.g;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str9 = (String) obj2;
                if (!n55Var.e && !n55Var.d) {
                    if (wallettransaction != null && wallettransaction.traceSucceeded && !wallettransaction.traceIncomplete) {
                        iArr[0] = 1;
                        SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                        CharSequence q = cVar2.q(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(q)) {
                            V = ob6.V(null, null, 2131742770, r);
                        } else {
                            V = ob6.V(null, null, 2131742769, r, q);
                        }
                        textView.setText(V);
                    } else if (cVar2.z() < z45Var.c) {
                        iArr[0] = 2;
                        textView.setText(ob6.M0(2131742716, null));
                    } else {
                        iArr[0] = 3;
                        textView.setText(ob6.M0(2131742617, null));
                        if (str9 != null) {
                            a55.m("widget preview", str9);
                        }
                    }
                    ao1Var.run();
                    return;
                }
                return;
            default:
                wua wuaVar = (wua) this.b;
                TextView textView2 = (TextView) this.c;
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = (TL_stars.starGiftDepositPayload[]) this.e;
                Runnable[] runnableArr = (Runnable[]) this.f;
                long[] jArr = (long[]) this.g;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (!((boolean[]) this.d)[0]) {
                    if (stargiftdepositpayload == null) {
                        textView2.setVisibility(8);
                        return;
                    }
                    stargiftdepositpayloadArr[0] = stargiftdepositpayload;
                    if (c.C(wuaVar.a).z() < stargiftdepositpayload.amount) {
                        textView2.setVisibility(8);
                        return;
                    } else {
                        runnableArr[0] = c.C(wuaVar.a).j(stargiftdepositpayload, new ia7(textView2, jArr, (byte) 10));
                        return;
                    }
                }
                return;
        }
    }

    public a45(a55 a55Var, Object obj, TLObject tLObject, String str, byte[] bArr, Object obj2, byte b) {
        this.a = b;
        this.b = a55Var;
        this.d = obj;
        this.e = tLObject;
        this.c = str;
        this.f = bArr;
        this.g = obj2;
    }

    public a45(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
