package d1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import c7.b0;
import c7.e0;
import c7.g;
import c7.i0;
import c7.j;
import c7.k;
import c7.m;
import c7.o;
import c7.s;
import c7.t;
import c7.u;
import c7.v;
import c7.w;
import c7.x;
import c7.y;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n7.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v7.o6;
public final class e extends b1.d {
    public final Context f6465e;
    public i f6466f;
    public Executor f6467g;
    public CancellationSignal h;
    public final c1.d f6468i;

    public e(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f6465e = context;
        this.f6468i = new c1.d(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static v0.f e(u uVar) {
        JSONObject jSONObject;
        try {
            k kVar = uVar.f4675f;
            s0 s0Var = uVar.f4673c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (s0Var != null && s0Var.u().length > 0) {
                    jSONObject2.put("rawId", u6.b.c(s0Var.u()));
                }
                String str = uVar.f4676n;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = uVar.f4672b;
                if (str2 != null && kVar == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = uVar.f4671a;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                c7.i iVar = uVar.f4674e;
                boolean z10 = true;
                if (iVar != null) {
                    jSONObject = iVar.b();
                } else {
                    j jVar = uVar.d;
                    if (jVar != null) {
                        jSONObject = jVar.b();
                    } else {
                        z10 = false;
                        if (kVar != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", kVar.f4635a.f4666a);
                                String str5 = kVar.f4636b;
                                if (str5 != null) {
                                    jSONObject3.put("message", str5);
                                }
                                str4 = "error";
                                jSONObject = jSONObject3;
                            } catch (JSONException e7) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e7);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                g gVar = uVar.h;
                if (gVar != null) {
                    jSONObject2.put("clientExtensionResults", gVar.b());
                } else if (z10) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                kotlin.jvm.internal.i.d(jSONObject4, "toJson(...)");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", jSONObject4);
                return new v0.f(jSONObject4, bundle);
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
            }
        } catch (Throwable th2) {
            throw new w0.c("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage(), 2);
        }
    }

    public final v d(v0.e request) {
        Double d;
        c7.f fVar;
        m mVar;
        c7.f fVar2;
        s sVar;
        t tVar;
        i0 i0Var;
        e0 e0Var;
        c7.c cVar;
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        ArrayList arrayList;
        long j3;
        kotlin.jvm.internal.i.e(request, "request");
        LinkedHashMap linkedHashMap = f.f6469a;
        String str4 = request.d;
        Context context = this.f6465e;
        kotlin.jvm.internal.i.e(context, "context");
        if (k6.d.d.d(context, k6.e.f14815a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                kotlin.jvm.internal.i.d(packageInfo, "getPackageInfo(...)");
                j3 = b5.d.s(packageInfo);
            } else {
                j3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j3 > 241217000) {
                return new v(str4);
            }
        }
        JSONObject jSONObject = new JSONObject(str4);
        byte[] a2 = o6.a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str5 = "id";
        String string = jSONObject2.getString("id");
        kotlin.jvm.internal.i.d(string, "getString(...)");
        byte[] decode = Base64.decode(string, 11);
        kotlin.jvm.internal.i.d(decode, "decode(...)");
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        kotlin.jvm.internal.i.b(string3);
        if (string3.length() != 0) {
            if (decode.length != 0) {
                kotlin.jvm.internal.i.b(string2);
                if (string2.length() != 0) {
                    b0 b0Var = new b0(string2, decode, optString, string3);
                    JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
                    String string4 = jSONObject3.getString("id");
                    String optString2 = jSONObject3.optString("name", "");
                    String optString3 = jSONObject3.optString("icon", "");
                    kotlin.jvm.internal.i.b(optString3);
                    if (optString3.length() == 0) {
                        optString3 = null;
                    }
                    kotlin.jvm.internal.i.b(optString2);
                    if (optString2.length() != 0) {
                        kotlin.jvm.internal.i.b(string4);
                        if (string4.length() != 0) {
                            y yVar = new y(string4, optString2, optString3);
                            JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArray2.length();
                            int i10 = 0;
                            while (i10 < length) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                                LinkedHashMap linkedHashMap2 = f.f6469a;
                                byte[] bArr = a2;
                                int i11 = (int) jSONObject4.getLong("alg");
                                String optString4 = jSONObject4.optString("type", "");
                                kotlin.jvm.internal.i.b(optString4);
                                if (optString4.length() != 0) {
                                    try {
                                        o.a(i11);
                                        arrayList2.add(new x(optString4, i11));
                                    } catch (Throwable unused) {
                                    }
                                    i10++;
                                    a2 = bArr;
                                } else {
                                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                                }
                            }
                            byte[] bArr2 = a2;
                            y yVar2 = yVar;
                            ArrayList arrayList3 = new ArrayList();
                            LinkedHashMap linkedHashMap3 = f.f6469a;
                            if (jSONObject.has("excludeCredentials")) {
                                JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
                                int length2 = jSONArray3.length();
                                int i12 = 0;
                                while (i12 < length2) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i12);
                                    LinkedHashMap linkedHashMap4 = f.f6469a;
                                    String string5 = jSONObject5.getString(str5);
                                    kotlin.jvm.internal.i.d(string5, "getString(...)");
                                    y yVar3 = yVar2;
                                    byte[] decode2 = Base64.decode(string5, 11);
                                    kotlin.jvm.internal.i.d(decode2, "decode(...)");
                                    String string6 = jSONObject5.getString("type");
                                    kotlin.jvm.internal.i.b(string6);
                                    if (string6.length() != 0) {
                                        if (decode2.length != 0) {
                                            if (jSONObject5.has("transports")) {
                                                str3 = str5;
                                                arrayList = new ArrayList();
                                                JSONArray jSONArray4 = jSONObject5.getJSONArray("transports");
                                                int length3 = jSONArray4.length();
                                                jSONArray = jSONArray3;
                                                int i13 = 0;
                                                while (i13 < length3) {
                                                    try {
                                                        JSONArray jSONArray5 = jSONArray4;
                                                        arrayList.add(Transport.a(jSONArray4.getString(i13)));
                                                        i13++;
                                                        jSONArray4 = jSONArray5;
                                                    } catch (a7.a e7) {
                                                        throw new y0.a(new x0.a(4), e7.getMessage());
                                                    }
                                                }
                                                continue;
                                            } else {
                                                str3 = str5;
                                                jSONArray = jSONArray3;
                                                arrayList = null;
                                            }
                                            arrayList3.add(new w(string6, decode2, arrayList));
                                            i12++;
                                            yVar2 = yVar3;
                                            str5 = str3;
                                            jSONArray3 = jSONArray;
                                        } else {
                                            throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                                        }
                                    } else {
                                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                                    }
                                }
                            }
                            y yVar4 = yVar2;
                            LinkedHashMap linkedHashMap5 = f.f6469a;
                            String str6 = "none";
                            String optString5 = jSONObject.optString("attestation", "none");
                            kotlin.jvm.internal.i.b(optString5);
                            if (optString5.length() != 0) {
                                str6 = optString5;
                            }
                            c7.e a10 = c7.e.a(str6);
                            if (jSONObject.has("timeout")) {
                                d = Double.valueOf(jSONObject.getLong("timeout") / 1000);
                            } else {
                                d = null;
                            }
                            if (jSONObject.has("authenticatorSelection")) {
                                JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
                                boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
                                String optString6 = jSONObject6.optString("residentKey", "");
                                kotlin.jvm.internal.i.b(optString6);
                                if (optString6.length() > 0) {
                                    e0Var = e0.a(optString6);
                                } else {
                                    e0Var = null;
                                }
                                Boolean valueOf = Boolean.valueOf(optBoolean);
                                String optString7 = jSONObject6.optString("authenticatorAttachment", "");
                                kotlin.jvm.internal.i.b(optString7);
                                if (optString7.length() > 0) {
                                    cVar = c7.c.a(optString7);
                                } else {
                                    cVar = null;
                                }
                                if (cVar == null) {
                                    str = null;
                                } else {
                                    str = cVar.f4597a;
                                }
                                if (e0Var == null) {
                                    str2 = null;
                                } else {
                                    str2 = e0Var.f4606a;
                                }
                                fVar = null;
                                mVar = new m(str, valueOf, null, str2);
                            } else {
                                fVar = null;
                                mVar = null;
                            }
                            if (jSONObject.has("extensions")) {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
                                String optString8 = jSONObject7.optString("appid", "");
                                kotlin.jvm.internal.i.b(optString8);
                                if (optString8.length() > 0) {
                                    sVar = new s(optString8);
                                } else {
                                    sVar = fVar;
                                }
                                if (jSONObject7.optBoolean("thirdPartyPayment", false)) {
                                    tVar = new t(true);
                                } else {
                                    tVar = fVar;
                                }
                                if (jSONObject7.optBoolean("uvm", false)) {
                                    i0Var = new i0(true);
                                } else {
                                    i0Var = fVar;
                                }
                                fVar2 = new c7.f(sVar, null, i0Var, null, null, null, null, null, tVar, null, null, null);
                            } else {
                                fVar2 = fVar;
                            }
                            return new v(yVar4, b0Var, bArr2, arrayList2, d, arrayList3, mVar, null, null, a10.f4603a, fVar2, null, null);
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
