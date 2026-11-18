package bi;

import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.js0;
import org.telegram.ui.nl0;
import org.telegram.ui.p51;
public final class m6 implements q10 {
    public final int f3884a;
    public final Object f3885b;
    public final Object f3886c;

    public m6(int i7, Object obj, Object obj2) {
        this.f3884a = i7;
        this.f3885b = obj;
        this.f3886c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        String str = (String) obj2;
        ((vf.b) this.f3885b).b();
        ((nl0) this.f3886c).a((Boolean) obj);
    }

    private final void c(Object obj, Object obj2) {
        TLRPC.EmojiStatus emojiStatus;
        long longValue;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f3885b;
        js0 js0Var = (js0) this.f3886c;
        Long l10 = (Long) obj;
        Integer num = (Integer) obj2;
        if (l10 == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l10.longValue();
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
            }
            emojiStatus = tL_emojiStatus;
        }
        premiumPreviewFragment.getMessagesController().t5(emojiStatus, null);
        if (l10 == null) {
            longValue = 0;
        } else {
            longValue = l10.longValue();
        }
        js0Var.b(longValue, true);
    }

    private final void d(Object obj, Object obj2) {
        JSONArray jSONArray;
        String str;
        String str2 = (String) this.f3885b;
        x10 x10Var = (x10) this.f3886c;
        TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        byte[] bArr = null;
        if (apiresponse != null) {
            try {
                JSONObject jSONObject = new JSONObject(apiresponse.response.data);
                if (jSONObject.has("stack")) {
                    jSONArray = jSONObject.getJSONArray("stack");
                    if (jSONObject.has("exit_code") && jSONObject.getInt("exit_code") != 0) {
                        throw new Exception("received exit code: " + jSONObject.getInt("exit_code"));
                    }
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                    if (jSONObject2.has("exit_code") && jSONObject2.getInt("exit_code") != 0) {
                        throw new Exception("received exit code: " + jSONObject2.getInt("exit_code"));
                    }
                    jSONArray = jSONObject2.getJSONArray("stack");
                }
                if (jSONArray.get(0) instanceof JSONArray) {
                    str = jSONArray.getJSONArray(0).getString(1);
                } else if (jSONArray.get(0) instanceof JSONObject) {
                    str = jSONArray.getJSONObject(0).getString("value");
                } else {
                    str = "";
                }
                if (str.startsWith("0x")) {
                    bArr = Utilities.v(str.substring(2));
                }
            } catch (Exception e10) {
                org.telegram.ui.Wallet.u0.o("failed to get public key of " + str2, e10);
            }
        }
        x10Var.a(bArr);
    }

    private final void e(Object obj, Object obj2) {
        String str;
        org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.f3885b;
        org.telegram.ui.Wallet.v8 v8Var = (org.telegram.ui.Wallet.v8) this.f3886c;
        org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj;
        String str2 = (String) obj2;
        String str3 = "NULL_ERROR";
        if (r0Var == null) {
            if (str2 == null) {
                str = "NULL_ERROR";
            } else {
                str = str2;
            }
            org.telegram.ui.Wallet.u0.n("enable backup: didnt get secret phrase: ".concat(str));
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            v8Var.a(str2);
            return;
        }
        org.telegram.ui.Wallet.r0 b10 = r0Var.b();
        p51 p51Var = new p51(3, b10, v8Var);
        org.telegram.ui.Wallet.u0.P("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(u0Var.f45083a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new d3.b(1), new org.telegram.ui.Wallet.s(u0Var, p51Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 2));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.u0.o("failed to get public key from secret phrase", e10);
            if (e10.getMessage() != null) {
                str3 = e10.getMessage();
            }
            p51Var.a(str3);
        }
    }

    @Override
    public final void a(java.lang.Object r35, java.lang.Object r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m6.a(java.lang.Object, java.lang.Object):void");
    }

    public m6(org.telegram.ui.Wallet.u0 u0Var, String str, x10 x10Var) {
        this.f3884a = 27;
        this.f3885b = str;
        this.f3886c = x10Var;
    }
}
