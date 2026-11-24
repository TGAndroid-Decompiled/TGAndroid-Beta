package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.Wallet.c;
public final class wm1 implements i8c {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public wm1(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        d S;
        byte b = this.a;
        TLRPC.Updates updates = null;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj4;
                mu1Var.getClass();
                gl.c3(new i57(mu1Var, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, (byte) 8));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                kz5 kz5Var = (kz5) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    na7.q1(launchActivity.P).R3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    gl.c3(new hb5(launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, (byte) 22));
                }
                gl.c3(new i57(launchActivity, kz5Var, tL_error, updates, this.b, (byte) 16));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    u21.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    u21.b0(passkeysActivity).g0(tL_error2, false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    return;
                } else {
                    return;
                }
            case 3:
                i8c i8cVar = (i8c) obj4;
                Context context = (Context) obj3;
                k03 k03Var = (k03) obj;
                Throwable th = (Throwable) obj2;
                if (!(th instanceof b03) && !(th instanceof f03)) {
                    if (th instanceof g03) {
                        gl.c3(new c05(i8cVar, (byte) 2));
                        return;
                    } else if (th != null) {
                        fa4.g(th, true);
                        gl.c3(new bj7(i8cVar, th, (byte) 20));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(k03Var.a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                            registerpasskey.credential = inputpasskeycredentialpublickey;
                            inputpasskeycredentialpublickey.id = jSONObject.getString("id");
                            registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                            TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            inputpasskeyresponseregister.client_data = tL_dataJSON;
                            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                            inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                            StringBuilder sb = new StringBuilder();
                            sb.append("AAGUID: ");
                            byte[] copyOfRange = Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83);
                            StringBuilder sb2 = new StringBuilder(copyOfRange.length << 1);
                            int length = copyOfRange.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                sb2.append(String.format("%02x", Byte.valueOf(copyOfRange[i2])));
                            }
                            sb.append(sb2.toString());
                            fa4.b(sb.toString());
                            registerpasskey.credential.response = inputpasskeyresponseregister;
                            gl.c3(new q76(context, this.b, registerpasskey, i8cVar, (byte) 16));
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            gl.c3(new d05(i8cVar, e, (byte) 3));
                            return;
                        }
                    }
                }
                gl.c3(new c05(i8cVar, (byte) 1));
                return;
            case 4:
                p8c p8cVar = (p8c) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((b1c) obj4).G;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i));
                    p8cVar.a(tL_textWithEntities);
                    return;
                } else if (tL_error3 != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error3.text) && (S = LaunchActivity.S()) != null) {
                        m21 K = u21.b0(S).K(2131624211, k96.M0(2131744090, null), k96.M0(2131744089, null), new ro8(S, (byte) 28));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i));
                    p8cVar.a(null);
                    return;
                } else {
                    return;
                }
            default:
                koc kocVar = (koc) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                kocVar.g1 = 0;
                if (cardVar2 != null) {
                    koc.e0(i, cardVar2);
                    if (!kocVar.b1) {
                        if (kocVar.e1) {
                            kocVar.c1 = cardVar2;
                            kocVar.d1 = koc.T(cardVar2);
                            kocVar.Q();
                            return;
                        }
                        kocVar.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    koc.e0(i, cardVar);
                }
                if (!kocVar.b1) {
                    if (tL_error4 != null) {
                        u21.b0(kocVar.a).g0(tL_error4, false);
                        if ("WALLET_NFT_NOT_OWNED".equals(tL_error4.text)) {
                            kocVar.E1 = true;
                            c.C(i).A().d();
                        }
                    }
                    kocVar.e1 = false;
                    TL_wallet.card cardVar3 = kocVar.c1;
                    if (cardVar3 != null) {
                        kocVar.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wm1(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
