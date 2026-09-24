package c1;

import ai.ba;
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
import ci.y8;
import com.google.android.gms.common.api.f;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import n4.h;
import n4.q;
import n4.x;
import org.json.JSONException;
import v0.o;
import v7.h0;
import w0.g;
import w0.i;
import w0.j;
import w7.c9;
import w7.g0;
import w7.h8;
import w7.v7;
import w7.w7;
public final class d extends ResultReceiver {
    public final int f3643a;
    public final Object f3644b;

    public d(b1.d dVar, Handler handler, int i10) {
        super(handler);
        this.f3643a = i10;
        this.f3644b = dVar;
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
        h hVar = null;
        switch (this.f3643a) {
            case 0:
                kotlin.jvm.internal.i.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.f2885a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                final e eVar = (e) this.f3644b;
                if (!b1.d.b(resultData, cVar2, eVar.f(), eVar.e(), eVar.h)) {
                    int i11 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i12 = b1.d.f2887c;
                    if (i11 != i12) {
                        Log.w("BeginSignIn", "Returned request code " + i12 + " which  does not match what was given " + i11);
                        return;
                    } else if (!h0.b(i10, new b1.e(1), new b(eVar, 0), eVar.h)) {
                        try {
                            final o d = eVar.d(h8.a(eVar.e).f(intent));
                            h0.a(eVar.h, new rd.a() {
                                @Override
                                public final Object invoke() {
                                    switch (r1) {
                                        case 0:
                                            ((Executor) eVar).execute(new a1.b((v0.i) d, 7));
                                            break;
                                        default:
                                            c1.e eVar2 = (c1.e) eVar;
                                            eVar2.f().execute(new ba(10, eVar2, (o) d));
                                            break;
                                    }
                                    return gd.i.f9602a;
                                }
                            });
                            return;
                        } catch (f e) {
                            ?? obj3 = new Object();
                            obj3.f13892a = new w0.h(e.getMessage(), 2);
                            if (e.getStatusCode() == 16) {
                                obj3.f13892a = new g(e.getMessage());
                            } else if (b1.d.f2886b.contains(Integer.valueOf(e.getStatusCode()))) {
                                obj3.f13892a = new j(e.getMessage());
                            }
                            CancellationSignal cancellationSignal = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                eVar.f().execute(new ba(8, eVar, obj3));
                                return;
                            }
                            return;
                        } catch (i e7) {
                            CancellationSignal cancellationSignal2 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal2)) {
                                eVar.f().execute(new a(eVar, e7, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            w0.h hVar2 = new w0.h(th2.getMessage(), 2);
                            CancellationSignal cancellationSignal3 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal3)) {
                                eVar.f().execute(new ba(9, eVar, hVar2));
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
                c cVar3 = new c(2, b1.d.f2885a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) this.f3644b;
                Executor executor = eVar2.f7393g;
                if (executor != null) {
                    v0.i iVar2 = eVar2.f7392f;
                    if (iVar2 != null) {
                        if (!b1.d.b(resultData, cVar3, executor, iVar2, eVar2.h)) {
                            int i13 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i14 = b1.d.f2887c;
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
                                    a1.g gVar = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = eVar2.h;
                                    gVar.getClass();
                                    if (!a1.g.a(cancellationSignal4)) {
                                        Executor executor2 = eVar2.f7393g;
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
                                LinkedHashMap linkedHashMap = d1.f.f7395a;
                                Parcelable parcelable = uVar.d;
                                Parcelable parcelable2 = parcelable;
                                if (parcelable == null) {
                                    Parcelable parcelable3 = uVar.e;
                                    parcelable2 = parcelable3;
                                    if (parcelable3 == null) {
                                        Parcelable parcelable4 = uVar.f4143f;
                                        parcelable2 = parcelable4;
                                        if (parcelable4 == null) {
                                            throw new IllegalStateException("No response set.");
                                        }
                                    }
                                }
                                if (parcelable2 instanceof k) {
                                    k kVar = (k) parcelable2;
                                    r rVar = kVar.f4105a;
                                    kotlin.jvm.internal.i.d(rVar, "getErrorCode(...)");
                                    x0.a aVar = (x0.a) d1.f.f7395a.get(rVar);
                                    String str = kVar.f4106b;
                                    if (aVar == null) {
                                        dVar = new y0.a(new x0.a(26), v7.j.g("unknown fido gms exception - ", str));
                                    } else if (rVar == r.NOT_ALLOWED_ERR && str != null && xd.j.b(str, "Unable to get sync account")) {
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
                                        Executor executor3 = eVar2.f7393g;
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
                                    if (!a1.g.a(cancellationSignal6)) {
                                        Executor executor4 = eVar2.f7393g;
                                        if (executor4 != null) {
                                            executor4.execute(new y8(7, eVar2, e10));
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
                                    if (!a1.g.a(cancellationSignal7)) {
                                        Executor executor5 = eVar2.f7393g;
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
                                    if (!a1.g.a(cancellationSignal8)) {
                                        Executor executor6 = eVar2.f7393g;
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
                c cVar4 = new c(2, b1.d.f2885a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar2 = (e1.d) this.f3644b;
                Executor executor7 = dVar2.f7852g;
                if (executor7 != null) {
                    v0.i iVar3 = dVar2.f7851f;
                    if (iVar3 != null) {
                        if (!b1.d.b(resultData, cVar4, executor7, iVar3, dVar2.h)) {
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
                            int i17 = b1.d.f2887c;
                            if (i15 != i17) {
                                Log.w("CreatePublicKey", "Returned request code " + i17 + " does not match what was given " + i15);
                                return;
                            } else if (!b1.d.c(i10, new b1.e(3), new b(dVar2, 2), dVar2.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = dVar2.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal9)) {
                                        Executor executor8 = dVar2.f7852g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(dVar2, 1));
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
                                        cVar = v7.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = dVar2.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal10)) {
                                        Executor executor9 = dVar2.f7852g;
                                        if (executor9 != null) {
                                            executor9.execute(new y8(10, dVar2, cVar));
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
                                    int i18 = w0.d.f44735a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a2 = null;
                                    } else {
                                        String string3 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string3 != null) {
                                            a2 = c9.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string3);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = dVar2.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.g.a(cancellationSignal11)) {
                                    Executor executor10 = dVar2.f7852g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.c(dVar2, a2, 1));
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
                c cVar5 = new c(2, b1.d.f2885a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.a aVar2 = (f1.a) this.f3644b;
                Executor executor11 = aVar2.f8777g;
                if (executor11 != null) {
                    v0.i iVar4 = aVar2.f8776f;
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
                            final Executor executor12 = aVar2.f8777g;
                            if (executor12 != null) {
                                final v0.i iVar5 = aVar2.f8776f;
                                if (iVar5 != null) {
                                    CancellationSignal cancellationSignal12 = aVar2.h;
                                    int i21 = b1.d.f2887c;
                                    if (i19 != i21) {
                                        Log.w("GetCredentialController", "Returned request code " + i21 + " which  does not match what was given " + i19);
                                        return;
                                    } else if (!h0.b(i10, new b1.e(0), new b1.f(0, executor12, iVar5), cancellationSignal12)) {
                                        if (intent4 == null) {
                                            h0.a(cancellationSignal12, new rd.a() {
                                                @Override
                                                public final Object invoke() {
                                                    switch (r1) {
                                                        case 0:
                                                            ((Executor) executor12).execute(new a1.b((v0.i) iVar5, 7));
                                                            break;
                                                        default:
                                                            c1.e eVar22 = (c1.e) executor12;
                                                            eVar22.f().execute(new ba(10, eVar22, (o) iVar5));
                                                            break;
                                                    }
                                                    return gd.i.f9602a;
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
                                                oVar = new o(w7.a(string2, bundle2));
                                            }
                                        }
                                        if (oVar != null) {
                                            h0.a(cancellationSignal12, new b1.b(executor12, iVar5, oVar, 1));
                                            return;
                                        }
                                        if (i20 >= 34) {
                                            iVar = g1.a.c(intent4);
                                        } else {
                                            int i22 = i.f44736a;
                                            Bundle bundleExtra4 = intent4.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                                            if (bundleExtra4 != null) {
                                                String string4 = bundleExtra4.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                                if (string4 != null) {
                                                    iVar = c9.b(bundleExtra4.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string4);
                                                } else {
                                                    throw new IllegalArgumentException("Bundle was missing exception type.");
                                                }
                                            }
                                        }
                                        h0.a(cancellationSignal12, new b1.b(executor12, iVar5, iVar, 2));
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
                n4.j jVar = (n4.j) ((WeakReference) this.f3644b).get();
                if (jVar != null && resultData != null) {
                    synchronized (jVar.f15171b) {
                        x xVar = jVar.e;
                        IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i23 = q.f15186b;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
                                hVar = (h) queryLocalInterface;
                            } else {
                                ?? obj4 = new Object();
                                obj4.f15153a = binder;
                                hVar = obj4;
                            }
                        }
                        xVar.b(hVar);
                        jVar.e.c(y4.a.a(resultData));
                        jVar.a();
                    }
                    return;
                }
                return;
        }
    }

    public d(n4.j jVar) {
        super(null);
        this.f3643a = 4;
        this.f3644b = new WeakReference(jVar);
    }
}
