package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Base64;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.qd0;
public final class et implements v0.h {
    public final qd0 f22397a;
    public final Context f22398b;
    public final int f22399c;

    public et(qd0 qd0Var, Context context, int i3) {
        this.f22397a = qd0Var;
        this.f22398b = context;
        this.f22399c = i3;
    }

    @Override
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        boolean z10 = iVar instanceof w0.k;
        qd0 qd0Var = this.f22397a;
        if (z10) {
            qd0Var.a(0L, null, "EMPTY");
        } else if (iVar instanceof w0.g) {
            qd0Var.a(0L, null, "CANCELLED");
        } else if (iVar instanceof w0.j) {
            qd0Var.a(0L, null, "CANCELLED");
        } else if (iVar != null) {
            qd0Var.a(0L, null, iVar.getMessage());
        }
    }

    @Override
    public final void onResult(Object obj) {
        final qd0 qd0Var = this.f22397a;
        ci.u0 u0Var = ((v0.n) obj).f56433a;
        TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
        finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
        try {
            JSONObject jSONObject = new JSONObject(((Bundle) u0Var.f6076a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
            finishpasskeylogin.credential.f27212id = jSONObject.getString("id");
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
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, this.f22398b, null);
            s1Var.r(500L);
            int i3 = this.f22399c;
            if (parseInt != ConnectionsManager.getInstance(i3).getCurrentDatacenterId()) {
                int currentDatacenterId = ConnectionsManager.getInstance(i3).getCurrentDatacenterId();
                long currentAuthKeyId = ConnectionsManager.getInstance(i3).getCurrentAuthKeyId();
                ConnectionsManager.getInstance(i3).setDefaultDatacenterId(parseInt);
                finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                finishpasskeylogin.from_dc_id = currentDatacenterId;
                finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
            }
            final int sendRequestTyped = ConnectionsManager.getInstance(i3).sendRequestTyped(finishpasskeylogin, new c3.b(1), new k9(s1Var, qd0Var, parseLong, 3), parseInt, 72);
            final int i10 = this.f22399c;
            s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ConnectionsManager.getInstance(i10).cancelRequest(sendRequestTyped, true);
                    qd0Var.a(Long.valueOf(parseLong), null, "CANCELLED");
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            qd0Var.a(0L, null, e10.getMessage());
        }
    }
}
