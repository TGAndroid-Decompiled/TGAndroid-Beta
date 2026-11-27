package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oz7 implements h23 {
    public final ih6 a;
    public final Context b;
    public final int c;

    public oz7(ih6 ih6Var, Context context, int i) {
        this.a = ih6Var;
        this.b = context;
        this.c = i;
    }

    @Override
    public final void B(Object obj) {
        yu4 yu4Var = (yu4) obj;
        boolean z = yu4Var instanceof om7;
        ih6 ih6Var = this.a;
        if (z) {
            ih6Var.a(0L, null, "EMPTY");
        } else if (yu4Var instanceof vu4) {
            ih6Var.a(0L, null, "CANCELLED");
        } else if (yu4Var instanceof zu4) {
            ih6Var.a(0L, null, "CANCELLED");
        } else if (yu4Var != null) {
            ih6Var.a(0L, null, yu4Var.getMessage());
        }
    }

    @Override
    public final void onResult(Object obj) {
        final ih6 ih6Var = this.a;
        e23 e23Var = ((bv4) obj).a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) e23Var.a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.id = jSONObject.getString("id");
            finishpasskeylogin.credential.raw_id = jSONObject.getString("rawId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            TL_account.inputPasskeyResponseLogin inputpasskeyresponselogin = new TL_account.inputPasskeyResponseLogin();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            inputpasskeyresponselogin.client_data = tL_dataJSON;
            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
            inputpasskeyresponselogin.authenticator_data = Base64.decode(jSONObject2.getString("authenticatorData"), 8);
            inputpasskeyresponselogin.signature = Base64.decode(jSONObject2.getString("signature"), 8);
            String str = new String(Base64.decode(jSONObject2.getString("userHandle"), 8));
            inputpasskeyresponselogin.user_handle = str;
            int parseInt = Integer.parseInt(str.split(":")[0]);
            final long parseLong = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
            finishpasskeylogin.credential.response = inputpasskeyresponselogin;
            id idVar = new id(3, null, this.b);
            idVar.q(500L);
            int i = this.c;
            if (parseInt != ConnectionsManager.getInstance(i).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags |= 1;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(finishpasskeylogin, new ic((byte) 0), new iv4(idVar, ih6Var, parseLong, (byte) 4), parseInt, 72);
            final int i2 = this.c;
            idVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i2).cancelRequest(sendRequestTyped, true);
                    ih6Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e) {
            cc4.g(e, true);
            ih6Var.a(0L, null, e.getMessage());
        }
    }
}
