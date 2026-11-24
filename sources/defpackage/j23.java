package defpackage;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
public final class j23 extends ResultReceiver {
    public final byte a;
    public final Object b;

    public j23(to6 to6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(to6Var);
    }

    @Override
    public final void onReceiveResult(int i, Bundle bundle) {
        w13 w13Var;
        String string;
        Bundle bundle2;
        o13 a;
        boolean z;
        byte[] bArr;
        o13 o13Var;
        kk5 kk5Var;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                bundle.getClass();
                i23 i23Var = new i23(2, j33.a, e33.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                k23 k23Var = (k23) this.b;
                Executor executor = k23Var.g;
                if (executor != null) {
                    a33 a33Var = k23Var.f;
                    if (a33Var != null) {
                        if (!j33.b(bundle, i23Var, executor, a33Var, k23Var.h)) {
                            int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent = (Intent) zrd.a(bundle);
                            boolean z3 = j33.c;
                            if (i2 != z3) {
                                Log.w("CreatePublicKey", "Returned request code " + (z3 ? 1 : 0) + " does not match what was given " + i2);
                                return;
                            }
                            z1 z1Var = new z1(k23Var, (byte) 1);
                            CancellationSignal cancellationSignal = k23Var.h;
                            if (i != -1) {
                                ?? obj = new Object();
                                obj.a = new n13(mce.a(i), (byte) 2);
                                if (i == 0) {
                                    obj.a = new m13("activity is cancelled by the user.");
                                }
                                i33 i33Var = new i33(z1Var, obj, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!w33.a(cancellationSignal)) {
                                    i33Var.invoke();
                                }
                                z2 = true;
                            }
                            if (!z2) {
                                if (intent == null) {
                                    CancellationSignal cancellationSignal2 = k23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal2)) {
                                        Executor executor2 = k23Var.g;
                                        if (executor2 != null) {
                                            executor2.execute(new e23(k23Var, (byte) 1));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                if (i3 >= 34) {
                                    w13Var = t4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                                } else {
                                    Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        w13Var = null;
                                    } else {
                                        w13Var = tbe.a(string, bundle2);
                                    }
                                }
                                if (w13Var != null) {
                                    CancellationSignal cancellationSignal3 = k23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal3)) {
                                        Executor executor3 = k23Var.g;
                                        if (executor3 != null) {
                                            executor3.execute(new mv2(k23Var, w13Var, (byte) 14));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i3 >= 34) {
                                    a = t4.a(intent);
                                } else {
                                    int i4 = o13.a;
                                    Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a = null;
                                    } else {
                                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string2 != null) {
                                            a = gwd.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                                        } else {
                                            u36.j("Bundle was missing exception type.");
                                            return;
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal4 = k23Var.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!w33.a(cancellationSignal4)) {
                                    Executor executor4 = k23Var.g;
                                    if (executor4 != null) {
                                        executor4.execute(new g23(k23Var, a, (byte) 1));
                                        return;
                                    } else {
                                        rr5.e("executor");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    rr5.e("callback");
                    throw null;
                }
                rr5.e("executor");
                throw null;
            case 1:
                bundle.getClass();
                i23 i23Var2 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                h33 h33Var = (h33) this.b;
                if (!j33.b(bundle, i23Var2, h33Var.f(), h33Var.e(), h33Var.h)) {
                    int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                    boolean z4 = j33.c;
                    if (i5 != z4) {
                        Log.w("BeginSignIn", "Returned request code " + (z4 ? 1 : 0) + " which  does not match what was given " + i5);
                        return;
                    }
                    z1 z1Var2 = new z1(h33Var, (byte) 2);
                    CancellationSignal cancellationSignal5 = h33Var.h;
                    if (i != -1) {
                        ?? obj2 = new Object();
                        obj2.a = new uu4(mce.a(i), (byte) 2);
                        if (i == 0) {
                            obj2.a = new su4("activity is cancelled by the user.");
                        }
                        i33 i33Var2 = new i33(z1Var2, obj2, (byte) 1);
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal5)) {
                            i33Var2.invoke();
                            return;
                        }
                        return;
                    }
                    try {
                        ume.a(h33Var.e);
                        yu4 d = h33Var.d(s5d.f(intent2));
                        CancellationSignal cancellationSignal6 = h33Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal6)) {
                            h33Var.f().execute(new mv2(h33Var, d, (byte) 18));
                            return;
                        }
                        return;
                    } catch (ap e) {
                        ?? obj3 = new Object();
                        obj3.a = new uu4(e.getMessage(), (byte) 2);
                        if (e.getStatusCode() == 16) {
                            obj3.a = new su4(e.getMessage());
                        } else if (j33.b.contains(Integer.valueOf(e.getStatusCode()))) {
                            obj3.a = new wu4(e.getMessage());
                        }
                        CancellationSignal cancellationSignal7 = h33Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal7)) {
                            h33Var.f().execute(new mv2(h33Var, (Object) obj3, (byte) 19));
                            return;
                        }
                        return;
                    } catch (vu4 e2) {
                        CancellationSignal cancellationSignal8 = h33Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal8)) {
                            h33Var.f().execute(new g33(h33Var, e2, (byte) 1));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        uu4 uu4Var = new uu4(th.getMessage(), (byte) 2);
                        CancellationSignal cancellationSignal9 = h33Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal9)) {
                            h33Var.f().execute(new mv2(h33Var, uu4Var, (byte) 17));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                bundle.getClass();
                i23 i23Var3 = new i23(2, j33.a, e33.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                o33 o33Var = (o33) this.b;
                Executor executor5 = o33Var.g;
                if (executor5 != null) {
                    a33 a33Var2 = o33Var.f;
                    if (a33Var2 != null) {
                        if (!j33.b(bundle, i23Var3, executor5, a33Var2, o33Var.h)) {
                            int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                            boolean z5 = j33.c;
                            if (i6 != z5) {
                                Log.w("CreatePublicKey", "Returned request code " + (z5 ? 1 : 0) + " does not match what was given " + i6);
                                return;
                            }
                            z1 z1Var3 = new z1(o33Var, (byte) 3);
                            CancellationSignal cancellationSignal10 = o33Var.h;
                            if (i != -1) {
                                ?? obj4 = new Object();
                                obj4.a = new n13(mce.a(i), (byte) 2);
                                if (i == 0) {
                                    obj4.a = new m13("activity is cancelled by the user.");
                                }
                                i33 i33Var3 = new i33(z1Var3, obj4, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!w33.a(cancellationSignal10)) {
                                    i33Var3.invoke();
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                if (intent3 != null) {
                                    bArr = intent3.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                } else {
                                    bArr = null;
                                }
                                if (bArr == null) {
                                    w33 w33Var = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal11 = o33Var.h;
                                    w33Var.getClass();
                                    if (!w33.a(cancellationSignal11)) {
                                        Executor executor6 = o33Var.g;
                                        if (executor6 != null) {
                                            executor6.execute(new m33(o33Var, (byte) 1));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                lw8 lw8Var = (lw8) nve.a(bArr, lw8.CREATOR);
                                lw8Var.getClass();
                                LinkedHashMap linkedHashMap = mw8.a;
                                b4 b4Var = lw8Var.d;
                                b4 b4Var2 = b4Var;
                                if (b4Var == null) {
                                    b4 b4Var3 = lw8Var.e;
                                    b4Var2 = b4Var3;
                                    if (b4Var3 == null) {
                                        b4 b4Var4 = lw8Var.f;
                                        b4Var2 = b4Var4;
                                        if (b4Var4 == null) {
                                            dq9.m("No response set.");
                                            return;
                                        }
                                    }
                                }
                                if (b4Var2 instanceof b60) {
                                    b60 b60Var = (b60) b4Var2;
                                    f54 f54Var = b60Var.a;
                                    f54Var.getClass();
                                    h1 h1Var = (h1) mw8.a.get(f54Var);
                                    String str = b60Var.b;
                                    if (h1Var == null) {
                                        o13Var = new l23(new h1((byte) 26), b10.h("unknown fido gms exception - ", str));
                                    } else if (f54Var == f54.NOT_ALLOWED_ERR && str != null && hbb.f(0, 2, str, "Unable to get sync account") >= 0) {
                                        o13Var = new m13("Passkey registration was cancelled by the user.");
                                    } else {
                                        o13Var = new l23(h1Var, str);
                                    }
                                } else {
                                    o13Var = null;
                                }
                                if (o13Var != null) {
                                    CancellationSignal cancellationSignal12 = o33Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal12)) {
                                        Executor executor7 = o33Var.g;
                                        if (executor7 != null) {
                                            executor7.execute(new n33(o33Var, o13Var, (byte) 1));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                try {
                                    n23 e3 = o33.e(lw8Var);
                                    CancellationSignal cancellationSignal13 = o33Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal13)) {
                                        Executor executor8 = o33Var.g;
                                        if (executor8 != null) {
                                            executor8.execute(new mv2(o33Var, e3, (byte) 21));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (JSONException e4) {
                                    CancellationSignal cancellationSignal14 = o33Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal14)) {
                                        Executor executor9 = o33Var.g;
                                        if (executor9 != null) {
                                            executor9.execute(new k33(o33Var, e4, (byte) 0));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    CancellationSignal cancellationSignal15 = o33Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!w33.a(cancellationSignal15)) {
                                        Executor executor10 = o33Var.g;
                                        if (executor10 != null) {
                                            executor10.execute(new l33(o33Var, th2, (byte) 0));
                                            return;
                                        } else {
                                            rr5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    rr5.e("callback");
                    throw null;
                }
                rr5.e("executor");
                throw null;
            case 3:
                bundle.getClass();
                i23 i23Var4 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                t33 t33Var = (t33) this.b;
                Executor executor11 = t33Var.g;
                if (executor11 != null) {
                    a33 a33Var3 = t33Var.f;
                    if (a33Var3 != null) {
                        if (!j33.b(bundle, i23Var4, executor11, a33Var3, t33Var.h)) {
                            int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent4 = (Intent) zrd.a(bundle);
                            Executor executor12 = t33Var.g;
                            if (executor12 != null) {
                                a33 a33Var4 = t33Var.f;
                                if (a33Var4 != null) {
                                    rue.a(i7, i, intent4, executor12, a33Var4, t33Var.h);
                                    return;
                                } else {
                                    rr5.e("callback");
                                    throw null;
                                }
                            }
                            rr5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    rr5.e("callback");
                    throw null;
                }
                rr5.e("executor");
                throw null;
            case 4:
                bundle.getClass();
                i23 i23Var5 = new i23(2, j33.a, e33.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                tu4 tu4Var = (tu4) this.b;
                Executor executor13 = tu4Var.g;
                if (executor13 != null) {
                    a33 a33Var5 = tu4Var.f;
                    if (a33Var5 != null) {
                        if (!j33.b(bundle, i23Var5, executor13, a33Var5, tu4Var.h)) {
                            int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent5 = (Intent) zrd.a(bundle);
                            Executor executor14 = tu4Var.g;
                            if (executor14 != null) {
                                a33 a33Var6 = tu4Var.f;
                                if (a33Var6 != null) {
                                    rue.a(i8, i, intent5, executor14, a33Var6, tu4Var.h);
                                    return;
                                } else {
                                    rr5.e("callback");
                                    throw null;
                                }
                            }
                            rr5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    rr5.e("callback");
                    throw null;
                }
                rr5.e("executor");
                throw null;
            default:
                to6 to6Var = (to6) ((WeakReference) this.b).get();
                if (to6Var != null && bundle != null) {
                    synchronized (to6Var.b) {
                        kx6 kx6Var = to6Var.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i9 = ax6.b;
                        if (binder == null) {
                            kk5Var = null;
                        } else {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof kk5)) {
                                kk5Var = (kk5) queryLocalInterface;
                            } else {
                                ?? obj5 = new Object();
                                obj5.a = binder;
                                kk5Var = obj5;
                            }
                        }
                        kx6Var.b(kk5Var);
                        to6Var.e.c(ww7.b(bundle));
                        ArrayList arrayList = to6Var.c;
                        if (to6Var.e.a() != null) {
                            Iterator it = arrayList.iterator();
                            if (!it.hasNext()) {
                                arrayList.clear();
                            } else if (it.next() != null) {
                                rjb.p();
                            } else {
                                to6Var.d.put(null, new qo6());
                                throw null;
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    public j23(j33 j33Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = j33Var;
    }
}
