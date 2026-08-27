package c1;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.api.f;
import g7.d0;
import g7.q7;
import h7.o8;
import h7.s8;
import h7.t7;
import h7.u7;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import n6.k;
import n6.r;
import n6.u;
import org.json.JSONException;
import v0.p;
import w0.g;
import w0.h;
import w0.i;

public final class d extends ResultReceiver {

    public final int f2223a;

    public final b1.d f2224b;

    public d(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.f2223a = i10;
        this.f2224b = dVar;
    }

    @Override
    public final void onReceiveResult(int i10, Bundle resultData) {
        w0.d bVar;
        Object parcelable;
        String string;
        Bundle bundle;
        v0.c cVarA;
        w0.d dVarA;
        Object parcelable2;
        String string2;
        Bundle bundle2;
        p pVar;
        i iVarB;
        int i11 = this.f2223a;
        b1.d dVar = this.f2224b;
        switch (i11) {
            case 0:
                j.e(resultData, "resultData");
                final e eVar = (e) dVar;
                if (b1.d.b(resultData, new c(2, b1.d.f1890a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0), eVar.f(), eVar.e(), eVar.h)) {
                    return;
                }
                int i12 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                int i13 = b1.d.f1892c;
                if (i12 != i13) {
                    Log.w("BeginSignIn", "Returned request code " + i13 + " which  does not match what was given " + i12);
                    return;
                }
                if (d0.b(i10, new b1.e(1), new b(eVar, 0), eVar.h)) {
                    return;
                }
                try {
                    final p pVarD = eVar.d(q7.a(eVar.f2225e).f(intent));
                    final int i14 = 1;
                    d0.a(eVar.h, new ad.a() {
                        @Override
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    ((Executor) eVar).execute(new a1.b((v0.i) pVarD, 7));
                                    break;
                                default:
                                    c1.e eVar2 = (c1.e) eVar;
                                    eVar2.f().execute(new a1.e(14, eVar2, (p) pVarD));
                                    break;
                            }
                            return pc.i.f45696a;
                        }
                    });
                    return;
                } catch (f e9) {
                    q qVar = new q();
                    qVar.f15253a = new h(e9.getMessage(), 2);
                    if (e9.getStatusCode() == 16) {
                        qVar.f15253a = new g(e9.getMessage());
                    } else if (b1.d.f1891b.contains(Integer.valueOf(e9.getStatusCode()))) {
                        qVar.f15253a = new w0.j(e9.getMessage());
                    }
                    CancellationSignal cancellationSignal = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal)) {
                        return;
                    }
                    eVar.f().execute(new a1.e(12, eVar, qVar));
                    return;
                } catch (i e10) {
                    CancellationSignal cancellationSignal2 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal2)) {
                        return;
                    }
                    eVar.f().execute(new a(eVar, e10, 1));
                    return;
                } catch (Throwable th) {
                    h hVar = new h(th.getMessage(), 2);
                    CancellationSignal cancellationSignal3 = eVar.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal3)) {
                        return;
                    }
                    eVar.f().execute(new a1.e(13, eVar, hVar));
                    return;
                }
            case 1:
                j.e(resultData, "resultData");
                c cVar = new c(2, b1.d.f1890a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) dVar;
                Executor executor = eVar2.f4693g;
                if (executor == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar = eVar2.f4692f;
                if (iVar == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar, executor, iVar, eVar2.h)) {
                    return;
                }
                int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                int i16 = b1.d.f1892c;
                if (i15 != i16) {
                    Log.w("CreatePublicKey", "Returned request code " + i16 + " does not match what was given " + i15);
                    return;
                }
                if (b1.d.c(i10, new b1.e(2), new b(eVar2, 1), eVar2.h)) {
                    return;
                }
                byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
                if (byteArrayExtra == null) {
                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                    CancellationSignal cancellationSignal4 = eVar2.h;
                    gVar.getClass();
                    if (a1.g.a(cancellationSignal4)) {
                        return;
                    }
                    Executor executor2 = eVar2.f4693g;
                    if (executor2 != null) {
                        executor2.execute(new d1.d(eVar2, 1));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                u uVar = (u) s8.a(byteArrayExtra, u.CREATOR);
                j.d(uVar, "deserializeFromBytes(...)");
                LinkedHashMap linkedHashMap = d1.g.f4699a;
                Parcelable parcelable3 = uVar.d;
                if (parcelable3 == null && (parcelable3 = uVar.f18413e) == null && (parcelable3 = uVar.f18414f) == null) {
                    throw new IllegalStateException("No response set.");
                }
                if (parcelable3 instanceof k) {
                    k kVar = (k) parcelable3;
                    r rVar = kVar.f18374a;
                    j.d(rVar, "getErrorCode(...)");
                    x0.a aVar = (x0.a) d1.g.f4699a.get(rVar);
                    String str = kVar.f18375b;
                    if (aVar == null) {
                        bVar = new y0.a(new x0.a(26), s3.c.e("unknown fido gms exception - ", str));
                    } else {
                        bVar = (rVar == r.NOT_ALLOWED_ERR && str != null && gd.j.b(str, "Unable to get sync account")) ? new w0.b("Passkey registration was cancelled by the user.") : new y0.a(aVar, str);
                    }
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    CancellationSignal cancellationSignal5 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal5)) {
                        return;
                    }
                    Executor executor3 = eVar2.f4693g;
                    if (executor3 != null) {
                        executor3.execute(new d1.a(eVar2, bVar, 2));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                try {
                    v0.f fVarE = d1.e.e(uVar);
                    CancellationSignal cancellationSignal6 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal6)) {
                        return;
                    }
                    Executor executor4 = eVar2.f4693g;
                    if (executor4 != null) {
                        executor4.execute(new a1.e(29, eVar2, fVarE));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (JSONException e11) {
                    CancellationSignal cancellationSignal7 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal7)) {
                        return;
                    }
                    Executor executor5 = eVar2.f4693g;
                    if (executor5 != null) {
                        executor5.execute(new d1.b(eVar2, e11, 0));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                } catch (Throwable th2) {
                    CancellationSignal cancellationSignal8 = eVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal8)) {
                        return;
                    }
                    Executor executor6 = eVar2.f4693g;
                    if (executor6 != null) {
                        executor6.execute(new d1.c(eVar2, th2, 0));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
            case 2:
                j.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.f1890a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar2 = (e1.d) dVar;
                Executor executor7 = dVar2.f5157g;
                if (executor7 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar2 = dVar2.f5156f;
                if (iVar2 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar2, executor7, iVar2, dVar2.h)) {
                    return;
                }
                int i17 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 34) {
                    parcelable = g0.a.c(resultData);
                } else {
                    parcelable = resultData.getParcelable("RESULT_DATA");
                    if (!Intent.class.isInstance(parcelable)) {
                        parcelable = null;
                    }
                }
                Intent intent3 = (Intent) parcelable;
                int i19 = b1.d.f1892c;
                if (i17 != i19) {
                    Log.w("CreatePublicKey", "Returned request code " + i19 + " does not match what was given " + i17);
                    return;
                }
                if (b1.d.c(i10, new b1.e(3), new b(dVar2, 2), dVar2.h)) {
                    return;
                }
                if (intent3 == null) {
                    CancellationSignal cancellationSignal9 = dVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal9)) {
                        return;
                    }
                    Executor executor8 = dVar2.f5157g;
                    if (executor8 != null) {
                        executor8.execute(new e1.a(dVar2, 1));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i18 >= 34) {
                    cVarA = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                } else {
                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                    cVarA = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) ? null : t7.a(string, bundle);
                }
                if (cVarA != null) {
                    CancellationSignal cancellationSignal10 = dVar2.h;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (a1.g.a(cancellationSignal10)) {
                        return;
                    }
                    Executor executor9 = dVar2.f5157g;
                    if (executor9 != null) {
                        executor9.execute(new d5.u(4, dVar2, cVarA));
                        return;
                    } else {
                        j.h("executor");
                        throw null;
                    }
                }
                if (i18 >= 34) {
                    dVarA = g1.a.a(intent3);
                } else {
                    int i20 = w0.d.f48926a;
                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 == null) {
                        dVarA = null;
                    } else {
                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string3 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        dVarA = o8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                    }
                }
                CancellationSignal cancellationSignal11 = dVar2.h;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal11)) {
                    return;
                }
                Executor executor10 = dVar2.f5157g;
                if (executor10 != null) {
                    executor10.execute(new e1.c(dVar2, dVarA, 1));
                    return;
                } else {
                    j.h("executor");
                    throw null;
                }
            default:
                j.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.f1890a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar2 = (f1.b) dVar;
                Executor executor11 = bVar2.f5609g;
                if (executor11 == null) {
                    j.h("executor");
                    throw null;
                }
                v0.i iVar3 = bVar2.f5608f;
                if (iVar3 == null) {
                    j.h("callback");
                    throw null;
                }
                if (b1.d.b(resultData, cVar3, executor11, iVar3, bVar2.h)) {
                    return;
                }
                int i21 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                int i22 = Build.VERSION.SDK_INT;
                if (i22 >= 34) {
                    parcelable2 = g0.a.c(resultData);
                } else {
                    parcelable2 = resultData.getParcelable("RESULT_DATA");
                    if (!Intent.class.isInstance(parcelable2)) {
                        parcelable2 = null;
                    }
                }
                Intent intent4 = (Intent) parcelable2;
                final Executor executor12 = bVar2.f5609g;
                if (executor12 == null) {
                    j.h("executor");
                    throw null;
                }
                final v0.i iVar4 = bVar2.f5608f;
                if (iVar4 == null) {
                    j.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal12 = bVar2.h;
                int i23 = b1.d.f1892c;
                if (i21 != i23) {
                    Log.w("GetCredentialController", "Returned request code " + i23 + " which  does not match what was given " + i21);
                    return;
                }
                final int i24 = 0;
                if (d0.b(i10, new b1.e(i24), new b1.f(i24, executor12, iVar4), cancellationSignal12)) {
                    return;
                }
                if (intent4 == null) {
                    d0.a(cancellationSignal12, new ad.a() {
                        @Override
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    ((Executor) executor12).execute(new a1.b((v0.i) iVar4, 7));
                                    break;
                                default:
                                    c1.e eVar3 = (c1.e) executor12;
                                    eVar3.f().execute(new a1.e(14, eVar3, (p) iVar4));
                                    break;
                            }
                            return pc.i.f45696a;
                        }
                    });
                    return;
                }
                if (i22 >= 34) {
                    pVar = g1.a.d(intent4);
                } else {
                    Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    pVar = (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new p(u7.a(string2, bundle2));
                }
                if (pVar != null) {
                    d0.a(cancellationSignal12, new b1.b(executor12, iVar4, pVar, 1));
                    return;
                }
                if (i22 >= 34) {
                    iVarB = g1.a.c(intent4);
                } else {
                    int i25 = i.f48927a;
                    Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra4 == null) {
                        iVarB = null;
                    } else {
                        String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string4 == null) {
                            throw new IllegalArgumentException("Bundle was missing exception type.");
                        }
                        iVarB = o8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                    }
                }
                d0.a(cancellationSignal12, new b1.b(executor12, iVar4, iVarB, 2));
                return;
        }
    }
}
