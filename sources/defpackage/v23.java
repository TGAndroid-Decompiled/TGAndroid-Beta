package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class v23 extends q23 {
    public final Context e;
    public h23 f;
    public Executor g;
    public CancellationSignal h;
    public final q13 i;

    public v23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new q13(this, new Handler(Looper.getMainLooper()), (byte) 2);
    }

    public static u13 e(tx8 tx8Var) {
        JSONObject jSONObject;
        try {
            d50 d50Var = tx8Var.f;
            gfe gfeVar = tx8Var.c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (gfeVar != null && gfeVar.p().length > 0) {
                    jSONObject2.put("rawId", lsd.b(gfeVar.p()));
                }
                String str = tx8Var.n;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = tx8Var.b;
                if (str2 != null && d50Var == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = tx8Var.a;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                b50 b50Var = tx8Var.e;
                boolean z = true;
                if (b50Var != null) {
                    jSONObject = b50Var.b();
                } else {
                    c50 c50Var = tx8Var.d;
                    if (c50Var != null) {
                        jSONObject = c50Var.b();
                    } else {
                        z = false;
                        if (d50Var != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", (int) d50Var.a.a);
                                String str5 = d50Var.b;
                                if (str5 != null) {
                                    jSONObject3.put("message", str5);
                                }
                                str4 = "error";
                                jSONObject = jSONObject3;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                z40 z40Var = tx8Var.h;
                if (z40Var != null) {
                    jSONObject2.put("clientExtensionResults", z40Var.b());
                } else if (z) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                jSONObject4.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new u13(jSONObject4, bundle);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            throw new v03("The PublicKeyCredential response json had an unexpected exception when parsing: " + message, (byte) 2);
        }
    }

    public final vx8 d(t13 t13Var) {
        Double d;
        y40 y40Var;
        f50 f50Var;
        y40 y40Var2;
        ra4 ra4Var;
        h15 h15Var;
        tbc tbcVar;
        pd9 pd9Var;
        cy cyVar;
        String str;
        String str2;
        JSONArray jSONArray;
        String str3;
        ArrayList arrayList;
        long j;
        LinkedHashMap linkedHashMap = ux8.a;
        String str4 = t13Var.d;
        Context context = this.e;
        context.getClass();
        if (i05.e.c(context, j05.a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                packageInfo.getClass();
                j = go.u(packageInfo);
            } else {
                j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j > 241217000) {
                return new vx8(str4);
            }
        }
        JSONObject jSONObject = new JSONObject(str4);
        byte[] a = mwe.a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str5 = "id";
        String string = jSONObject2.getString("id");
        string.getClass();
        int i = 11;
        byte[] decode = Base64.decode(string, 11);
        decode.getClass();
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        string3.getClass();
        if (string3.length() != 0) {
            if (decode.length != 0) {
                string2.getClass();
                if (string2.length() != 0) {
                    by8 by8Var = new by8(string2, decode, optString, string3);
                    JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
                    String string4 = jSONObject3.getString("id");
                    String optString2 = jSONObject3.optString("name", "");
                    String optString3 = jSONObject3.optString("icon", "");
                    optString3.getClass();
                    if (optString3.length() == 0) {
                        optString3 = null;
                    }
                    optString2.getClass();
                    if (optString2.length() != 0) {
                        string4.getClass();
                        if (string4.length() != 0) {
                            yx8 yx8Var = new yx8(string4, optString2, optString3);
                            JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                                LinkedHashMap linkedHashMap2 = ux8.a;
                                int i3 = i2;
                                int i4 = (int) jSONObject4.getLong("alg");
                                String optString4 = jSONObject4.optString("type", "");
                                optString4.getClass();
                                if (optString4.length() != 0) {
                                    try {
                                        t51.a(i4);
                                        arrayList2.add(new xx8(optString4, i4));
                                    } catch (Throwable unused) {
                                    }
                                    i2 = i3 + 1;
                                } else {
                                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            LinkedHashMap linkedHashMap3 = ux8.a;
                            if (jSONObject.has("excludeCredentials")) {
                                JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
                                int length2 = jSONArray3.length();
                                int i5 = 0;
                                while (i5 < length2) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i5);
                                    LinkedHashMap linkedHashMap4 = ux8.a;
                                    String string5 = jSONObject5.getString(str5);
                                    string5.getClass();
                                    byte[] decode2 = Base64.decode(string5, i);
                                    decode2.getClass();
                                    String string6 = jSONObject5.getString("type");
                                    string6.getClass();
                                    if (string6.length() != 0) {
                                        if (decode2.length != 0) {
                                            if (jSONObject5.has("transports")) {
                                                jSONArray = jSONArray3;
                                                arrayList = new ArrayList();
                                                JSONArray jSONArray4 = jSONObject5.getJSONArray("transports");
                                                int length3 = jSONArray4.length();
                                                str3 = str5;
                                                int i6 = 0;
                                                while (i6 < length3) {
                                                    try {
                                                        int i7 = i6;
                                                        arrayList.add(Transport.a(jSONArray4.getString(i6)));
                                                        i6 = i7 + 1;
                                                    } catch (b5c e) {
                                                        throw new s13(new i1((byte) 4), e.getMessage());
                                                    }
                                                }
                                                continue;
                                            } else {
                                                jSONArray = jSONArray3;
                                                str3 = str5;
                                                arrayList = null;
                                            }
                                            arrayList3.add(new wx8(string6, decode2, arrayList));
                                            i5++;
                                            jSONArray3 = jSONArray;
                                            str5 = str3;
                                            i = 11;
                                        } else {
                                            throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                                        }
                                    } else {
                                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                                    }
                                }
                            }
                            LinkedHashMap linkedHashMap5 = ux8.a;
                            String str6 = "none";
                            String optString5 = jSONObject.optString("attestation", "none");
                            optString5.getClass();
                            if (optString5.length() != 0) {
                                str6 = optString5;
                            }
                            ey a2 = ey.a(str6);
                            if (jSONObject.has("timeout")) {
                                d = Double.valueOf(jSONObject.getLong("timeout") / 1000.0d);
                            } else {
                                d = null;
                            }
                            if (jSONObject.has("authenticatorSelection")) {
                                JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
                                boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
                                String optString6 = jSONObject6.optString("residentKey", "");
                                optString6.getClass();
                                if (optString6.length() > 0) {
                                    pd9Var = pd9.a(optString6);
                                } else {
                                    pd9Var = null;
                                }
                                Boolean valueOf = Boolean.valueOf(optBoolean);
                                String optString7 = jSONObject6.optString("authenticatorAttachment", "");
                                optString7.getClass();
                                if (optString7.length() > 0) {
                                    cyVar = cy.a(optString7);
                                } else {
                                    cyVar = null;
                                }
                                if (cyVar == null) {
                                    str = null;
                                } else {
                                    str = cyVar.a;
                                }
                                if (pd9Var == null) {
                                    str2 = null;
                                } else {
                                    str2 = pd9Var.a;
                                }
                                y40Var = null;
                                f50Var = new f50(str, valueOf, null, str2);
                            } else {
                                y40Var = null;
                                f50Var = null;
                            }
                            if (jSONObject.has("extensions")) {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
                                String optString8 = jSONObject7.optString("appid", "");
                                optString8.getClass();
                                if (optString8.length() > 0) {
                                    ra4Var = new ra4(optString8);
                                } else {
                                    ra4Var = y40Var;
                                }
                                if (jSONObject7.optBoolean("thirdPartyPayment", false)) {
                                    h15Var = new h15(true);
                                } else {
                                    h15Var = y40Var;
                                }
                                if (jSONObject7.optBoolean("uvm", false)) {
                                    tbcVar = new tbc(true);
                                } else {
                                    tbcVar = y40Var;
                                }
                                y40Var2 = new y40(ra4Var, null, tbcVar, null, null, null, null, null, h15Var, null, null, null);
                            } else {
                                y40Var2 = y40Var;
                            }
                            return new vx8(yx8Var, by8Var, a, arrayList2, d, arrayList3, f50Var, null, null, a2.a, y40Var2, null, null);
                        }
                        throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
                    }
                    throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
                }
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
    }
}
