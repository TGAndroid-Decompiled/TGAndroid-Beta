package org.telegram.messenger;

import android.content.Context;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class et implements s10 {
    public final int f23364a = 0;
    public final int f23365b;
    public final Object f23366c;
    public final Object d;

    public et(int i7, Context context, s10 s10Var) {
        this.f23366c = s10Var;
        this.d = context;
        this.f23365b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.e2 T;
        int i7 = this.f23364a;
        Object obj3 = this.d;
        Object obj4 = this.f23366c;
        switch (i7) {
            case 0:
                final s10 s10Var = (s10) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                if (!(th2 instanceof w0.b) && !(th2 instanceof w0.e)) {
                    if (th2 instanceof w0.f) {
                        g0.h3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        s10Var.a(null, "CANCELLED");
                                        return;
                                    default:
                                        s10Var.a(null, "EMPTY");
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (th2 != null) {
                        a8.g(th2, true);
                        g0.h3(new pq(16, s10Var, th2));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(cVar.f58449a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                            registerpasskey.credential = inputpasskeycredentialpublickey;
                            inputpasskeycredentialpublickey.f28262id = jSONObject.getString("id");
                            registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                            TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            inputpasskeyresponseregister.client_data = tL_dataJSON;
                            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                            inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("AAGUID: ");
                            byte[] copyOfRange = Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83);
                            StringBuilder sb3 = new StringBuilder(copyOfRange.length * 2);
                            int length = copyOfRange.length;
                            for (int i10 = 0; i10 < length; i10++) {
                                sb3.append(String.format("%02x", Byte.valueOf(copyOfRange[i10])));
                            }
                            sb2.append(sb3.toString());
                            a8.b(sb2.toString());
                            registerpasskey.credential.response = inputpasskeyresponseregister;
                            g0.h3(new cg(context, this.f23365b, registerpasskey, s10Var, 16));
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            g0.h3(new ft(s10Var, e10, 1));
                            return;
                        }
                    }
                }
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                s10Var.a(null, "CANCELLED");
                                return;
                            default:
                                s10Var.a(null, "EMPTY");
                                return;
                        }
                    }
                });
                return;
            default:
                z10 z10Var = (z10) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((c10) obj4).G;
                int i11 = this.f23365b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i11));
                    z10Var.a(tL_textWithEntities);
                    return;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.xb K = org.telegram.ui.Components.cc.a0(T).K(2131624217, hd.M0(2131744331, null), hd.M0(2131744330, null), new on(3, T));
                        K.f41635j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i11));
                    z10Var.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    public et(c10 c10Var, int i7, z10 z10Var) {
        this.f23366c = c10Var;
        this.f23365b = i7;
        this.d = z10Var;
    }
}
