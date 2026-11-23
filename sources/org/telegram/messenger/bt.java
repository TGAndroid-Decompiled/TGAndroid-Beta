package org.telegram.messenger;

import android.content.Context;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class bt implements p10 {
    public final int f23252a = 0;
    public final int f23253b;
    public final Object f23254c;
    public final Object d;

    public bt(int i7, Context context, p10 p10Var) {
        this.f23254c = p10Var;
        this.d = context;
        this.f23253b = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.g2 T;
        int i7 = this.f23252a;
        Object obj3 = this.d;
        Object obj4 = this.f23254c;
        switch (i7) {
            case 0:
                final p10 p10Var = (p10) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                if (!(th2 instanceof w0.b) && !(th2 instanceof w0.e)) {
                    if (th2 instanceof w0.f) {
                        g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        p10Var.a(null, "CANCELLED");
                                        return;
                                    default:
                                        p10Var.a(null, "EMPTY");
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (th2 != null) {
                        a8.g(th2, true);
                        g0.g3(new rq(17, p10Var, th2));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(cVar.f59141a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                            registerpasskey.credential = inputpasskeycredentialpublickey;
                            inputpasskeycredentialpublickey.f28703id = jSONObject.getString("id");
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
                            g0.g3(new dg(context, this.f23253b, registerpasskey, p10Var, 15));
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            g0.g3(new ct(p10Var, e10, 1));
                            return;
                        }
                    }
                }
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                p10Var.a(null, "CANCELLED");
                                return;
                            default:
                                p10Var.a(null, "EMPTY");
                                return;
                        }
                    }
                });
                return;
            default:
                w10 w10Var = (w10) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((y00) obj4).G;
                int i11 = this.f23253b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i11));
                    w10Var.a(tL_textWithEntities);
                    return;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.fc K = org.telegram.ui.Components.kc.b0(T).K(2131624217, gd.N0(2131744086, null), gd.N0(2131744085, null), new ln(3, T));
                        K.f35091j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i11));
                    w10Var.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    public bt(y00 y00Var, int i7, w10 w10Var) {
        this.f23254c = y00Var;
        this.f23253b = i7;
        this.d = w10Var;
    }
}
