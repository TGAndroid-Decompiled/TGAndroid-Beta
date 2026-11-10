package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.wd0;
public final class nt implements v0.g {
    public final wd0 f24232a;
    public final Context f24233b;
    public final int f24234c;

    public nt(wd0 wd0Var, Context context, int i7) {
        this.f24232a = wd0Var;
        this.f24233b = context;
        this.f24234c = i7;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z9 = iVar instanceof w0.k;
        wd0 wd0Var = this.f24232a;
        if (z9) {
            wd0Var.a(0L, null, "EMPTY");
        } else if (iVar instanceof w0.g) {
            wd0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            wd0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            wd0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override
    public final void onResult(Object obj) {
        final wd0 wd0Var = this.f24232a;
        bi.b1 b1Var = ((v0.o) obj).f56984a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) b1Var.f3503a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.f27171id = jSONObject.getString("id");
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
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, this.f24233b, null);
            u1Var.r(500L);
            int i7 = this.f24234c;
            if (parseInt != ConnectionsManager.getInstance(i7).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i7).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i7).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i7).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i7).sendRequestTyped(finishpasskeylogin, new d3.b(1), new q9(u1Var, wd0Var, parseLong, 3), parseInt, 72);
            final int i10 = this.f24234c;
            u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i10).cancelRequest(sendRequestTyped, true);
                    wd0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            wd0Var.a(0L, null, e10.getMessage());
        }
    }
}
