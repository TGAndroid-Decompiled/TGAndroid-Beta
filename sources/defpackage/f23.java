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
public final class f23 implements rr4 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public f23(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
        g7c g7cVar = g7c.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj6;
                k23 k23Var = (k23) obj5;
                Context context = k23Var.e;
                Executor executor = (Executor) obj4;
                a33 a33Var = (a33) obj3;
                p13 p13Var = (p13) obj;
                PendingIntent pendingIntent = p13Var.a;
                v13 v13Var = p13Var.b;
                if (pendingIntent == null) {
                    if (v13Var == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal)) {
                            executor.execute(new d23(a33Var, (byte) 1));
                        }
                        return g7cVar;
                    }
                } else {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    j33.a(k23Var.i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal)) {
                            Executor executor2 = k23Var.g;
                            if (executor2 != null) {
                                executor2.execute(new e23(k23Var, (byte) 0));
                            } else {
                                rr5.e("executor");
                                throw null;
                            }
                        }
                    }
                }
                if (v13Var != null) {
                    w13 a = tbe.a(v13Var.a, v13Var.b);
                    if (a instanceof n23) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal)) {
                            executor.execute(new mv2(a33Var, (n23) a, (byte) 13));
                        }
                        return g7cVar;
                    }
                }
                if (pendingIntent == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!w33.a(cancellationSignal)) {
                        executor.execute(new d23(a33Var, (byte) 0));
                    }
                }
                return g7cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj6;
                tu4 tu4Var = (tu4) obj5;
                Context context2 = tu4Var.e;
                Executor executor3 = (Executor) obj4;
                a33 a33Var2 = (a33) obj3;
                b58 b58Var = (b58) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    j33.a(tu4Var.i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", b58Var.a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal2)) {
                            executor3.execute(new d23(a33Var2, (byte) 9));
                        }
                    }
                }
                return g7cVar;
            default:
                String str = (String) obj5;
                String str2 = (String) obj4;
                ni8 ni8Var = (ni8) obj3;
                lj7 lj7Var = (lj7) obj;
                ((rf5) obj6).getClass();
                ni8 ni8Var2 = rf5.c;
                ni8 ni8Var3 = rf5.d;
                String str3 = "";
                if (((String) one.a(lj7Var, ni8Var3, "")).equals(str)) {
                    ni8 d = rf5.d(lj7Var, str);
                    if (d != null && !d.a.equals(str2)) {
                        rf5.f(lj7Var, str);
                        HashSet hashSet = new HashSet((Collection) one.a(lj7Var, ni8Var, new HashSet()));
                        hashSet.add(str);
                        lj7Var.d(ni8Var, hashSet);
                    }
                    return null;
                }
                long longValue = ((Long) one.a(lj7Var, ni8Var2, 0L)).longValue();
                if (longValue + 1 == 30) {
                    long longValue2 = ((Long) one.a(lj7Var, ni8Var2, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : lj7Var.a().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((ni8) entry.getKey()).a;
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
                    lj7Var.d(new ni8(str3), hashSet3);
                    longValue = longValue2 - 1;
                    lj7Var.d(ni8Var2, Long.valueOf(longValue));
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) one.a(lj7Var, ni8Var, new HashSet()));
                hashSet4.add(str);
                lj7Var.d(ni8Var, hashSet4);
                lj7Var.d(ni8Var2, Long.valueOf(longValue + 1));
                lj7Var.d(ni8Var3, str);
                return obj2;
        }
    }
}
