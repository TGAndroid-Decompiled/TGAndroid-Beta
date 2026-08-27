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
import com.google.android.gms.fido.common.Transport;
import g7.o6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import n6.b0;
import n6.e0;
import n6.i0;
import n6.k;
import n6.m;
import n6.o;
import n6.s;
import n6.t;
import n6.u;
import n6.v;
import n6.w;
import n6.x;
import n6.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import y6.s0;

public final class e extends b1.d {

    public final Context f4691e;

    public i f4692f;

    public Executor f4693g;
    public CancellationSignal h;

    public final c1.d f4694i;

    public e(Context context) {
        j.e(context, "context");
        this.f4691e = context;
        this.f4694i = new c1.d(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static v0.f e(u uVar) throws w0.c {
        JSONObject jSONObjectB;
        try {
            k kVar = uVar.f18414f;
            s0 s0Var = uVar.f18412c;
            try {
                JSONObject jSONObject = new JSONObject();
                if (s0Var != null && s0Var.u().length > 0) {
                    jSONObject.put("rawId", f6.b.c(s0Var.u()));
                }
                String str = uVar.f18415n;
                if (str != null) {
                    jSONObject.put("authenticatorAttachment", str);
                }
                String str2 = uVar.f18411b;
                if (str2 != null && kVar == null) {
                    jSONObject.put("type", str2);
                }
                String str3 = uVar.f18410a;
                if (str3 != null) {
                    jSONObject.put("id", str3);
                }
                String str4 = "response";
                n6.i iVar = uVar.f18413e;
                boolean z10 = true;
                if (iVar != null) {
                    jSONObjectB = iVar.b();
                } else {
                    n6.j jVar = uVar.d;
                    if (jVar != null) {
                        jSONObjectB = jVar.b();
                    } else {
                        z10 = false;
                        if (kVar != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", kVar.f18374a.f18404a);
                                String str5 = kVar.f18375b;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                str4 = "error";
                                jSONObjectB = jSONObject2;
                            } catch (JSONException e9) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e9);
                            }
                        } else {
                            jSONObjectB = null;
                        }
                    }
                }
                if (jSONObjectB != null) {
                    jSONObject.put(str4, jSONObjectB);
                }
                n6.g gVar = uVar.h;
                if (gVar != null) {
                    jSONObject.put("clientExtensionResults", gVar.b());
                } else if (z10) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject.toString();
                j.d(string, "toJson(...)");
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                return new v0.f(string, bundle);
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
            }
        } catch (Throwable th) {
            throw new w0.c("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), 2);
        }
    }

