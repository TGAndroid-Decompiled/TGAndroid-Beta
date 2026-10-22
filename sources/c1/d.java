package c1;

import ai.pa;
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
import c7.k;
import c7.r;
import c7.u;
import ci.v7;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n4.m;
import org.json.JSONException;
import v0.o;
import v7.c0;
import w0.g;
import w0.h;
import w0.i;
import w0.j;
import w7.a8;
import w7.g0;
import w7.h8;
import w7.z7;
import w7.z8;
public final class d extends ResultReceiver {
    public final int f4481a;
    public final Object f4482b;

    public d(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.f4481a = i10;
        this.f4482b = dVar;
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
        o oVar;
        String string2;
        Bundle bundle2;
        i iVar = null;
        n4.d dVar2 = null;
        switch (this.f4481a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.f3656a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final e eVar = (e) this.f4482b;
                if (!b1.d.b(resultData, cVar2, eVar.f(), eVar.e(), eVar.h)) {
                    int i11 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i12 = b1.d.f3658c;
                    if (i11 != i12) {
                        Log.w("BeginSignIn", "Returned request code " + i12 + " which  does not match what was given " + i11);
                        return;
                    } else if (!c0.b(i10, new b1.e(1), new b(eVar, 0), eVar.h)) {
                        try {
                            final o d = eVar.d(h8.a(eVar.e).f(intent));
                            c0.a(eVar.h, new td.a() {
                                @Override
                                public final Object invoke() {
                                    switch (r1) {
                                        case 0:
                                            ((Executor) eVar).execute(new a1.e((v0.i) d, 7));
                                            break;
                                        default:
                                            c1.e eVar2 = (c1.e) eVar;
                                            eVar2.f().execute(new pa(7, eVar2, (o) d));
                                            break;
                                    }
                                    return id.i.f12775a;
                                }
                            });
                            return;
                        } catch (f e) {
                            ?? obj3 = new Object();
                            obj3.f15703a = new h(e.getMessage(), 2);
                            if (e.getStatusCode() == 16) {
                                obj3.f15703a = new g(e.getMessage());
                            } else if (b1.d.f3657b.contains(Integer.valueOf(e.getStatusCode()))) {
                                obj3.f15703a = new j(e.getMessage());
                            }
                            CancellationSignal cancellationSignal = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                eVar.f().execute(new pa(5, eVar, obj3));
                                return;
                            }
                            return;
                        } catch (i e7) {
                            CancellationSignal cancellationSignal2 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal2)) {
                                eVar.f().execute(new a(eVar, e7, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            h hVar = new h(th2.getMessage(), 2);
                            CancellationSignal cancellationSignal3 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal3)) {
                                eVar.f().execute(new pa(6, eVar, hVar));
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
                c cVar3 = new c(2, b1.d.f3656a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) this.f4482b;
                Executor executor = eVar2.f7729g;
                if (executor != null) {
                    v0.i iVar2 = eVar2.f7728f;
                    if (iVar2 != null) {
                        if (!b1.d.b(resultData, cVar3, executor, iVar2, eVar2.h)) {
                            int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i14 = b1.d.f3658c;
                            if (i13 != i14) {
                                Log.w("CreatePublicKey", "Returned request code " + i14 + " does not match what was given " + i13);
                                return;
                            } else if (!b1.d.c(i10, new b1.e(2), new b(eVar2, 1), eVar2.h)) {
                                if (intent2 != null) {
                                    bArr = intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    a1.h hVar2 = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = eVar2.h;
                                    hVar2.getClass();
                                    if (!a1.h.a(cancellationSignal4)) {
                                        Executor executor2 = eVar2.f7729g;
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
                                u uVar = (u) g0.a(bArr, u.CREATOR);
                                kotlin.jvm.internal.i.d(uVar, "deserializeFromBytes(...)");
                                LinkedHashMap linkedHashMap = d1.f.f7731a;
                                Parcelable parcelable = uVar.d;
                                Parcelable parcelable2 = parcelable;
                                if (parcelable == null) {
                                    Parcelable parcelable3 = uVar.e;
                                    parcelable2 = parcelable3;
                                    if (parcelable3 == null) {
                                        Parcelable parcelable4 = uVar.f5007f;
                                        parcelable2 = parcelable4;
                                        if (parcelable4 == null) {
                                            throw new IllegalStateException("No response set.");
                                        }
                                    }
                                }
                                if (parcelable2 instanceof k) {
                                    k kVar = (k) parcelable2;
                                    r rVar = kVar.f4969a;
                                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                                    x0.a aVar = (x0.a) d1.f.f7731a.get(rVar);
                                    String str = kVar.f4970b;
                                    if (aVar == null) {
                                        dVar = new y0.a(new x0.a(26), r4.c.h("unknown fido gms exception - ", str));
                                    } else if (rVar == r.NOT_ALLOWED_ERR && str != null && zd.j.b(str, "Unable to get sync account")) {
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
                                    if (!a1.h.a(cancellationSignal5)) {
                                        Executor executor3 = eVar2.f7729g;
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
                                    v0.f e10 = d1.e.e(uVar);
                                    CancellationSignal cancellationSignal6 = eVar2.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal6)) {
                                        Executor executor4 = eVar2.f7729g;
                                        if (executor4 != null) {
                                            executor4.execute(new v7(10, eVar2, e10));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (JSONException e11) {
                                    CancellationSignal cancellationSignal7 = eVar2.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal7)) {
                                        Executor executor5 = eVar2.f7729g;
                                        if (executor5 != null) {
                                            executor5.execute(new d1.b(eVar2, e11, 0));
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    CancellationSignal cancellationSignal8 = eVar2.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal8)) {
                                        Executor executor6 = eVar2.f7729g;
                                        if (executor6 != null) {
                                            executor6.execute(new d1.c(eVar2, th3, 0));
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
                c cVar4 = new c(2, b1.d.f3656a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.e eVar3 = (e1.e) this.f4482b;
                Executor executor7 = eVar3.f8184g;
                if (executor7 != null) {
                    v0.i iVar3 = eVar3.f8183f;
                    if (iVar3 != null) {
                        if (!b1.d.b(resultData, cVar4, executor7, iVar3, eVar3.h)) {
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
                            int i17 = b1.d.f3658c;
                            if (i15 != i17) {
                                Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i15);
                                return;
                            } else if (!b1.d.c(i10, new b1.e(3), new b(eVar3, 2), eVar3.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = eVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal9)) {
                                        Executor executor8 = eVar3.f8184g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(eVar3, 1));
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
                                        cVar = z7.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = eVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.h.a(cancellationSignal10)) {
                                        Executor executor9 = eVar3.f8184g;
                                        if (executor9 != null) {
                                            executor9.execute(new v7(15, eVar3, cVar));
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
                                    int i18 = w0.d.f48461a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a2 = null;
                                    } else {
                                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string3 != null) {
                                            a2 = z8.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = eVar3.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.h.a(cancellationSignal11)) {
                                    Executor executor10 = eVar3.f8184g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.d(eVar3, a2, 1));
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
                c cVar5 = new c(2, b1.d.f3656a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.a aVar2 = (f1.a) this.f4482b;
                Executor executor11 = aVar2.f10277g;
                if (executor11 != null) {
                    v0.i iVar4 = aVar2.f10276f;
                    if (iVar4 != null) {
                        if (!b1.d.b(resultData, cVar5, executor11, iVar4, aVar2.h)) {
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
                            final Executor executor12 = aVar2.f10277g;
                            if (executor12 != null) {
                                final v0.i iVar5 = aVar2.f10276f;
                                if (iVar5 != null) {
                                    CancellationSignal cancellationSignal12 = aVar2.h;
                                    int i21 = b1.d.f3658c;
                                    if (i19 != i21) {
                                        Log.w("GetCredentialController", "Returned request code " + i21 + " which  does not match what was given " + i19);
                                        return;
                                    } else if (!c0.b(i10, new b1.e(0), new b1.f(0, executor12, iVar5), cancellationSignal12)) {
                                        if (intent4 == null) {
                                            c0.a(cancellationSignal12, new td.a() {
                                                @Override
                                                public final Object invoke() {
                                                    switch (r1) {
                                                        case 0:
                                                            ((Executor) executor12).execute(new a1.e((v0.i) iVar5, 7));
                                                            break;
                                                        default:
                                                            c1.e eVar22 = (c1.e) executor12;
                                                            eVar22.f().execute(new pa(7, eVar22, (o) iVar5));
                                                            break;
                                                    }
                                                    return id.i.f12775a;
                                                }
                                            });
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            oVar = g1.a.d(intent4);
                                        } else {
                                            Bundle bundleExtra3 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                                            if (bundleExtra3 == null || (string2 = bundleExtra3.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra3.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) {
                                                oVar = null;
                                            } else {
                                                oVar = new o(a8.a(string2, bundle2));
                                            }
                                        }
                                        if (oVar != null) {
                                            c0.a(cancellationSignal12, new b1.b(executor12, iVar5, oVar, 1));
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            iVar = g1.a.c(intent4);
                                        } else {
                                            int i22 = i.f48462a;
                                            Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra4 != null) {
                                                String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string4 != null) {
                                                    iVar = z8.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                                                } else {
                                                    throw new IllegalArgumentException("Bundle was missing exception type.");
                                                }
                                            }
                                        }
                                        c0.a(cancellationSignal12, new b1.b(executor12, iVar5, iVar, 2));
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
                n4.f fVar = (n4.f) ((WeakReference) this.f4482b).get();
                if (fVar != null && resultData != null) {
                    synchronized (fVar.f17090b) {
                        n4.r rVar2 = fVar.e;
                        IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i23 = m.f17106b;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof n4.d)) {
                                dVar2 = (n4.d) queryLocalInterface;
                            } else {
                                ?? obj4 = new Object();
                                obj4.f17086a = binder;
                                dVar2 = obj4;
                            }
                        }
                        rVar2.b(dVar2);
                        fVar.e.c(y4.a.a(resultData));
                        fVar.a();
                    }
                    return;
                }
                return;
        }
    }

    public d(n4.f fVar) {
        super(null);
        this.f4481a = 4;
        this.f4482b = new WeakReference(fVar);
    }
}
