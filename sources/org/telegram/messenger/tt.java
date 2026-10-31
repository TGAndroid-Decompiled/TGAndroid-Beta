package org.telegram.messenger;

import android.content.Context;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class tt implements j20 {
    public final int f18104a = 0;
    public final int f18105b;
    public final Object f18106c;
    public final Object d;

    public tt(int i10, Context context, j20 j20Var) {
        this.f18106c = j20Var;
        this.d = context;
        this.f18105b = i10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        org.telegram.ui.ActionBar.k2 T;
        int i10 = this.f18104a;
        Object obj3 = this.d;
        Object obj4 = this.f18106c;
        switch (i10) {
            case 0:
                final j20 j20Var = (j20) obj4;
                Context context = (Context) obj3;
                v0.c cVar = (v0.c) obj;
                Throwable th2 = (Throwable) obj2;
                if (!(th2 instanceof w0.b) && !(th2 instanceof w0.e)) {
                    if (th2 instanceof w0.f) {
                        i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        j20Var.a(null, "CANCELLED");
                                        return;
                                    default:
                                        j20Var.a(null, "EMPTY");
                                        return;
                                }
                            }
                        });
                        return;
                    } else if (th2 != null) {
                        f8.g(th2, true);
                        i0.g3(new hr(13, j20Var, th2));
                        return;
                    } else {
                        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                        try {
                            JSONObject jSONObject = new JSONObject(cVar.f50272a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                            registerpasskey.credential = inputpasskeycredentialpublickey;
                            inputpasskeycredentialpublickey.f20003id = jSONObject.getString("id");
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
                            for (int i11 = 0; i11 < length; i11++) {
                                sb3.append(String.format("%02x", Byte.valueOf(copyOfRange[i11])));
                            }
                            sb2.append(sb3.toString());
                            f8.b(sb2.toString());
                            registerpasskey.credential.response = inputpasskeyresponseregister;
                            i0.g3(new cg(context, this.f18105b, registerpasskey, j20Var, 16));
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
                            i0.g3(new ut(j20Var, e, 1));
                            return;
                        }
                    }
                }
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                j20Var.a(null, "CANCELLED");
                                return;
                            default:
                                j20Var.a(null, "EMPTY");
                                return;
                        }
                    }
                });
                return;
            default:
                q20 q20Var = (q20) obj3;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashSet hashSet = ((t10) obj4).F;
                int i12 = this.f18105b;
                if (tL_textWithEntities != null) {
                    hashSet.remove(Integer.valueOf(i12));
                    q20Var.a(tL_textWithEntities);
                    return;
                } else if (tL_error != null) {
                    if ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && (T = LaunchActivity.T()) != null) {
                        org.telegram.ui.Components.wb K = org.telegram.ui.Components.cc.a0(T).K(2131624214, cd.L0(2131744357, null), cd.L0(2131744356, null), new xn(3, T));
                        K.f32135j = 5000;
                        K.k(true);
                    }
                    hashSet.remove(Integer.valueOf(i12));
                    q20Var.a(null);
                    return;
                } else {
                    return;
                }
        }
    }

    public tt(t10 t10Var, int i10, q20 q20Var) {
        this.f18106c = t10Var;
        this.f18105b = i10;
        this.d = q20Var;
    }
}
