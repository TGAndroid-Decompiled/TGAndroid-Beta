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
import f7.f0;
import f7.v7;
import g7.q8;
import g7.w7;
import g7.x7;
import g7.x8;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import m6.k;
import m6.r;
import m6.u;
import org.json.JSONException;
import v0.p;
import w0.g;
import w0.h;
import w0.i;
import w0.j;
public final class d extends ResultReceiver {
    public final int f2084a;
    public final b1.d f2085b;

    public d(b1.d dVar, Handler handler, int i9) {
        super(handler);
        this.f2084a = i9;
        this.f2085b = dVar;
    }

    @Override
    public final void onReceiveResult(int i9, Bundle resultData) {
        byte[] bArr;
        w0.d dVar;
        Object parcelable;
        v0.c cVar;
        String string;
        Bundle bundle;
        w0.d a2;
        Object parcelable2;
        p pVar;
        String string2;
        Bundle bundle2;
        i b10;
        int i10 = this.f2084a;
        b1.d dVar2 = this.f2085b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                final e eVar = (e) dVar2;
                if (!b1.d.b(resultData, new c(2, b1.d.f1394a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0), eVar.f(), eVar.e(), eVar.h)) {
                    int i11 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i12 = b1.d.f1396c;
                    if (i11 != i12) {
                        Log.w("BeginSignIn", "Returned request code " + i12 + " which  does not match what was given " + i11);
                        return;
                    } else if (!f0.b(i9, new b1.e(1), new b(eVar, 0), eVar.h)) {
                        try {
                            final p d = eVar.d(v7.a(eVar.f2086e).f(intent));
                            f0.a(eVar.h, new zc.a() {
                                @Override
                                public final Object invoke() {
                                    switch (r1) {
                                        case 0:
                                            ((Executor) eVar).execute(new a1.b((v0.i) d, 7));
                                            break;
                                        default:
                                            c1.e eVar2 = (c1.e) eVar;
                                            eVar2.f().execute(new a1.e(19, eVar2, (p) d));
                                            break;
                                    }
                                    return oc.i.f19197a;
                                }
                            });
                            return;
                        } catch (f e10) {
                            ?? obj = new Object();
                            obj.f16499a = new h(e10.getMessage(), 2);
                            if (e10.getStatusCode() == 16) {
                                obj.f16499a = new g(e10.getMessage());
                            } else if (b1.d.f1395b.contains(Integer.valueOf(e10.getStatusCode()))) {
                                obj.f16499a = new j(e10.getMessage());
                            }
                            CancellationSignal cancellationSignal = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                eVar.f().execute(new a1.e(17, eVar, obj));
                                return;
                            }
                            return;
                        } catch (i e11) {
                            CancellationSignal cancellationSignal2 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal2)) {
                                eVar.f().execute(new a(eVar, e11, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            h hVar = new h(th.getMessage(), 2);
                            CancellationSignal cancellationSignal3 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal3)) {
                                eVar.f().execute(new a1.e(18, eVar, hVar));
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.f1394a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) dVar2;
                Executor executor = eVar2.f4251g;
                if (executor != null) {
                    v0.i iVar = eVar2.f4250f;
                    if (iVar != null) {
                        if (!b1.d.b(resultData, cVar2, executor, iVar, eVar2.h)) {
                            int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i14 = b1.d.f1396c;
                            if (i13 != i14) {
                                Log.w("CreatePublicKey", "Returned request code " + i14 + " does not match what was given " + i13);
                                return;
                            } else if (!b1.d.c(i9, new b1.e(2), new b(eVar2, 1), eVar2.h)) {
                                if (intent2 != null) {
                                    bArr = intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = eVar2.h;
                                    gVar.getClass();
                                    if (!a1.g.a(cancellationSignal4)) {
                                        Executor executor2 = eVar2.f4251g;
                                        if (executor2 != null) {
                                            executor2.execute(new d1.d(eVar2, 1));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                u uVar = (u) q8.a(bArr, u.CREATOR);
                                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                                LinkedHashMap linkedHashMap = d1.g.f4257a;
                                Parcelable parcelable3 = uVar.d;
                                if (parcelable3 != null || (parcelable3 = uVar.f17577e) != null || (parcelable3 = uVar.f17578f) != null) {
                                    if (parcelable3 instanceof k) {
                                        k kVar = (k) parcelable3;
                                        r rVar = kVar.f17538a;
                                        kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                                        x0.a aVar = (x0.a) d1.g.f4257a.get(rVar);
                                        String str = kVar.f17539b;
                                        if (aVar == null) {
                                            dVar = new y0.a(new x0.a(26), ta.b.d("unknown fido gms exception - ", str));
                                        } else if (rVar == r.NOT_ALLOWED_ERR && str != null && fd.j.b(str, "Unable to get sync account")) {
                                            dVar = new w0.b("Passkey registration was cancelled by the user.");
                                        } else {
                                            dVar = new y0.a(aVar, str);
                                        }
                                    } else {
                                        dVar = null;
                                    }
                                    if (dVar != null) {
                                        CancellationSignal cancellationSignal5 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal5)) {
                                            Executor executor3 = eVar2.f4251g;
                                            if (executor3 != null) {
                                                executor3.execute(new d1.a(eVar2, dVar, 2));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        v0.f e12 = d1.e.e(uVar);
                                        CancellationSignal cancellationSignal6 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal6)) {
                                            Executor executor4 = eVar2.f4251g;
                                            if (executor4 != null) {
                                                executor4.execute(new a1.e(24, eVar2, e12));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (JSONException e13) {
                                        CancellationSignal cancellationSignal7 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal7)) {
                                            Executor executor5 = eVar2.f4251g;
                                            if (executor5 != null) {
                                                executor5.execute(new d1.b(eVar2, e13, 0));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        CancellationSignal cancellationSignal8 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal8)) {
                                            Executor executor6 = eVar2.f4251g;
                                            if (executor6 != null) {
                                                executor6.execute(new d1.c(eVar2, th2, 0));
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                }
                                throw new IllegalStateException("No response set.");
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                kotlin.jvm.internal.i.h("executor");
                throw null;
            case 2:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar3 = new c(2, b1.d.f1394a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar3 = (e1.d) dVar2;
                Executor executor7 = dVar3.f4800g;
                if (executor7 != null) {
                    v0.i iVar2 = dVar3.f4799f;
                    if (iVar2 != null) {
                        if (!b1.d.b(resultData, cVar3, executor7, iVar2, dVar3.h)) {
                            int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 >= 34) {
                                parcelable = g0.a.c(resultData);
                            } else {
                                parcelable = resultData.getParcelable("RESULT_DATA");
                                if (!Intent.class.isInstance(parcelable)) {
                                    parcelable = null;
                                }
                            }
                            Intent intent3 = (Intent) parcelable;
                            int i17 = b1.d.f1396c;
                            if (i15 != i17) {
                                Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i15);
                                return;
                            } else if (!b1.d.c(i9, new b1.e(3), new b(dVar3, 2), dVar3.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = dVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal9)) {
                                        Executor executor8 = dVar3.f4800g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(dVar3, 1));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i16 >= 34) {
                                    cVar = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                                } else {
                                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        cVar = null;
                                    } else {
                                        cVar = w7.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = dVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal10)) {
                                        Executor executor9 = dVar3.f4800g;
                                        if (executor9 != null) {
                                            executor9.execute(new a1.e(29, dVar3, cVar));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i16 >= 34) {
                                    a2 = g1.a.a(intent3);
                                } else {
                                    int i18 = w0.d.f48423a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a2 = null;
                                    } else {
                                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string3 != null) {
                                            a2 = x8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = dVar3.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.g.a(cancellationSignal11)) {
                                    Executor executor10 = dVar3.f4800g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.c(dVar3, a2, 1));
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.h("executor");
                                        throw null;
                                    }
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                kotlin.jvm.internal.i.h("executor");
                throw null;
            default:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar4 = new c(2, b1.d.f1394a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar = (f1.b) dVar2;
                Executor executor11 = bVar.f5304g;
                if (executor11 != null) {
                    v0.i iVar3 = bVar.f5303f;
                    if (iVar3 != null) {
                        if (!b1.d.b(resultData, cVar4, executor11, iVar3, bVar.h)) {
                            int i19 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i20 = Build.VERSION.SDK_INT;
                            if (i20 >= 34) {
                                parcelable2 = g0.a.c(resultData);
                            } else {
                                parcelable2 = resultData.getParcelable("RESULT_DATA");
                                if (!Intent.class.isInstance(parcelable2)) {
                                    parcelable2 = null;
                                }
                            }
                            Intent intent4 = (Intent) parcelable2;
                            final Executor executor12 = bVar.f5304g;
                            if (executor12 != null) {
                                final v0.i iVar4 = bVar.f5303f;
                                if (iVar4 != null) {
                                    CancellationSignal cancellationSignal12 = bVar.h;
                                    int i21 = b1.d.f1396c;
                                    if (i19 != i21) {
                                        Log.w("GetCredentialController", "Returned request code " + i21 + " which  does not match what was given " + i19);
                                        return;
                                    } else if (!f0.b(i9, new b1.e(0), new b1.f(0, executor12, iVar4), cancellationSignal12)) {
                                        if (intent4 == null) {
                                            f0.a(cancellationSignal12, new zc.a() {
                                                @Override
                                                public final Object invoke() {
                                                    switch (r1) {
                                                        case 0:
                                                            ((Executor) executor12).execute(new a1.b((v0.i) iVar4, 7));
                                                            break;
                                                        default:
                                                            c1.e eVar22 = (c1.e) executor12;
                                                            eVar22.f().execute(new a1.e(19, eVar22, (p) iVar4));
                                                            break;
                                                    }
                                                    return oc.i.f19197a;
                                                }
                                            });
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            pVar = g1.a.d(intent4);
                                        } else {
                                            Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                                            if (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                                                pVar = null;
                                            } else {
                                                pVar = new p(x7.a(string2, bundle2));
                                            }
                                        }
                                        if (pVar != null) {
                                            f0.a(cancellationSignal12, new b1.b(executor12, iVar4, pVar, 1));
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            b10 = g1.a.c(intent4);
                                        } else {
                                            int i22 = i.f48424a;
                                            Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra4 == null) {
                                                b10 = null;
                                            } else {
                                                String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string4 != null) {
                                                    b10 = x8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                                                } else {
                                                    throw new IllegalArgumentException("Bundle was missing exception type.");
                                                }
                                            }
                                        }
                                        f0.a(cancellationSignal12, new b1.b(executor12, iVar4, b10, 2));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                kotlin.jvm.internal.i.h("callback");
                                throw null;
                            }
                            kotlin.jvm.internal.i.h("executor");
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
                kotlin.jvm.internal.i.h("executor");
                throw null;
        }
    }
}