    public final v d(v0.e request) throws JSONException, PackageManager.NameNotFoundException, n6.d, y0.a {
        n6.f fVar;
        m mVar;
        n6.f fVar2;
        ArrayList arrayList;
        long jS;
        j.e(request, "request");
        LinkedHashMap linkedHashMap = g.f4699a;
        String str = request.d;
        Context context = this.f4691e;
        j.e(context, "context");
        if (v5.d.d.d(context, v5.e.f48794a) == 0) {
            PackageManager packageManager = context.getPackageManager();
            j.d(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                j.d(packageInfo, "getPackageInfo(...)");
                jS = f.s(packageInfo);
            } else {
                jS = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            if (jS > 241217000) {
                return new v(str);
            }
        }
        JSONObject jSONObject = new JSONObject(str);
        byte[] bArrA = o6.a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("user");
        String str2 = "id";
        String string = jSONObject2.getString("id");
        j.d(string, "getString(...)");
        byte[] bArrDecode = Base64.decode(string, 11);
        j.d(bArrDecode, "decode(...)");
        String string2 = jSONObject2.getString("name");
        String string3 = jSONObject2.getString("displayName");
        String strOptString = jSONObject2.optString("icon", "");
        j.b(string3);
        if (string3.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
        }
        if (bArrDecode.length == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
        }
        j.b(string2);
        if (string2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
        }
        b0 b0Var = new b0(string2, bArrDecode, strOptString, string3);
        JSONObject jSONObject3 = jSONObject.getJSONObject("rp");
        String string4 = jSONObject3.getString("id");
        String strOptString2 = jSONObject3.optString("name", "");
        String strOptString3 = jSONObject3.optString("icon", "");
        j.b(strOptString3);
        if (strOptString3.length() == 0) {
            strOptString3 = null;
        }
        j.b(strOptString2);
        if (strOptString2.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
        }
        j.b(string4);
        if (string4.length() == 0) {
            throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
        }
        y yVar = new y(string4, strOptString2, strOptString3);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        int i10 = 0;
        while (i10 < length) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
            LinkedHashMap linkedHashMap2 = g.f4699a;
            byte[] bArr = bArrA;
            int i11 = (int) jSONObject4.getLong("alg");
            String strOptString4 = jSONObject4.optString("type", "");
            j.b(strOptString4);
            if (strOptString4.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
            }
            try {
                o.a(i11);
                arrayList2.add(new x(strOptString4, i11));
            } catch (Throwable unused) {
            }
            i10++;
            bArrA = bArr;
        }
        byte[] bArr2 = bArrA;
        y yVar2 = yVar;
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap3 = g.f4699a;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            int length2 = jSONArray2.length();
            int i12 = 0;
            while (i12 < length2) {
                JSONObject jSONObject5 = jSONArray2.getJSONObject(i12);
                LinkedHashMap linkedHashMap4 = g.f4699a;
                String string5 = jSONObject5.getString(str2);
                j.d(string5, "getString(...)");
                y yVar3 = yVar2;
                byte[] bArrDecode2 = Base64.decode(string5, 11);
                j.d(bArrDecode2, "decode(...)");
                String string6 = jSONObject5.getString("type");
                j.b(string6);
                if (string6.length() == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                }
                if (bArrDecode2.length == 0) {
                    throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                }
                if (jSONObject5.has("transports")) {
                    arrayList = new ArrayList();
                    JSONArray jSONArray3 = jSONObject5.getJSONArray("transports");
                    int length3 = jSONArray3.length();
                    int i13 = 0;
                    while (i13 < length3) {
                        try {
                            JSONArray jSONArray4 = jSONArray3;
                            arrayList.add(Transport.a(jSONArray3.getString(i13)));
                            i13++;
                            jSONArray3 = jSONArray4;
                        } catch (l6.a e9) {
                            throw new y0.a(new x0.a(4), e9.getMessage());
                        }
                    }
                } else {
                    arrayList = null;
                }
                arrayList3.add(new w(string6, bArrDecode2, arrayList));
                i12++;
                yVar2 = yVar3;
                str2 = str2;
                jSONArray2 = jSONArray2;
            }
        }
        y yVar4 = yVar2;
        LinkedHashMap linkedHashMap5 = g.f4699a;
        String strOptString5 = jSONObject.optString("attestation", "none");
        j.b(strOptString5);
        n6.e eVarA = n6.e.a(strOptString5.length() != 0 ? strOptString5 : "none");
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getLong("timeout") / ((double) 1000)) : null;
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            boolean zOptBoolean = jSONObject6.optBoolean("requireResidentKey", false);
            String strOptString6 = jSONObject6.optString("residentKey", "");
            j.b(strOptString6);
            e0 e0VarA = strOptString6.length() > 0 ? e0.a(strOptString6) : null;
            Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
            String strOptString7 = jSONObject6.optString("authenticatorAttachment", "");
            j.b(strOptString7);
            n6.c cVarA = strOptString7.length() > 0 ? n6.c.a(strOptString7) : null;
            fVar = null;
            mVar = new m(cVarA == null ? null : cVarA.f18336a, boolValueOf, null, e0VarA == null ? null : e0VarA.f18345a);
        } else {
            fVar = null;
            mVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            String strOptString8 = jSONObject7.optString("appid", "");
            j.b(strOptString8);
            fVar2 = new n6.f(strOptString8.length() > 0 ? new s(strOptString8) : fVar, null, jSONObject7.optBoolean("uvm", false) ? new i0(true) : fVar, null, null, null, null, null, jSONObject7.optBoolean("thirdPartyPayment", false) ? new t(true) : fVar, null, null, null);
        } else {
            fVar2 = fVar;
        }
        return new v(yVar4, b0Var, bArr2, arrayList2, dValueOf, arrayList3, mVar, null, null, eVarA.f18342a, fVar2, null, null);
    }
}
