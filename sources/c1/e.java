package c1;

import ag.h0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.f;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import g7.o6;
import g7.q7;
import h5.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import n6.k;
import n6.r;
import n6.u;
import org.json.JSONException;
import org.json.JSONObject;
import v0.i;
import v0.n;
import v0.o;
import v0.p;
import v0.q;
import w0.h;
import y6.s0;

public final class e extends b1.d {

    public final Context f2225e;

    public i f2226f;

    public Executor f2227g;
    public CancellationSignal h;

    public final d f2228i;

    public e(Context context) {
        j.e(context, "context");
        this.f2225e = context;
        this.f2228i = new d(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final p d(g gVar) throws w0.g, h, y0.b {
        n nVar;
        Object obj;
        n6.g gVar2;
        String string;
        u uVar = gVar.f8286r;
        String idToken = gVar.h;
        String id2 = gVar.f8280a;
        String str = gVar.f8284f;
        if (str != null) {
            j.d(id2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            nVar = new n(str, 2, bundle);
        } else {
            boolean z10 = false;
            JSONObject jSONObject = null;
            if (idToken != null) {
                j.d(id2, "getId(...)");
                String str2 = gVar.f8281b;
                if (str2 == null) {
                    str2 = null;
                }
                String str3 = gVar.f8282c;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = gVar.d;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = gVar.f8285n;
                if (str5 == null) {
                    str5 = null;
                }
                Uri uri = gVar.f8283e;
                Uri uri2 = uri != null ? uri : null;
                j.e(id2, "id");
                j.e(idToken, "idToken");
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", id2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", idToken);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str3);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str5);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri2);
                nVar = new k8.a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (id2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (idToken.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (uVar != null) {
                k kVar = uVar.f18414f;
                n6.i iVar = uVar.f18413e;
                n6.j jVar = uVar.d;
                LinkedHashMap linkedHashMap = d1.g.f4699a;
                JSONObject jSONObject2 = new JSONObject();
                if (jVar != null) {
                    obj = jVar;
                } else if (iVar != null) {
                    obj = iVar;
                } else {
                    if (kVar == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    obj = kVar;
                }
                if (obj instanceof k) {
                    k kVar2 = (k) obj;
                    r rVar = kVar2.f18374a;
                    j.d(rVar, "getErrorCode(...)");
                    String str6 = kVar2.f18375b;
                    x0.a aVar = (x0.a) d1.g.f4699a.get(rVar);
                    if (aVar == null) {
                        throw new y0.b(new x0.a(26), s3.c.e("unknown fido gms exception - ", str6));
                    }
                    if (rVar == r.NOT_ALLOWED_ERR && str6 != null && gd.j.b(str6, "Unable to get sync account")) {
                        throw new w0.g("Passkey retrieval was cancelled by the user.");
                    }
                    throw new y0.b(aVar, str6);
                }
                if (obj instanceof n6.i) {
                    try {
                        s0 s0Var = uVar.f18412c;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (s0Var != null && s0Var.u().length > 0) {
                                jSONObject3.put("rawId", f6.b.c(s0Var.u()));
                            }
                            String str7 = uVar.f18415n;
                            if (str7 != null) {
                                jSONObject3.put("authenticatorAttachment", str7);
                            }
                            String str8 = uVar.f18411b;
                            if (str8 != null && kVar == null) {
                                jSONObject3.put("type", str8);
                            }
                            String str9 = uVar.f18410a;
                            if (str9 != null) {
                                jSONObject3.put("id", str9);
                            }
                            String str10 = "response";
                            if (iVar != null) {
                                jSONObject = iVar.b();
                            } else {
                                if (jVar != null) {
                                    jSONObject = jVar.b();
                                } else if (kVar != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", kVar.f18374a.f18404a);
                                        String str11 = kVar.f18375b;
                                        if (str11 != null) {
                                            jSONObject.put("message", str11);
                                        }
                                        str10 = "error";
                                    } catch (JSONException e9) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e9);
                                    }
                                }
                                if (jSONObject != null) {
                                    jSONObject3.put(str10, jSONObject);
                                }
                                gVar2 = uVar.h;
                                if (gVar2 != null) {
                                    jSONObject3.put("clientExtensionResults", gVar2.b());
                                } else if (z10) {
                                    jSONObject3.put("clientExtensionResults", new JSONObject());
                                }
                                string = jSONObject3.toString();
                                j.d(string, "toJson(...)");
                            }
                            z10 = true;
                            if (jSONObject != null) {
                                jSONObject3.put(str10, jSONObject);
                            }
                            gVar2 = uVar.h;
                            if (gVar2 != null) {
                                jSONObject3.put("clientExtensionResults", gVar2.b());
                            } else if (z10) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            j.d(string, "toJson(...)");
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
                        }
                    } catch (Throwable th) {
                        throw new h("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), 2);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    j.d(string, "toString(...)");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                nVar = new n(string, 3, bundle3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                nVar = null;
            }
        }
        if (nVar != null) {
            return new p(nVar);
        }
        throw new h("When attempting to convert get response, null credential found", 2);
    }

    public final i e() {
        i iVar = this.f2226f;
        if (iVar != null) {
            return iVar;
        }
        j.h("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.f2227g;
        if (executor != null) {
            return executor;
        }
        j.h("executor");
        throw null;
    }

    public final void g(o request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        j.e(request, "request");
        j.e(callback, "callback");
        j.e(executor, "executor");
        this.h = cancellationSignal;
        this.f2226f = callback;
        this.f2227g = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        Context context = this.f2225e;
        j.e(context, "context");
        h5.d dVar = new h5.d(false);
        h5.a aVar = new h5.a(false, null, null, true, null, null, false);
        h5.c cVar = new h5.c(false, null, null);
        h5.b bVar = new h5.b(null, false);
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        long j10 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        Iterator it = request.f48666a.iterator();
        h5.b bVar2 = bVar;
        boolean z10 = false;
        while (true) {
            int i10 = 1;
            if (!it.hasNext()) {
                boolean z11 = j10 > 241217000 ? request.f48667b : false;
                t6.b bVarA = q7.a(context);
                new h5.a(false, null, null, true, null, null, false);
                h5.e eVar = new h5.e(dVar, aVar, bVarA.f48102k, false, 0, cVar, bVar2, z11);
                v vVarB = w.b();
                vVarB.d = new v5.c[]{new v5.c("auth_api_credentials_begin_sign_in", 8L)};
                vVarB.f3359c = new m5.o(bVarA, eVar);
                vVarB.f3358b = false;
                vVarB.f3357a = 1553;
                bVarA.e(0, vVarB.b()).addOnSuccessListener(new a1.c(new f(i10, cancellationSignal, this), i10)).addOnFailureListener(new h0(3, this, cancellationSignal));
                return;
            }
            q qVar = (q) it.next();
            if ((qVar instanceof q) && !z10) {
                if (j10 >= 231815000) {
                    LinkedHashMap linkedHashMap = d1.g.f4699a;
                    bVar2 = new h5.b(qVar.d, true);
                } else {
                    LinkedHashMap linkedHashMap2 = d1.g.f4699a;
                    JSONObject jSONObject = new JSONObject(qVar.d);
                    String strOptString = jSONObject.optString("rpId", "");
                    j.b(strOptString);
                    if (strOptString.length() == 0) {
                        throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
                    }
                    cVar = new h5.c(true, o6.a(jSONObject), strOptString);
                }
                z10 = true;
            }
        }
    }
}
