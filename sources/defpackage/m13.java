package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
public final class m13 implements ur4 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public m13(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj6;
                r13 r13Var = (r13) obj5;
                Context context = r13Var.e;
                Executor executor = (Executor) obj4;
                h23 h23Var = (h23) obj3;
                x03 x03Var = (x03) obj;
                PendingIntent pendingIntent = x03Var.a;
                c13 c13Var = x03Var.b;
                if (pendingIntent == null) {
                    if (c13Var == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal)) {
                            executor.execute(new k13(h23Var, (byte) 1));
                        }
                        return f9cVar;
                    }
                } else {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    q23.a(r13Var.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal)) {
                            Executor executor2 = r13Var.g;
                            if (executor2 != null) {
                                executor2.execute(new l13(r13Var, (byte) 0));
                            } else {
                                ur5.e("executor");
                                throw null;
                            }
                        }
                    }
                }
                if (c13Var != null) {
                    d13 a = iee.a(c13Var.a, c13Var.b);
                    if (a instanceof u13) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal)) {
                            executor.execute(new bv2(h23Var, (u13) a, (byte) 11));
                        }
                        return f9cVar;
                    }
                }
                if (pendingIntent == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!d33.a(cancellationSignal)) {
                        executor.execute(new k13(h23Var, (byte) 0));
                    }
                }
                return f9cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj6;
                wu4 wu4Var = (wu4) obj5;
                Context context2 = wu4Var.e;
                Executor executor3 = (Executor) obj4;
                h23 h23Var2 = (h23) obj3;
                p68 p68Var = (p68) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!d33.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    q23.a(wu4Var.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", p68Var.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!d33.a(cancellationSignal2)) {
                            executor3.execute(new k13(h23Var2, (byte) 9));
                        }
                    }
                }
                return f9cVar;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                zj8 zj8Var = (zj8) obj3;
                rj7 rj7Var = (rj7) obj;
                ((uf5) obj6).getClass();
                zj8 zj8Var2 = uf5.c;
                zj8 zj8Var3 = uf5.d;
                String str3 = "";
                if (((String) eqe.a(rj7Var, zj8Var3, "")).equals(str)) {
                    zj8 d = uf5.d(rj7Var, str);
                    if (d != null && !d.a.equals(str2)) {
                        uf5.f(rj7Var, str);
                        HashSet hashSet = new HashSet((Collection) eqe.a(rj7Var, zj8Var, new HashSet()));
                        hashSet.add(str);
                        rj7Var.d(zj8Var, hashSet);
                    }
                    return null;
                }
                long longValue = ((Long) eqe.a(rj7Var, zj8Var2, 0L)).longValue();
                if (longValue + 1 == 30) {
                    long longValue2 = ((Long) eqe.a(rj7Var, zj8Var2, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : rj7Var.a().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((zj8) entry.getKey()).a;
                                    str4 = str5;
                                    hashSet2 = set;
                                }
                            }
                        }
                    }
                    obj2 = null;
                    HashSet hashSet3 = new HashSet(hashSet2);
                    hashSet3.remove(str4);
                    str3.getClass();
                    rj7Var.d(new zj8(str3), hashSet3);
                    longValue = longValue2 - 1;
                    rj7Var.d(zj8Var2, Long.valueOf(longValue));
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) eqe.a(rj7Var, zj8Var, new HashSet()));
                hashSet4.add(str);
                rj7Var.d(zj8Var, hashSet4);
                rj7Var.d(zj8Var2, Long.valueOf(longValue + 1));
                rj7Var.d(zj8Var3, str);
                return obj2;
        }
    }
}
