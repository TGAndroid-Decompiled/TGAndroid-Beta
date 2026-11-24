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
public final class x03 extends ResultReceiver {
    public final byte a;
    public final Object b;

    public x03(tm6 tm6Var) {
        super(null);
        this.a = (byte) 5;
        this.b = new WeakReference(tm6Var);
    }

    @Override
    public final void onReceiveResult(int i, Bundle bundle) {
        k03 k03Var;
        String string;
        Bundle bundle2;
        d03 a;
        boolean z;
        byte[] bArr;
        d03 d03Var;
        li5 li5Var;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                bundle.getClass();
                w03 w03Var = new w03(2, y13.a, t13.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 0);
                y03 y03Var = (y03) this.b;
                Executor executor = y03Var.g;
                if (executor != null) {
                    o13 o13Var = y03Var.f;
                    if (o13Var != null) {
                        if (!y13.b(bundle, w03Var, executor, o13Var, y03Var.h)) {
                            int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent = (Intent) wpd.a(bundle);
                            boolean z3 = y13.c;
                            if (i2 != z3) {
                                Log.w("CreatePublicKey", "Returned request code " + (z3 ? 1 : 0) + " does not match what was given " + i2);
                                return;
                            }
                            z1 z1Var = new z1(y03Var, (byte) 1);
                            CancellationSignal cancellationSignal = y03Var.h;
                            if (i != -1) {
                                ?? obj = new Object();
                                obj.a = new c03(lae.a(i), (byte) 2);
                                if (i == 0) {
                                    obj.a = new b03("activity is cancelled by the user.");
                                }
                                x13 x13Var = new x13(z1Var, obj, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!l23.a(cancellationSignal)) {
                                    x13Var.invoke();
                                }
                                z2 = true;
                            }
                            if (!z2) {
                                if (intent == null) {
                                    CancellationSignal cancellationSignal2 = y03Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal2)) {
                                        Executor executor2 = y03Var.g;
                                        if (executor2 != null) {
                                            executor2.execute(new s03(y03Var, (byte) 1));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                if (i3 >= 34) {
                                    k03Var = t4.b("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
                                } else {
                                    Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
                                    if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
                                        k03Var = null;
                                    } else {
                                        k03Var = s9e.a(string, bundle2);
                                    }
                                }
                                if (k03Var != null) {
                                    CancellationSignal cancellationSignal3 = y03Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal3)) {
                                        Executor executor3 = y03Var.g;
                                        if (executor3 != null) {
                                            executor3.execute(new gu2(y03Var, k03Var, (byte) 13));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                if (i3 >= 34) {
                                    a = t4.a(intent);
                                } else {
                                    int i4 = d03.a;
                                    Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
                                    if (bundleExtra2 == null) {
                                        a = null;
                                    } else {
                                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                                        if (string2 != null) {
                                            a = dud.a(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                                        } else {
                                            w26.j("Bundle was missing exception type.");
                                            return;
                                        }
                                    }
                                }
                                CancellationSignal cancellationSignal4 = y03Var.h;
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!l23.a(cancellationSignal4)) {
                                    Executor executor4 = y03Var.g;
                                    if (executor4 != null) {
                                        executor4.execute(new u03(y03Var, a, (byte) 1));
                                        return;
                                    } else {
                                        rp5.e("executor");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    rp5.e("callback");
                    throw null;
                }
                rp5.e("executor");
                throw null;
            case 1:
                bundle.getClass();
                w03 w03Var2 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 1);
                w13 w13Var = (w13) this.b;
                if (!y13.b(bundle, w03Var2, w13Var.f(), w13Var.e(), w13Var.h)) {
                    int i5 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                    boolean z4 = y13.c;
                    if (i5 != z4) {
                        Log.w("BeginSignIn", "Returned request code " + (z4 ? 1 : 0) + " which  does not match what was given " + i5);
                        return;
                    }
                    z1 z1Var2 = new z1(w13Var, (byte) 2);
                    CancellationSignal cancellationSignal5 = w13Var.h;
                    if (i != -1) {
                        ?? obj2 = new Object();
                        obj2.a = new ts4(lae.a(i), (byte) 2);
                        if (i == 0) {
                            obj2.a = new rs4("activity is cancelled by the user.");
                        }
                        x13 x13Var2 = new x13(z1Var2, obj2, (byte) 1);
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal5)) {
                            x13Var2.invoke();
                            return;
                        }
                        return;
                    }
                    try {
                        ske.a(w13Var.e);
                        xs4 d = w13Var.d(q3d.f(intent2));
                        CancellationSignal cancellationSignal6 = w13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal6)) {
                            w13Var.f().execute(new gu2(w13Var, d, (byte) 17));
                            return;
                        }
                        return;
                    } catch (us4 e) {
                        CancellationSignal cancellationSignal7 = w13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal7)) {
                            w13Var.f().execute(new v13(w13Var, e, (byte) 1));
                            return;
                        }
                        return;
                    } catch (zn e2) {
                        ?? obj3 = new Object();
                        obj3.a = new ts4(e2.getMessage(), (byte) 2);
                        if (e2.getStatusCode() == 16) {
                            obj3.a = new rs4(e2.getMessage());
                        } else if (y13.b.contains(Integer.valueOf(e2.getStatusCode()))) {
                            obj3.a = new vs4(e2.getMessage());
                        }
                        CancellationSignal cancellationSignal8 = w13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal8)) {
                            w13Var.f().execute(new gu2(w13Var, (Object) obj3, (byte) 18));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ts4 ts4Var = new ts4(th.getMessage(), (byte) 2);
                        CancellationSignal cancellationSignal9 = w13Var.h;
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal9)) {
                            w13Var.f().execute(new gu2(w13Var, ts4Var, (byte) 16));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                bundle.getClass();
                w03 w03Var3 = new w03(2, y13.a, t13.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0, (byte) 2);
                d23 d23Var = (d23) this.b;
                Executor executor5 = d23Var.g;
                if (executor5 != null) {
                    o13 o13Var2 = d23Var.f;
                    if (o13Var2 != null) {
                        if (!y13.b(bundle, w03Var3, executor5, o13Var2, d23Var.h)) {
                            int i6 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent3 = (Intent) bundle.getParcelable("RESULT_DATA");
                            boolean z5 = y13.c;
                            if (i6 != z5) {
                                Log.w("CreatePublicKey", "Returned request code " + (z5 ? 1 : 0) + " does not match what was given " + i6);
                                return;
                            }
                            z1 z1Var3 = new z1(d23Var, (byte) 3);
                            CancellationSignal cancellationSignal10 = d23Var.h;
                            if (i != -1) {
                                ?? obj4 = new Object();
                                obj4.a = new c03(lae.a(i), (byte) 2);
                                if (i == 0) {
                                    obj4.a = new b03("activity is cancelled by the user.");
                                }
                                x13 x13Var3 = new x13(z1Var3, obj4, (byte) 0);
                                CredentialProviderPlayServicesImpl.Companion.getClass();
                                if (!l23.a(cancellationSignal10)) {
                                    x13Var3.invoke();
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
                                    l23 l23Var = CredentialProviderPlayServicesImpl.Companion;
                                    CancellationSignal cancellationSignal11 = d23Var.h;
                                    l23Var.getClass();
                                    if (!l23.a(cancellationSignal11)) {
                                        Executor executor6 = d23Var.g;
                                        if (executor6 != null) {
                                            executor6.execute(new b23(d23Var, (byte) 1));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                ku8 ku8Var = (ku8) kte.a(bArr, ku8.CREATOR);
                                ku8Var.getClass();
                                LinkedHashMap linkedHashMap = lu8.a;
                                yo9 yo9Var = ku8Var.d;
                                yo9 yo9Var2 = yo9Var;
                                if (yo9Var == null) {
                                    yo9 yo9Var3 = ku8Var.e;
                                    yo9Var2 = yo9Var3;
                                    if (yo9Var3 == null) {
                                        yo9 yo9Var4 = ku8Var.f;
                                        yo9Var2 = yo9Var4;
                                        if (yo9Var4 == null) {
                                            sc8.j("No response set.");
                                            return;
                                        }
                                    }
                                }
                                if (yo9Var2 instanceof b50) {
                                    b50 b50Var = (b50) yo9Var2;
                                    v34 v34Var = b50Var.a;
                                    v34Var.getClass();
                                    h1 h1Var = (h1) lu8.a.get(v34Var);
                                    String str = b50Var.b;
                                    if (h1Var == null) {
                                        d03Var = new z03(new h1((byte) 26), b00.h("unknown fido gms exception - ", str));
                                    } else if (v34Var == v34.NOT_ALLOWED_ERR && str != null && f9b.f(0, 2, str, "Unable to get sync account") >= 0) {
                                        d03Var = new b03("Passkey registration was cancelled by the user.");
                                    } else {
                                        d03Var = new z03(h1Var, str);
                                    }
                                } else {
                                    d03Var = null;
                                }
                                if (d03Var != null) {
                                    CancellationSignal cancellationSignal12 = d23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal12)) {
                                        Executor executor7 = d23Var.g;
                                        if (executor7 != null) {
                                            executor7.execute(new c23(d23Var, d03Var, (byte) 1));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                }
                                try {
                                    b13 e3 = d23.e(ku8Var);
                                    CancellationSignal cancellationSignal13 = d23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal13)) {
                                        Executor executor8 = d23Var.g;
                                        if (executor8 != null) {
                                            executor8.execute(new gu2(d23Var, e3, (byte) 20));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (JSONException e4) {
                                    CancellationSignal cancellationSignal14 = d23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal14)) {
                                        Executor executor9 = d23Var.g;
                                        if (executor9 != null) {
                                            executor9.execute(new z13(d23Var, e4, (byte) 0));
                                            return;
                                        } else {
                                            rp5.e("executor");
                                            throw null;
                                        }
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    CancellationSignal cancellationSignal15 = d23Var.h;
                                    CredentialProviderPlayServicesImpl.Companion.getClass();
                                    if (!l23.a(cancellationSignal15)) {
                                        Executor executor10 = d23Var.g;
                                        if (executor10 != null) {
                                            executor10.execute(new a23(d23Var, th2, (byte) 0));
                                            return;
                                        } else {
                                            rp5.e("executor");
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
                    rp5.e("callback");
                    throw null;
                }
                rp5.e("executor");
                throw null;
            case 3:
                bundle.getClass();
                w03 w03Var4 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 3);
                i23 i23Var = (i23) this.b;
                Executor executor11 = i23Var.g;
                if (executor11 != null) {
                    o13 o13Var3 = i23Var.f;
                    if (o13Var3 != null) {
                        if (!y13.b(bundle, w03Var4, executor11, o13Var3, i23Var.h)) {
                            int i7 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent4 = (Intent) wpd.a(bundle);
                            Executor executor12 = i23Var.g;
                            if (executor12 != null) {
                                o13 o13Var4 = i23Var.f;
                                if (o13Var4 != null) {
                                    ose.a(i7, i, intent4, executor12, o13Var4, i23Var.h);
                                    return;
                                } else {
                                    rp5.e("callback");
                                    throw null;
                                }
                            }
                            rp5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    rp5.e("callback");
                    throw null;
                }
                rp5.e("executor");
                throw null;
            case 4:
                bundle.getClass();
                w03 w03Var5 = new w03(2, y13.a, t13.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                ss4 ss4Var = (ss4) this.b;
                Executor executor13 = ss4Var.g;
                if (executor13 != null) {
                    o13 o13Var5 = ss4Var.f;
                    if (o13Var5 != null) {
                        if (!y13.b(bundle, w03Var5, executor13, o13Var5, ss4Var.h)) {
                            int i8 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                            Intent intent5 = (Intent) wpd.a(bundle);
                            Executor executor14 = ss4Var.g;
                            if (executor14 != null) {
                                o13 o13Var6 = ss4Var.f;
                                if (o13Var6 != null) {
                                    ose.a(i8, i, intent5, executor14, o13Var6, ss4Var.h);
                                    return;
                                } else {
                                    rp5.e("callback");
                                    throw null;
                                }
                            }
                            rp5.e("executor");
                            throw null;
                        }
                        return;
                    }
                    rp5.e("callback");
                    throw null;
                }
                rp5.e("executor");
                throw null;
            default:
                tm6 tm6Var = (tm6) ((WeakReference) this.b).get();
                if (tm6Var != null && bundle != null) {
                    synchronized (tm6Var.b) {
                        kv6 kv6Var = tm6Var.e;
                        IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                        int i9 = av6.b;
                        if (binder == null) {
                            li5Var = null;
                        } else {
                            IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                            if (queryLocalInterface != null && (queryLocalInterface instanceof li5)) {
                                li5Var = (li5) queryLocalInterface;
                            } else {
                                ?? obj5 = new Object();
                                obj5.a = binder;
                                li5Var = obj5;
                            }
                        }
                        kv6Var.b(li5Var);
                        tm6Var.e.c(vu7.b(bundle));
                        ArrayList arrayList = tm6Var.c;
                        if (tm6Var.e.a() != null) {
                            Iterator it = arrayList.iterator();
                            if (!it.hasNext()) {
                                arrayList.clear();
                            } else if (it.next() != null) {
                                fyb.g();
                            } else {
                                tm6Var.d.put(null, new qm6());
                                throw null;
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    public x03(y13 y13Var, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = y13Var;
    }
}
