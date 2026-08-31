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
import j7.c0;
import j7.h5;
import j7.y8;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import k7.d8;
import k7.e8;
import k7.v8;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.telegram.ui.yh;
import q6.k;
import q6.r;
import q6.u;
import v0.o;
import w0.g;
import w0.h;
import w0.i;
public final class e extends ResultReceiver {
    public final int f2032a;
    public final b1.d f2033b;

    public e(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.f2032a = i10;
        this.f2033b = dVar;
    }

    @Override
    public final void onReceiveResult(int i10, Bundle resultData) {
        byte[] bArr;
        w0.d dVar;
        Object parcelable;
        v0.c cVar;
        String string;
        Bundle bundle;
        w0.d a2;
        Object parcelable2;
        o oVar;
        String string2;
        Bundle bundle2;
        i b10;
        int i11 = this.f2032a;
        b1.d dVar2 = this.f2033b;
        switch (i11) {
            case 0:
                j.e(resultData, "resultData");
                final f fVar = (f) dVar2;
                if (!b1.d.b(resultData, new d(2, b1.d.f1375a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0), fVar.f(), fVar.e(), fVar.h)) {
                    int i12 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i13 = b1.d.f1377c;
                    if (i12 != i13) {
                        Log.w("BeginSignIn", "Returned request code " + i13 + " which  does not match what was given " + i12);
                        return;
                    } else if (!c0.b(i10, new b1.e(1), new c(fVar, 0), fVar.h)) {
                        try {
                            final o d = fVar.d(y8.a(fVar.f2034e).f(intent));
                            c0.a(fVar.h, new dd.a() {
                                @Override
                                public final Object invoke() {
                                    switch (r1) {
                                        case 0:
                                            ((Executor) fVar).execute(new a1.b((v0.i) d, 7));
                                            break;
                                        default:
                                            c1.f fVar2 = (c1.f) fVar;
                                            fVar2.f().execute(new a1.e(7, fVar2, (o) d));
                                            break;
                                    }
                                    return sc.i.f47243a;
                                }
                            });
                            return;
                        } catch (com.google.android.gms.common.api.f e6) {
                            ?? obj = new Object();
                            obj.f11340a = new h(e6.getMessage(), 2);
                            if (e6.getStatusCode() == 16) {
                                obj.f11340a = new g(e6.getMessage());
                            } else if (b1.d.f1376b.contains(Integer.valueOf(e6.getStatusCode()))) {
                                obj.f11340a = new w0.j(e6.getMessage());
                            }
                            CancellationSignal cancellationSignal = fVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                fVar.f().execute(new a1.e(5, fVar, obj));
                                return;
                            }
                            return;
                        } catch (i e10) {
                            CancellationSignal cancellationSignal2 = fVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal2)) {
                                fVar.f().execute(new a(fVar, e10, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            h hVar = new h(th2.getMessage(), 2);
                            CancellationSignal cancellationSignal3 = fVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal3)) {
                                fVar.f().execute(new a1.e(6, fVar, hVar));
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
                j.e(resultData, "resultData");
                d dVar3 = new d(2, b1.d.f1375a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar = (d1.e) dVar2;
                Executor executor = eVar.f4156g;
                if (executor != null) {
                    v0.i iVar = eVar.f4155f;
                    if (iVar != null) {
                        if (!b1.d.b(resultData, dVar3, executor, iVar, eVar.h)) {
                            int i14 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i15 = b1.d.f1377c;
                            if (i14 != i15) {
                                Log.w("CreatePublicKey", "Returned request code " + i15 + " does not match what was given " + i14);
                                return;
                            } else if (!b1.d.c(i10, new b1.e(2), new c(eVar, 1), eVar.h)) {
                                if (intent2 != null) {
                                    bArr = intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = eVar.h;
                                    gVar.getClass();
                                    if (!a1.g.a(cancellationSignal4)) {
                                        Executor executor2 = eVar.f4156g;
                                        if (executor2 != null) {
                                            executor2.execute(new d1.d(eVar, 1));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                u uVar = (u) h5.a(bArr, u.CREATOR);
                                j.d(uVar, "deserializeFromBytes(...)");
                                LinkedHashMap linkedHashMap = d1.g.f4162a;
                                Parcelable parcelable3 = uVar.d;
                                if (parcelable3 != null || (parcelable3 = uVar.f44727e) != null || (parcelable3 = uVar.f44728f) != null) {
                                    if (parcelable3 instanceof k) {
                                        k kVar = (k) parcelable3;
                                        r rVar = kVar.f44688a;
                                        j.d(rVar, "getErrorCode(...)");
                                        x0.a aVar = (x0.a) d1.g.f4162a.get(rVar);
                                        String str = kVar.f44689b;
                                        if (aVar == null) {
                                            dVar = new y0.a(new x0.a(26), yh.k("unknown fido gms exception - ", str));
                                        } else if (rVar == r.NOT_ALLOWED_ERR && str != null && jd.j.b(str, "Unable to get sync account")) {
                                            dVar = new w0.b("Passkey registration was cancelled by the user.");
                                        } else {
                                            dVar = new y0.a(aVar, str);
                                        }
                                    } else {
                                        dVar = null;
                                    }
                                    if (dVar != null) {
                                        CancellationSignal cancellationSignal5 = eVar.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal5)) {
                                            Executor executor3 = eVar.f4156g;
                                            if (executor3 != null) {
                                                executor3.execute(new d1.a(eVar, dVar, 2));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        v0.f e11 = d1.e.e(uVar);
                                        CancellationSignal cancellationSignal6 = eVar.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal6)) {
                                            Executor executor4 = eVar.f4156g;
                                            if (executor4 != null) {
                                                executor4.execute(new a1.e(12, eVar, e11));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (JSONException e12) {
                                        CancellationSignal cancellationSignal7 = eVar.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal7)) {
                                            Executor executor5 = eVar.f4156g;
                                            if (executor5 != null) {
                                                executor5.execute(new d1.b(eVar, e12, 0));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        CancellationSignal cancellationSignal8 = eVar.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal8)) {
                                            Executor executor6 = eVar.f4156g;
                                            if (executor6 != null) {
                                                executor6.execute(new d1.c(eVar, th3, 0));
                                                return;
                                            } else {
                                                j.h("executor");
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
                    j.h("callback");
                    throw null;
                }
                j.h("executor");
                throw null;
            case 2:
                j.e(resultData, "resultData");
                d dVar4 = new d(2, b1.d.f1375a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar5 = (e1.d) dVar2;
                Executor executor7 = dVar5.f4886g;
                if (executor7 != null) {
                    v0.i iVar2 = dVar5.f4885f;
                    if (iVar2 != null) {
                        if (!b1.d.b(resultData, dVar4, executor7, iVar2, dVar5.h)) {
                            int i16 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i17 = Build.VERSION.SDK_INT;
                            if (i17 >= 34) {
                                parcelable = g0.a.c(resultData);
                            } else {
                                parcelable = resultData.getParcelable("RESULT_DATA");
                                if (!Intent.class.isInstance(parcelable)) {
                                    parcelable = null;
                                }
                            }
                            Intent intent3 = (Intent) parcelable;
                            int i18 = b1.d.f1377c;
                            if (i16 != i18) {
                                Log.w("CreatePublicKey", "Returned request code " + i18 + " does not match what was given " + i16);
                                return;
                            } else if (!b1.d.c(i10, new b1.e(3), new c(dVar5, 2), dVar5.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = dVar5.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal9)) {
                                        Executor executor8 = dVar5.f4886g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(dVar5, 1));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i17 >= 34) {
                                    cVar = g1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                                } else {
                                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        cVar = null;
                                    } else {
                                        cVar = d8.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = dVar5.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal10)) {
                                        Executor executor9 = dVar5.f4886g;
                                        if (executor9 != null) {
                                            executor9.execute(new a1.e(19, dVar5, cVar));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i17 >= 34) {
                                    a2 = g1.a.a(intent3);
                                } else {
                                    int i19 = w0.d.f49316a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a2 = null;
                                    } else {
                                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string3 != null) {
                                            a2 = v8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = dVar5.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.g.a(cancellationSignal11)) {
                                    Executor executor10 = dVar5.f4886g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.c(dVar5, a2, 1));
                                        return;
                                    } else {
                                        j.h("executor");
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
                    j.h("callback");
                    throw null;
                }
                j.h("executor");
                throw null;
            default:
                j.e(resultData, "resultData");
                d dVar6 = new d(2, b1.d.f1375a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar = (f1.b) dVar2;
                Executor executor11 = bVar.f5723g;
                if (executor11 != null) {
                    v0.i iVar3 = bVar.f5722f;
                    if (iVar3 != null) {
                        if (!b1.d.b(resultData, dVar6, executor11, iVar3, bVar.h)) {
                            int i20 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i21 = Build.VERSION.SDK_INT;
                            if (i21 >= 34) {
                                parcelable2 = g0.a.c(resultData);
                            } else {
                                parcelable2 = resultData.getParcelable("RESULT_DATA");
                                if (!Intent.class.isInstance(parcelable2)) {
                                    parcelable2 = null;
                                }
                            }
                            Intent intent4 = (Intent) parcelable2;
                            final Executor executor12 = bVar.f5723g;
                            if (executor12 != null) {
                                final v0.i iVar4 = bVar.f5722f;
                                if (iVar4 != null) {
                                    CancellationSignal cancellationSignal12 = bVar.h;
                                    int i22 = b1.d.f1377c;
                                    if (i20 != i22) {
                                        Log.w("GetCredentialController", "Returned request code " + i22 + " which  does not match what was given " + i20);
                                        return;
                                    } else if (!c0.b(i10, new b1.e(0), new b1.f(0, executor12, iVar4), cancellationSignal12)) {
                                        if (intent4 == null) {
                                            c0.a(cancellationSignal12, new dd.a() {
                                                @Override
                                                public final Object invoke() {
                                                    switch (r1) {
                                                        case 0:
                                                            ((Executor) executor12).execute(new a1.b((v0.i) iVar4, 7));
                                                            break;
                                                        default:
                                                            c1.f fVar2 = (c1.f) executor12;
                                                            fVar2.f().execute(new a1.e(7, fVar2, (o) iVar4));
                                                            break;
                                                    }
                                                    return sc.i.f47243a;
                                                }
                                            });
                                            return;
                                        }
                                        if (i21 >= 34) {
                                            oVar = g1.a.d(intent4);
                                        } else {
                                            Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                                            if (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                                                oVar = null;
                                            } else {
                                                oVar = new o(e8.a(string2, bundle2));
                                            }
                                        }
                                        if (oVar != null) {
                                            c0.a(cancellationSignal12, new b1.b(executor12, iVar4, oVar, 1));
                                            return;
                                        }
                                        if (i21 >= 34) {
                                            b10 = g1.a.c(intent4);
                                        } else {
                                            int i23 = i.f49317a;
                                            Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra4 == null) {
                                                b10 = null;
                                            } else {
                                                String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string4 != null) {
                                                    b10 = v8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                                                } else {
                                                    throw new IllegalArgumentException("Bundle was missing exception type.");
                                                }
                                            }
                                        }
                                        c0.a(cancellationSignal12, new b1.b(executor12, iVar4, b10, 2));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                j.h("callback");
                                throw null;
                            }
                            j.h("executor");
                            throw null;
                        }
                        return;
                    }
                    j.h("callback");
                    throw null;
                }
                j.h("executor");
                throw null;
        }
    }
}
