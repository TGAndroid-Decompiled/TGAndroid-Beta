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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.Wallet.c;
public final class pn1 implements icc {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public pn1(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        e S;
        byte b = this.a;
        TLRPC.Updates updates = null;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj4;
                zu1Var.getClass();
                hl.c3(new l77(zu1Var, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, (byte) 8));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                tg5 tg5Var = (tg5) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    uc7.s1(launchActivity.P).Y3(updates, false);
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    hl.c3(new tg5(launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, (byte) 18));
                }
                hl.c3(new l77(launchActivity, tg5Var, tL_error, updates, this.b, (byte) 17));
                return;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse) {
                    d31.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    return;
                } else if (tL_error2 != null) {
                    d31.b0(passkeysActivity).g0(tL_error2, false);
                    arrayList.add(Utilities.j(i, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    return;
                } else {
                    return;
                }
            case 3:
                icc iccVar = (icc) obj4;
                Context context = (Context) obj3;
                d13 d13Var = (d13) obj;
                Throwable th = (Throwable) obj2;
                if (!(th instanceof u03) && !(th instanceof y03)) {
                    if (th instanceof z03) {
                        hl.c3(new g25(iccVar, (byte) 2));
                        return;
                    } else if (th != null) {
                        cc4.g(th, true);
                        hl.c3(new ql7(iccVar, th, (byte) 19));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(d13Var.a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
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
                            cc4.b(sb.toString());
                            registerpasskey.credential.response = inputpasskeyresponseregister;
                            hl.c3(new y36(context, this.b, registerpasskey, iccVar, (byte) 18));
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            hl.c3(new h25(iccVar, e, (byte) 3));
                            return;
                        }
                    }
                }
                hl.c3(new g25(iccVar, (byte) 1));
                return;
            case 4:
                pcc pccVar = (pcc) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((a5c) obj4).G;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i));
                    pccVar.a(tL_textWithEntities);
                    return;
                } else if (tL_error3 != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error3.text) && (S = LaunchActivity.S()) != null) {
                        v21 K = d31.b0(S).K(2131624211, ob6.M0(2131743984, null), ob6.M0(2131743983, null), new ds8(S, (byte) 28));
                        K.j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i));
                    pccVar.a(null);
                    return;
                } else {
                    return;
                }
            default:
                wsc wscVar = (wsc) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                wscVar.g1 = 0;
                if (cardVar2 != null) {
                    wsc.e0(i, cardVar2);
                    if (!wscVar.b1) {
                        if (wscVar.e1) {
                            wscVar.c1 = cardVar2;
                            wscVar.d1 = wsc.T(cardVar2);
                            wscVar.Q();
                            return;
                        }
                        wscVar.d(cardVar2);
                        return;
                    }
                    return;
                }
                if (cardVar != null) {
                    wsc.e0(i, cardVar);
                }
                if (!wscVar.b1) {
                    if (tL_error4 != null) {
                        d31.b0(wscVar.a).g0(tL_error4, false);
                        if ("WALLET_NFT_NOT_OWNED".equals(tL_error4.text)) {
                            wscVar.E1 = true;
                            c.C(i).A().d();
                        }
                    }
                    wscVar.e1 = false;
                    TL_wallet.card cardVar3 = wscVar.c1;
                    if (cardVar3 != null) {
                        wscVar.d(cardVar3);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public pn1(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
