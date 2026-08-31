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
import b7.w0;
import com.google.android.gms.fido.common.Transport;
import j7.y6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q6.b0;
import q6.e0;
import q6.i0;
import q6.k;
import q6.m;
import q6.o;
import q6.s;
import q6.t;
import q6.u;
import q6.v;
import q6.w;
import q6.x;
import q6.y;
import v0.i;
public final class e extends b1.d {
    public final Context f4154e;
    public i f4155f;
    public Executor f4156g;
    public CancellationSignal h;
    public final c1.e f4157i;

    public e(Context context) {
        j.e(context, "context");
        this.f4154e = context;
        this.f4157i = new c1.e(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static v0.f e(u uVar) {
        JSONObject jSONObject;
        try {
            k kVar = uVar.f44728f;
            w0 w0Var = uVar.f44726c;
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (w0Var != null && w0Var.u().length > 0) {
                    jSONObject2.put("rawId", i6.b.c(w0Var.u()));
                }
                String str = uVar.f44729n;
                if (str != null) {
                    jSONObject2.put("authenticatorAttachment", str);
                }
                String str2 = uVar.f44725b;
                if (str2 != null && kVar == null) {
                    jSONObject2.put("type", str2);
                }
                String str3 = uVar.f44724a;
                if (str3 != null) {
                    jSONObject2.put("id", str3);
                }
                String str4 = "response";
                q6.i iVar = uVar.f44727e;
                boolean z4 = true;
                if (iVar != null) {
                    jSONObject = iVar.e();
                } else {
                    q6.j jVar = uVar.d;
                    if (jVar != null) {
                        jSONObject = jVar.e();
                    } else {
                        z4 = false;
                        if (kVar != null) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("code", kVar.f44688a.f44719a);
                                String str5 = kVar.f44689b;
                                if (str5 != null) {
                                    jSONObject3.put("message", str5);
                                }
                                str4 = "error";
                                jSONObject = jSONObject3;
                            } catch (JSONException e6) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e6);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str4, jSONObject);
                }
                q6.g gVar = uVar.h;
                if (gVar != null) {
                    jSONObject2.put("clientExtensionResults", gVar.e());
                } else if (z4) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String jSONObject4 = jSONObject2.toString();
                j.d(jSONObject4, "toJson(...)");
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
        q6.f fVar;
        m mVar;
        q6.f fVar2;
        s sVar;
        t tVar;
        i0 i0Var;
        e0 e0Var;
        q6.c cVar;
        String str;
        String str2;
        String str3;
        JSONArray jSONArray;
        ArrayList arrayList;
        long j10;
        j.e(request, "request");
        LinkedHashMap linkedHashMap = g.f4162a;
        String str4 = request.d;
        Context context = this.f4154e;
        j.e(context, "context");
        if (y5.d.d.d(context, y5.e.f50767a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            j.d(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                j.d(packageInfo, "getPackageInfo(...)");
                j10 = f.s(packageInfo);
            } else {
                j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (j10 > 241217000) {
                return new v(str4);
            }
        }
        JSONObject jSONObject = new JSONObject(str4);
        byte[] a2 = y6.a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str5 = "id";
        String string = jSONObject2.getString("id");
        j.d(string, "getString(...)");
        byte[] decode = Base64.decode(string, 11);
        j.d(decode, "decode(...)");
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String optString = jSONObject2.optString("icon", "");
        j.b(string3);
        if (string3.length() != 0) {
            if (decode.length != 0) {
                j.b(string2);
                if (string2.length() != 0) {
                    b0 b0Var = new b0(string2, decode, optString, string3);
                    JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
                    String string4 = jSONObject3.getString("id");
                    String optString2 = jSONObject3.optString("name", "");
                    String optString3 = jSONObject3.optString("icon", "");
                    j.b(optString3);
                    if (optString3.length() == 0) {
                        optString3 = null;
                    }
                    j.b(optString2);
                    if (optString2.length() != 0) {
                        j.b(string4);
                        if (string4.length() != 0) {
                            y yVar = new y(string4, optString2, optString3);
                            JSONArray jSONArray2 = jSONObject.getJSONArray("pubKeyCredParams");
                            ArrayList arrayList2 = new ArrayList();
                            int length = jSONArray2.length();
                            int i10 = 0;
                            while (i10 < length) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i10);
                                LinkedHashMap linkedHashMap2 = g.f4162a;
                                byte[] bArr = a2;
                                int i11 = (int) jSONObject4.getLong("alg");
                                String optString4 = jSONObject4.optString("type", "");
                                j.b(optString4);
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
                            LinkedHashMap linkedHashMap3 = g.f4162a;
                            if (jSONObject.has("excludeCredentials")) {
                                JSONArray jSONArray3 = jSONObject.getJSONArray("excludeCredentials");
                                int length2 = jSONArray3.length();
                                int i12 = 0;
                                while (i12 < length2) {
                                    JSONObject jSONObject5 = jSONArray3.getJSONObject(i12);
                                    LinkedHashMap linkedHashMap4 = g.f4162a;
                                    String string5 = jSONObject5.getString(str5);
                                    j.d(string5, "getString(...)");
                                    y yVar3 = yVar2;
                                    byte[] decode2 = Base64.decode(string5, 11);
                                    j.d(decode2, "decode(...)");
                                    String string6 = jSONObject5.getString("type");
                                    j.b(string6);
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
                                                    } catch (o6.a e6) {
                                                        throw new y0.a(new x0.a(4), e6.getMessage());
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
                            LinkedHashMap linkedHashMap5 = g.f4162a;
                            String str6 = "none";
                            String optString5 = jSONObject.optString("attestation", "none");
                            j.b(optString5);
                            if (optString5.length() != 0) {
                                str6 = optString5;
                            }
                            q6.e a10 = q6.e.a(str6);
                            if (jSONObject.has("timeout")) {
                                d = Double.valueOf(jSONObject.getLong("timeout") / 1000);
                            } else {
                                d = null;
                            }
                            if (jSONObject.has("authenticatorSelection")) {
                                JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
                                boolean optBoolean = jSONObject6.optBoolean("requireResidentKey", false);
                                String optString6 = jSONObject6.optString("residentKey", "");
                                j.b(optString6);
                                if (optString6.length() > 0) {
                                    e0Var = e0.a(optString6);
                                } else {
                                    e0Var = null;
                                }
                                Boolean valueOf = Boolean.valueOf(optBoolean);
                                String optString7 = jSONObject6.optString("authenticatorAttachment", "");
                                j.b(optString7);
                                if (optString7.length() > 0) {
                                    cVar = q6.c.a(optString7);
                                } else {
                                    cVar = null;
                                }
                                if (cVar == null) {
                                    str = null;
                                } else {
                                    str = cVar.f44650a;
                                }
                                if (e0Var == null) {
                                    str2 = null;
                                } else {
                                    str2 = e0Var.f44659a;
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
                                j.b(optString8);
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
                                fVar2 = new q6.f(sVar, null, i0Var, null, null, null, null, null, tVar, null, null, null);
                            } else {
                                fVar2 = fVar;
                            }
                            return new v(yVar4, b0Var, bArr2, arrayList2, d, arrayList3, mVar, null, null, a10.f44656a, fVar2, null, null);
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
