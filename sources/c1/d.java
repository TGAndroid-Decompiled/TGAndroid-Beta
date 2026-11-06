package c1;

import a8.d7;
import a8.e7;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.f;
import bi.a4;
import c8.ge;
import c8.vc;
import c8.x9;
import c8.yb;
import di.z0;
import f7.k;
import f7.l;
import f7.r;
import f7.u;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import q4.p;
import w0.g;
import w0.h;
import w0.i;
public final class d extends ResultReceiver {
    public final int f5252a;
    public final Object f5253b;

    public d(b1.d dVar, Handler handler, int i7) {
        super(handler);
        this.f5252a = i7;
        this.f5253b = dVar;
    }

    @Override
    public final void onReceiveResult(int i7, Bundle resultData) {
        byte[] bArr;
        w0.d dVar;
        v0.c cVar;
        String string;
        Bundle bundle;
        w0.d a10;
        q4.d dVar2 = null;
        switch (this.f5252a) {
            case 0:
                j.e(resultData, "resultData");
                c cVar2 = new c(2, b1.d.f2897a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 0);
                e eVar = (e) this.f5253b;
                if (!b1.d.b(resultData, cVar2, eVar.g(), eVar.f(), eVar.h)) {
                    int i10 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) resultData.getParcelable("RESULT_DATA");
                    int i11 = b1.d.f2899c;
                    if (i10 != i11) {
                        Log.w("BeginSignIn", "Returned request code " + i11 + " which  does not match what was given " + i10);
                        return;
                    } else if (!d7.b(i7, new b1.e(1), new b(eVar, 0), eVar.h)) {
                        try {
                            d7.a(eVar.h, new f(1, eVar, eVar.e(a.a.a(eVar.f5254e).f(intent))));
                            return;
                        } catch (com.google.android.gms.common.api.f e10) {
                            ?? obj = new Object();
                            obj.f17612a = new h(2, e10.getMessage());
                            if (e10.getStatusCode() == 16) {
                                obj.f17612a = new g(e10.getMessage());
                            } else if (b1.d.f2898b.contains(Integer.valueOf(e10.getStatusCode()))) {
                                obj.f17612a = new w0.j(e10.getMessage());
                            }
                            CancellationSignal cancellationSignal = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                eVar.g().execute(new a4(12, eVar, (Object) obj));
                                return;
                            }
                            return;
                        } catch (i e11) {
                            CancellationSignal cancellationSignal2 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal2)) {
                                eVar.g().execute(new a(eVar, e11, 1));
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            h hVar = new h(2, th2.getMessage());
                            CancellationSignal cancellationSignal3 = eVar.h;
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal3)) {
                                eVar.g().execute(new a4(13, eVar, hVar));
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
                c cVar3 = new c(2, b1.d.f2897a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 1);
                d1.e eVar2 = (d1.e) this.f5253b;
                Executor executor = eVar2.f7942g;
                if (executor != null) {
                    v0.g gVar = eVar2.f7941f;
                    if (gVar != null) {
                        if (!b1.d.b(resultData, cVar3, executor, gVar, eVar2.h)) {
                            int i12 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent2 = (Intent) resultData.getParcelable("RESULT_DATA");
                            int i13 = b1.d.f2899c;
                            if (i12 != i13) {
                                Log.w("CreatePublicKey", "Returned request code " + i13 + " does not match what was given " + i12);
                                return;
                            } else if (!b1.d.c(i7, new b1.e(2), new b(eVar2, 1), eVar2.h)) {
                                if (intent2 != null) {
                                    bArr = intent2.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    a1.g gVar2 = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal4 = eVar2.h;
                                    gVar2.getClass();
                                    if (!a1.g.a(cancellationSignal4)) {
                                        Executor executor2 = eVar2.f7942g;
                                        if (executor2 != null) {
                                            executor2.execute(new d1.d(eVar2, 1));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                u uVar = (u) yb.a(bArr, u.CREATOR);
                                j.d(uVar, "deserializeFromBytes(...)");
                                LinkedHashMap linkedHashMap = d1.g.f7948a;
                                l lVar = uVar.d;
                                if (lVar != null || (lVar = uVar.f11435e) != null || (lVar = uVar.f11436f) != null) {
                                    if (lVar instanceof k) {
                                        k kVar = (k) lVar;
                                        r rVar = kVar.f11396a;
                                        j.d(rVar, "getErrorCode(...)");
                                        x0.a aVar = (x0.a) d1.g.f7948a.get(rVar);
                                        String str = kVar.f11397b;
                                        if (aVar == null) {
                                            dVar = new y0.a(new x0.a(26), rf.b.i("unknown fido gms exception - ", str));
                                        } else if (rVar == r.NOT_ALLOWED_ERR && str != null && xd.d.e(str, "Unable to get sync account")) {
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
                                            Executor executor3 = eVar2.f7942g;
                                            if (executor3 != null) {
                                                executor3.execute(new d1.a(eVar2, dVar, 2));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        v0.f f10 = d1.e.f(uVar);
                                        CancellationSignal cancellationSignal6 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal6)) {
                                            Executor executor4 = eVar2.f7942g;
                                            if (executor4 != null) {
                                                executor4.execute(new a4(21, eVar2, f10));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (JSONException e12) {
                                        CancellationSignal cancellationSignal7 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal7)) {
                                            Executor executor5 = eVar2.f7942g;
                                            if (executor5 != null) {
                                                executor5.execute(new d1.b(eVar2, e12, 0));
                                                return;
                                            } else {
                                                j.h("executor");
                                                throw null;
                                            }
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        CancellationSignal cancellationSignal8 = eVar2.h;
                                        CredentialProviderPlayServicesImpl.Companion.getClass();
                                        if (!a1.g.a(cancellationSignal8)) {
                                            Executor executor6 = eVar2.f7942g;
                                            if (executor6 != null) {
                                                executor6.execute(new d1.c(eVar2, th3, 0));
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
                c cVar4 = new c(2, b1.d.f2897a, b1.a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, 2);
                e1.d dVar3 = (e1.d) this.f5253b;
                Executor executor7 = dVar3.f10140g;
                if (executor7 != null) {
                    v0.g gVar3 = dVar3.f10139f;
                    if (gVar3 != null) {
                        if (!b1.d.b(resultData, cVar4, executor7, gVar3, dVar3.h)) {
                            int i14 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent3 = (Intent) x9.a(resultData);
                            int i15 = b1.d.f2899c;
                            if (i14 != i15) {
                                Log.w("CreatePublicKey", "Returned request code " + i15 + " does not match what was given " + i14);
                                return;
                            } else if (!b1.d.c(i7, new b1.e(4), new b(dVar3, 2), dVar3.h)) {
                                if (intent3 == null) {
                                    CancellationSignal cancellationSignal9 = dVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal9)) {
                                        Executor executor8 = dVar3.f10140g;
                                        if (executor8 != null) {
                                            executor8.execute(new e1.a(dVar3, 1));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                int i16 = Build.VERSION.SDK_INT;
                                if (i16 >= 34) {
                                    cVar = h1.a.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent3);
                                } else {
                                    Bundle bundleExtra = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        cVar = null;
                                    } else {
                                        cVar = vc.a(string, bundle);
                                    }
                                }
                                if (cVar != null) {
                                    CancellationSignal cancellationSignal10 = dVar3.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!a1.g.a(cancellationSignal10)) {
                                        Executor executor9 = dVar3.f10140g;
                                        if (executor9 != null) {
                                            executor9.execute(new z0(28, dVar3, cVar));
                                            return;
                                        } else {
                                            j.h("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i16 >= 34) {
                                    a10 = h1.a.a(intent3);
                                } else {
                                    int i17 = w0.d.f57479a;
                                    Bundle bundleExtra2 = intent3.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a10 = null;
                                    } else {
                                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string2 != null) {
                                            a10 = ge.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                                        } else {
                                            throw new IllegalArgumentException("Bundle was missing exception type.");
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal11 = dVar3.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!a1.g.a(cancellationSignal11)) {
                                    Executor executor10 = dVar3.f10140g;
                                    if (executor10 != null) {
                                        executor10.execute(new e1.c(dVar3, a10, 1));
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
            case 3:
                j.e(resultData, "resultData");
                c cVar5 = new c(2, b1.d.f2897a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 3);
                f1.a aVar2 = (f1.a) this.f5253b;
                Executor executor11 = aVar2.f10885g;
                if (executor11 != null) {
                    v0.g gVar4 = aVar2.f10884f;
                    if (gVar4 != null) {
                        if (!b1.d.b(resultData, cVar5, executor11, gVar4, aVar2.h)) {
                            int i18 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent4 = (Intent) x9.a(resultData);
                            Executor executor12 = aVar2.f10885g;
                            if (executor12 != null) {
                                v0.g gVar5 = aVar2.f10884f;
                                if (gVar5 != null) {
                                    e7.a(i18, i7, intent4, executor12, gVar5, aVar2.h);
                                    return;
                                } else {
                                    j.h("callback");
                                    throw null;
                                }
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
            case 4:
                j.e(resultData, "resultData");
                c cVar6 = new c(2, b1.d.f2897a, b1.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 4);
                g1.a aVar3 = (g1.a) this.f5253b;
                Executor executor13 = aVar3.f13412g;
                if (executor13 != null) {
                    v0.g gVar6 = aVar3.f13411f;
                    if (gVar6 != null) {
                        if (!b1.d.b(resultData, cVar6, executor13, gVar6, aVar3.h)) {
                            int i19 = resultData.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent5 = (Intent) x9.a(resultData);
                            Executor executor14 = aVar3.f13412g;
                            if (executor14 != null) {
                                v0.g gVar7 = aVar3.f13411f;
                                if (gVar7 != null) {
                                    e7.a(i19, i7, intent5, executor14, gVar7, aVar3.h);
                                    return;
                                } else {
                                    j.h("callback");
                                    throw null;
                                }
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
            default:
                q4.f fVar = (q4.f) ((WeakReference) this.f5253b).get();
                if (fVar != null && resultData != null) {
                    synchronized (fVar.f53676b) {
                        p pVar = fVar.f53678e;
                        IBinder binder = resultData.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i20 = q4.k.f53690b;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof q4.d)) {
                                dVar2 = (q4.d) queryLocalInterface;
                            } else {
                                ?? obj2 = new Object();
                                obj2.f53672a = binder;
                                dVar2 = obj2;
                            }
                        }
                        pVar.b(dVar2);
                        fVar.f53678e.c(b5.a.c(resultData));
                        fVar.a();
                    }
                    return;
                }
                return;
        }
    }

    public d(q4.f fVar) {
        super(null);
        this.f5252a = 5;
        this.f5253b = new WeakReference(fVar);
    }
}
