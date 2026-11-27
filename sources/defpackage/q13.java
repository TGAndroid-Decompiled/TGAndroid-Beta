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
public final class q13 extends ResultReceiver {
    public final byte a;
    public final Object b;

    public q13(xo6 xo6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(xo6Var);
    }

    @Override
    public final void onReceiveResult(int i, Bundle bundle) {
        d13 d13Var;
        String string;
        Bundle bundle2;
        w03 a;
        boolean z;
        byte[] bArr;
        w03 w03Var;
        nk5 nk5Var;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                bundle.getClass();
                p13 p13Var = new p13(2, q23.a, l23.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                r13 r13Var = (r13) this.b;
                Executor executor = r13Var.g;
                if (executor != null) {
                    h23 h23Var = r13Var.f;
                    if (h23Var != null) {
                        if (!q23.b(bundle, p13Var, executor, h23Var, r13Var.h)) {
                            int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent = (Intent) mud.a(bundle);
                            boolean z3 = q23.c;
                            if (i2 != z3) {
                                Log.w("CreatePublicKey", "Returned request code " + (z3 ? 1 : 0) + " does not match what was given " + i2);
                                return;
                            }
                            a2 a2Var = new a2(r13Var, (byte) 1);
                            CancellationSignal cancellationSignal = r13Var.h;
                            if (i != -1) {
                                ?? obj = new Object();
                                obj.a = new v03(bfe.a(i), (byte) 2);
                                if (i == 0) {
                                    obj.a = new u03("activity is cancelled by the user.");
                                }
                                p23 p23Var = new p23(a2Var, obj, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!d33.a(cancellationSignal)) {
                                    p23Var.invoke();
                                }
                                z2 = true;
                            }
                            if (!z2) {
                                if (intent == null) {
                                    CancellationSignal cancellationSignal2 = r13Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal2)) {
                                        Executor executor2 = r13Var.g;
                                        if (executor2 != null) {
                                            executor2.execute(new l13(r13Var, (byte) 1));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                if (i3 >= 34) {
                                    d13Var = u4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                                } else {
                                    Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        d13Var = null;
                                    } else {
                                        d13Var = iee.a(string, bundle2);
                                    }
                                }
                                if (d13Var != null) {
                                    CancellationSignal cancellationSignal3 = r13Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal3)) {
                                        Executor executor3 = r13Var.g;
                                        if (executor3 != null) {
                                            executor3.execute(new bv2(r13Var, d13Var, (byte) 12));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i3 >= 34) {
                                    a = u4.a(intent);
                                } else {
                                    int i4 = w03.a;
                                    Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a = null;
                                    } else {
                                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string2 != null) {
                                            a = tyd.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                                        } else {
                                            lq5.j("Bundle was missing exception type.");
                                            return;
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal4 = r13Var.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!d33.a(cancellationSignal4)) {
                                    Executor executor4 = r13Var.g;
                                    if (executor4 != null) {
                                        executor4.execute(new n13(r13Var, a, (byte) 1));
                                        return;
                                    } else {
                                        ur5.e("executor");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ur5.e("callback");
                    throw null;
                }
                ur5.e("executor");
                throw null;
            case 1:
                bundle.getClass();
                p13 p13Var2 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                o23 o23Var = (o23) this.b;
                if (!q23.b(bundle, p13Var2, o23Var.f(), o23Var.e(), o23Var.h)) {
                    int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                    boolean z4 = q23.c;
                    if (i5 != z4) {
                        Log.w("BeginSignIn", "Returned request code " + (z4 ? 1 : 0) + " which  does not match what was given " + i5);
                        return;
                    }
                    a2 a2Var2 = new a2(o23Var, (byte) 2);
                    CancellationSignal cancellationSignal5 = o23Var.h;
                    if (i != -1) {
                        ?? obj2 = new Object();
                        obj2.a = new xu4(bfe.a(i), (byte) 2);
                        if (i == 0) {
                            obj2.a = new vu4("activity is cancelled by the user.");
                        }
                        p23 p23Var2 = new p23(a2Var2, obj2, (byte) 1);
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal5)) {
                            p23Var2.invoke();
                            return;
                        }
                        return;
                    }
                    try {
                        kpe.a(o23Var.e);
                        bv4 d = o23Var.d(h8d.f(intent2));
                        CancellationSignal cancellationSignal6 = o23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal6)) {
                            o23Var.f().execute(new bv2(o23Var, d, (byte) 16));
                            return;
                        }
                        return;
                    } catch (ao e) {
                        ?? obj3 = new Object();
                        obj3.a = new xu4(e.getMessage(), (byte) 2);
                        if (e.getStatusCode() == 16) {
                            obj3.a = new vu4(e.getMessage());
                        } else if (q23.b.contains(Integer.valueOf(e.getStatusCode()))) {
                            obj3.a = new zu4(e.getMessage());
                        }
                        CancellationSignal cancellationSignal7 = o23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal7)) {
                            o23Var.f().execute(new bv2(o23Var, (Object) obj3, (byte) 17));
                            return;
                        }
                        return;
                    } catch (yu4 e2) {
                        CancellationSignal cancellationSignal8 = o23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal8)) {
                            o23Var.f().execute(new n23(o23Var, e2, (byte) 1));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        xu4 xu4Var = new xu4(th.getMessage(), (byte) 2);
                        CancellationSignal cancellationSignal9 = o23Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal9)) {
                            o23Var.f().execute(new bv2(o23Var, xu4Var, (byte) 15));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                bundle.getClass();
                p13 p13Var3 = new p13(2, q23.a, l23.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                v23 v23Var = (v23) this.b;
                Executor executor5 = v23Var.g;
                if (executor5 != null) {
                    h23 h23Var2 = v23Var.f;
                    if (h23Var2 != null) {
                        if (!q23.b(bundle, p13Var3, executor5, h23Var2, v23Var.h)) {
                            int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                            boolean z5 = q23.c;
                            if (i6 != z5) {
                                Log.w("CreatePublicKey", "Returned request code " + (z5 ? 1 : 0) + " does not match what was given " + i6);
                                return;
                            }
                            a2 a2Var3 = new a2(v23Var, (byte) 3);
                            CancellationSignal cancellationSignal10 = v23Var.h;
                            if (i != -1) {
                                ?? obj4 = new Object();
                                obj4.a = new v03(bfe.a(i), (byte) 2);
                                if (i == 0) {
                                    obj4.a = new u03("activity is cancelled by the user.");
                                }
                                p23 p23Var3 = new p23(a2Var3, obj4, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!d33.a(cancellationSignal10)) {
                                    p23Var3.invoke();
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
                                    d33 d33Var = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal11 = v23Var.h;
                                    d33Var.getClass();
                                    if (!d33.a(cancellationSignal11)) {
                                        Executor executor6 = v23Var.g;
                                        if (executor6 != null) {
                                            executor6.execute(new t23(v23Var, (byte) 1));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                tx8 tx8Var = (tx8) dye.a(bArr, tx8.CREATOR);
                                tx8Var.getClass();
                                LinkedHashMap linkedHashMap = ux8.a;
                                e50 e50Var = tx8Var.d;
                                e50 e50Var2 = e50Var;
                                if (e50Var == null) {
                                    e50 e50Var3 = tx8Var.e;
                                    e50Var2 = e50Var3;
                                    if (e50Var3 == null) {
                                        e50 e50Var4 = tx8Var.f;
                                        e50Var2 = e50Var4;
                                        if (e50Var4 == null) {
                                            grb.i("No response set.");
                                            return;
                                        }
                                    }
                                }
                                if (e50Var2 instanceof d50) {
                                    d50 d50Var = (d50) e50Var2;
                                    q44 q44Var = d50Var.a;
                                    q44Var.getClass();
                                    i1 i1Var = (i1) ux8.a.get(q44Var);
                                    String str = d50Var.b;
                                    if (i1Var == null) {
                                        w03Var = new s13(new i1((byte) 26), c00.i("unknown fido gms exception - ", str));
                                    } else if (q44Var == q44.NOT_ALLOWED_ERR && str != null && ddb.f(0, 2, str, "Unable to get sync account") >= 0) {
                                        w03Var = new u03("Passkey registration was cancelled by the user.");
                                    } else {
                                        w03Var = new s13(i1Var, str);
                                    }
                                } else {
                                    w03Var = null;
                                }
                                if (w03Var != null) {
                                    CancellationSignal cancellationSignal12 = v23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal12)) {
                                        Executor executor7 = v23Var.g;
                                        if (executor7 != null) {
                                            executor7.execute(new u23(v23Var, w03Var, (byte) 1));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                try {
                                    u13 e3 = v23.e(tx8Var);
                                    CancellationSignal cancellationSignal13 = v23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal13)) {
                                        Executor executor8 = v23Var.g;
                                        if (executor8 != null) {
                                            executor8.execute(new bv2(v23Var, e3, (byte) 19));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (JSONException e4) {
                                    CancellationSignal cancellationSignal14 = v23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal14)) {
                                        Executor executor9 = v23Var.g;
                                        if (executor9 != null) {
                                            executor9.execute(new r23(v23Var, e4, (byte) 0));
                                            return;
                                        } else {
                                            ur5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    CancellationSignal cancellationSignal15 = v23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!d33.a(cancellationSignal15)) {
                                        Executor executor10 = v23Var.g;
                                        if (executor10 != null) {
                                            executor10.execute(new s23(v23Var, th2, (byte) 0));
                                            return;
                                        } else {
                                            ur5.e("executor");
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
                    ur5.e("callback");
                    throw null;
                }
                ur5.e("executor");
                throw null;
            case 3:
                bundle.getClass();
                p13 p13Var4 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                a33 a33Var = (a33) this.b;
                Executor executor11 = a33Var.g;
                if (executor11 != null) {
                    h23 h23Var3 = a33Var.f;
                    if (h23Var3 != null) {
                        if (!q23.b(bundle, p13Var4, executor11, h23Var3, a33Var.h)) {
                            int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent4 = (Intent) mud.a(bundle);
                            Executor executor12 = a33Var.g;
                            if (executor12 != null) {
                                h23 h23Var4 = a33Var.f;
                                if (h23Var4 != null) {
                                    hxe.a(i7, i, intent4, executor12, h23Var4, a33Var.h);
                                    return;
                                } else {
                                    ur5.e("callback");
                                    throw null;
                                }
                            }
                            ur5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    ur5.e("callback");
                    throw null;
                }
                ur5.e("executor");
                throw null;
            case 4:
                bundle.getClass();
                p13 p13Var5 = new p13(2, q23.a, l23.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                wu4 wu4Var = (wu4) this.b;
                Executor executor13 = wu4Var.g;
                if (executor13 != null) {
                    h23 h23Var5 = wu4Var.f;
                    if (h23Var5 != null) {
                        if (!q23.b(bundle, p13Var5, executor13, h23Var5, wu4Var.h)) {
                            int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent5 = (Intent) mud.a(bundle);
                            Executor executor14 = wu4Var.g;
                            if (executor14 != null) {
                                h23 h23Var6 = wu4Var.f;
                                if (h23Var6 != null) {
                                    hxe.a(i8, i, intent5, executor14, h23Var6, wu4Var.h);
                                    return;
                                } else {
                                    ur5.e("callback");
                                    throw null;
                                }
                            }
                            ur5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    ur5.e("callback");
                    throw null;
                }
                ur5.e("executor");
                throw null;
            default:
                xo6 xo6Var = (xo6) ((WeakReference) this.b).get();
                if (xo6Var != null && bundle != null) {
                    synchronized (xo6Var.b) {
                        px6 px6Var = xo6Var.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i9 = fx6.b;
                        if (binder == null) {
                            nk5Var = null;
                        } else {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof nk5)) {
                                nk5Var = (nk5) queryLocalInterface;
                            } else {
                                ?? obj5 = new Object();
                                obj5.a = binder;
                                nk5Var = obj5;
                            }
                        }
                        px6Var.b(nk5Var);
                        xo6Var.e.c(cy7.b(bundle));
                        ArrayList arrayList = xo6Var.c;
                        if (xo6Var.e.a() != null) {
                            Iterator it = arrayList.iterator();
                            if (!it.hasNext()) {
                                arrayList.clear();
                            } else if (it.next() != null) {
                                grb.o();
                            } else {
                                xo6Var.d.put(null, new uo6());
                                throw null;
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    public q13(q23 q23Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = q23Var;
    }
}
