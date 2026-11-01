package c1;

import ad.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.e;
import c7.k;
import c7.r;
import c7.u;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n4.p;
import org.json.JSONException;
import v0.n;
import v7.c0;
import w0.g;
import w0.h;
import w0.i;
import w7.f8;
import w7.g8;
import w7.i0;
import w7.l9;
import w7.p8;
public final class c extends ResultReceiver {
    public final int f3518a;
    public final Object f3519b;

    public c(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.f3518a = i10;
        this.f3519b = dVar;
    }

    @Override
    public final void onReceiveResult(int i10, Bundle resultData) {
        byte[] bArr;
        w0.d dVar;
        Object obj;
        v0.c cVar;
        String string;
        Bundle bundle;
        w0.d a2;
        Object obj2;
        n nVar;
        String string2;
        Bundle bundle2;
        i iVar = null;
        n4.d dVar2 = null;
        switch (this.f3518a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar = new b(2, b1.d.f1947a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final d dVar3 = (d) this.f3519b;
                if (!b1.d.b(resultData, bVar, dVar3.f(), dVar3.e(), dVar3.h)) {
                    int i11 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i12 = b1.d.f1949c;
                    if (i11 != i12) {
                        Log.w("BeginSignIn", "Returned request code " + i12 + " which  does not match what was given " + i11);
                        return;
                    } else if (!c0.b(i10, new e(1), new bd.a(dVar3, 1), dVar3.h)) {
                        try {
                            final n d = dVar3.d(p8.a(dVar3.e).f(intent));
                            c0.a(dVar3.h, new ld.a() {
                                @Override
                                public final Object invoke() {
                                    switch (r1) {
                                        case 0:
                                            ((Executor) dVar3).execute(new a1.e((v0.h) d, 7));
                                            break;
                                        default:
                                            c1.d dVar4 = (c1.d) dVar3;
                                            dVar4.f().execute(new a1.f(28, dVar4, (n) d));
                                            break;
                                    }
                                    return j.f401a;
                                }
                            });
                            return;
                        } catch (f e) {
                            ?? obj3 = new Object();
                            obj3.f11445a = new h(2, e.getMessage());
                            if (e.getStatusCode() == 16) {
                                obj3.f11445a = new g(e.getMessage());
                            } else if (b1.d.f1948b.contains(Integer.valueOf(e.getStatusCode()))) {
                                obj3.f11445a = new w0.j(e.getMessage());
                            }
                            CancellationSignal cancellationSignal = dVar3.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                dVar3.f().execute(new a1.f(26, dVar3, obj3));
                                return;
                            }
                            return;
                        } catch (i e7) {
                            CancellationSignal cancellationSignal2 = dVar3.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal2)) {
                                dVar3.f().execute(new a(dVar3, e7, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            h hVar = new h(2, th2.getMessage());
                            CancellationSignal cancellationSignal3 = dVar3.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal3)) {
                                dVar3.f().execute(new a1.f(27, dVar3, hVar));
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
                b bVar2 = new b(2, b1.d.f1947a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.f fVar = (d1.f) this.f3519b;
                Executor executor = fVar.f5642g;
                if (executor != null) {
                    v0.h hVar2 = fVar.f5641f;
                    if (hVar2 != null) {
                        if (!b1.d.b(resultData, bVar2, executor, hVar2, fVar.h)) {
                            int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i14 = b1.d.f1949c;
                            if (i13 != i14) {
                                Log.w("CreatePublicKey", "Returned request code " + i14 + " does not match what was given " + i13);
                                return;
                            } else if (!b1.d.c(i10, new e(4), new bd.a(fVar, 2), fVar.h)) {
                                if (intent2 != null) {
                                    bArr = intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    a1.h hVar3 = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = fVar.h;
                                    hVar3.getClass();
                                    if (!a1.h.a(cancellationSignal4)) {
                                        Executor executor2 = fVar.f5642g;
                                        if (executor2 != null) {
                                            executor2.execute(new d1.d(fVar, 1));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                u uVar = (u) i0.a(bArr, u.CREATOR);
                                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                                LinkedHashMap linkedHashMap = d1.g.f5644a;
                                Parcelable parcelable = uVar.d;
                                Parcelable parcelable2 = parcelable;
                                if (parcelable == null) {
                                    Parcelable parcelable3 = uVar.e;
                                    parcelable2 = parcelable3;
                                    if (parcelable3 == null) {
                                        Parcelable parcelable4 = uVar.f4040f;
                                        parcelable2 = parcelable4;
                                        if (parcelable4 == null) {
                                            throw new IllegalStateException("No response set.");
                                        }
                                    }
                                }
                                if (parcelable2 instanceof k) {
                                    k kVar = (k) parcelable2;
                                    r rVar = kVar.f4002a;
                                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                                    x0.a aVar = (x0.a) d1.g.f5644a.get(rVar);
                                    String str = kVar.f4003b;
                                    if (aVar == null) {
                                        dVar = new y0.a(new x0.a(26), sc.e.h("unknown fido gms exception - ", str));
                                    } else if (rVar == r.NOT_ALLOWED_ERR && str != null && rd.j.b(str, "Unable to get sync account")) {
                                        dVar = new w0.b("Passkey registration was cancelled by the user.");
                                    } else {
                                        dVar = new y0.a(aVar, str);
                                    }
                                } else {
                                    dVar = null;
                                }
                                if (dVar != null) {
                                    CancellationSignal cancellationSignal5 = fVar.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal5)) {
                                        Executor executor3 = fVar.f5642g;
                                        if (executor3 != null) {
                                            executor3.execute(new d1.a(fVar, dVar, 2));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                try {
                                    v0.f e10 = d1.f.e(uVar);
                                    CancellationSignal cancellationSignal6 = fVar.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal6)) {
                                        Executor executor4 = fVar.f5642g;
                                        if (executor4 != null) {
                                            executor4.execute(new d1.e(0, fVar, e10));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (JSONException e11) {
                                    CancellationSignal cancellationSignal7 = fVar.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal7)) {
                                        Executor executor5 = fVar.f5642g;
                                        if (executor5 != null) {
                                            executor5.execute(new d1.b(fVar, e11, 0));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    CancellationSignal cancellationSignal8 = fVar.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal8)) {
                                        Executor executor6 = fVar.f5642g;
                                        if (executor6 != null) {
                                            executor6.execute(new d1.c(fVar, th3, 0));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
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
                b bVar3 = new b(2, b1.d.f1947a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar4 = (e1.d) this.f3519b;
                Executor executor7 = dVar4.f6098g;
                if (executor7 != null) {
                    v0.h hVar4 = dVar4.f6097f;
                    if (hVar4 != null) {
                        if (!b1.d.b(resultData, bVar3, executor7, hVar4, dVar4.h)) {
                            int i15 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 >= 34) {
                                obj = g0.a.e(resultData);
                            } else {
                                Parcelable parcelable5 = resultData.getParcelable("RESULT_DATA");
                                boolean isInstance = Intent.class.isInstance(parcelable5);
                                obj = parcelable5;
                                if (!isInstance) {
                                    obj = null;
                                }
                            }
                            Intent intent3 = (Intent) obj;
                            int i17 = b1.d.f1949c;
                            if (i15 != i17) {
                                Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i15);
                                return;
                            } else if (!b1.d.c(i10, new e(5), new bd.a(dVar4, 3), dVar4.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = dVar4.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal9)) {
                                        Executor executor8 = dVar4.f6098g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(dVar4, 1));
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
                                        cVar = f8.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = dVar4.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal10)) {
                                        Executor executor9 = dVar4.f6098g;
                                        if (executor9 != null) {
                                            executor9.execute(new d1.e(6, dVar4, cVar));
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
                                    int i18 = w0.d.f52343a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a2 = null;
                                    } else {
                                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string3 != null) {
                                            a2 = l9.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = dVar4.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.h.a(cancellationSignal11)) {
                                    Executor executor10 = dVar4.f6098g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.c(dVar4, a2, 1));
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
            case 3:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                b bVar4 = new b(2, b1.d.f1947a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.b bVar5 = (f1.b) this.f3519b;
                Executor executor11 = bVar5.f6726g;
                if (executor11 != null) {
                    v0.h hVar5 = bVar5.f6725f;
                    if (hVar5 != null) {
                        if (!b1.d.b(resultData, bVar4, executor11, hVar5, bVar5.h)) {
                            int i19 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            int i20 = Build.VERSION.SDK_INT;
                            if (i20 >= 34) {
                                obj2 = g0.a.e(resultData);
                            } else {
                                Parcelable parcelable6 = resultData.getParcelable("RESULT_DATA");
                                boolean isInstance2 = Intent.class.isInstance(parcelable6);
                                obj2 = parcelable6;
                                if (!isInstance2) {
                                    obj2 = null;
                                }
                            }
                            Intent intent4 = (Intent) obj2;
                            final Executor executor12 = bVar5.f6726g;
                            if (executor12 != null) {
                                final v0.h hVar6 = bVar5.f6725f;
                                if (hVar6 != null) {
                                    CancellationSignal cancellationSignal12 = bVar5.h;
                                    int i21 = b1.d.f1949c;
                                    if (i19 != i21) {
                                        Log.w("GetCredentialController", "Returned request code " + i21 + " which  does not match what was given " + i19);
                                        return;
                                    } else if (!c0.b(i10, new e(0), new b1.f(0, executor12, hVar6), cancellationSignal12)) {
                                        if (intent4 == null) {
                                            c0.a(cancellationSignal12, new ld.a() {
                                                @Override
                                                public final Object invoke() {
                                                    switch (r1) {
                                                        case 0:
                                                            ((Executor) executor12).execute(new a1.e((v0.h) hVar6, 7));
                                                            break;
                                                        default:
                                                            c1.d dVar42 = (c1.d) executor12;
                                                            dVar42.f().execute(new a1.f(28, dVar42, (n) hVar6));
                                                            break;
                                                    }
                                                    return j.f401a;
                                                }
                                            });
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            nVar = g1.a.d(intent4);
                                        } else {
                                            Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                                            if (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                                                nVar = null;
                                            } else {
                                                nVar = new n(g8.a(string2, bundle2));
                                            }
                                        }
                                        if (nVar != null) {
                                            c0.a(cancellationSignal12, new b1.b(executor12, hVar6, nVar, 1));
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            iVar = g1.a.c(intent4);
                                        } else {
                                            int i22 = i.f52344a;
                                            Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra4 != null) {
                                                String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string4 != null) {
                                                    iVar = l9.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                                                } else {
                                                    throw new IllegalArgumentException("Bundle was missing exception type.");
                                                }
                                            }
                                        }
                                        c0.a(cancellationSignal12, new b1.b(executor12, hVar6, iVar, 2));
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
            default:
                n4.f fVar2 = (n4.f) ((WeakReference) this.f3519b).get();
                if (fVar2 != null && resultData != null) {
                    synchronized (fVar2.f13497b) {
                        p pVar = fVar2.e;
                        IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i23 = n4.k.f13509b;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof n4.d)) {
                                dVar2 = (n4.d) queryLocalInterface;
                            } else {
                                ?? obj4 = new Object();
                                obj4.f13493a = binder;
                                dVar2 = obj4;
                            }
                        }
                        pVar.b(dVar2);
                        fVar2.e.c(y4.a.a(resultData));
                        fVar2.a();
                    }
                    return;
                }
                return;
        }
    }

    public c(n4.f fVar) {
        super(null);
        this.f3518a = 4;
        this.f3519b = new WeakReference(fVar);
    }
}
