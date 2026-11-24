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
public final class d23 extends y13 {
    public final Context e;
    public o13 f;
    public Executor g;
    public CancellationSignal h;
    public final x03 i;

    public d23(Context context) {
        context.getClass();
        this.e = context;
        this.i = new x03(this, new Handler(Looper.getMainLooper()), (byte) 2);
    }

    public static b13 e(ku8 ku8Var) {
        JSONObject jSONObject;
        try {
            b50 b50Var = ku8Var.f;
            qae qaeVar = ku8Var.c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (qaeVar != null && qaeVar.p().length > 0) {
                    jSONObject2.put("rawId", und.b(qaeVar.p()));
                }
                String str = ku8Var.n;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = ku8Var.b;
                if (str2 != null && b50Var == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = ku8Var.a;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                z40 z40Var = ku8Var.e;
                boolean z = true;
                if (z40Var != null) {
                    jSONObject = z40Var.b();
                } else {
                    a50 a50Var = ku8Var.d;
                    if (a50Var != null) {
                        jSONObject = a50Var.b();
                    } else {
                        z = false;
                        if (b50Var != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", (int) b50Var.a.a);
                                String str5 = b50Var.b;
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
                x40 x40Var = ku8Var.h;
                if (x40Var != null) {
                    jSONObject2.put("clientExtensionResults", x40Var.b());
                } else if (z) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                jSONObject4.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new b13(jSONObject4, bundle);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            String message = th.getMessage();
            throw new c03("The PublicKeyCredential response json had an unexpected exception when parsing: " + message, (byte) 2);
        }
    }

    public final mu8 d(a13 a13Var) {
        Double d;
        w40 w40Var;
        d50 d50Var;
        w40 w40Var2;
        v84 v84Var;
        dz4 dz4Var;
        t7c t7cVar;
        ba9 ba9Var;
        ay ayVar;
        String str;
        String str2;
        JSONArray jSONArray;
        String str3;
        ArrayList arrayList;
        long j;
        LinkedHashMap linkedHashMap = lu8.a;
        String str4 = a13Var.d;
        Context context = this.e;
        context.getClass();
        if (cy4.e.c(context, dy4.a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                packageInfo.getClass();
                j = fo.u(packageInfo);
            } else {
                j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j > 241217000) {
                return new mu8(str4);
            }
        }
        JSONObject jSONObject = new JSONObject(str4);
        byte[] a = ure.a(jSONObject);
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
                    su8 su8Var = new su8(string2, decode, optString, string3);
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
                            pu8 pu8Var = new pu8(string4, optString2, optString3);
                            JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArray2.length();
                            int i2 = 0;
                            while (i2 < length) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                                LinkedHashMap linkedHashMap2 = lu8.a;
                                int i3 = i2;
                                int i4 = (int) jSONObject4.getLong("alg");
                                String optString4 = jSONObject4.optString("type", "");
                                optString4.getClass();
                                if (optString4.length() != 0) {
                                    try {
                                        l51.a(i4);
                                        arrayList2.add(new ou8(optString4, i4));
                                    } catch (Throwable unused) {
                                    }
                                    i2 = i3 + 1;
                                } else {
                                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            LinkedHashMap linkedHashMap3 = lu8.a;
                            if (jSONObject.has("excludeCredentials")) {
                                JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
                                int length2 = jSONArray3.length();
                                int i5 = 0;
                                while (i5 < length2) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i5);
                                    LinkedHashMap linkedHashMap4 = lu8.a;
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
                                                    } catch (c1c e) {
                                                        throw new z03(new h1((byte) 4), e.getMessage());
                                                    }
                                                }
                                                continue;
                                            } else {
                                                jSONArray = jSONArray3;
                                                str3 = str5;
                                                arrayList = null;
                                            }
                                            arrayList3.add(new nu8(string6, decode2, arrayList));
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
                            LinkedHashMap linkedHashMap5 = lu8.a;
                            String str6 = "none";
                            String optString5 = jSONObject.optString("attestation", "none");
                            optString5.getClass();
                            if (optString5.length() != 0) {
                                str6 = optString5;
                            }
                            dy a2 = dy.a(str6);
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
                                    ba9Var = ba9.a(optString6);
                                } else {
                                    ba9Var = null;
                                }
                                Boolean valueOf = Boolean.valueOf(optBoolean);
                                String optString7 = jSONObject6.optString("authenticatorAttachment", "");
                                optString7.getClass();
                                if (optString7.length() > 0) {
                                    ayVar = ay.a(optString7);
                                } else {
                                    ayVar = null;
                                }
                                if (ayVar == null) {
                                    str = null;
                                } else {
                                    str = ayVar.a;
                                }
                                if (ba9Var == null) {
                                    str2 = null;
                                } else {
                                    str2 = ba9Var.a;
                                }
                                w40Var = null;
                                d50Var = new d50(str, valueOf, null, str2);
                            } else {
                                w40Var = null;
                                d50Var = null;
                            }
                            if (jSONObject.has("extensions")) {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
                                String optString8 = jSONObject7.optString("appid", "");
                                optString8.getClass();
                                if (optString8.length() > 0) {
                                    v84Var = new v84(optString8);
                                } else {
                                    v84Var = w40Var;
                                }
                                if (jSONObject7.optBoolean("thirdPartyPayment", false)) {
                                    dz4Var = new dz4(true);
                                } else {
                                    dz4Var = w40Var;
                                }
                                if (jSONObject7.optBoolean("uvm", false)) {
                                    t7cVar = new t7c(true);
                                } else {
                                    t7cVar = w40Var;
                                }
                                w40Var2 = new w40(v84Var, null, t7cVar, null, null, null, null, null, dz4Var, null, null, null);
                            } else {
                                w40Var2 = w40Var;
                            }
                            return new mu8(pu8Var, su8Var, a, arrayList2, d, arrayList3, d50Var, null, null, a2.a, w40Var2, null, null);
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
