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
public final class t03 implements qp4 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public t03(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        g5c g5cVar = g5c.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj6;
                y03 y03Var = (y03) obj5;
                Context context = y03Var.e;
                Executor executor = (Executor) obj4;
                o13 o13Var = (o13) obj3;
                e03 e03Var = (e03) obj;
                PendingIntent pendingIntent = e03Var.a;
                j03 j03Var = e03Var.b;
                if (pendingIntent == null) {
                    if (j03Var == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal)) {
                            executor.execute(new r03(o13Var, (byte) 1));
                        }
                        return g5cVar;
                    }
                } else {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    y13.a(y03Var.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal)) {
                            Executor executor2 = y03Var.g;
                            if (executor2 != null) {
                                executor2.execute(new s03(y03Var, (byte) 0));
                            } else {
                                rp5.e("executor");
                                throw null;
                            }
                        }
                    }
                }
                if (j03Var != null) {
                    k03 a = s9e.a(j03Var.a, j03Var.b);
                    if (a instanceof b13) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal)) {
                            executor.execute(new gu2(o13Var, (b13) a, (byte) 12));
                        }
                        return g5cVar;
                    }
                }
                if (pendingIntent == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!l23.a(cancellationSignal)) {
                        executor.execute(new r03(o13Var, (byte) 0));
                    }
                }
                return g5cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj6;
                ss4 ss4Var = (ss4) obj5;
                Context context2 = ss4Var.e;
                Executor executor3 = (Executor) obj4;
                o13 o13Var2 = (o13) obj3;
                z28 z28Var = (z28) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!l23.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    y13.a(ss4Var.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", z28Var.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!l23.a(cancellationSignal2)) {
                            executor3.execute(new r03(o13Var2, (byte) 9));
                        }
                    }
                }
                return g5cVar;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                lg8 lg8Var = (lg8) obj3;
                ih7 ih7Var = (ih7) obj;
                ((td5) obj6).getClass();
                lg8 lg8Var2 = td5.c;
                lg8 lg8Var3 = td5.d;
                String str3 = "";
                if (((String) mle.a(ih7Var, lg8Var3, "")).equals(str)) {
                    lg8 d = td5.d(ih7Var, str);
                    if (d != null && !d.a.equals(str2)) {
                        td5.f(ih7Var, str);
                        HashSet hashSet = new HashSet((Collection) mle.a(ih7Var, lg8Var, new HashSet()));
                        hashSet.add(str);
                        ih7Var.d(lg8Var, hashSet);
                    }
                    return null;
                }
                long longValue = ((Long) mle.a(ih7Var, lg8Var2, 0L)).longValue();
                if (longValue + 1 == 30) {
                    long longValue2 = ((Long) mle.a(ih7Var, lg8Var2, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : ih7Var.a().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((lg8) entry.getKey()).a;
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
                    ih7Var.d(new lg8(str3), hashSet3);
                    longValue = longValue2 - 1;
                    ih7Var.d(lg8Var2, Long.valueOf(longValue));
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) mle.a(ih7Var, lg8Var, new HashSet()));
                hashSet4.add(str);
                ih7Var.d(lg8Var, hashSet4);
                ih7Var.d(lg8Var2, Long.valueOf(longValue + 1));
                ih7Var.d(lg8Var3, str);
                return obj2;
        }
    }
}
