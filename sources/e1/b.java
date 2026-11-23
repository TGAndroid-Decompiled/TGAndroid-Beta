package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import c8.e1;
import c8.ub;
import c8.yc;
import di.f2;
import gd.k;
import j7.f;
import j7.h;
import j7.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import q1.e;
import rd.l;
import v0.g;
public final class b implements l {
    public final int f10314a;
    public final Object f10315b;
    public final Object f10316c;
    public final Object d;
    public final Object f10317e;

    public b(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f10314a = i7;
        this.f10315b = obj;
        this.f10317e = obj2;
        this.f10316c = obj3;
        this.d = obj4;
    }

    @Override
    public final Object invoke(Object obj) {
        long j3;
        Object obj2;
        switch (this.f10314a) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f10315b;
                d dVar = (d) this.f10317e;
                Context context = dVar.f10321e;
                Executor executor = (Executor) this.f10316c;
                g gVar = (g) this.d;
                f fVar = (f) obj;
                PendingIntent pendingIntent = fVar.f17324a;
                h hVar = fVar.f17325b;
                if (pendingIntent == null && hVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(gVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f10324i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f10323g;
                                if (executor2 != null) {
                                    executor2.execute(new a(dVar, 0));
                                } else {
                                    j.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (hVar != null) {
                        v0.c a10 = yc.a(hVar.f17331a, hVar.f17332b);
                        if (a10 instanceof v0.f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new f2(19, gVar, (v0.f) a10));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            executor.execute(new a1.b(gVar, 8));
                        }
                    }
                }
                return k.f13517a;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f10315b;
                f1.a aVar = (f1.a) this.f10317e;
                Context context2 = aVar.f11048e;
                Executor executor3 = (Executor) this.f10316c;
                g gVar2 = (g) this.d;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f11051i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f17341a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            executor3.execute(new a1.b(gVar2, 10));
                        }
                    }
                }
                return k.f13517a;
            default:
                String str = (String) this.f10317e;
                String str2 = (String) this.f10316c;
                e eVar = (e) this.d;
                q1.b bVar = (q1.b) obj;
                ((sa.h) this.f10315b).getClass();
                e eVar2 = sa.h.f57182c;
                e eVar3 = sa.h.d;
                String str3 = "";
                if (((String) e1.a(bVar, eVar3, "")).equals(str)) {
                    e d = sa.h.d(bVar, str);
                    if (d != null && !d.f55754a.equals(str2)) {
                        sa.h.f(bVar, str);
                        HashSet hashSet = new HashSet((Collection) e1.a(bVar, eVar, new HashSet()));
                        hashSet.add(str);
                        bVar.e(eVar, hashSet);
                    }
                    return null;
                }
                long longValue = ((Long) e1.a(bVar, eVar2, 0L)).longValue();
                long j10 = 1;
                if (longValue + 1 == 30) {
                    long longValue2 = ((Long) e1.a(bVar, eVar2, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : bVar.a().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                long j11 = j10;
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((e) entry.getKey()).f55754a;
                                    hashSet2 = set;
                                    str4 = str5;
                                }
                                j10 = j11;
                            }
                        }
                        j10 = j10;
                    }
                    j3 = j10;
                    obj2 = null;
                    HashSet hashSet3 = new HashSet(hashSet2);
                    hashSet3.remove(str4);
                    bVar.e(ub.b(str3), hashSet3);
                    longValue = longValue2 - j3;
                    bVar.e(eVar2, Long.valueOf(longValue));
                } else {
                    j3 = 1;
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) e1.a(bVar, eVar, new HashSet()));
                hashSet4.add(str);
                bVar.e(eVar, hashSet4);
                bVar.e(eVar2, Long.valueOf(longValue + j3));
                bVar.e(eVar3, str);
                return obj2;
        }
    }
}
