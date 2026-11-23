package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.td0;
public final class gt implements v0.g {
    public final td0 f24401a;
    public final Context f24402b;
    public final int f24403c;

    public gt(td0 td0Var, Context context, int i7) {
        this.f24401a = td0Var;
        this.f24402b = context;
        this.f24403c = i7;
    }

    @Override
    public final void T(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z10 = iVar instanceof w0.k;
        td0 td0Var = this.f24401a;
        if (z10) {
            td0Var.a(0L, null, "EMPTY");
        } else if (iVar instanceof w0.g) {
            td0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            td0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            td0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override
    public final void onResult(Object obj) {
        final td0 td0Var = this.f24401a;
        com.google.android.gms.common.api.q qVar = ((v0.n) obj).f59150a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) qVar.f6389a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.f28703id = jSONObject.getString("id");
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
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, this.f24402b, null);
            t1Var.r(500L);
            int i7 = this.f24403c;
            if (parseInt != ConnectionsManager.getInstance(i7).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i7).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i7).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i7).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i7).sendRequestTyped(finishpasskeylogin, new d3.b(1), new o9(t1Var, td0Var, parseLong, 3), parseInt, 72);
            final int i10 = this.f24403c;
            t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i10).cancelRequest(sendRequestTyped, true);
                    td0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            td0Var.a(0L, null, e10.getMessage());
        }
    }
}
